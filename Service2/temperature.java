// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Service2Climate.proto

package jt.smartFarmingService2;

/**
 * Protobuf type {@code service2Climate.temperature}
 */
public  final class temperature extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:service2Climate.temperature)
    temperatureOrBuilder {
private static final long serialVersionUID = 0L;
  // Use temperature.newBuilder() to construct.
  private temperature(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private temperature() {
    temperatureDegree_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private temperature(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 16: {

            temperatureDegree_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return jt.smartFarmingService2.Service2ClimateImpl.internal_static_service2Climate_temperature_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return jt.smartFarmingService2.Service2ClimateImpl.internal_static_service2Climate_temperature_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            jt.smartFarmingService2.temperature.class, jt.smartFarmingService2.temperature.Builder.class);
  }

  public static final int TEMPERATURE_DEGREE_FIELD_NUMBER = 2;
  private int temperatureDegree_;
  /**
   * <code>int32 temperature_degree = 2;</code>
   */
  public int getTemperatureDegree() {
    return temperatureDegree_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (temperatureDegree_ != 0) {
      output.writeInt32(2, temperatureDegree_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (temperatureDegree_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, temperatureDegree_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof jt.smartFarmingService2.temperature)) {
      return super.equals(obj);
    }
    jt.smartFarmingService2.temperature other = (jt.smartFarmingService2.temperature) obj;

    boolean result = true;
    result = result && (getTemperatureDegree()
        == other.getTemperatureDegree());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TEMPERATURE_DEGREE_FIELD_NUMBER;
    hash = (53 * hash) + getTemperatureDegree();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static jt.smartFarmingService2.temperature parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static jt.smartFarmingService2.temperature parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static jt.smartFarmingService2.temperature parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static jt.smartFarmingService2.temperature parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static jt.smartFarmingService2.temperature parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static jt.smartFarmingService2.temperature parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static jt.smartFarmingService2.temperature parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static jt.smartFarmingService2.temperature parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static jt.smartFarmingService2.temperature parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static jt.smartFarmingService2.temperature parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static jt.smartFarmingService2.temperature parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static jt.smartFarmingService2.temperature parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(jt.smartFarmingService2.temperature prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code service2Climate.temperature}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:service2Climate.temperature)
      jt.smartFarmingService2.temperatureOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return jt.smartFarmingService2.Service2ClimateImpl.internal_static_service2Climate_temperature_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return jt.smartFarmingService2.Service2ClimateImpl.internal_static_service2Climate_temperature_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              jt.smartFarmingService2.temperature.class, jt.smartFarmingService2.temperature.Builder.class);
    }

    // Construct using jt.smartFarmingService2.temperature.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      temperatureDegree_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return jt.smartFarmingService2.Service2ClimateImpl.internal_static_service2Climate_temperature_descriptor;
    }

    @java.lang.Override
    public jt.smartFarmingService2.temperature getDefaultInstanceForType() {
      return jt.smartFarmingService2.temperature.getDefaultInstance();
    }

    @java.lang.Override
    public jt.smartFarmingService2.temperature build() {
      jt.smartFarmingService2.temperature result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public jt.smartFarmingService2.temperature buildPartial() {
      jt.smartFarmingService2.temperature result = new jt.smartFarmingService2.temperature(this);
      result.temperatureDegree_ = temperatureDegree_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof jt.smartFarmingService2.temperature) {
        return mergeFrom((jt.smartFarmingService2.temperature)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(jt.smartFarmingService2.temperature other) {
      if (other == jt.smartFarmingService2.temperature.getDefaultInstance()) return this;
      if (other.getTemperatureDegree() != 0) {
        setTemperatureDegree(other.getTemperatureDegree());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      jt.smartFarmingService2.temperature parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (jt.smartFarmingService2.temperature) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int temperatureDegree_ ;
    /**
     * <code>int32 temperature_degree = 2;</code>
     */
    public int getTemperatureDegree() {
      return temperatureDegree_;
    }
    /**
     * <code>int32 temperature_degree = 2;</code>
     */
    public Builder setTemperatureDegree(int value) {
      
      temperatureDegree_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 temperature_degree = 2;</code>
     */
    public Builder clearTemperatureDegree() {
      
      temperatureDegree_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:service2Climate.temperature)
  }

  // @@protoc_insertion_point(class_scope:service2Climate.temperature)
  private static final jt.smartFarmingService2.temperature DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new jt.smartFarmingService2.temperature();
  }

  public static jt.smartFarmingService2.temperature getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<temperature>
      PARSER = new com.google.protobuf.AbstractParser<temperature>() {
    @java.lang.Override
    public temperature parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new temperature(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<temperature> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<temperature> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public jt.smartFarmingService2.temperature getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

