// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WalletService.proto

package com.aldren.wallet.grpc;

/**
 * Protobuf type {@code com.aldren.wallet.grpc.Transaction}
 */
public  final class Transaction extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.aldren.wallet.grpc.Transaction)
    TransactionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Transaction.newBuilder() to construct.
  private Transaction(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Transaction() {
    currency_ = "";
    type_ = "";
    date_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Transaction();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Transaction(
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
          case 9: {

            amount_ = input.readDouble();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            currency_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            type_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            date_ = s;
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
    return com.aldren.wallet.grpc.WalletServiceOuterClass.internal_static_com_aldren_wallet_grpc_Transaction_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aldren.wallet.grpc.WalletServiceOuterClass.internal_static_com_aldren_wallet_grpc_Transaction_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aldren.wallet.grpc.Transaction.class, com.aldren.wallet.grpc.Transaction.Builder.class);
  }

  public static final int AMOUNT_FIELD_NUMBER = 1;
  private double amount_;
  /**
   * <code>double amount = 1;</code>
   * @return The amount.
   */
  public double getAmount() {
    return amount_;
  }

  public static final int CURRENCY_FIELD_NUMBER = 2;
  private volatile java.lang.Object currency_;
  /**
   * <code>string currency = 2;</code>
   * @return The currency.
   */
  public java.lang.String getCurrency() {
    java.lang.Object ref = currency_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      currency_ = s;
      return s;
    }
  }
  /**
   * <code>string currency = 2;</code>
   * @return The bytes for currency.
   */
  public com.google.protobuf.ByteString
      getCurrencyBytes() {
    java.lang.Object ref = currency_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      currency_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TYPE_FIELD_NUMBER = 3;
  private volatile java.lang.Object type_;
  /**
   * <code>string type = 3;</code>
   * @return The type.
   */
  public java.lang.String getType() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      type_ = s;
      return s;
    }
  }
  /**
   * <code>string type = 3;</code>
   * @return The bytes for type.
   */
  public com.google.protobuf.ByteString
      getTypeBytes() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      type_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATE_FIELD_NUMBER = 4;
  private volatile java.lang.Object date_;
  /**
   * <code>string date = 4;</code>
   * @return The date.
   */
  public java.lang.String getDate() {
    java.lang.Object ref = date_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      date_ = s;
      return s;
    }
  }
  /**
   * <code>string date = 4;</code>
   * @return The bytes for date.
   */
  public com.google.protobuf.ByteString
      getDateBytes() {
    java.lang.Object ref = date_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      date_ = b;
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
    if (amount_ != 0D) {
      output.writeDouble(1, amount_);
    }
    if (!getCurrencyBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, currency_);
    }
    if (!getTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, type_);
    }
    if (!getDateBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, date_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (amount_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, amount_);
    }
    if (!getCurrencyBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, currency_);
    }
    if (!getTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, type_);
    }
    if (!getDateBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, date_);
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
    if (!(obj instanceof com.aldren.wallet.grpc.Transaction)) {
      return super.equals(obj);
    }
    com.aldren.wallet.grpc.Transaction other = (com.aldren.wallet.grpc.Transaction) obj;

    if (java.lang.Double.doubleToLongBits(getAmount())
        != java.lang.Double.doubleToLongBits(
            other.getAmount())) return false;
    if (!getCurrency()
        .equals(other.getCurrency())) return false;
    if (!getType()
        .equals(other.getType())) return false;
    if (!getDate()
        .equals(other.getDate())) return false;
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
    hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getAmount()));
    hash = (37 * hash) + CURRENCY_FIELD_NUMBER;
    hash = (53 * hash) + getCurrency().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType().hashCode();
    hash = (37 * hash) + DATE_FIELD_NUMBER;
    hash = (53 * hash) + getDate().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aldren.wallet.grpc.Transaction parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aldren.wallet.grpc.Transaction parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aldren.wallet.grpc.Transaction parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aldren.wallet.grpc.Transaction parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aldren.wallet.grpc.Transaction parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aldren.wallet.grpc.Transaction parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aldren.wallet.grpc.Transaction parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aldren.wallet.grpc.Transaction parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aldren.wallet.grpc.Transaction parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.aldren.wallet.grpc.Transaction parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aldren.wallet.grpc.Transaction parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aldren.wallet.grpc.Transaction parseFrom(
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
  public static Builder newBuilder(com.aldren.wallet.grpc.Transaction prototype) {
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
   * Protobuf type {@code com.aldren.wallet.grpc.Transaction}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.aldren.wallet.grpc.Transaction)
      com.aldren.wallet.grpc.TransactionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aldren.wallet.grpc.WalletServiceOuterClass.internal_static_com_aldren_wallet_grpc_Transaction_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aldren.wallet.grpc.WalletServiceOuterClass.internal_static_com_aldren_wallet_grpc_Transaction_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aldren.wallet.grpc.Transaction.class, com.aldren.wallet.grpc.Transaction.Builder.class);
    }

    // Construct using com.aldren.wallet.grpc.Transaction.newBuilder()
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
      amount_ = 0D;

      currency_ = "";

      type_ = "";

      date_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aldren.wallet.grpc.WalletServiceOuterClass.internal_static_com_aldren_wallet_grpc_Transaction_descriptor;
    }

    @java.lang.Override
    public com.aldren.wallet.grpc.Transaction getDefaultInstanceForType() {
      return com.aldren.wallet.grpc.Transaction.getDefaultInstance();
    }

    @java.lang.Override
    public com.aldren.wallet.grpc.Transaction build() {
      com.aldren.wallet.grpc.Transaction result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aldren.wallet.grpc.Transaction buildPartial() {
      com.aldren.wallet.grpc.Transaction result = new com.aldren.wallet.grpc.Transaction(this);
      result.amount_ = amount_;
      result.currency_ = currency_;
      result.type_ = type_;
      result.date_ = date_;
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
      if (other instanceof com.aldren.wallet.grpc.Transaction) {
        return mergeFrom((com.aldren.wallet.grpc.Transaction)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aldren.wallet.grpc.Transaction other) {
      if (other == com.aldren.wallet.grpc.Transaction.getDefaultInstance()) return this;
      if (other.getAmount() != 0D) {
        setAmount(other.getAmount());
      }
      if (!other.getCurrency().isEmpty()) {
        currency_ = other.currency_;
        onChanged();
      }
      if (!other.getType().isEmpty()) {
        type_ = other.type_;
        onChanged();
      }
      if (!other.getDate().isEmpty()) {
        date_ = other.date_;
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
      com.aldren.wallet.grpc.Transaction parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.aldren.wallet.grpc.Transaction) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private double amount_ ;
    /**
     * <code>double amount = 1;</code>
     * @return The amount.
     */
    public double getAmount() {
      return amount_;
    }
    /**
     * <code>double amount = 1;</code>
     * @param value The amount to set.
     * @return This builder for chaining.
     */
    public Builder setAmount(double value) {
      
      amount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double amount = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAmount() {
      
      amount_ = 0D;
      onChanged();
      return this;
    }

    private java.lang.Object currency_ = "";
    /**
     * <code>string currency = 2;</code>
     * @return The currency.
     */
    public java.lang.String getCurrency() {
      java.lang.Object ref = currency_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        currency_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string currency = 2;</code>
     * @return The bytes for currency.
     */
    public com.google.protobuf.ByteString
        getCurrencyBytes() {
      java.lang.Object ref = currency_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        currency_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string currency = 2;</code>
     * @param value The currency to set.
     * @return This builder for chaining.
     */
    public Builder setCurrency(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      currency_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string currency = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCurrency() {
      
      currency_ = getDefaultInstance().getCurrency();
      onChanged();
      return this;
    }
    /**
     * <code>string currency = 2;</code>
     * @param value The bytes for currency to set.
     * @return This builder for chaining.
     */
    public Builder setCurrencyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      currency_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object type_ = "";
    /**
     * <code>string type = 3;</code>
     * @return The type.
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        type_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string type = 3;</code>
     * @return The bytes for type.
     */
    public com.google.protobuf.ByteString
        getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string type = 3;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string type = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      
      type_ = getDefaultInstance().getType();
      onChanged();
      return this;
    }
    /**
     * <code>string type = 3;</code>
     * @param value The bytes for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      type_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object date_ = "";
    /**
     * <code>string date = 4;</code>
     * @return The date.
     */
    public java.lang.String getDate() {
      java.lang.Object ref = date_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        date_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string date = 4;</code>
     * @return The bytes for date.
     */
    public com.google.protobuf.ByteString
        getDateBytes() {
      java.lang.Object ref = date_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        date_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string date = 4;</code>
     * @param value The date to set.
     * @return This builder for chaining.
     */
    public Builder setDate(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      date_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string date = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearDate() {
      
      date_ = getDefaultInstance().getDate();
      onChanged();
      return this;
    }
    /**
     * <code>string date = 4;</code>
     * @param value The bytes for date to set.
     * @return This builder for chaining.
     */
    public Builder setDateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      date_ = value;
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


    // @@protoc_insertion_point(builder_scope:com.aldren.wallet.grpc.Transaction)
  }

  // @@protoc_insertion_point(class_scope:com.aldren.wallet.grpc.Transaction)
  private static final com.aldren.wallet.grpc.Transaction DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aldren.wallet.grpc.Transaction();
  }

  public static com.aldren.wallet.grpc.Transaction getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Transaction>
      PARSER = new com.google.protobuf.AbstractParser<Transaction>() {
    @java.lang.Override
    public Transaction parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Transaction(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Transaction> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Transaction> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aldren.wallet.grpc.Transaction getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
