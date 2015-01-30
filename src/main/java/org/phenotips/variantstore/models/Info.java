/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.phenotips.variantstore.models;  
@SuppressWarnings("all")
/** This metadata represents VCF INFO fields. In order to be queried and filtered
by apache drill, the each info key that we need is typed and stored as a field,
instead of as a map of {<string>: <string>} as in ga4gh API. */
@org.apache.avro.specific.AvroGenerated
public class Info extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Info\",\"namespace\":\"org.phenotips.variantstore.models\",\"doc\":\"This metadata represents VCF INFO fields. In order to be queried and filtered\\nby apache drill, the each info key that we need is typed and stored as a field,\\ninstead of as a map of {<string>: <string>} as in ga4gh API.\",\"fields\":[{\"name\":\"variantId\",\"type\":\"string\"},{\"name\":\"ExomiserGene\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"ExomiserGenePhenoScore\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"ExomiserVariantScore\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"ExomiserGeneVariantScore\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"ExomiserGeneCominedScore\",\"type\":[\"null\",\"double\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence variantId;
  @Deprecated public java.lang.CharSequence ExomiserGene;
  @Deprecated public java.lang.Double ExomiserGenePhenoScore;
  @Deprecated public java.lang.Double ExomiserVariantScore;
  @Deprecated public java.lang.Double ExomiserGeneVariantScore;
  @Deprecated public java.lang.Double ExomiserGeneCominedScore;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Info() {}

  /**
   * All-args constructor.
   */
  public Info(java.lang.CharSequence variantId, java.lang.CharSequence ExomiserGene, java.lang.Double ExomiserGenePhenoScore, java.lang.Double ExomiserVariantScore, java.lang.Double ExomiserGeneVariantScore, java.lang.Double ExomiserGeneCominedScore) {
    this.variantId = variantId;
    this.ExomiserGene = ExomiserGene;
    this.ExomiserGenePhenoScore = ExomiserGenePhenoScore;
    this.ExomiserVariantScore = ExomiserVariantScore;
    this.ExomiserGeneVariantScore = ExomiserGeneVariantScore;
    this.ExomiserGeneCominedScore = ExomiserGeneCominedScore;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return variantId;
    case 1: return ExomiserGene;
    case 2: return ExomiserGenePhenoScore;
    case 3: return ExomiserVariantScore;
    case 4: return ExomiserGeneVariantScore;
    case 5: return ExomiserGeneCominedScore;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: variantId = (java.lang.CharSequence)value$; break;
    case 1: ExomiserGene = (java.lang.CharSequence)value$; break;
    case 2: ExomiserGenePhenoScore = (java.lang.Double)value$; break;
    case 3: ExomiserVariantScore = (java.lang.Double)value$; break;
    case 4: ExomiserGeneVariantScore = (java.lang.Double)value$; break;
    case 5: ExomiserGeneCominedScore = (java.lang.Double)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'variantId' field.
   */
  public java.lang.CharSequence getVariantId() {
    return variantId;
  }

  /**
   * Sets the value of the 'variantId' field.
   * @param value the value to set.
   */
  public void setVariantId(java.lang.CharSequence value) {
    this.variantId = value;
  }

  /**
   * Gets the value of the 'ExomiserGene' field.
   */
  public java.lang.CharSequence getExomiserGene() {
    return ExomiserGene;
  }

  /**
   * Sets the value of the 'ExomiserGene' field.
   * @param value the value to set.
   */
  public void setExomiserGene(java.lang.CharSequence value) {
    this.ExomiserGene = value;
  }

  /**
   * Gets the value of the 'ExomiserGenePhenoScore' field.
   */
  public java.lang.Double getExomiserGenePhenoScore() {
    return ExomiserGenePhenoScore;
  }

  /**
   * Sets the value of the 'ExomiserGenePhenoScore' field.
   * @param value the value to set.
   */
  public void setExomiserGenePhenoScore(java.lang.Double value) {
    this.ExomiserGenePhenoScore = value;
  }

  /**
   * Gets the value of the 'ExomiserVariantScore' field.
   */
  public java.lang.Double getExomiserVariantScore() {
    return ExomiserVariantScore;
  }

  /**
   * Sets the value of the 'ExomiserVariantScore' field.
   * @param value the value to set.
   */
  public void setExomiserVariantScore(java.lang.Double value) {
    this.ExomiserVariantScore = value;
  }

  /**
   * Gets the value of the 'ExomiserGeneVariantScore' field.
   */
  public java.lang.Double getExomiserGeneVariantScore() {
    return ExomiserGeneVariantScore;
  }

  /**
   * Sets the value of the 'ExomiserGeneVariantScore' field.
   * @param value the value to set.
   */
  public void setExomiserGeneVariantScore(java.lang.Double value) {
    this.ExomiserGeneVariantScore = value;
  }

  /**
   * Gets the value of the 'ExomiserGeneCominedScore' field.
   */
  public java.lang.Double getExomiserGeneCominedScore() {
    return ExomiserGeneCominedScore;
  }

  /**
   * Sets the value of the 'ExomiserGeneCominedScore' field.
   * @param value the value to set.
   */
  public void setExomiserGeneCominedScore(java.lang.Double value) {
    this.ExomiserGeneCominedScore = value;
  }

  /** Creates a new Info RecordBuilder */
  public static org.phenotips.variantstore.models.Info.Builder newBuilder() {
    return new org.phenotips.variantstore.models.Info.Builder();
  }
  
  /** Creates a new Info RecordBuilder by copying an existing Builder */
  public static org.phenotips.variantstore.models.Info.Builder newBuilder(org.phenotips.variantstore.models.Info.Builder other) {
    return new org.phenotips.variantstore.models.Info.Builder(other);
  }
  
  /** Creates a new Info RecordBuilder by copying an existing Info instance */
  public static org.phenotips.variantstore.models.Info.Builder newBuilder(org.phenotips.variantstore.models.Info other) {
    return new org.phenotips.variantstore.models.Info.Builder(other);
  }
  
  /**
   * RecordBuilder for Info instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Info>
    implements org.apache.avro.data.RecordBuilder<Info> {

    private java.lang.CharSequence variantId;
    private java.lang.CharSequence ExomiserGene;
    private java.lang.Double ExomiserGenePhenoScore;
    private java.lang.Double ExomiserVariantScore;
    private java.lang.Double ExomiserGeneVariantScore;
    private java.lang.Double ExomiserGeneCominedScore;

    /** Creates a new Builder */
    private Builder() {
      super(org.phenotips.variantstore.models.Info.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.phenotips.variantstore.models.Info.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.variantId)) {
        this.variantId = data().deepCopy(fields()[0].schema(), other.variantId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.ExomiserGene)) {
        this.ExomiserGene = data().deepCopy(fields()[1].schema(), other.ExomiserGene);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.ExomiserGenePhenoScore)) {
        this.ExomiserGenePhenoScore = data().deepCopy(fields()[2].schema(), other.ExomiserGenePhenoScore);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.ExomiserVariantScore)) {
        this.ExomiserVariantScore = data().deepCopy(fields()[3].schema(), other.ExomiserVariantScore);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.ExomiserGeneVariantScore)) {
        this.ExomiserGeneVariantScore = data().deepCopy(fields()[4].schema(), other.ExomiserGeneVariantScore);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.ExomiserGeneCominedScore)) {
        this.ExomiserGeneCominedScore = data().deepCopy(fields()[5].schema(), other.ExomiserGeneCominedScore);
        fieldSetFlags()[5] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Info instance */
    private Builder(org.phenotips.variantstore.models.Info other) {
            super(org.phenotips.variantstore.models.Info.SCHEMA$);
      if (isValidValue(fields()[0], other.variantId)) {
        this.variantId = data().deepCopy(fields()[0].schema(), other.variantId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.ExomiserGene)) {
        this.ExomiserGene = data().deepCopy(fields()[1].schema(), other.ExomiserGene);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.ExomiserGenePhenoScore)) {
        this.ExomiserGenePhenoScore = data().deepCopy(fields()[2].schema(), other.ExomiserGenePhenoScore);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.ExomiserVariantScore)) {
        this.ExomiserVariantScore = data().deepCopy(fields()[3].schema(), other.ExomiserVariantScore);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.ExomiserGeneVariantScore)) {
        this.ExomiserGeneVariantScore = data().deepCopy(fields()[4].schema(), other.ExomiserGeneVariantScore);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.ExomiserGeneCominedScore)) {
        this.ExomiserGeneCominedScore = data().deepCopy(fields()[5].schema(), other.ExomiserGeneCominedScore);
        fieldSetFlags()[5] = true;
      }
    }

    /** Gets the value of the 'variantId' field */
    public java.lang.CharSequence getVariantId() {
      return variantId;
    }
    
    /** Sets the value of the 'variantId' field */
    public org.phenotips.variantstore.models.Info.Builder setVariantId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.variantId = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'variantId' field has been set */
    public boolean hasVariantId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'variantId' field */
    public org.phenotips.variantstore.models.Info.Builder clearVariantId() {
      variantId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'ExomiserGene' field */
    public java.lang.CharSequence getExomiserGene() {
      return ExomiserGene;
    }
    
    /** Sets the value of the 'ExomiserGene' field */
    public org.phenotips.variantstore.models.Info.Builder setExomiserGene(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.ExomiserGene = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'ExomiserGene' field has been set */
    public boolean hasExomiserGene() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'ExomiserGene' field */
    public org.phenotips.variantstore.models.Info.Builder clearExomiserGene() {
      ExomiserGene = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'ExomiserGenePhenoScore' field */
    public java.lang.Double getExomiserGenePhenoScore() {
      return ExomiserGenePhenoScore;
    }
    
    /** Sets the value of the 'ExomiserGenePhenoScore' field */
    public org.phenotips.variantstore.models.Info.Builder setExomiserGenePhenoScore(java.lang.Double value) {
      validate(fields()[2], value);
      this.ExomiserGenePhenoScore = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'ExomiserGenePhenoScore' field has been set */
    public boolean hasExomiserGenePhenoScore() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'ExomiserGenePhenoScore' field */
    public org.phenotips.variantstore.models.Info.Builder clearExomiserGenePhenoScore() {
      ExomiserGenePhenoScore = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'ExomiserVariantScore' field */
    public java.lang.Double getExomiserVariantScore() {
      return ExomiserVariantScore;
    }
    
    /** Sets the value of the 'ExomiserVariantScore' field */
    public org.phenotips.variantstore.models.Info.Builder setExomiserVariantScore(java.lang.Double value) {
      validate(fields()[3], value);
      this.ExomiserVariantScore = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'ExomiserVariantScore' field has been set */
    public boolean hasExomiserVariantScore() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'ExomiserVariantScore' field */
    public org.phenotips.variantstore.models.Info.Builder clearExomiserVariantScore() {
      ExomiserVariantScore = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'ExomiserGeneVariantScore' field */
    public java.lang.Double getExomiserGeneVariantScore() {
      return ExomiserGeneVariantScore;
    }
    
    /** Sets the value of the 'ExomiserGeneVariantScore' field */
    public org.phenotips.variantstore.models.Info.Builder setExomiserGeneVariantScore(java.lang.Double value) {
      validate(fields()[4], value);
      this.ExomiserGeneVariantScore = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'ExomiserGeneVariantScore' field has been set */
    public boolean hasExomiserGeneVariantScore() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'ExomiserGeneVariantScore' field */
    public org.phenotips.variantstore.models.Info.Builder clearExomiserGeneVariantScore() {
      ExomiserGeneVariantScore = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'ExomiserGeneCominedScore' field */
    public java.lang.Double getExomiserGeneCominedScore() {
      return ExomiserGeneCominedScore;
    }
    
    /** Sets the value of the 'ExomiserGeneCominedScore' field */
    public org.phenotips.variantstore.models.Info.Builder setExomiserGeneCominedScore(java.lang.Double value) {
      validate(fields()[5], value);
      this.ExomiserGeneCominedScore = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'ExomiserGeneCominedScore' field has been set */
    public boolean hasExomiserGeneCominedScore() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'ExomiserGeneCominedScore' field */
    public org.phenotips.variantstore.models.Info.Builder clearExomiserGeneCominedScore() {
      ExomiserGeneCominedScore = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    public Info build() {
      try {
        Info record = new Info();
        record.variantId = fieldSetFlags()[0] ? this.variantId : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.ExomiserGene = fieldSetFlags()[1] ? this.ExomiserGene : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.ExomiserGenePhenoScore = fieldSetFlags()[2] ? this.ExomiserGenePhenoScore : (java.lang.Double) defaultValue(fields()[2]);
        record.ExomiserVariantScore = fieldSetFlags()[3] ? this.ExomiserVariantScore : (java.lang.Double) defaultValue(fields()[3]);
        record.ExomiserGeneVariantScore = fieldSetFlags()[4] ? this.ExomiserGeneVariantScore : (java.lang.Double) defaultValue(fields()[4]);
        record.ExomiserGeneCominedScore = fieldSetFlags()[5] ? this.ExomiserGeneCominedScore : (java.lang.Double) defaultValue(fields()[5]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}