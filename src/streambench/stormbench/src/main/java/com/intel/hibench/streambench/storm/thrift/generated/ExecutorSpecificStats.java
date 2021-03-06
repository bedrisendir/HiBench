/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.intel.hibench.streambench.storm.thrift.generated;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
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

public class ExecutorSpecificStats extends org.apache.thrift.TUnion<ExecutorSpecificStats, ExecutorSpecificStats._Fields> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ExecutorSpecificStats");
  private static final org.apache.thrift.protocol.TField BOLT_FIELD_DESC = new org.apache.thrift.protocol.TField("bolt", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField SPOUT_FIELD_DESC = new org.apache.thrift.protocol.TField("spout", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BOLT((short)1, "bolt"),
    SPOUT((short)2, "spout");

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
        case 1: // BOLT
          return BOLT;
        case 2: // SPOUT
          return SPOUT;
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

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BOLT, new org.apache.thrift.meta_data.FieldMetaData("bolt", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, BoltStats.class)));
    tmpMap.put(_Fields.SPOUT, new org.apache.thrift.meta_data.FieldMetaData("spout", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SpoutStats.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ExecutorSpecificStats.class, metaDataMap);
  }

  public ExecutorSpecificStats() {
    super();
  }

  public ExecutorSpecificStats(_Fields setField, Object value) {
    super(setField, value);
  }

  public ExecutorSpecificStats(ExecutorSpecificStats other) {
    super(other);
  }
  public ExecutorSpecificStats deepCopy() {
    return new ExecutorSpecificStats(this);
  }

  public static ExecutorSpecificStats bolt(BoltStats value) {
    ExecutorSpecificStats x = new ExecutorSpecificStats();
    x.setBolt(value);
    return x;
  }

  public static ExecutorSpecificStats spout(SpoutStats value) {
    ExecutorSpecificStats x = new ExecutorSpecificStats();
    x.setSpout(value);
    return x;
  }


  @Override
  protected void checkType(_Fields setField, Object value) throws ClassCastException {
    switch (setField) {
      case BOLT:
        if (value instanceof BoltStats) {
          break;
        }
        throw new ClassCastException("Was expecting value of type BoltStats for field 'bolt', but got " + value.getClass().getSimpleName());
      case SPOUT:
        if (value instanceof SpoutStats) {
          break;
        }
        throw new ClassCastException("Was expecting value of type SpoutStats for field 'spout', but got " + value.getClass().getSimpleName());
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected Object standardSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TField field) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
        case BOLT:
          if (field.type == BOLT_FIELD_DESC.type) {
            BoltStats bolt;
            bolt = new BoltStats();
            bolt.read(iprot);
            return bolt;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case SPOUT:
          if (field.type == SPOUT_FIELD_DESC.type) {
            SpoutStats spout;
            spout = new SpoutStats();
            spout.read(iprot);
            return spout;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        default:
          throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      return null;
    }
  }

  @Override
  protected void standardSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case BOLT:
        BoltStats bolt = (BoltStats)value_;
        bolt.write(oprot);
        return;
      case SPOUT:
        SpoutStats spout = (SpoutStats)value_;
        spout.write(oprot);
        return;
      default:
        throw new IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected Object tupleSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, short fieldID) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(fieldID);
    if (setField != null) {
      switch (setField) {
        case BOLT:
          BoltStats bolt;
          bolt = new BoltStats();
          bolt.read(iprot);
          return bolt;
        case SPOUT:
          SpoutStats spout;
          spout = new SpoutStats();
          spout.read(iprot);
          return spout;
        default:
          throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      throw new TProtocolException("Couldn't find a field with field id " + fieldID);
    }
  }

  @Override
  protected void tupleSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case BOLT:
        BoltStats bolt = (BoltStats)value_;
        bolt.write(oprot);
        return;
      case SPOUT:
        SpoutStats spout = (SpoutStats)value_;
        spout.write(oprot);
        return;
      default:
        throw new IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case BOLT:
        return BOLT_FIELD_DESC;
      case SPOUT:
        return SPOUT_FIELD_DESC;
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TStruct getStructDesc() {
    return STRUCT_DESC;
  }

  @Override
  protected _Fields enumForId(short id) {
    return _Fields.findByThriftIdOrThrow(id);
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }


  public BoltStats getBolt() {
    if (getSetField() == _Fields.BOLT) {
      return (BoltStats)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'bolt' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setBolt(BoltStats value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.BOLT;
    value_ = value;
  }

  public SpoutStats getSpout() {
    if (getSetField() == _Fields.SPOUT) {
      return (SpoutStats)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'spout' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setSpout(SpoutStats value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.SPOUT;
    value_ = value;
  }

  public boolean isSetBolt() {
    return setField_ == _Fields.BOLT;
  }


  public boolean isSetSpout() {
    return setField_ == _Fields.SPOUT;
  }


  public boolean equals(Object other) {
    if (other instanceof ExecutorSpecificStats) {
      return equals((ExecutorSpecificStats)other);
    } else {
      return false;
    }
  }

  public boolean equals(ExecutorSpecificStats other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  @Override
  public int compareTo(ExecutorSpecificStats other) {
    int lastComparison = org.apache.thrift.TBaseHelper.compareTo(getSetField(), other.getSetField());
    if (lastComparison == 0) {
      return org.apache.thrift.TBaseHelper.compareTo(getFieldValue(), other.getFieldValue());
    }
    return lastComparison;
  }


  @Override
  public int hashCode() {
    HashCodeBuilder hcb = new HashCodeBuilder();
    hcb.append(this.getClass().getName());
    org.apache.thrift.TFieldIdEnum setField = getSetField();
    if (setField != null) {
      hcb.append(setField.getThriftFieldId());
      Object value = getFieldValue();
      if (value instanceof org.apache.thrift.TEnum) {
        hcb.append(((org.apache.thrift.TEnum)getFieldValue()).getValue());
      } else {
        hcb.append(value);
      }
    }
    return hcb.toHashCode();
  }
  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }


  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }


}
