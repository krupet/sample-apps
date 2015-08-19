/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.kaaproject.kaa.examples.robotrun.gen;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Borders extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Borders\",\"namespace\":\"org.kaaproject.kaa.examples.robotrun.gen\",\"fields\":[{\"name\":\"hBorders\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Border\",\"fields\":[{\"name\":\"x\",\"type\":\"int\",\"optional\":true},{\"name\":\"y\",\"type\":\"int\",\"optional\":true},{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"BorderType\",\"symbols\":[\"UNKNOWN\",\"SOLID\",\"FREE\"]},\"optional\":true}]}},\"optional\":true},{\"name\":\"vBorders\",\"type\":{\"type\":\"array\",\"items\":\"Border\"},\"optional\":true}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private java.util.List<org.kaaproject.kaa.examples.robotrun.gen.Border> hBorders;
   private java.util.List<org.kaaproject.kaa.examples.robotrun.gen.Border> vBorders;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}. 
   */
  public Borders() {}

  /**
   * All-args constructor.
   */
  public Borders(java.util.List<org.kaaproject.kaa.examples.robotrun.gen.Border> hBorders, java.util.List<org.kaaproject.kaa.examples.robotrun.gen.Border> vBorders) {
    this.hBorders = hBorders;
    this.vBorders = vBorders;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return hBorders;
    case 1: return vBorders;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: hBorders = (java.util.List<org.kaaproject.kaa.examples.robotrun.gen.Border>)value$; break;
    case 1: vBorders = (java.util.List<org.kaaproject.kaa.examples.robotrun.gen.Border>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'hBorders' field.
   */
  public java.util.List<org.kaaproject.kaa.examples.robotrun.gen.Border> getHBorders() {
    return hBorders;
  }

  /**
   * Sets the value of the 'hBorders' field.
   * @param value the value to set.
   */
  public void setHBorders(java.util.List<org.kaaproject.kaa.examples.robotrun.gen.Border> value) {
    this.hBorders = value;
  }

  /**
   * Gets the value of the 'vBorders' field.
   */
  public java.util.List<org.kaaproject.kaa.examples.robotrun.gen.Border> getVBorders() {
    return vBorders;
  }

  /**
   * Sets the value of the 'vBorders' field.
   * @param value the value to set.
   */
  public void setVBorders(java.util.List<org.kaaproject.kaa.examples.robotrun.gen.Border> value) {
    this.vBorders = value;
  }

  /** Creates a new Borders RecordBuilder */
  public static org.kaaproject.kaa.examples.robotrun.gen.Borders.Builder newBuilder() {
    return new org.kaaproject.kaa.examples.robotrun.gen.Borders.Builder();
  }
  
  /** Creates a new Borders RecordBuilder by copying an existing Builder */
  public static org.kaaproject.kaa.examples.robotrun.gen.Borders.Builder newBuilder(org.kaaproject.kaa.examples.robotrun.gen.Borders.Builder other) {
    return new org.kaaproject.kaa.examples.robotrun.gen.Borders.Builder(other);
  }
  
  /** Creates a new Borders RecordBuilder by copying an existing Borders instance */
  public static org.kaaproject.kaa.examples.robotrun.gen.Borders.Builder newBuilder(org.kaaproject.kaa.examples.robotrun.gen.Borders other) {
    return new org.kaaproject.kaa.examples.robotrun.gen.Borders.Builder(other);
  }
  
  /**
   * RecordBuilder for Borders instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Borders>
    implements org.apache.avro.data.RecordBuilder<Borders> {

    private java.util.List<org.kaaproject.kaa.examples.robotrun.gen.Border> hBorders;
    private java.util.List<org.kaaproject.kaa.examples.robotrun.gen.Border> vBorders;

    /** Creates a new Builder */
    private Builder() {
      super(org.kaaproject.kaa.examples.robotrun.gen.Borders.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.kaaproject.kaa.examples.robotrun.gen.Borders.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.hBorders)) {
        this.hBorders = data().deepCopy(fields()[0].schema(), other.hBorders);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.vBorders)) {
        this.vBorders = data().deepCopy(fields()[1].schema(), other.vBorders);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Borders instance */
    private Builder(org.kaaproject.kaa.examples.robotrun.gen.Borders other) {
            super(org.kaaproject.kaa.examples.robotrun.gen.Borders.SCHEMA$);
      if (isValidValue(fields()[0], other.hBorders)) {
        this.hBorders = data().deepCopy(fields()[0].schema(), other.hBorders);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.vBorders)) {
        this.vBorders = data().deepCopy(fields()[1].schema(), other.vBorders);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'hBorders' field */
    public java.util.List<org.kaaproject.kaa.examples.robotrun.gen.Border> getHBorders() {
      return hBorders;
    }
    
    /** Sets the value of the 'hBorders' field */
    public org.kaaproject.kaa.examples.robotrun.gen.Borders.Builder setHBorders(java.util.List<org.kaaproject.kaa.examples.robotrun.gen.Border> value) {
      validate(fields()[0], value);
      this.hBorders = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'hBorders' field has been set */
    public boolean hasHBorders() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'hBorders' field */
    public org.kaaproject.kaa.examples.robotrun.gen.Borders.Builder clearHBorders() {
      hBorders = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'vBorders' field */
    public java.util.List<org.kaaproject.kaa.examples.robotrun.gen.Border> getVBorders() {
      return vBorders;
    }
    
    /** Sets the value of the 'vBorders' field */
    public org.kaaproject.kaa.examples.robotrun.gen.Borders.Builder setVBorders(java.util.List<org.kaaproject.kaa.examples.robotrun.gen.Border> value) {
      validate(fields()[1], value);
      this.vBorders = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'vBorders' field has been set */
    public boolean hasVBorders() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'vBorders' field */
    public org.kaaproject.kaa.examples.robotrun.gen.Borders.Builder clearVBorders() {
      vBorders = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public Borders build() {
      try {
        Borders record = new Borders();
        record.hBorders = fieldSetFlags()[0] ? this.hBorders : (java.util.List<org.kaaproject.kaa.examples.robotrun.gen.Border>) defaultValue(fields()[0]);
        record.vBorders = fieldSetFlags()[1] ? this.vBorders : (java.util.List<org.kaaproject.kaa.examples.robotrun.gen.Border>) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
