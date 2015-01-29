/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.phenotips.variantstore.models;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public interface VariantStore {
  public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"variantStore\",\"namespace\":\"org.phenotips.variantstore.models\",\"types\":[{\"type\":\"record\",\"name\":\"Info\",\"doc\":\"This metadata represents VCF INFO fields. In order to be queried and filtered\\nby apache drill, the each info key that we need is typed and stored as a field,\\ninstead of as a map of {<string>: <string>} as in ga4gh API.\",\"fields\":[{\"name\":\"variantId\",\"type\":\"string\"},{\"name\":\"ExomiserGene\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"ExomiserGenePhenoScore\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"ExomiserVariantScore\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"ExomiserGeneVariantScore\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"ExomiserGeneCominedScore\",\"type\":[\"null\",\"double\"],\"default\":null}]}],\"messages\":{}}");

  @SuppressWarnings("all")
  public interface Callback extends VariantStore {
    public static final org.apache.avro.Protocol PROTOCOL = VariantStore.PROTOCOL;
  }
}
