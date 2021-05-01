// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Service3CropHealth.proto

package jt.smartFarmingService3;

/**
 * Protobuf type {@code service3CropHealth.cropHealthResponse}
 */
public  final class cropHealthResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:service3CropHealth.cropHealthResponse)
    cropHealthResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use cropHealthResponse.newBuilder() to construct.
  private cropHealthResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private cropHealthResponse() {
    healthResponse_ = "";
    waterResponse_ = "";
    soilResponse_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private cropHealthResponse(
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

            healthResponse_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            waterResponse_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            soilResponse_ = s;
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
    return jt.smartFarmingService3.Service3CropHealthImpl.internal_static_service3CropHealth_cropHealthResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return jt.smartFarmingService3.Service3CropHealthImpl.internal_static_service3CropHealth_cropHealthResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            jt.smartFarmingService3.cropHealthResponse.class, jt.smartFarmingService3.cropHealthResponse.Builder.class);
  }

  public static final int HEALTHRESPONSE_FIELD_NUMBER = 1;
  private volatile java.lang.Object healthResponse_;
  /**
   * <code>string healthResponse = 1;</code>
   */
  public java.lang.String getHealthResponse() {
    java.lang.Object ref = healthResponse_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      healthResponse_ = s;
      return s;
    }
  }
  /**
   * <code>string healthResponse = 1;</code>
   */
  public com.google.protobuf.ByteString
      getHealthResponseBytes() {
    java.lang.Object ref = healthResponse_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      healthResponse_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int WATERRESPONSE_FIELD_NUMBER = 2;
  private volatile java.lang.Object waterResponse_;
  /**
   * <code>string waterResponse = 2;</code>
   */
  public java.lang.String getWaterResponse() {
    java.lang.Object ref = waterResponse_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      waterResponse_ = s;
      return s;
    }
  }
  /**
   * <code>string waterResponse = 2;</code>
   */
  public com.google.protobuf.ByteString
      getWaterResponseBytes() {
    java.lang.Object ref = waterResponse_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      waterResponse_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SOILRESPONSE_FIELD_NUMBER = 3;
  private volatile java.lang.Object soilResponse_;
  /**
   * <code>string soilResponse = 3;</code>
   */
  public java.lang.String getSoilResponse() {
    java.lang.Object ref = soilResponse_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      soilResponse_ = s;
      return s;
    }
  }
  /**
   * <code>string soilResponse = 3;</code>
   */
  public com.google.protobuf.ByteString
      getSoilResponseBytes() {
    java.lang.Object ref = soilResponse_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      soilResponse_ = b;
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
    if (!getHealthResponseBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, healthResponse_);
    }
    if (!getWaterResponseBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, waterResponse_);
    }
    if (!getSoilResponseBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, soilResponse_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getHealthResponseBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, healthResponse_);
    }
    if (!getWaterResponseBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, waterResponse_);
    }
    if (!getSoilResponseBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, soilResponse_);
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
    if (!(obj instanceof jt.smartFarmingService3.cropHealthResponse)) {
      return super.equals(obj);
    }
    jt.smartFarmingService3.cropHealthResponse other = (jt.smartFarmingService3.cropHealthResponse) obj;

    boolean result = true;
    result = result && getHealthResponse()
        .equals(other.getHealthResponse());
    result = result && getWaterResponse()
        .equals(other.getWaterResponse());
    result = result && getSoilResponse()
        .equals(other.getSoilResponse());
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
    hash = (37 * hash) + HEALTHRESPONSE_FIELD_NUMBER;
    hash = (53 * hash) + getHealthResponse().hashCode();
    hash = (37 * hash) + WATERRESPONSE_FIELD_NUMBER;
    hash = (53 * hash) + getWaterResponse().hashCode();
    hash = (37 * hash) + SOILRESPONSE_FIELD_NUMBER;
    hash = (53 * hash) + getSoilResponse().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static jt.smartFarmingService3.cropHealthResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static jt.smartFarmingService3.cropHealthResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static jt.smartFarmingService3.cropHealthResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static jt.smartFarmingService3.cropHealthResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static jt.smartFarmingService3.cropHealthResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static jt.smartFarmingService3.cropHealthResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static jt.smartFarmingService3.cropHealthResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static jt.smartFarmingService3.cropHealthResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static jt.smartFarmingService3.cropHealthResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static jt.smartFarmingService3.cropHealthResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static jt.smartFarmingService3.cropHealthResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static jt.smartFarmingService3.cropHealthResponse parseFrom(
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
  public static Builder newBuilder(jt.smartFarmingService3.cropHealthResponse prototype) {
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
   * Protobuf type {@code service3CropHealth.cropHealthResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:service3CropHealth.cropHealthResponse)
      jt.smartFarmingService3.cropHealthResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return jt.smartFarmingService3.Service3CropHealthImpl.internal_static_service3CropHealth_cropHealthResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return jt.smartFarmingService3.Service3CropHealthImpl.internal_static_service3CropHealth_cropHealthResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              jt.smartFarmingService3.cropHealthResponse.class, jt.smartFarmingService3.cropHealthResponse.Builder.class);
    }

    // Construct using jt.smartFarmingService3.cropHealthResponse.newBuilder()
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
      healthResponse_ = "";

      waterResponse_ = "";

      soilResponse_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return jt.smartFarmingService3.Service3CropHealthImpl.internal_static_service3CropHealth_cropHealthResponse_descriptor;
    }

    @java.lang.Override
    public jt.smartFarmingService3.cropHealthResponse getDefaultInstanceForType() {
      return jt.smartFarmingService3.cropHealthResponse.getDefaultInstance();
    }

    @java.lang.Override
    public jt.smartFarmingService3.cropHealthResponse build() {
      jt.smartFarmingService3.cropHealthResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public jt.smartFarmingService3.cropHealthResponse buildPartial() {
      jt.smartFarmingService3.cropHealthResponse result = new jt.smartFarmingService3.cropHealthResponse(this);
      result.healthResponse_ = healthResponse_;
      result.waterResponse_ = waterResponse_;
      result.soilResponse_ = soilResponse_;
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
      if (other instanceof jt.smartFarmingService3.cropHealthResponse) {
        return mergeFrom((jt.smartFarmingService3.cropHealthResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(jt.smartFarmingService3.cropHealthResponse other) {
      if (other == jt.smartFarmingService3.cropHealthResponse.getDefaultInstance()) return this;
      if (!other.getHealthResponse().isEmpty()) {
        healthResponse_ = other.healthResponse_;
        onChanged();
      }
      if (!other.getWaterResponse().isEmpty()) {
        waterResponse_ = other.waterResponse_;
        onChanged();
      }
      if (!other.getSoilResponse().isEmpty()) {
        soilResponse_ = other.soilResponse_;
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
      jt.smartFarmingService3.cropHealthResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (jt.smartFarmingService3.cropHealthResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object healthResponse_ = "";
    /**
     * <code>string healthResponse = 1;</code>
     */
    public java.lang.String getHealthResponse() {
      java.lang.Object ref = healthResponse_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        healthResponse_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string healthResponse = 1;</code>
     */
    public com.google.protobuf.ByteString
        getHealthResponseBytes() {
      java.lang.Object ref = healthResponse_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        healthResponse_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string healthResponse = 1;</code>
     */
    public Builder setHealthResponse(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      healthResponse_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string healthResponse = 1;</code>
     */
    public Builder clearHealthResponse() {
      
      healthResponse_ = getDefaultInstance().getHealthResponse();
      onChanged();
      return this;
    }
    /**
     * <code>string healthResponse = 1;</code>
     */
    public Builder setHealthResponseBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      healthResponse_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object waterResponse_ = "";
    /**
     * <code>string waterResponse = 2;</code>
     */
    public java.lang.String getWaterResponse() {
      java.lang.Object ref = waterResponse_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        waterResponse_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string waterResponse = 2;</code>
     */
    public com.google.protobuf.ByteString
        getWaterResponseBytes() {
      java.lang.Object ref = waterResponse_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        waterResponse_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string waterResponse = 2;</code>
     */
    public Builder setWaterResponse(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      waterResponse_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string waterResponse = 2;</code>
     */
    public Builder clearWaterResponse() {
      
      waterResponse_ = getDefaultInstance().getWaterResponse();
      onChanged();
      return this;
    }
    /**
     * <code>string waterResponse = 2;</code>
     */
    public Builder setWaterResponseBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      waterResponse_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object soilResponse_ = "";
    /**
     * <code>string soilResponse = 3;</code>
     */
    public java.lang.String getSoilResponse() {
      java.lang.Object ref = soilResponse_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        soilResponse_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string soilResponse = 3;</code>
     */
    public com.google.protobuf.ByteString
        getSoilResponseBytes() {
      java.lang.Object ref = soilResponse_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        soilResponse_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string soilResponse = 3;</code>
     */
    public Builder setSoilResponse(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      soilResponse_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string soilResponse = 3;</code>
     */
    public Builder clearSoilResponse() {
      
      soilResponse_ = getDefaultInstance().getSoilResponse();
      onChanged();
      return this;
    }
    /**
     * <code>string soilResponse = 3;</code>
     */
    public Builder setSoilResponseBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      soilResponse_ = value;
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


    // @@protoc_insertion_point(builder_scope:service3CropHealth.cropHealthResponse)
  }

  // @@protoc_insertion_point(class_scope:service3CropHealth.cropHealthResponse)
  private static final jt.smartFarmingService3.cropHealthResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new jt.smartFarmingService3.cropHealthResponse();
  }

  public static jt.smartFarmingService3.cropHealthResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<cropHealthResponse>
      PARSER = new com.google.protobuf.AbstractParser<cropHealthResponse>() {
    @java.lang.Override
    public cropHealthResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new cropHealthResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<cropHealthResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<cropHealthResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public jt.smartFarmingService3.cropHealthResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

