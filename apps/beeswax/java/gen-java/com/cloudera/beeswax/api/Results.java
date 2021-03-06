/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.cloudera.beeswax.api;

import org.apache.commons.lang.builder.HashCodeBuilder;
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

public class Results implements TBase<Results, Results._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("Results");

  private static final TField READY_FIELD_DESC = new TField("ready", TType.BOOL, (short)1);
  private static final TField COLUMNS_FIELD_DESC = new TField("columns", TType.LIST, (short)2);
  private static final TField DATA_FIELD_DESC = new TField("data", TType.LIST, (short)3);
  private static final TField START_ROW_FIELD_DESC = new TField("start_row", TType.I64, (short)4);
  private static final TField HAS_MORE_FIELD_DESC = new TField("has_more", TType.BOOL, (short)5);

  public boolean ready;
  public List<String> columns;
  public List<String> data;
  public long start_row;
  public boolean has_more;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    READY((short)1, "ready"),
    COLUMNS((short)2, "columns"),
    DATA((short)3, "data"),
    START_ROW((short)4, "start_row"),
    HAS_MORE((short)5, "has_more");

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
        case 1: // READY
          return READY;
        case 2: // COLUMNS
          return COLUMNS;
        case 3: // DATA
          return DATA;
        case 4: // START_ROW
          return START_ROW;
        case 5: // HAS_MORE
          return HAS_MORE;
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
  private static final int __READY_ISSET_ID = 0;
  private static final int __START_ROW_ISSET_ID = 1;
  private static final int __HAS_MORE_ISSET_ID = 2;
  private BitSet __isset_bit_vector = new BitSet(3);

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.READY, new FieldMetaData("ready", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.BOOL)));
    tmpMap.put(_Fields.COLUMNS, new FieldMetaData("columns", TFieldRequirementType.DEFAULT, 
        new ListMetaData(TType.LIST, 
            new FieldValueMetaData(TType.STRING))));
    tmpMap.put(_Fields.DATA, new FieldMetaData("data", TFieldRequirementType.DEFAULT, 
        new ListMetaData(TType.LIST, 
            new FieldValueMetaData(TType.STRING))));
    tmpMap.put(_Fields.START_ROW, new FieldMetaData("start_row", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
    tmpMap.put(_Fields.HAS_MORE, new FieldMetaData("has_more", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(Results.class, metaDataMap);
  }

  public Results() {
  }

  public Results(
    boolean ready,
    List<String> columns,
    List<String> data,
    long start_row,
    boolean has_more)
  {
    this();
    this.ready = ready;
    setReadyIsSet(true);
    this.columns = columns;
    this.data = data;
    this.start_row = start_row;
    setStart_rowIsSet(true);
    this.has_more = has_more;
    setHas_moreIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Results(Results other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.ready = other.ready;
    if (other.isSetColumns()) {
      List<String> __this__columns = new ArrayList<String>();
      for (String other_element : other.columns) {
        __this__columns.add(other_element);
      }
      this.columns = __this__columns;
    }
    if (other.isSetData()) {
      List<String> __this__data = new ArrayList<String>();
      for (String other_element : other.data) {
        __this__data.add(other_element);
      }
      this.data = __this__data;
    }
    this.start_row = other.start_row;
    this.has_more = other.has_more;
  }

  public Results deepCopy() {
    return new Results(this);
  }

  @Override
  public void clear() {
    setReadyIsSet(false);
    this.ready = false;
    this.columns = null;
    this.data = null;
    setStart_rowIsSet(false);
    this.start_row = 0;
    setHas_moreIsSet(false);
    this.has_more = false;
  }

  public boolean isReady() {
    return this.ready;
  }

  public Results setReady(boolean ready) {
    this.ready = ready;
    setReadyIsSet(true);
    return this;
  }

  public void unsetReady() {
    __isset_bit_vector.clear(__READY_ISSET_ID);
  }

  /** Returns true if field ready is set (has been asigned a value) and false otherwise */
  public boolean isSetReady() {
    return __isset_bit_vector.get(__READY_ISSET_ID);
  }

  public void setReadyIsSet(boolean value) {
    __isset_bit_vector.set(__READY_ISSET_ID, value);
  }

  public int getColumnsSize() {
    return (this.columns == null) ? 0 : this.columns.size();
  }

  public java.util.Iterator<String> getColumnsIterator() {
    return (this.columns == null) ? null : this.columns.iterator();
  }

  public void addToColumns(String elem) {
    if (this.columns == null) {
      this.columns = new ArrayList<String>();
    }
    this.columns.add(elem);
  }

  public List<String> getColumns() {
    return this.columns;
  }

  public Results setColumns(List<String> columns) {
    this.columns = columns;
    return this;
  }

  public void unsetColumns() {
    this.columns = null;
  }

  /** Returns true if field columns is set (has been asigned a value) and false otherwise */
  public boolean isSetColumns() {
    return this.columns != null;
  }

  public void setColumnsIsSet(boolean value) {
    if (!value) {
      this.columns = null;
    }
  }

  public int getDataSize() {
    return (this.data == null) ? 0 : this.data.size();
  }

  public java.util.Iterator<String> getDataIterator() {
    return (this.data == null) ? null : this.data.iterator();
  }

  public void addToData(String elem) {
    if (this.data == null) {
      this.data = new ArrayList<String>();
    }
    this.data.add(elem);
  }

  public List<String> getData() {
    return this.data;
  }

  public Results setData(List<String> data) {
    this.data = data;
    return this;
  }

  public void unsetData() {
    this.data = null;
  }

  /** Returns true if field data is set (has been asigned a value) and false otherwise */
  public boolean isSetData() {
    return this.data != null;
  }

  public void setDataIsSet(boolean value) {
    if (!value) {
      this.data = null;
    }
  }

  public long getStart_row() {
    return this.start_row;
  }

  public Results setStart_row(long start_row) {
    this.start_row = start_row;
    setStart_rowIsSet(true);
    return this;
  }

  public void unsetStart_row() {
    __isset_bit_vector.clear(__START_ROW_ISSET_ID);
  }

  /** Returns true if field start_row is set (has been asigned a value) and false otherwise */
  public boolean isSetStart_row() {
    return __isset_bit_vector.get(__START_ROW_ISSET_ID);
  }

  public void setStart_rowIsSet(boolean value) {
    __isset_bit_vector.set(__START_ROW_ISSET_ID, value);
  }

  public boolean isHas_more() {
    return this.has_more;
  }

  public Results setHas_more(boolean has_more) {
    this.has_more = has_more;
    setHas_moreIsSet(true);
    return this;
  }

  public void unsetHas_more() {
    __isset_bit_vector.clear(__HAS_MORE_ISSET_ID);
  }

  /** Returns true if field has_more is set (has been asigned a value) and false otherwise */
  public boolean isSetHas_more() {
    return __isset_bit_vector.get(__HAS_MORE_ISSET_ID);
  }

  public void setHas_moreIsSet(boolean value) {
    __isset_bit_vector.set(__HAS_MORE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case READY:
      if (value == null) {
        unsetReady();
      } else {
        setReady((Boolean)value);
      }
      break;

    case COLUMNS:
      if (value == null) {
        unsetColumns();
      } else {
        setColumns((List<String>)value);
      }
      break;

    case DATA:
      if (value == null) {
        unsetData();
      } else {
        setData((List<String>)value);
      }
      break;

    case START_ROW:
      if (value == null) {
        unsetStart_row();
      } else {
        setStart_row((Long)value);
      }
      break;

    case HAS_MORE:
      if (value == null) {
        unsetHas_more();
      } else {
        setHas_more((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case READY:
      return new Boolean(isReady());

    case COLUMNS:
      return getColumns();

    case DATA:
      return getData();

    case START_ROW:
      return new Long(getStart_row());

    case HAS_MORE:
      return new Boolean(isHas_more());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case READY:
      return isSetReady();
    case COLUMNS:
      return isSetColumns();
    case DATA:
      return isSetData();
    case START_ROW:
      return isSetStart_row();
    case HAS_MORE:
      return isSetHas_more();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Results)
      return this.equals((Results)that);
    return false;
  }

  public boolean equals(Results that) {
    if (that == null)
      return false;

    boolean this_present_ready = true;
    boolean that_present_ready = true;
    if (this_present_ready || that_present_ready) {
      if (!(this_present_ready && that_present_ready))
        return false;
      if (this.ready != that.ready)
        return false;
    }

    boolean this_present_columns = true && this.isSetColumns();
    boolean that_present_columns = true && that.isSetColumns();
    if (this_present_columns || that_present_columns) {
      if (!(this_present_columns && that_present_columns))
        return false;
      if (!this.columns.equals(that.columns))
        return false;
    }

    boolean this_present_data = true && this.isSetData();
    boolean that_present_data = true && that.isSetData();
    if (this_present_data || that_present_data) {
      if (!(this_present_data && that_present_data))
        return false;
      if (!this.data.equals(that.data))
        return false;
    }

    boolean this_present_start_row = true;
    boolean that_present_start_row = true;
    if (this_present_start_row || that_present_start_row) {
      if (!(this_present_start_row && that_present_start_row))
        return false;
      if (this.start_row != that.start_row)
        return false;
    }

    boolean this_present_has_more = true;
    boolean that_present_has_more = true;
    if (this_present_has_more || that_present_has_more) {
      if (!(this_present_has_more && that_present_has_more))
        return false;
      if (this.has_more != that.has_more)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_ready = true;
    builder.append(present_ready);
    if (present_ready)
      builder.append(ready);

    boolean present_columns = true && (isSetColumns());
    builder.append(present_columns);
    if (present_columns)
      builder.append(columns);

    boolean present_data = true && (isSetData());
    builder.append(present_data);
    if (present_data)
      builder.append(data);

    boolean present_start_row = true;
    builder.append(present_start_row);
    if (present_start_row)
      builder.append(start_row);

    boolean present_has_more = true;
    builder.append(present_has_more);
    if (present_has_more)
      builder.append(has_more);

    return builder.toHashCode();
  }

  public int compareTo(Results other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    Results typedOther = (Results)other;

    lastComparison = Boolean.valueOf(isSetReady()).compareTo(typedOther.isSetReady());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReady()) {
      lastComparison = TBaseHelper.compareTo(this.ready, typedOther.ready);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetColumns()).compareTo(typedOther.isSetColumns());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColumns()) {
      lastComparison = TBaseHelper.compareTo(this.columns, typedOther.columns);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetData()).compareTo(typedOther.isSetData());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetData()) {
      lastComparison = TBaseHelper.compareTo(this.data, typedOther.data);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStart_row()).compareTo(typedOther.isSetStart_row());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStart_row()) {
      lastComparison = TBaseHelper.compareTo(this.start_row, typedOther.start_row);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHas_more()).compareTo(typedOther.isSetHas_more());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHas_more()) {
      lastComparison = TBaseHelper.compareTo(this.has_more, typedOther.has_more);
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
        case 1: // READY
          if (field.type == TType.BOOL) {
            this.ready = iprot.readBool();
            setReadyIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // COLUMNS
          if (field.type == TType.LIST) {
            {
              TList _list4 = iprot.readListBegin();
              this.columns = new ArrayList<String>(_list4.size);
              for (int _i5 = 0; _i5 < _list4.size; ++_i5)
              {
                String _elem6;
                _elem6 = iprot.readString();
                this.columns.add(_elem6);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // DATA
          if (field.type == TType.LIST) {
            {
              TList _list7 = iprot.readListBegin();
              this.data = new ArrayList<String>(_list7.size);
              for (int _i8 = 0; _i8 < _list7.size; ++_i8)
              {
                String _elem9;
                _elem9 = iprot.readString();
                this.data.add(_elem9);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // START_ROW
          if (field.type == TType.I64) {
            this.start_row = iprot.readI64();
            setStart_rowIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // HAS_MORE
          if (field.type == TType.BOOL) {
            this.has_more = iprot.readBool();
            setHas_moreIsSet(true);
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
    oprot.writeFieldBegin(READY_FIELD_DESC);
    oprot.writeBool(this.ready);
    oprot.writeFieldEnd();
    if (this.columns != null) {
      oprot.writeFieldBegin(COLUMNS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRING, this.columns.size()));
        for (String _iter10 : this.columns)
        {
          oprot.writeString(_iter10);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.data != null) {
      oprot.writeFieldBegin(DATA_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRING, this.data.size()));
        for (String _iter11 : this.data)
        {
          oprot.writeString(_iter11);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(START_ROW_FIELD_DESC);
    oprot.writeI64(this.start_row);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(HAS_MORE_FIELD_DESC);
    oprot.writeBool(this.has_more);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Results(");
    boolean first = true;

    sb.append("ready:");
    sb.append(this.ready);
    first = false;
    if (!first) sb.append(", ");
    sb.append("columns:");
    if (this.columns == null) {
      sb.append("null");
    } else {
      sb.append(this.columns);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("data:");
    if (this.data == null) {
      sb.append("null");
    } else {
      sb.append(this.data);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("start_row:");
    sb.append(this.start_row);
    first = false;
    if (!first) sb.append(", ");
    sb.append("has_more:");
    sb.append(this.has_more);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

