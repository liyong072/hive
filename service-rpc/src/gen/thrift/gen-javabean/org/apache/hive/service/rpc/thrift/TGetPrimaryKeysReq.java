/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hive.service.rpc.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)")
@org.apache.hadoop.hive.common.classification.InterfaceAudience.Public @org.apache.hadoop.hive.common.classification.InterfaceStability.Stable public class TGetPrimaryKeysReq implements org.apache.thrift.TBase<TGetPrimaryKeysReq, TGetPrimaryKeysReq._Fields>, java.io.Serializable, Cloneable, Comparable<TGetPrimaryKeysReq> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TGetPrimaryKeysReq");

  private static final org.apache.thrift.protocol.TField SESSION_HANDLE_FIELD_DESC = new org.apache.thrift.protocol.TField("sessionHandle", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField CATALOG_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("catalogName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField SCHEMA_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("schemaName", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField TABLE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("tableName", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TGetPrimaryKeysReqStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TGetPrimaryKeysReqTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable TSessionHandle sessionHandle; // required
  private @org.apache.thrift.annotation.Nullable java.lang.String catalogName; // optional
  private @org.apache.thrift.annotation.Nullable java.lang.String schemaName; // optional
  private @org.apache.thrift.annotation.Nullable java.lang.String tableName; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SESSION_HANDLE((short)1, "sessionHandle"),
    CATALOG_NAME((short)2, "catalogName"),
    SCHEMA_NAME((short)3, "schemaName"),
    TABLE_NAME((short)4, "tableName");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // SESSION_HANDLE
          return SESSION_HANDLE;
        case 2: // CATALOG_NAME
          return CATALOG_NAME;
        case 3: // SCHEMA_NAME
          return SCHEMA_NAME;
        case 4: // TABLE_NAME
          return TABLE_NAME;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.CATALOG_NAME,_Fields.SCHEMA_NAME,_Fields.TABLE_NAME};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SESSION_HANDLE, new org.apache.thrift.meta_data.FieldMetaData("sessionHandle", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TSessionHandle.class)));
    tmpMap.put(_Fields.CATALOG_NAME, new org.apache.thrift.meta_data.FieldMetaData("catalogName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TIdentifier")));
    tmpMap.put(_Fields.SCHEMA_NAME, new org.apache.thrift.meta_data.FieldMetaData("schemaName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TIdentifier")));
    tmpMap.put(_Fields.TABLE_NAME, new org.apache.thrift.meta_data.FieldMetaData("tableName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TIdentifier")));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TGetPrimaryKeysReq.class, metaDataMap);
  }

  public TGetPrimaryKeysReq() {
  }

  public TGetPrimaryKeysReq(
    TSessionHandle sessionHandle)
  {
    this();
    this.sessionHandle = sessionHandle;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TGetPrimaryKeysReq(TGetPrimaryKeysReq other) {
    if (other.isSetSessionHandle()) {
      this.sessionHandle = new TSessionHandle(other.sessionHandle);
    }
    if (other.isSetCatalogName()) {
      this.catalogName = other.catalogName;
    }
    if (other.isSetSchemaName()) {
      this.schemaName = other.schemaName;
    }
    if (other.isSetTableName()) {
      this.tableName = other.tableName;
    }
  }

  public TGetPrimaryKeysReq deepCopy() {
    return new TGetPrimaryKeysReq(this);
  }

  @Override
  public void clear() {
    this.sessionHandle = null;
    this.catalogName = null;
    this.schemaName = null;
    this.tableName = null;
  }

  @org.apache.thrift.annotation.Nullable
  public TSessionHandle getSessionHandle() {
    return this.sessionHandle;
  }

  public void setSessionHandle(@org.apache.thrift.annotation.Nullable TSessionHandle sessionHandle) {
    this.sessionHandle = sessionHandle;
  }

  public void unsetSessionHandle() {
    this.sessionHandle = null;
  }

  /** Returns true if field sessionHandle is set (has been assigned a value) and false otherwise */
  public boolean isSetSessionHandle() {
    return this.sessionHandle != null;
  }

  public void setSessionHandleIsSet(boolean value) {
    if (!value) {
      this.sessionHandle = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getCatalogName() {
    return this.catalogName;
  }

  public void setCatalogName(@org.apache.thrift.annotation.Nullable java.lang.String catalogName) {
    this.catalogName = catalogName;
  }

  public void unsetCatalogName() {
    this.catalogName = null;
  }

  /** Returns true if field catalogName is set (has been assigned a value) and false otherwise */
  public boolean isSetCatalogName() {
    return this.catalogName != null;
  }

  public void setCatalogNameIsSet(boolean value) {
    if (!value) {
      this.catalogName = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getSchemaName() {
    return this.schemaName;
  }

  public void setSchemaName(@org.apache.thrift.annotation.Nullable java.lang.String schemaName) {
    this.schemaName = schemaName;
  }

  public void unsetSchemaName() {
    this.schemaName = null;
  }

  /** Returns true if field schemaName is set (has been assigned a value) and false otherwise */
  public boolean isSetSchemaName() {
    return this.schemaName != null;
  }

  public void setSchemaNameIsSet(boolean value) {
    if (!value) {
      this.schemaName = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getTableName() {
    return this.tableName;
  }

  public void setTableName(@org.apache.thrift.annotation.Nullable java.lang.String tableName) {
    this.tableName = tableName;
  }

  public void unsetTableName() {
    this.tableName = null;
  }

  /** Returns true if field tableName is set (has been assigned a value) and false otherwise */
  public boolean isSetTableName() {
    return this.tableName != null;
  }

  public void setTableNameIsSet(boolean value) {
    if (!value) {
      this.tableName = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case SESSION_HANDLE:
      if (value == null) {
        unsetSessionHandle();
      } else {
        setSessionHandle((TSessionHandle)value);
      }
      break;

    case CATALOG_NAME:
      if (value == null) {
        unsetCatalogName();
      } else {
        setCatalogName((java.lang.String)value);
      }
      break;

    case SCHEMA_NAME:
      if (value == null) {
        unsetSchemaName();
      } else {
        setSchemaName((java.lang.String)value);
      }
      break;

    case TABLE_NAME:
      if (value == null) {
        unsetTableName();
      } else {
        setTableName((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SESSION_HANDLE:
      return getSessionHandle();

    case CATALOG_NAME:
      return getCatalogName();

    case SCHEMA_NAME:
      return getSchemaName();

    case TABLE_NAME:
      return getTableName();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case SESSION_HANDLE:
      return isSetSessionHandle();
    case CATALOG_NAME:
      return isSetCatalogName();
    case SCHEMA_NAME:
      return isSetSchemaName();
    case TABLE_NAME:
      return isSetTableName();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TGetPrimaryKeysReq)
      return this.equals((TGetPrimaryKeysReq)that);
    return false;
  }

  public boolean equals(TGetPrimaryKeysReq that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_sessionHandle = true && this.isSetSessionHandle();
    boolean that_present_sessionHandle = true && that.isSetSessionHandle();
    if (this_present_sessionHandle || that_present_sessionHandle) {
      if (!(this_present_sessionHandle && that_present_sessionHandle))
        return false;
      if (!this.sessionHandle.equals(that.sessionHandle))
        return false;
    }

    boolean this_present_catalogName = true && this.isSetCatalogName();
    boolean that_present_catalogName = true && that.isSetCatalogName();
    if (this_present_catalogName || that_present_catalogName) {
      if (!(this_present_catalogName && that_present_catalogName))
        return false;
      if (!this.catalogName.equals(that.catalogName))
        return false;
    }

    boolean this_present_schemaName = true && this.isSetSchemaName();
    boolean that_present_schemaName = true && that.isSetSchemaName();
    if (this_present_schemaName || that_present_schemaName) {
      if (!(this_present_schemaName && that_present_schemaName))
        return false;
      if (!this.schemaName.equals(that.schemaName))
        return false;
    }

    boolean this_present_tableName = true && this.isSetTableName();
    boolean that_present_tableName = true && that.isSetTableName();
    if (this_present_tableName || that_present_tableName) {
      if (!(this_present_tableName && that_present_tableName))
        return false;
      if (!this.tableName.equals(that.tableName))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetSessionHandle()) ? 131071 : 524287);
    if (isSetSessionHandle())
      hashCode = hashCode * 8191 + sessionHandle.hashCode();

    hashCode = hashCode * 8191 + ((isSetCatalogName()) ? 131071 : 524287);
    if (isSetCatalogName())
      hashCode = hashCode * 8191 + catalogName.hashCode();

    hashCode = hashCode * 8191 + ((isSetSchemaName()) ? 131071 : 524287);
    if (isSetSchemaName())
      hashCode = hashCode * 8191 + schemaName.hashCode();

    hashCode = hashCode * 8191 + ((isSetTableName()) ? 131071 : 524287);
    if (isSetTableName())
      hashCode = hashCode * 8191 + tableName.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TGetPrimaryKeysReq other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetSessionHandle()).compareTo(other.isSetSessionHandle());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSessionHandle()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sessionHandle, other.sessionHandle);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCatalogName()).compareTo(other.isSetCatalogName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCatalogName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.catalogName, other.catalogName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSchemaName()).compareTo(other.isSetSchemaName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSchemaName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.schemaName, other.schemaName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetTableName()).compareTo(other.isSetTableName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTableName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tableName, other.tableName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TGetPrimaryKeysReq(");
    boolean first = true;

    sb.append("sessionHandle:");
    if (this.sessionHandle == null) {
      sb.append("null");
    } else {
      sb.append(this.sessionHandle);
    }
    first = false;
    if (isSetCatalogName()) {
      if (!first) sb.append(", ");
      sb.append("catalogName:");
      if (this.catalogName == null) {
        sb.append("null");
      } else {
        sb.append(this.catalogName);
      }
      first = false;
    }
    if (isSetSchemaName()) {
      if (!first) sb.append(", ");
      sb.append("schemaName:");
      if (this.schemaName == null) {
        sb.append("null");
      } else {
        sb.append(this.schemaName);
      }
      first = false;
    }
    if (isSetTableName()) {
      if (!first) sb.append(", ");
      sb.append("tableName:");
      if (this.tableName == null) {
        sb.append("null");
      } else {
        sb.append(this.tableName);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetSessionHandle()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'sessionHandle' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
    if (sessionHandle != null) {
      sessionHandle.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TGetPrimaryKeysReqStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TGetPrimaryKeysReqStandardScheme getScheme() {
      return new TGetPrimaryKeysReqStandardScheme();
    }
  }

  private static class TGetPrimaryKeysReqStandardScheme extends org.apache.thrift.scheme.StandardScheme<TGetPrimaryKeysReq> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TGetPrimaryKeysReq struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SESSION_HANDLE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.sessionHandle = new TSessionHandle();
              struct.sessionHandle.read(iprot);
              struct.setSessionHandleIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CATALOG_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.catalogName = iprot.readString();
              struct.setCatalogNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SCHEMA_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.schemaName = iprot.readString();
              struct.setSchemaNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TABLE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.tableName = iprot.readString();
              struct.setTableNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TGetPrimaryKeysReq struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.sessionHandle != null) {
        oprot.writeFieldBegin(SESSION_HANDLE_FIELD_DESC);
        struct.sessionHandle.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.catalogName != null) {
        if (struct.isSetCatalogName()) {
          oprot.writeFieldBegin(CATALOG_NAME_FIELD_DESC);
          oprot.writeString(struct.catalogName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.schemaName != null) {
        if (struct.isSetSchemaName()) {
          oprot.writeFieldBegin(SCHEMA_NAME_FIELD_DESC);
          oprot.writeString(struct.schemaName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.tableName != null) {
        if (struct.isSetTableName()) {
          oprot.writeFieldBegin(TABLE_NAME_FIELD_DESC);
          oprot.writeString(struct.tableName);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TGetPrimaryKeysReqTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TGetPrimaryKeysReqTupleScheme getScheme() {
      return new TGetPrimaryKeysReqTupleScheme();
    }
  }

  private static class TGetPrimaryKeysReqTupleScheme extends org.apache.thrift.scheme.TupleScheme<TGetPrimaryKeysReq> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TGetPrimaryKeysReq struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.sessionHandle.write(oprot);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetCatalogName()) {
        optionals.set(0);
      }
      if (struct.isSetSchemaName()) {
        optionals.set(1);
      }
      if (struct.isSetTableName()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetCatalogName()) {
        oprot.writeString(struct.catalogName);
      }
      if (struct.isSetSchemaName()) {
        oprot.writeString(struct.schemaName);
      }
      if (struct.isSetTableName()) {
        oprot.writeString(struct.tableName);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TGetPrimaryKeysReq struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.sessionHandle = new TSessionHandle();
      struct.sessionHandle.read(iprot);
      struct.setSessionHandleIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.catalogName = iprot.readString();
        struct.setCatalogNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.schemaName = iprot.readString();
        struct.setSchemaNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.tableName = iprot.readString();
        struct.setTableNameIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

