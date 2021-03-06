/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.hadoop.thriftfs.api;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.thrift.*;
import org.apache.thrift.async.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

public class MetricsContext implements TBase<MetricsContext, MetricsContext._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("MetricsContext");

  private static final TField NAME_FIELD_DESC = new TField("name", TType.STRING, (short)1);
  private static final TField IS_MONITORING_FIELD_DESC = new TField("isMonitoring", TType.BOOL, (short)2);
  private static final TField PERIOD_FIELD_DESC = new TField("period", TType.I32, (short)3);
  private static final TField RECORDS_FIELD_DESC = new TField("records", TType.MAP, (short)4);

  public String name;
  public boolean isMonitoring;
  public int period;
  public Map<String,List<MetricsRecord>> records;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    NAME((short)1, "name"),
    IS_MONITORING((short)2, "isMonitoring"),
    PERIOD((short)3, "period"),
    RECORDS((short)4, "records");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // NAME
          return NAME;
        case 2: // IS_MONITORING
          return IS_MONITORING;
        case 3: // PERIOD
          return PERIOD;
        case 4: // RECORDS
          return RECORDS;
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
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ISMONITORING_ISSET_ID = 0;
  private static final int __PERIOD_ISSET_ID = 1;
  private BitSet __isset_bit_vector = new BitSet(2);

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NAME, new FieldMetaData("name", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.IS_MONITORING, new FieldMetaData("isMonitoring", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.BOOL)));
    tmpMap.put(_Fields.PERIOD, new FieldMetaData("period", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMap.put(_Fields.RECORDS, new FieldMetaData("records", TFieldRequirementType.DEFAULT, 
        new MapMetaData(TType.MAP, 
            new FieldValueMetaData(TType.STRING), 
            new ListMetaData(TType.LIST, 
                new StructMetaData(TType.STRUCT, MetricsRecord.class)))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(MetricsContext.class, metaDataMap);
  }

  public MetricsContext() {
  }

  public MetricsContext(
    String name,
    boolean isMonitoring,
    int period,
    Map<String,List<MetricsRecord>> records)
  {
    this();
    this.name = name;
    this.isMonitoring = isMonitoring;
    setIsMonitoringIsSet(true);
    this.period = period;
    setPeriodIsSet(true);
    this.records = records;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MetricsContext(MetricsContext other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetName()) {
      this.name = other.name;
    }
    this.isMonitoring = other.isMonitoring;
    this.period = other.period;
    if (other.isSetRecords()) {
      Map<String,List<MetricsRecord>> __this__records = new HashMap<String,List<MetricsRecord>>();
      for (Map.Entry<String, List<MetricsRecord>> other_element : other.records.entrySet()) {

        String other_element_key = other_element.getKey();
        List<MetricsRecord> other_element_value = other_element.getValue();

        String __this__records_copy_key = other_element_key;

        List<MetricsRecord> __this__records_copy_value = new ArrayList<MetricsRecord>();
        for (MetricsRecord other_element_value_element : other_element_value) {
          __this__records_copy_value.add(new MetricsRecord(other_element_value_element));
        }

        __this__records.put(__this__records_copy_key, __this__records_copy_value);
      }
      this.records = __this__records;
    }
  }

  public MetricsContext deepCopy() {
    return new MetricsContext(this);
  }

  @Override
  public void clear() {
    this.name = null;
    setIsMonitoringIsSet(false);
    this.isMonitoring = false;
    setPeriodIsSet(false);
    this.period = 0;
    this.records = null;
  }

  public String getName() {
    return this.name;
  }

  public MetricsContext setName(String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been asigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public boolean isIsMonitoring() {
    return this.isMonitoring;
  }

  public MetricsContext setIsMonitoring(boolean isMonitoring) {
    this.isMonitoring = isMonitoring;
    setIsMonitoringIsSet(true);
    return this;
  }

  public void unsetIsMonitoring() {
    __isset_bit_vector.clear(__ISMONITORING_ISSET_ID);
  }

  /** Returns true if field isMonitoring is set (has been asigned a value) and false otherwise */
  public boolean isSetIsMonitoring() {
    return __isset_bit_vector.get(__ISMONITORING_ISSET_ID);
  }

  public void setIsMonitoringIsSet(boolean value) {
    __isset_bit_vector.set(__ISMONITORING_ISSET_ID, value);
  }

  public int getPeriod() {
    return this.period;
  }

  public MetricsContext setPeriod(int period) {
    this.period = period;
    setPeriodIsSet(true);
    return this;
  }

  public void unsetPeriod() {
    __isset_bit_vector.clear(__PERIOD_ISSET_ID);
  }

  /** Returns true if field period is set (has been asigned a value) and false otherwise */
  public boolean isSetPeriod() {
    return __isset_bit_vector.get(__PERIOD_ISSET_ID);
  }

  public void setPeriodIsSet(boolean value) {
    __isset_bit_vector.set(__PERIOD_ISSET_ID, value);
  }

  public int getRecordsSize() {
    return (this.records == null) ? 0 : this.records.size();
  }

  public void putToRecords(String key, List<MetricsRecord> val) {
    if (this.records == null) {
      this.records = new HashMap<String,List<MetricsRecord>>();
    }
    this.records.put(key, val);
  }

  public Map<String,List<MetricsRecord>> getRecords() {
    return this.records;
  }

  public MetricsContext setRecords(Map<String,List<MetricsRecord>> records) {
    this.records = records;
    return this;
  }

  public void unsetRecords() {
    this.records = null;
  }

  /** Returns true if field records is set (has been asigned a value) and false otherwise */
  public boolean isSetRecords() {
    return this.records != null;
  }

  public void setRecordsIsSet(boolean value) {
    if (!value) {
      this.records = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case IS_MONITORING:
      if (value == null) {
        unsetIsMonitoring();
      } else {
        setIsMonitoring((Boolean)value);
      }
      break;

    case PERIOD:
      if (value == null) {
        unsetPeriod();
      } else {
        setPeriod((Integer)value);
      }
      break;

    case RECORDS:
      if (value == null) {
        unsetRecords();
      } else {
        setRecords((Map<String,List<MetricsRecord>>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NAME:
      return getName();

    case IS_MONITORING:
      return new Boolean(isIsMonitoring());

    case PERIOD:
      return new Integer(getPeriod());

    case RECORDS:
      return getRecords();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NAME:
      return isSetName();
    case IS_MONITORING:
      return isSetIsMonitoring();
    case PERIOD:
      return isSetPeriod();
    case RECORDS:
      return isSetRecords();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof MetricsContext)
      return this.equals((MetricsContext)that);
    return false;
  }

  public boolean equals(MetricsContext that) {
    if (that == null)
      return false;

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_isMonitoring = true;
    boolean that_present_isMonitoring = true;
    if (this_present_isMonitoring || that_present_isMonitoring) {
      if (!(this_present_isMonitoring && that_present_isMonitoring))
        return false;
      if (this.isMonitoring != that.isMonitoring)
        return false;
    }

    boolean this_present_period = true;
    boolean that_present_period = true;
    if (this_present_period || that_present_period) {
      if (!(this_present_period && that_present_period))
        return false;
      if (this.period != that.period)
        return false;
    }

    boolean this_present_records = true && this.isSetRecords();
    boolean that_present_records = true && that.isSetRecords();
    if (this_present_records || that_present_records) {
      if (!(this_present_records && that_present_records))
        return false;
      if (!this.records.equals(that.records))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(MetricsContext other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    MetricsContext typedOther = (MetricsContext)other;

    lastComparison = Boolean.valueOf(isSetName()).compareTo(typedOther.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = TBaseHelper.compareTo(this.name, typedOther.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIsMonitoring()).compareTo(typedOther.isSetIsMonitoring());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsMonitoring()) {
      lastComparison = TBaseHelper.compareTo(this.isMonitoring, typedOther.isMonitoring);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPeriod()).compareTo(typedOther.isSetPeriod());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPeriod()) {
      lastComparison = TBaseHelper.compareTo(this.period, typedOther.period);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRecords()).compareTo(typedOther.isSetRecords());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRecords()) {
      lastComparison = TBaseHelper.compareTo(this.records, typedOther.records);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // NAME
          if (field.type == TType.STRING) {
            this.name = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // IS_MONITORING
          if (field.type == TType.BOOL) {
            this.isMonitoring = iprot.readBool();
            setIsMonitoringIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // PERIOD
          if (field.type == TType.I32) {
            this.period = iprot.readI32();
            setPeriodIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // RECORDS
          if (field.type == TType.MAP) {
            {
              TMap _map19 = iprot.readMapBegin();
              this.records = new HashMap<String,List<MetricsRecord>>(2*_map19.size);
              for (int _i20 = 0; _i20 < _map19.size; ++_i20)
              {
                String _key21;
                List<MetricsRecord> _val22;
                _key21 = iprot.readString();
                {
                  TList _list23 = iprot.readListBegin();
                  _val22 = new ArrayList<MetricsRecord>(_list23.size);
                  for (int _i24 = 0; _i24 < _list23.size; ++_i24)
                  {
                    MetricsRecord _elem25;
                    _elem25 = new MetricsRecord();
                    _elem25.read(iprot);
                    _val22.add(_elem25);
                  }
                  iprot.readListEnd();
                }
                this.records.put(_key21, _val22);
              }
              iprot.readMapEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.name != null) {
      oprot.writeFieldBegin(NAME_FIELD_DESC);
      oprot.writeString(this.name);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(IS_MONITORING_FIELD_DESC);
    oprot.writeBool(this.isMonitoring);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(PERIOD_FIELD_DESC);
    oprot.writeI32(this.period);
    oprot.writeFieldEnd();
    if (this.records != null) {
      oprot.writeFieldBegin(RECORDS_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.STRING, TType.LIST, this.records.size()));
        for (Map.Entry<String, List<MetricsRecord>> _iter26 : this.records.entrySet())
        {
          oprot.writeString(_iter26.getKey());
          {
            oprot.writeListBegin(new TList(TType.STRUCT, _iter26.getValue().size()));
            for (MetricsRecord _iter27 : _iter26.getValue())
            {
              _iter27.write(oprot);
            }
            oprot.writeListEnd();
          }
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("MetricsContext(");
    boolean first = true;

    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("isMonitoring:");
    sb.append(this.isMonitoring);
    first = false;
    if (!first) sb.append(", ");
    sb.append("period:");
    sb.append(this.period);
    first = false;
    if (!first) sb.append(", ");
    sb.append("records:");
    if (this.records == null) {
      sb.append("null");
    } else {
      sb.append(this.records);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

