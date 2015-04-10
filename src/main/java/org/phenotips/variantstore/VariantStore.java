package org.phenotips.variantstore;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.apache.log4j.Logger;
import org.ga4gh.GAVariant;
import org.phenotips.variantstore.input.InputManager;
import org.phenotips.variantstore.input.VariantHeader;
import org.phenotips.variantstore.input.csv.CSVManager;
import org.phenotips.variantstore.db.AbstractDatabaseController;
import org.phenotips.variantstore.db.solr.SolrController;
import org.phenotips.variantstore.input.vcf.VCFIterator;
import org.phenotips.variantstore.input.vcf.VCFManager;
import org.phenotips.variantstore.jannovar.JannovarController;
import org.phenotips.variantstore.shared.VariantStoreException;

/**
 * The Variant Store is capable of storing a large number of individuals genomic variants for further
 * querying and sorting
 */
public class VariantStore {
    private static Logger logger = Logger.getLogger(VariantStore.class);
    private final Path path;
    private final JannovarController jannovar;
    private InputManager inputManager;
    private AbstractDatabaseController db;

    public VariantStore(Path path, InputManager inputManager, AbstractDatabaseController db) {
        this.path = path;
        this.inputManager = inputManager;
        this.db = db;
        this.jannovar = new JannovarController();
    }

    public void init() throws VariantStoreException {
        db.init(this.path.resolve("db"));
        inputManager.init(this.path.resolve("vcf"));
//        jannovar.init(this.path.resolve("jannovar"));
    }

    public void stop() {
        db.stop();
    }

    /**
     * Add an individual to the variant store. This is an asynchronous operation.
     * In case of application failure, the individual would have to be remove and re-inserted.
     * @param id a unique id that represents the individual.
     * @param isPublic whether to include this individual's data in aggregate queries.
     *                 This does not prevent the data to be queried by the individual's id.
     * @param file the path to the file on the local filesystem where the data is stored.
     * @return a Future that completes when the individual is fully inserted into the variant store,
     *         and is ready to be queried.
     */
    public Future addIndividual(String id, boolean isPublic, Path file) throws VariantStoreException {
        // copy file to file cache
        inputManager.addIndividual(id, file);

        // annotate VCF with jannovar
//        Path jpath = null;
//        try {
//            jpath = jannovar.annotate(vcf.getIndividual(id)).get();
//        } catch (InterruptedException | ExecutionException e) {
//            throw new VariantStoreException("Error adding individual to the vairant store", e);
//        }
//        // filter down to exonic variants
//        Map<String,List<String>> filter = new HashMap<>();
//        filter.put("EFFECT", Arrays.asList("UPSTREAM", "DOWNSTREAM", "INTRONIC", "INTERGENIC", "ERROR"));
        // run them through exomiser
        // add them to solr
        // add all variants to solr
        return this.db.addIndividual(this.inputManager.getIteratorForIndividual(id, isPublic));
    }

    /**
     * Remove any information associated with the specified individual from the variant store
     * @param id the individual's id
     * @return a Future that completes when the individual is fully removed from the variant store.
     */
    public Future removeIndividual(String id) throws VariantStoreException {
        return this.db.removeIndividual(id);
    }

    /**
     * Get the top n most harmful variants for a specified individual.
     * @param id the individuals id
     * @param n the number of variants to return
     * @return a List of harmful variants for the specified individual
     */
    public List<GAVariant> getTopHarmfullVariants(String id, int n) {
        return null;
    }

    /*TODO: other query methods*/

    public static void main(String[] args) {
        logger.debug("Starting");
        VariantStore vs = null;

        vs = new VariantStore(Paths.get("/data/dev-variant-store"),
                new VCFManager(),
                new SolrController()
        );

        try {
            vs.init();
        } catch (VariantStoreException e) {
            logger.error("Error initializing VariantStore", e);
            return;
        }

        logger.debug("Started");

        String id = "P000001";
        try {
            logger.debug("Adding");
            vs.addIndividual(id, true, Paths.get("/data/vcf/P0000210/P0000210-original.vcf")).get();
            logger.debug("Added.");
            vs.removeIndividual(id).get();
            logger.debug("Removed.");

        } catch (VariantStoreException | ExecutionException e) {
            logger.error("ERROR!!", e);
        } catch (InterruptedException e) {
            logger.error("Shouldn't happen", e);
        }

        vs.stop();
        logger.debug("Stopped");
    }
}
