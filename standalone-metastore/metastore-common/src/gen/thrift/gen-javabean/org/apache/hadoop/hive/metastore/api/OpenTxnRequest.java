/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)")
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class OpenTxnRequest implements org.apache.thrift.TBase<OpenTxnRequest, OpenTxnRequest._Fields>, java.io.Serializable, Cloneable, Comparable<OpenTxnRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("OpenTxnRequest");

  private static final org.apache.thrift.protocol.TField NUM_TXNS_FIELD_DESC = new org.apache.thrift.protocol.TField("num_txns", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField USER_FIELD_DESC = new org.apache.thrift.protocol.TField("user", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField HOSTNAME_FIELD_DESC = new org.apache.thrift.protocol.TField("hostname", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField AGENT_INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("agentInfo", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField REPL_POLICY_FIELD_DESC = new org.apache.thrift.protocol.TField("replPolicy", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField REPL_SRC_TXN_IDS_FIELD_DESC = new org.apache.thrift.protocol.TField("replSrcTxnIds", org.apache.thrift.protocol.TType.LIST, (short)6);
  private static final org.apache.thrift.protocol.TField TXN_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("txn_type", org.apache.thrift.protocol.TType.I32, (short)7);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new OpenTxnRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new OpenTxnRequestTupleSchemeFactory();

  private int num_txns; // required
  private @org.apache.thrift.annotation.Nullable java.lang.String user; // required
  private @org.apache.thrift.annotation.Nullable java.lang.String hostname; // required
  private @org.apache.thrift.annotation.Nullable java.lang.String agentInfo; // optional
  private @org.apache.thrift.annotation.Nullable java.lang.String replPolicy; // optional
  private @org.apache.thrift.annotation.Nullable java.util.List<java.lang.Long> replSrcTxnIds; // optional
  private @org.apache.thrift.annotation.Nullable TxnType txn_type; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NUM_TXNS((short)1, "num_txns"),
    USER((short)2, "user"),
    HOSTNAME((short)3, "hostname"),
    AGENT_INFO((short)4, "agentInfo"),
    REPL_POLICY((short)5, "replPolicy"),
    REPL_SRC_TXN_IDS((short)6, "replSrcTxnIds"),
    /**
     * 
     * @see TxnType
     */
    TXN_TYPE((short)7, "txn_type");

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
        case 1: // NUM_TXNS
          return NUM_TXNS;
        case 2: // USER
          return USER;
        case 3: // HOSTNAME
          return HOSTNAME;
        case 4: // AGENT_INFO
          return AGENT_INFO;
        case 5: // REPL_POLICY
          return REPL_POLICY;
        case 6: // REPL_SRC_TXN_IDS
          return REPL_SRC_TXN_IDS;
        case 7: // TXN_TYPE
          return TXN_TYPE;
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
  private static final int __NUM_TXNS_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.AGENT_INFO,_Fields.REPL_POLICY,_Fields.REPL_SRC_TXN_IDS,_Fields.TXN_TYPE};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NUM_TXNS, new org.apache.thrift.meta_data.FieldMetaData("num_txns", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.USER, new org.apache.thrift.meta_data.FieldMetaData("user", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.HOSTNAME, new org.apache.thrift.meta_data.FieldMetaData("hostname", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.AGENT_INFO, new org.apache.thrift.meta_data.FieldMetaData("agentInfo", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.REPL_POLICY, new org.apache.thrift.meta_data.FieldMetaData("replPolicy", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.REPL_SRC_TXN_IDS, new org.apache.thrift.meta_data.FieldMetaData("replSrcTxnIds", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64))));
    tmpMap.put(_Fields.TXN_TYPE, new org.apache.thrift.meta_data.FieldMetaData("txn_type", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TxnType.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(OpenTxnRequest.class, metaDataMap);
  }

  public OpenTxnRequest() {
    this.agentInfo = "Unknown";

    this.txn_type = org.apache.hadoop.hive.metastore.api.TxnType.DEFAULT;

  }

  public OpenTxnRequest(
    int num_txns,
    java.lang.String user,
    java.lang.String hostname)
  {
    this();
    this.num_txns = num_txns;
    setNum_txnsIsSet(true);
    this.user = user;
    this.hostname = hostname;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public OpenTxnRequest(OpenTxnRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    this.num_txns = other.num_txns;
    if (other.isSetUser()) {
      this.user = other.user;
    }
    if (other.isSetHostname()) {
      this.hostname = other.hostname;
    }
    if (other.isSetAgentInfo()) {
      this.agentInfo = other.agentInfo;
    }
    if (other.isSetReplPolicy()) {
      this.replPolicy = other.replPolicy;
    }
    if (other.isSetReplSrcTxnIds()) {
      java.util.List<java.lang.Long> __this__replSrcTxnIds = new java.util.ArrayList<java.lang.Long>(other.replSrcTxnIds);
      this.replSrcTxnIds = __this__replSrcTxnIds;
    }
    if (other.isSetTxn_type()) {
      this.txn_type = other.txn_type;
    }
  }

  public OpenTxnRequest deepCopy() {
    return new OpenTxnRequest(this);
  }

  @Override
  public void clear() {
    setNum_txnsIsSet(false);
    this.num_txns = 0;
    this.user = null;
    this.hostname = null;
    this.agentInfo = "Unknown";

    this.replPolicy = null;
    this.replSrcTxnIds = null;
    this.txn_type = org.apache.hadoop.hive.metastore.api.TxnType.DEFAULT;

  }

  public int getNum_txns() {
    return this.num_txns;
  }

  public void setNum_txns(int num_txns) {
    this.num_txns = num_txns;
    setNum_txnsIsSet(true);
  }

  public void unsetNum_txns() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __NUM_TXNS_ISSET_ID);
  }

  /** Returns true if field num_txns is set (has been assigned a value) and false otherwise */
  public boolean isSetNum_txns() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __NUM_TXNS_ISSET_ID);
  }

  public void setNum_txnsIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __NUM_TXNS_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getUser() {
    return this.user;
  }

  public void setUser(@org.apache.thrift.annotation.Nullable java.lang.String user) {
    this.user = user;
  }

  public void unsetUser() {
    this.user = null;
  }

  /** Returns true if field user is set (has been assigned a value) and false otherwise */
  public boolean isSetUser() {
    return this.user != null;
  }

  public void setUserIsSet(boolean value) {
    if (!value) {
      this.user = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getHostname() {
    return this.hostname;
  }

  public void setHostname(@org.apache.thrift.annotation.Nullable java.lang.String hostname) {
    this.hostname = hostname;
  }

  public void unsetHostname() {
    this.hostname = null;
  }

  /** Returns true if field hostname is set (has been assigned a value) and false otherwise */
  public boolean isSetHostname() {
    return this.hostname != null;
  }

  public void setHostnameIsSet(boolean value) {
    if (!value) {
      this.hostname = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getAgentInfo() {
    return this.agentInfo;
  }

  public void setAgentInfo(@org.apache.thrift.annotation.Nullable java.lang.String agentInfo) {
    this.agentInfo = agentInfo;
  }

  public void unsetAgentInfo() {
    this.agentInfo = null;
  }

  /** Returns true if field agentInfo is set (has been assigned a value) and false otherwise */
  public boolean isSetAgentInfo() {
    return this.agentInfo != null;
  }

  public void setAgentInfoIsSet(boolean value) {
    if (!value) {
      this.agentInfo = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getReplPolicy() {
    return this.replPolicy;
  }

  public void setReplPolicy(@org.apache.thrift.annotation.Nullable java.lang.String replPolicy) {
    this.replPolicy = replPolicy;
  }

  public void unsetReplPolicy() {
    this.replPolicy = null;
  }

  /** Returns true if field replPolicy is set (has been assigned a value) and false otherwise */
  public boolean isSetReplPolicy() {
    return this.replPolicy != null;
  }

  public void setReplPolicyIsSet(boolean value) {
    if (!value) {
      this.replPolicy = null;
    }
  }

  public int getReplSrcTxnIdsSize() {
    return (this.replSrcTxnIds == null) ? 0 : this.replSrcTxnIds.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.Long> getReplSrcTxnIdsIterator() {
    return (this.replSrcTxnIds == null) ? null : this.replSrcTxnIds.iterator();
  }

  public void addToReplSrcTxnIds(long elem) {
    if (this.replSrcTxnIds == null) {
      this.replSrcTxnIds = new java.util.ArrayList<java.lang.Long>();
    }
    this.replSrcTxnIds.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.Long> getReplSrcTxnIds() {
    return this.replSrcTxnIds;
  }

  public void setReplSrcTxnIds(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.Long> replSrcTxnIds) {
    this.replSrcTxnIds = replSrcTxnIds;
  }

  public void unsetReplSrcTxnIds() {
    this.replSrcTxnIds = null;
  }

  /** Returns true if field replSrcTxnIds is set (has been assigned a value) and false otherwise */
  public boolean isSetReplSrcTxnIds() {
    return this.replSrcTxnIds != null;
  }

  public void setReplSrcTxnIdsIsSet(boolean value) {
    if (!value) {
      this.replSrcTxnIds = null;
    }
  }

  /**
   * 
   * @see TxnType
   */
  @org.apache.thrift.annotation.Nullable
  public TxnType getTxn_type() {
    return this.txn_type;
  }

  /**
   * 
   * @see TxnType
   */
  public void setTxn_type(@org.apache.thrift.annotation.Nullable TxnType txn_type) {
    this.txn_type = txn_type;
  }

  public void unsetTxn_type() {
    this.txn_type = null;
  }

  /** Returns true if field txn_type is set (has been assigned a value) and false otherwise */
  public boolean isSetTxn_type() {
    return this.txn_type != null;
  }

  public void setTxn_typeIsSet(boolean value) {
    if (!value) {
      this.txn_type = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case NUM_TXNS:
      if (value == null) {
        unsetNum_txns();
      } else {
        setNum_txns((java.lang.Integer)value);
      }
      break;

    case USER:
      if (value == null) {
        unsetUser();
      } else {
        setUser((java.lang.String)value);
      }
      break;

    case HOSTNAME:
      if (value == null) {
        unsetHostname();
      } else {
        setHostname((java.lang.String)value);
      }
      break;

    case AGENT_INFO:
      if (value == null) {
        unsetAgentInfo();
      } else {
        setAgentInfo((java.lang.String)value);
      }
      break;

    case REPL_POLICY:
      if (value == null) {
        unsetReplPolicy();
      } else {
        setReplPolicy((java.lang.String)value);
      }
      break;

    case REPL_SRC_TXN_IDS:
      if (value == null) {
        unsetReplSrcTxnIds();
      } else {
        setReplSrcTxnIds((java.util.List<java.lang.Long>)value);
      }
      break;

    case TXN_TYPE:
      if (value == null) {
        unsetTxn_type();
      } else {
        setTxn_type((TxnType)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case NUM_TXNS:
      return getNum_txns();

    case USER:
      return getUser();

    case HOSTNAME:
      return getHostname();

    case AGENT_INFO:
      return getAgentInfo();

    case REPL_POLICY:
      return getReplPolicy();

    case REPL_SRC_TXN_IDS:
      return getReplSrcTxnIds();

    case TXN_TYPE:
      return getTxn_type();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case NUM_TXNS:
      return isSetNum_txns();
    case USER:
      return isSetUser();
    case HOSTNAME:
      return isSetHostname();
    case AGENT_INFO:
      return isSetAgentInfo();
    case REPL_POLICY:
      return isSetReplPolicy();
    case REPL_SRC_TXN_IDS:
      return isSetReplSrcTxnIds();
    case TXN_TYPE:
      return isSetTxn_type();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof OpenTxnRequest)
      return this.equals((OpenTxnRequest)that);
    return false;
  }

  public boolean equals(OpenTxnRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_num_txns = true;
    boolean that_present_num_txns = true;
    if (this_present_num_txns || that_present_num_txns) {
      if (!(this_present_num_txns && that_present_num_txns))
        return false;
      if (this.num_txns != that.num_txns)
        return false;
    }

    boolean this_present_user = true && this.isSetUser();
    boolean that_present_user = true && that.isSetUser();
    if (this_present_user || that_present_user) {
      if (!(this_present_user && that_present_user))
        return false;
      if (!this.user.equals(that.user))
        return false;
    }

    boolean this_present_hostname = true && this.isSetHostname();
    boolean that_present_hostname = true && that.isSetHostname();
    if (this_present_hostname || that_present_hostname) {
      if (!(this_present_hostname && that_present_hostname))
        return false;
      if (!this.hostname.equals(that.hostname))
        return false;
    }

    boolean this_present_agentInfo = true && this.isSetAgentInfo();
    boolean that_present_agentInfo = true && that.isSetAgentInfo();
    if (this_present_agentInfo || that_present_agentInfo) {
      if (!(this_present_agentInfo && that_present_agentInfo))
        return false;
      if (!this.agentInfo.equals(that.agentInfo))
        return false;
    }

    boolean this_present_replPolicy = true && this.isSetReplPolicy();
    boolean that_present_replPolicy = true && that.isSetReplPolicy();
    if (this_present_replPolicy || that_present_replPolicy) {
      if (!(this_present_replPolicy && that_present_replPolicy))
        return false;
      if (!this.replPolicy.equals(that.replPolicy))
        return false;
    }

    boolean this_present_replSrcTxnIds = true && this.isSetReplSrcTxnIds();
    boolean that_present_replSrcTxnIds = true && that.isSetReplSrcTxnIds();
    if (this_present_replSrcTxnIds || that_present_replSrcTxnIds) {
      if (!(this_present_replSrcTxnIds && that_present_replSrcTxnIds))
        return false;
      if (!this.replSrcTxnIds.equals(that.replSrcTxnIds))
        return false;
    }

    boolean this_present_txn_type = true && this.isSetTxn_type();
    boolean that_present_txn_type = true && that.isSetTxn_type();
    if (this_present_txn_type || that_present_txn_type) {
      if (!(this_present_txn_type && that_present_txn_type))
        return false;
      if (!this.txn_type.equals(that.txn_type))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + num_txns;

    hashCode = hashCode * 8191 + ((isSetUser()) ? 131071 : 524287);
    if (isSetUser())
      hashCode = hashCode * 8191 + user.hashCode();

    hashCode = hashCode * 8191 + ((isSetHostname()) ? 131071 : 524287);
    if (isSetHostname())
      hashCode = hashCode * 8191 + hostname.hashCode();

    hashCode = hashCode * 8191 + ((isSetAgentInfo()) ? 131071 : 524287);
    if (isSetAgentInfo())
      hashCode = hashCode * 8191 + agentInfo.hashCode();

    hashCode = hashCode * 8191 + ((isSetReplPolicy()) ? 131071 : 524287);
    if (isSetReplPolicy())
      hashCode = hashCode * 8191 + replPolicy.hashCode();

    hashCode = hashCode * 8191 + ((isSetReplSrcTxnIds()) ? 131071 : 524287);
    if (isSetReplSrcTxnIds())
      hashCode = hashCode * 8191 + replSrcTxnIds.hashCode();

    hashCode = hashCode * 8191 + ((isSetTxn_type()) ? 131071 : 524287);
    if (isSetTxn_type())
      hashCode = hashCode * 8191 + txn_type.getValue();

    return hashCode;
  }

  @Override
  public int compareTo(OpenTxnRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetNum_txns()).compareTo(other.isSetNum_txns());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNum_txns()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.num_txns, other.num_txns);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUser()).compareTo(other.isSetUser());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUser()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.user, other.user);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetHostname()).compareTo(other.isSetHostname());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHostname()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hostname, other.hostname);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetAgentInfo()).compareTo(other.isSetAgentInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAgentInfo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.agentInfo, other.agentInfo);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetReplPolicy()).compareTo(other.isSetReplPolicy());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReplPolicy()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.replPolicy, other.replPolicy);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetReplSrcTxnIds()).compareTo(other.isSetReplSrcTxnIds());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReplSrcTxnIds()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.replSrcTxnIds, other.replSrcTxnIds);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetTxn_type()).compareTo(other.isSetTxn_type());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTxn_type()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.txn_type, other.txn_type);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("OpenTxnRequest(");
    boolean first = true;

    sb.append("num_txns:");
    sb.append(this.num_txns);
    first = false;
    if (!first) sb.append(", ");
    sb.append("user:");
    if (this.user == null) {
      sb.append("null");
    } else {
      sb.append(this.user);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("hostname:");
    if (this.hostname == null) {
      sb.append("null");
    } else {
      sb.append(this.hostname);
    }
    first = false;
    if (isSetAgentInfo()) {
      if (!first) sb.append(", ");
      sb.append("agentInfo:");
      if (this.agentInfo == null) {
        sb.append("null");
      } else {
        sb.append(this.agentInfo);
      }
      first = false;
    }
    if (isSetReplPolicy()) {
      if (!first) sb.append(", ");
      sb.append("replPolicy:");
      if (this.replPolicy == null) {
        sb.append("null");
      } else {
        sb.append(this.replPolicy);
      }
      first = false;
    }
    if (isSetReplSrcTxnIds()) {
      if (!first) sb.append(", ");
      sb.append("replSrcTxnIds:");
      if (this.replSrcTxnIds == null) {
        sb.append("null");
      } else {
        sb.append(this.replSrcTxnIds);
      }
      first = false;
    }
    if (isSetTxn_type()) {
      if (!first) sb.append(", ");
      sb.append("txn_type:");
      if (this.txn_type == null) {
        sb.append("null");
      } else {
        sb.append(this.txn_type);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetNum_txns()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'num_txns' is unset! Struct:" + toString());
    }

    if (!isSetUser()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'user' is unset! Struct:" + toString());
    }

    if (!isSetHostname()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'hostname' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class OpenTxnRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public OpenTxnRequestStandardScheme getScheme() {
      return new OpenTxnRequestStandardScheme();
    }
  }

  private static class OpenTxnRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<OpenTxnRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, OpenTxnRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NUM_TXNS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.num_txns = iprot.readI32();
              struct.setNum_txnsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // USER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.user = iprot.readString();
              struct.setUserIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // HOSTNAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.hostname = iprot.readString();
              struct.setHostnameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // AGENT_INFO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.agentInfo = iprot.readString();
              struct.setAgentInfoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // REPL_POLICY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.replPolicy = iprot.readString();
              struct.setReplPolicyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // REPL_SRC_TXN_IDS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list682 = iprot.readListBegin();
                struct.replSrcTxnIds = new java.util.ArrayList<java.lang.Long>(_list682.size);
                long _elem683;
                for (int _i684 = 0; _i684 < _list682.size; ++_i684)
                {
                  _elem683 = iprot.readI64();
                  struct.replSrcTxnIds.add(_elem683);
                }
                iprot.readListEnd();
              }
              struct.setReplSrcTxnIdsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // TXN_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.txn_type = org.apache.hadoop.hive.metastore.api.TxnType.findByValue(iprot.readI32());
              struct.setTxn_typeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, OpenTxnRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(NUM_TXNS_FIELD_DESC);
      oprot.writeI32(struct.num_txns);
      oprot.writeFieldEnd();
      if (struct.user != null) {
        oprot.writeFieldBegin(USER_FIELD_DESC);
        oprot.writeString(struct.user);
        oprot.writeFieldEnd();
      }
      if (struct.hostname != null) {
        oprot.writeFieldBegin(HOSTNAME_FIELD_DESC);
        oprot.writeString(struct.hostname);
        oprot.writeFieldEnd();
      }
      if (struct.agentInfo != null) {
        if (struct.isSetAgentInfo()) {
          oprot.writeFieldBegin(AGENT_INFO_FIELD_DESC);
          oprot.writeString(struct.agentInfo);
          oprot.writeFieldEnd();
        }
      }
      if (struct.replPolicy != null) {
        if (struct.isSetReplPolicy()) {
          oprot.writeFieldBegin(REPL_POLICY_FIELD_DESC);
          oprot.writeString(struct.replPolicy);
          oprot.writeFieldEnd();
        }
      }
      if (struct.replSrcTxnIds != null) {
        if (struct.isSetReplSrcTxnIds()) {
          oprot.writeFieldBegin(REPL_SRC_TXN_IDS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, struct.replSrcTxnIds.size()));
            for (long _iter685 : struct.replSrcTxnIds)
            {
              oprot.writeI64(_iter685);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.txn_type != null) {
        if (struct.isSetTxn_type()) {
          oprot.writeFieldBegin(TXN_TYPE_FIELD_DESC);
          oprot.writeI32(struct.txn_type.getValue());
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class OpenTxnRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public OpenTxnRequestTupleScheme getScheme() {
      return new OpenTxnRequestTupleScheme();
    }
  }

  private static class OpenTxnRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<OpenTxnRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, OpenTxnRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI32(struct.num_txns);
      oprot.writeString(struct.user);
      oprot.writeString(struct.hostname);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetAgentInfo()) {
        optionals.set(0);
      }
      if (struct.isSetReplPolicy()) {
        optionals.set(1);
      }
      if (struct.isSetReplSrcTxnIds()) {
        optionals.set(2);
      }
      if (struct.isSetTxn_type()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetAgentInfo()) {
        oprot.writeString(struct.agentInfo);
      }
      if (struct.isSetReplPolicy()) {
        oprot.writeString(struct.replPolicy);
      }
      if (struct.isSetReplSrcTxnIds()) {
        {
          oprot.writeI32(struct.replSrcTxnIds.size());
          for (long _iter686 : struct.replSrcTxnIds)
          {
            oprot.writeI64(_iter686);
          }
        }
      }
      if (struct.isSetTxn_type()) {
        oprot.writeI32(struct.txn_type.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, OpenTxnRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.num_txns = iprot.readI32();
      struct.setNum_txnsIsSet(true);
      struct.user = iprot.readString();
      struct.setUserIsSet(true);
      struct.hostname = iprot.readString();
      struct.setHostnameIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.agentInfo = iprot.readString();
        struct.setAgentInfoIsSet(true);
      }
      if (incoming.get(1)) {
        struct.replPolicy = iprot.readString();
        struct.setReplPolicyIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list687 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, iprot.readI32());
          struct.replSrcTxnIds = new java.util.ArrayList<java.lang.Long>(_list687.size);
          long _elem688;
          for (int _i689 = 0; _i689 < _list687.size; ++_i689)
          {
            _elem688 = iprot.readI64();
            struct.replSrcTxnIds.add(_elem688);
          }
        }
        struct.setReplSrcTxnIdsIsSet(true);
      }
      if (incoming.get(3)) {
        struct.txn_type = org.apache.hadoop.hive.metastore.api.TxnType.findByValue(iprot.readI32());
        struct.setTxn_typeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

