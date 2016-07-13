/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.lightstep.tracer.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
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
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-7-13")
public class SampleCount implements org.apache.thrift.TBase<SampleCount, SampleCount._Fields>, java.io.Serializable, Cloneable, Comparable<SampleCount> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SampleCount");

  private static final org.apache.thrift.protocol.TField OLDEST_MICROS_FIELD_DESC = new org.apache.thrift.protocol.TField("oldest_micros", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField YOUNGEST_MICROS_FIELD_DESC = new org.apache.thrift.protocol.TField("youngest_micros", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("count", org.apache.thrift.protocol.TType.I64, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SampleCountStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SampleCountTupleSchemeFactory());
  }

  public long oldest_micros; // optional
  public long youngest_micros; // optional
  public long count; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    OLDEST_MICROS((short)1, "oldest_micros"),
    YOUNGEST_MICROS((short)2, "youngest_micros"),
    COUNT((short)3, "count");

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
        case 1: // OLDEST_MICROS
          return OLDEST_MICROS;
        case 2: // YOUNGEST_MICROS
          return YOUNGEST_MICROS;
        case 3: // COUNT
          return COUNT;
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
  private static final int __OLDEST_MICROS_ISSET_ID = 0;
  private static final int __YOUNGEST_MICROS_ISSET_ID = 1;
  private static final int __COUNT_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.OLDEST_MICROS,_Fields.YOUNGEST_MICROS,_Fields.COUNT};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.OLDEST_MICROS, new org.apache.thrift.meta_data.FieldMetaData("oldest_micros", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.YOUNGEST_MICROS, new org.apache.thrift.meta_data.FieldMetaData("youngest_micros", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.COUNT, new org.apache.thrift.meta_data.FieldMetaData("count", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SampleCount.class, metaDataMap);
  }

  public SampleCount() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SampleCount(SampleCount other) {
    __isset_bitfield = other.__isset_bitfield;
    this.oldest_micros = other.oldest_micros;
    this.youngest_micros = other.youngest_micros;
    this.count = other.count;
  }

  public SampleCount deepCopy() {
    return new SampleCount(this);
  }

  @Override
  public void clear() {
    setOldest_microsIsSet(false);
    this.oldest_micros = 0;
    setYoungest_microsIsSet(false);
    this.youngest_micros = 0;
    setCountIsSet(false);
    this.count = 0;
  }

  public long getOldest_micros() {
    return this.oldest_micros;
  }

  public SampleCount setOldest_micros(long oldest_micros) {
    this.oldest_micros = oldest_micros;
    setOldest_microsIsSet(true);
    return this;
  }

  public void unsetOldest_micros() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __OLDEST_MICROS_ISSET_ID);
  }

  /** Returns true if field oldest_micros is set (has been assigned a value) and false otherwise */
  public boolean isSetOldest_micros() {
    return EncodingUtils.testBit(__isset_bitfield, __OLDEST_MICROS_ISSET_ID);
  }

  public void setOldest_microsIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __OLDEST_MICROS_ISSET_ID, value);
  }

  public long getYoungest_micros() {
    return this.youngest_micros;
  }

  public SampleCount setYoungest_micros(long youngest_micros) {
    this.youngest_micros = youngest_micros;
    setYoungest_microsIsSet(true);
    return this;
  }

  public void unsetYoungest_micros() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __YOUNGEST_MICROS_ISSET_ID);
  }

  /** Returns true if field youngest_micros is set (has been assigned a value) and false otherwise */
  public boolean isSetYoungest_micros() {
    return EncodingUtils.testBit(__isset_bitfield, __YOUNGEST_MICROS_ISSET_ID);
  }

  public void setYoungest_microsIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __YOUNGEST_MICROS_ISSET_ID, value);
  }

  public long getCount() {
    return this.count;
  }

  public SampleCount setCount(long count) {
    this.count = count;
    setCountIsSet(true);
    return this;
  }

  public void unsetCount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __COUNT_ISSET_ID);
  }

  /** Returns true if field count is set (has been assigned a value) and false otherwise */
  public boolean isSetCount() {
    return EncodingUtils.testBit(__isset_bitfield, __COUNT_ISSET_ID);
  }

  public void setCountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __COUNT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case OLDEST_MICROS:
      if (value == null) {
        unsetOldest_micros();
      } else {
        setOldest_micros((Long)value);
      }
      break;

    case YOUNGEST_MICROS:
      if (value == null) {
        unsetYoungest_micros();
      } else {
        setYoungest_micros((Long)value);
      }
      break;

    case COUNT:
      if (value == null) {
        unsetCount();
      } else {
        setCount((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case OLDEST_MICROS:
      return Long.valueOf(getOldest_micros());

    case YOUNGEST_MICROS:
      return Long.valueOf(getYoungest_micros());

    case COUNT:
      return Long.valueOf(getCount());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case OLDEST_MICROS:
      return isSetOldest_micros();
    case YOUNGEST_MICROS:
      return isSetYoungest_micros();
    case COUNT:
      return isSetCount();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SampleCount)
      return this.equals((SampleCount)that);
    return false;
  }

  public boolean equals(SampleCount that) {
    if (that == null)
      return false;

    boolean this_present_oldest_micros = true && this.isSetOldest_micros();
    boolean that_present_oldest_micros = true && that.isSetOldest_micros();
    if (this_present_oldest_micros || that_present_oldest_micros) {
      if (!(this_present_oldest_micros && that_present_oldest_micros))
        return false;
      if (this.oldest_micros != that.oldest_micros)
        return false;
    }

    boolean this_present_youngest_micros = true && this.isSetYoungest_micros();
    boolean that_present_youngest_micros = true && that.isSetYoungest_micros();
    if (this_present_youngest_micros || that_present_youngest_micros) {
      if (!(this_present_youngest_micros && that_present_youngest_micros))
        return false;
      if (this.youngest_micros != that.youngest_micros)
        return false;
    }

    boolean this_present_count = true && this.isSetCount();
    boolean that_present_count = true && that.isSetCount();
    if (this_present_count || that_present_count) {
      if (!(this_present_count && that_present_count))
        return false;
      if (this.count != that.count)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_oldest_micros = true && (isSetOldest_micros());
    list.add(present_oldest_micros);
    if (present_oldest_micros)
      list.add(oldest_micros);

    boolean present_youngest_micros = true && (isSetYoungest_micros());
    list.add(present_youngest_micros);
    if (present_youngest_micros)
      list.add(youngest_micros);

    boolean present_count = true && (isSetCount());
    list.add(present_count);
    if (present_count)
      list.add(count);

    return list.hashCode();
  }

  @Override
  public int compareTo(SampleCount other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetOldest_micros()).compareTo(other.isSetOldest_micros());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOldest_micros()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.oldest_micros, other.oldest_micros);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetYoungest_micros()).compareTo(other.isSetYoungest_micros());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetYoungest_micros()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.youngest_micros, other.youngest_micros);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCount()).compareTo(other.isSetCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.count, other.count);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("SampleCount(");
    boolean first = true;

    if (isSetOldest_micros()) {
      sb.append("oldest_micros:");
      sb.append(this.oldest_micros);
      first = false;
    }
    if (isSetYoungest_micros()) {
      if (!first) sb.append(", ");
      sb.append("youngest_micros:");
      sb.append(this.youngest_micros);
      first = false;
    }
    if (isSetCount()) {
      if (!first) sb.append(", ");
      sb.append("count:");
      sb.append(this.count);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SampleCountStandardSchemeFactory implements SchemeFactory {
    public SampleCountStandardScheme getScheme() {
      return new SampleCountStandardScheme();
    }
  }

  private static class SampleCountStandardScheme extends StandardScheme<SampleCount> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SampleCount struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // OLDEST_MICROS
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.oldest_micros = iprot.readI64();
              struct.setOldest_microsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // YOUNGEST_MICROS
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.youngest_micros = iprot.readI64();
              struct.setYoungest_microsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.count = iprot.readI64();
              struct.setCountIsSet(true);
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

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, SampleCount struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetOldest_micros()) {
        oprot.writeFieldBegin(OLDEST_MICROS_FIELD_DESC);
        oprot.writeI64(struct.oldest_micros);
        oprot.writeFieldEnd();
      }
      if (struct.isSetYoungest_micros()) {
        oprot.writeFieldBegin(YOUNGEST_MICROS_FIELD_DESC);
        oprot.writeI64(struct.youngest_micros);
        oprot.writeFieldEnd();
      }
      if (struct.isSetCount()) {
        oprot.writeFieldBegin(COUNT_FIELD_DESC);
        oprot.writeI64(struct.count);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SampleCountTupleSchemeFactory implements SchemeFactory {
    public SampleCountTupleScheme getScheme() {
      return new SampleCountTupleScheme();
    }
  }

  private static class SampleCountTupleScheme extends TupleScheme<SampleCount> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SampleCount struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetOldest_micros()) {
        optionals.set(0);
      }
      if (struct.isSetYoungest_micros()) {
        optionals.set(1);
      }
      if (struct.isSetCount()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetOldest_micros()) {
        oprot.writeI64(struct.oldest_micros);
      }
      if (struct.isSetYoungest_micros()) {
        oprot.writeI64(struct.youngest_micros);
      }
      if (struct.isSetCount()) {
        oprot.writeI64(struct.count);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SampleCount struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.oldest_micros = iprot.readI64();
        struct.setOldest_microsIsSet(true);
      }
      if (incoming.get(1)) {
        struct.youngest_micros = iprot.readI64();
        struct.setYoungest_microsIsSet(true);
      }
      if (incoming.get(2)) {
        struct.count = iprot.readI64();
        struct.setCountIsSet(true);
      }
    }
  }

}

