// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReservationService.proto

package common.tharaka.ds.cw.communication.grpc.generated;

/**
 * Protobuf type {@code common.tharaka.ds.cw.communication.grpc.generated.ItemUpdateRequest}
 */
public final class ItemUpdateRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:common.tharaka.ds.cw.communication.grpc.generated.ItemUpdateRequest)
    ItemUpdateRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ItemUpdateRequest.newBuilder() to construct.
  private ItemUpdateRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ItemUpdateRequest() {
    itemId_ = "";
    sellerName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ItemUpdateRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ItemUpdateRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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

            itemId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            sellerName_ = s;
            break;
          }
          case 25: {

            price_ = input.readDouble();
            break;
          }
          case 32: {

            availableQuantity_ = input.readInt32();
            break;
          }
          case 40: {

            isSentByPrimary_ = input.readBool();
            break;
          }
          default: {
            if (!parseUnknownField(
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
    return common.tharaka.ds.cw.communication.grpc.generated.ReservationService.internal_static_common_tharaka_ds_cw_communication_grpc_generated_ItemUpdateRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return common.tharaka.ds.cw.communication.grpc.generated.ReservationService.internal_static_common_tharaka_ds_cw_communication_grpc_generated_ItemUpdateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            common.tharaka.ds.cw.communication.grpc.generated.ItemUpdateRequest.class, common.tharaka.ds.cw.communication.grpc.generated.ItemUpdateRequest.Builder.class);
  }

  public static final int ITEMID_FIELD_NUMBER = 1;
  private volatile java.lang.Object itemId_;
  /**
   * <code>string itemId = 1;</code>
   * @return The itemId.
   */
  @java.lang.Override
  public java.lang.String getItemId() {
    java.lang.Object ref = itemId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      itemId_ = s;
      return s;
    }
  }
  /**
   * <code>string itemId = 1;</code>
   * @return The bytes for itemId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getItemIdBytes() {
    java.lang.Object ref = itemId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      itemId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SELLERNAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object sellerName_;
  /**
   * <code>string sellerName = 2;</code>
   * @return The sellerName.
   */
  @java.lang.Override
  public java.lang.String getSellerName() {
    java.lang.Object ref = sellerName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sellerName_ = s;
      return s;
    }
  }
  /**
   * <code>string sellerName = 2;</code>
   * @return The bytes for sellerName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSellerNameBytes() {
    java.lang.Object ref = sellerName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sellerName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PRICE_FIELD_NUMBER = 3;
  private double price_;
  /**
   * <code>double price = 3;</code>
   * @return The price.
   */
  @java.lang.Override
  public double getPrice() {
    return price_;
  }

  public static final int AVAILABLEQUANTITY_FIELD_NUMBER = 4;
  private int availableQuantity_;
  /**
   * <code>int32 availableQuantity = 4;</code>
   * @return The availableQuantity.
   */
  @java.lang.Override
  public int getAvailableQuantity() {
    return availableQuantity_;
  }

  public static final int ISSENTBYPRIMARY_FIELD_NUMBER = 5;
  private boolean isSentByPrimary_;
  /**
   * <code>bool isSentByPrimary = 5;</code>
   * @return The isSentByPrimary.
   */
  @java.lang.Override
  public boolean getIsSentByPrimary() {
    return isSentByPrimary_;
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
    if (!getItemIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, itemId_);
    }
    if (!getSellerNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, sellerName_);
    }
    if (price_ != 0D) {
      output.writeDouble(3, price_);
    }
    if (availableQuantity_ != 0) {
      output.writeInt32(4, availableQuantity_);
    }
    if (isSentByPrimary_ != false) {
      output.writeBool(5, isSentByPrimary_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getItemIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, itemId_);
    }
    if (!getSellerNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, sellerName_);
    }
    if (price_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, price_);
    }
    if (availableQuantity_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, availableQuantity_);
    }
    if (isSentByPrimary_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, isSentByPrimary_);
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
    if (!(obj instanceof common.tharaka.ds.cw.communication.grpc.generated.ItemUpdateRequest)) {
      return super.equals(obj);
    }
    common.tharaka.ds.cw.communication.grpc.generated.ItemUpdateRequest other = (common.tharaka.ds.cw.communication.grpc.generated.ItemUpdateRequest) obj;

    if (!getItemId()
        .equals(other.getItemId())) return false;
    if (!getSellerName()
        .equals(other.getSellerName())) return false;
    if (java.lang.Double.doubleToLongBits(getPrice())
        != java.lang.Double.doubleToLongBits(
            other.getPrice())) return false;
    if (getAvailableQuantity()
        != other.getAvailableQuantity()) return false;
    if (getIsSentByPrimary()
        != other.getIsSentByPrimary()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ITEMID_FIELD_NUMBER;
    hash = (53 * hash) + getItemId().hashCode();
    hash = (37 * hash) + SELLERNAME_FIELD_NUMBER;
    hash = (53 * hash) + getSellerName().hashCode();
    hash = (37 * hash) + PRICE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getPrice()));
    hash = (37 * hash) + AVAILABLEQUANTITY_FIELD_NUMBER;
    hash = (53 * hash) + getAvailableQuantity();
    hash = (37 * hash) + ISSENTBYPRIMARY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsSentByPrimary());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static common.tharaka.ds.cw.communication.grpc.generated.ItemUpdateRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static common.tharaka.ds.cw.communication.grpc.generated.ItemUpdateRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static common.tharaka.ds.cw.communication.grpc.generated.ItemUpdateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static common.tharaka.ds.cw.communication.grpc.generated.ItemUpdateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static common.tharaka.ds.cw.communication.grpc.generated.ItemUpdateRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static common.tharaka.ds.cw.communication.grpc.generated.ItemUpdateRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static common.tharaka.ds.cw.communication.grpc.generated.ItemUpdateRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static common.tharaka.ds.cw.communication.grpc.generated.ItemUpdateRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static common.tharaka.ds.cw.communication.grpc.generated.ItemUpdateRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static common.tharaka.ds.cw.communication.grpc.generated.ItemUpdateRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static common.tharaka.ds.cw.communication.grpc.generated.ItemUpdateRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static common.tharaka.ds.cw.communication.grpc.generated.ItemUpdateRequest parseFrom(
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
  public static Builder newBuilder(common.tharaka.ds.cw.communication.grpc.generated.ItemUpdateRequest prototype) {
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
   * Protobuf type {@code common.tharaka.ds.cw.communication.grpc.generated.ItemUpdateRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:common.tharaka.ds.cw.communication.grpc.generated.ItemUpdateRequest)
      common.tharaka.ds.cw.communication.grpc.generated.ItemUpdateRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return common.tharaka.ds.cw.communication.grpc.generated.ReservationService.internal_static_common_tharaka_ds_cw_communication_grpc_generated_ItemUpdateRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return common.tharaka.ds.cw.communication.grpc.generated.ReservationService.internal_static_common_tharaka_ds_cw_communication_grpc_generated_ItemUpdateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              common.tharaka.ds.cw.communication.grpc.generated.ItemUpdateRequest.class, common.tharaka.ds.cw.communication.grpc.generated.ItemUpdateRequest.Builder.class);
    }

    // Construct using common.tharaka.ds.cw.communication.grpc.generated.ItemUpdateRequest.newBuilder()
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
      itemId_ = "";

      sellerName_ = "";

      price_ = 0D;

      availableQuantity_ = 0;

      isSentByPrimary_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return common.tharaka.ds.cw.communication.grpc.generated.ReservationService.internal_static_common_tharaka_ds_cw_communication_grpc_generated_ItemUpdateRequest_descriptor;
    }

    @java.lang.Override
    public common.tharaka.ds.cw.communication.grpc.generated.ItemUpdateRequest getDefaultInstanceForType() {
      return common.tharaka.ds.cw.communication.grpc.generated.ItemUpdateRequest.getDefaultInstance();
    }

    @java.lang.Override
    public common.tharaka.ds.cw.communication.grpc.generated.ItemUpdateRequest build() {
      common.tharaka.ds.cw.communication.grpc.generated.ItemUpdateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public common.tharaka.ds.cw.communication.grpc.generated.ItemUpdateRequest buildPartial() {
      common.tharaka.ds.cw.communication.grpc.generated.ItemUpdateRequest result = new common.tharaka.ds.cw.communication.grpc.generated.ItemUpdateRequest(this);
      result.itemId_ = itemId_;
      result.sellerName_ = sellerName_;
      result.price_ = price_;
      result.availableQuantity_ = availableQuantity_;
      result.isSentByPrimary_ = isSentByPrimary_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof common.tharaka.ds.cw.communication.grpc.generated.ItemUpdateRequest) {
        return mergeFrom((common.tharaka.ds.cw.communication.grpc.generated.ItemUpdateRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(common.tharaka.ds.cw.communication.grpc.generated.ItemUpdateRequest other) {
      if (other == common.tharaka.ds.cw.communication.grpc.generated.ItemUpdateRequest.getDefaultInstance()) return this;
      if (!other.getItemId().isEmpty()) {
        itemId_ = other.itemId_;
        onChanged();
      }
      if (!other.getSellerName().isEmpty()) {
        sellerName_ = other.sellerName_;
        onChanged();
      }
      if (other.getPrice() != 0D) {
        setPrice(other.getPrice());
      }
      if (other.getAvailableQuantity() != 0) {
        setAvailableQuantity(other.getAvailableQuantity());
      }
      if (other.getIsSentByPrimary() != false) {
        setIsSentByPrimary(other.getIsSentByPrimary());
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
      common.tharaka.ds.cw.communication.grpc.generated.ItemUpdateRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (common.tharaka.ds.cw.communication.grpc.generated.ItemUpdateRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object itemId_ = "";
    /**
     * <code>string itemId = 1;</code>
     * @return The itemId.
     */
    public java.lang.String getItemId() {
      java.lang.Object ref = itemId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        itemId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string itemId = 1;</code>
     * @return The bytes for itemId.
     */
    public com.google.protobuf.ByteString
        getItemIdBytes() {
      java.lang.Object ref = itemId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        itemId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string itemId = 1;</code>
     * @param value The itemId to set.
     * @return This builder for chaining.
     */
    public Builder setItemId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      itemId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string itemId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearItemId() {
      
      itemId_ = getDefaultInstance().getItemId();
      onChanged();
      return this;
    }
    /**
     * <code>string itemId = 1;</code>
     * @param value The bytes for itemId to set.
     * @return This builder for chaining.
     */
    public Builder setItemIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      itemId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object sellerName_ = "";
    /**
     * <code>string sellerName = 2;</code>
     * @return The sellerName.
     */
    public java.lang.String getSellerName() {
      java.lang.Object ref = sellerName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sellerName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string sellerName = 2;</code>
     * @return The bytes for sellerName.
     */
    public com.google.protobuf.ByteString
        getSellerNameBytes() {
      java.lang.Object ref = sellerName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sellerName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string sellerName = 2;</code>
     * @param value The sellerName to set.
     * @return This builder for chaining.
     */
    public Builder setSellerName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      sellerName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string sellerName = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSellerName() {
      
      sellerName_ = getDefaultInstance().getSellerName();
      onChanged();
      return this;
    }
    /**
     * <code>string sellerName = 2;</code>
     * @param value The bytes for sellerName to set.
     * @return This builder for chaining.
     */
    public Builder setSellerNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      sellerName_ = value;
      onChanged();
      return this;
    }

    private double price_ ;
    /**
     * <code>double price = 3;</code>
     * @return The price.
     */
    @java.lang.Override
    public double getPrice() {
      return price_;
    }
    /**
     * <code>double price = 3;</code>
     * @param value The price to set.
     * @return This builder for chaining.
     */
    public Builder setPrice(double value) {
      
      price_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double price = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPrice() {
      
      price_ = 0D;
      onChanged();
      return this;
    }

    private int availableQuantity_ ;
    /**
     * <code>int32 availableQuantity = 4;</code>
     * @return The availableQuantity.
     */
    @java.lang.Override
    public int getAvailableQuantity() {
      return availableQuantity_;
    }
    /**
     * <code>int32 availableQuantity = 4;</code>
     * @param value The availableQuantity to set.
     * @return This builder for chaining.
     */
    public Builder setAvailableQuantity(int value) {
      
      availableQuantity_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 availableQuantity = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearAvailableQuantity() {
      
      availableQuantity_ = 0;
      onChanged();
      return this;
    }

    private boolean isSentByPrimary_ ;
    /**
     * <code>bool isSentByPrimary = 5;</code>
     * @return The isSentByPrimary.
     */
    @java.lang.Override
    public boolean getIsSentByPrimary() {
      return isSentByPrimary_;
    }
    /**
     * <code>bool isSentByPrimary = 5;</code>
     * @param value The isSentByPrimary to set.
     * @return This builder for chaining.
     */
    public Builder setIsSentByPrimary(boolean value) {
      
      isSentByPrimary_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool isSentByPrimary = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsSentByPrimary() {
      
      isSentByPrimary_ = false;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:common.tharaka.ds.cw.communication.grpc.generated.ItemUpdateRequest)
  }

  // @@protoc_insertion_point(class_scope:common.tharaka.ds.cw.communication.grpc.generated.ItemUpdateRequest)
  private static final common.tharaka.ds.cw.communication.grpc.generated.ItemUpdateRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new common.tharaka.ds.cw.communication.grpc.generated.ItemUpdateRequest();
  }

  public static common.tharaka.ds.cw.communication.grpc.generated.ItemUpdateRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ItemUpdateRequest>
      PARSER = new com.google.protobuf.AbstractParser<ItemUpdateRequest>() {
    @java.lang.Override
    public ItemUpdateRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ItemUpdateRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ItemUpdateRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ItemUpdateRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public common.tharaka.ds.cw.communication.grpc.generated.ItemUpdateRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

