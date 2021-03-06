// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Service2Climate.proto

package jt.smartFarmingService2;

/**
 * Protobuf type {@code service2Climate.ClimateResponse}
 */
public  final class ClimateResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:service2Climate.ClimateResponse)
    ClimateResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ClimateResponse.newBuilder() to construct.
  private ClimateResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ClimateResponse() {
    rianfallResponse_ = "";
    temperatureResponse_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ClimateResponse(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            rianfallResponse_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            temperatureResponse_ = s;
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
    return jt.smartFarmingService2.Service2ClimateImpl.internal_static_service2Climate_ClimateResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return jt.smartFarmingService2.Service2ClimateImpl.internal_static_service2Climate_ClimateResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            jt.smartFarmingService2.ClimateResponse.class, jt.smartFarmingService2.ClimateResponse.Builder.class);
  }

  public static final int RIANFALLRESPONSE_FIELD_NUMBER = 1;
  private volatile java.lang.Object rianfallResponse_;
  /**
   * <code>string rianfallResponse = 1;</code>
   */
  public java.lang.String getRianfallResponse() {
    java.lang.Object ref = rianfallResponse_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      rianfallResponse_ = s;
      return s;
    }
  }
  /**
   * <code>string rianfallResponse = 1;</code>
   */
  public com.google.protobuf.ByteString
      getRianfallResponseBytes() {
    java.lang.Object ref = rianfallResponse_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      rianfallResponse_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TEMPERATURERESPONSE_FIELD_NUMBER = 2;
  private volatile java.lang.Object temperatureResponse_;
  /**
   * <code>string temperatureResponse = 2;</code>
   */
  public java.lang.String getTemperatureResponse() {
    java.lang.Object ref = temperatureResponse_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      temperatureResponse_ = s;
      return s;
    }
  }
  /**
   * <code>string temperatureResponse = 2;</code>
   */
  public com.google.protobuf.ByteString
      getTemperatureResponseBytes() {
    java.lang.Object ref = temperatureResponse_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      temperatureResponse_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getRianfallResponseBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, rianfallResponse_);
    }
    if (!getTemperatureResponseBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, temperatureResponse_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getRianfallResponseBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, rianfallResponse_);
    }
    if (!getTemperatureResponseBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, temperatureResponse_);
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
    if (!(obj instanceof jt.smartFarmingService2.ClimateResponse)) {
      return super.equals(obj);
    }
    jt.smartFarmingService2.ClimateResponse other = (jt.smartFarmingService2.ClimateResponse) obj;

    boolean result = true;
    result = result && getRianfallResponse()
        .equals(other.getRianfallResponse());
    result = result && getTemperatureResponse()
        .equals(other.getTemperatureResponse());
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
    hash = (37 * hash) + RIANFALLRESPONSE_FIELD_NUMBER;
    hash = (53 * hash) + getRianfallResponse().hashCode();
    hash = (37 * hash) + TEMPERATURERESPONSE_FIELD_NUMBER;
    hash = (53 * hash) + getTemperatureResponse().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static jt.smartFarmingService2.ClimateResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static jt.smartFarmingService2.ClimateResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static jt.smartFarmingService2.ClimateResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static jt.smartFarmingService2.ClimateResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static jt.smartFarmingService2.ClimateResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static jt.smartFarmingService2.ClimateResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static jt.smartFarmingService2.ClimateResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static jt.smartFarmingService2.ClimateResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static jt.smartFarmingService2.ClimateResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static jt.smartFarmingService2.ClimateResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static jt.smartFarmingService2.ClimateResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static jt.smartFarmingService2.ClimateResponse parseFrom(
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
  public static Builder newBuilder(jt.smartFarmingService2.ClimateResponse prototype) {
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
   * Protobuf type {@code service2Climate.ClimateResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:service2Climate.ClimateResponse)
      jt.smartFarmingService2.ClimateResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return jt.smartFarmingService2.Service2ClimateImpl.internal_static_service2Climate_ClimateResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return jt.smartFarmingService2.Service2ClimateImpl.internal_static_service2Climate_ClimateResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              jt.smartFarmingService2.ClimateResponse.class, jt.smartFarmingService2.ClimateResponse.Builder.class);
    }

    // Construct using jt.smartFarmingService2.ClimateResponse.newBuilder()
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
      rianfallResponse_ = "";

      temperatureResponse_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return jt.smartFarmingService2.Service2ClimateImpl.internal_static_service2Climate_ClimateResponse_descriptor;
    }

    @java.lang.Override
    public jt.smartFarmingService2.ClimateResponse getDefaultInstanceForType() {
      return jt.smartFarmingService2.ClimateResponse.getDefaultInstance();
    }

    @java.lang.Override
    public jt.smartFarmingService2.ClimateResponse build() {
      jt.smartFarmingService2.ClimateResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public jt.smartFarmingService2.ClimateResponse buildPartial() {
      jt.smartFarmingService2.ClimateResponse result = new jt.smartFarmingService2.ClimateResponse(this);
      result.rianfallResponse_ = rianfallResponse_;
      result.temperatureResponse_ = temperatureResponse_;
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
      if (other instanceof jt.smartFarmingService2.ClimateResponse) {
        return mergeFrom((jt.smartFarmingService2.ClimateResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(jt.smartFarmingService2.ClimateResponse other) {
      if (other == jt.smartFarmingService2.ClimateResponse.getDefaultInstance()) return this;
      if (!other.getRianfallResponse().isEmpty()) {
        rianfallResponse_ = other.rianfallResponse_;
        onChanged();
      }
      if (!other.getTemperatureResponse().isEmpty()) {
        temperatureResponse_ = other.temperatureResponse_;
        onChanged();
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
      jt.smartFarmingService2.ClimateResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (jt.smartFarmingService2.ClimateResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object rianfallResponse_ = "";
    /**
     * <code>string rianfallResponse = 1;</code>
     */
    public java.lang.String getRianfallResponse() {
      java.lang.Object ref = rianfallResponse_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        rianfallResponse_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string rianfallResponse = 1;</code>
     */
    public com.google.protobuf.ByteString
        getRianfallResponseBytes() {
      java.lang.Object ref = rianfallResponse_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        rianfallResponse_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string rianfallResponse = 1;</code>
     */
    public Builder setRianfallResponse(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      rianfallResponse_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string rianfallResponse = 1;</code>
     */
    public Builder clearRianfallResponse() {
      
      rianfallResponse_ = getDefaultInstance().getRianfallResponse();
      onChanged();
      return this;
    }
    /**
     * <code>string rianfallResponse = 1;</code>
     */
    public Builder setRianfallResponseBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      rianfallResponse_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object temperatureResponse_ = "";
    /**
     * <code>string temperatureResponse = 2;</code>
     */
    public java.lang.String getTemperatureResponse() {
      java.lang.Object ref = temperatureResponse_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        temperatureResponse_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string temperatureResponse = 2;</code>
     */
    public com.google.protobuf.ByteString
        getTemperatureResponseBytes() {
      java.lang.Object ref = temperatureResponse_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        temperatureResponse_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string temperatureResponse = 2;</code>
     */
    public Builder setTemperatureResponse(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      temperatureResponse_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string temperatureResponse = 2;</code>
     */
    public Builder clearTemperatureResponse() {
      
      temperatureResponse_ = getDefaultInstance().getTemperatureResponse();
      onChanged();
      return this;
    }
    /**
     * <code>string temperatureResponse = 2;</code>
     */
    public Builder setTemperatureResponseBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      temperatureResponse_ = value;
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


    // @@protoc_insertion_point(builder_scope:service2Climate.ClimateResponse)
  }

  // @@protoc_insertion_point(class_scope:service2Climate.ClimateResponse)
  private static final jt.smartFarmingService2.ClimateResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new jt.smartFarmingService2.ClimateResponse();
  }

  public static jt.smartFarmingService2.ClimateResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ClimateResponse>
      PARSER = new com.google.protobuf.AbstractParser<ClimateResponse>() {
    @java.lang.Override
    public ClimateResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ClimateResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ClimateResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ClimateResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public jt.smartFarmingService2.ClimateResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

