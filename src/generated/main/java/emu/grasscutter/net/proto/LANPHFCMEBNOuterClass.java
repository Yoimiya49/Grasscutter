// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LANPHFCMEBN.proto

package emu.grasscutter.net.proto;

public final class LANPHFCMEBNOuterClass {
  private LANPHFCMEBNOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LANPHFCMEBNOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LANPHFCMEBN)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool EPCIACIPLAN = 6;</code>
     * @return The ePCIACIPLAN.
     */
    boolean getEPCIACIPLAN();
  }
  /**
   * Protobuf type {@code LANPHFCMEBN}
   */
  public static final class LANPHFCMEBN extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LANPHFCMEBN)
      LANPHFCMEBNOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LANPHFCMEBN.newBuilder() to construct.
    private LANPHFCMEBN(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LANPHFCMEBN() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LANPHFCMEBN();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private LANPHFCMEBN(
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
            case 48: {

              ePCIACIPLAN_ = input.readBool();
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
      return emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.internal_static_LANPHFCMEBN_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.internal_static_LANPHFCMEBN_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.LANPHFCMEBN.class, emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.LANPHFCMEBN.Builder.class);
    }

    public static final int EPCIACIPLAN_FIELD_NUMBER = 6;
    private boolean ePCIACIPLAN_;
    /**
     * <code>bool EPCIACIPLAN = 6;</code>
     * @return The ePCIACIPLAN.
     */
    @java.lang.Override
    public boolean getEPCIACIPLAN() {
      return ePCIACIPLAN_;
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
      if (ePCIACIPLAN_ != false) {
        output.writeBool(6, ePCIACIPLAN_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (ePCIACIPLAN_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, ePCIACIPLAN_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.LANPHFCMEBN)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.LANPHFCMEBN other = (emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.LANPHFCMEBN) obj;

      if (getEPCIACIPLAN()
          != other.getEPCIACIPLAN()) return false;
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
      hash = (37 * hash) + EPCIACIPLAN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getEPCIACIPLAN());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.LANPHFCMEBN parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.LANPHFCMEBN parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.LANPHFCMEBN parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.LANPHFCMEBN parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.LANPHFCMEBN parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.LANPHFCMEBN parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.LANPHFCMEBN parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.LANPHFCMEBN parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.LANPHFCMEBN parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.LANPHFCMEBN parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.LANPHFCMEBN parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.LANPHFCMEBN parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.LANPHFCMEBN prototype) {
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
     * Protobuf type {@code LANPHFCMEBN}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LANPHFCMEBN)
        emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.LANPHFCMEBNOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.internal_static_LANPHFCMEBN_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.internal_static_LANPHFCMEBN_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.LANPHFCMEBN.class, emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.LANPHFCMEBN.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.LANPHFCMEBN.newBuilder()
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
        ePCIACIPLAN_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.internal_static_LANPHFCMEBN_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.LANPHFCMEBN getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.LANPHFCMEBN.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.LANPHFCMEBN build() {
        emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.LANPHFCMEBN result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.LANPHFCMEBN buildPartial() {
        emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.LANPHFCMEBN result = new emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.LANPHFCMEBN(this);
        result.ePCIACIPLAN_ = ePCIACIPLAN_;
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
        if (other instanceof emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.LANPHFCMEBN) {
          return mergeFrom((emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.LANPHFCMEBN)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.LANPHFCMEBN other) {
        if (other == emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.LANPHFCMEBN.getDefaultInstance()) return this;
        if (other.getEPCIACIPLAN() != false) {
          setEPCIACIPLAN(other.getEPCIACIPLAN());
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
        emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.LANPHFCMEBN parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.LANPHFCMEBN) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean ePCIACIPLAN_ ;
      /**
       * <code>bool EPCIACIPLAN = 6;</code>
       * @return The ePCIACIPLAN.
       */
      @java.lang.Override
      public boolean getEPCIACIPLAN() {
        return ePCIACIPLAN_;
      }
      /**
       * <code>bool EPCIACIPLAN = 6;</code>
       * @param value The ePCIACIPLAN to set.
       * @return This builder for chaining.
       */
      public Builder setEPCIACIPLAN(boolean value) {
        
        ePCIACIPLAN_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool EPCIACIPLAN = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearEPCIACIPLAN() {
        
        ePCIACIPLAN_ = false;
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


      // @@protoc_insertion_point(builder_scope:LANPHFCMEBN)
    }

    // @@protoc_insertion_point(class_scope:LANPHFCMEBN)
    private static final emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.LANPHFCMEBN DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.LANPHFCMEBN();
    }

    public static emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.LANPHFCMEBN getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LANPHFCMEBN>
        PARSER = new com.google.protobuf.AbstractParser<LANPHFCMEBN>() {
      @java.lang.Override
      public LANPHFCMEBN parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new LANPHFCMEBN(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<LANPHFCMEBN> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LANPHFCMEBN> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.LANPHFCMEBNOuterClass.LANPHFCMEBN getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LANPHFCMEBN_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LANPHFCMEBN_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021LANPHFCMEBN.proto\"\"\n\013LANPHFCMEBN\022\023\n\013EP" +
      "CIACIPLAN\030\006 \001(\010B\033\n\031emu.grasscutter.net.p" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_LANPHFCMEBN_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LANPHFCMEBN_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LANPHFCMEBN_descriptor,
        new java.lang.String[] { "EPCIACIPLAN", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}