// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AchievementUpdateNotify.proto

package emu.grasscutter.net.proto;

public final class AchievementUpdateNotifyOuterClass {
  private AchievementUpdateNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AchievementUpdateNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AchievementUpdateNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .Achievement achievement_list = 2;</code>
     */
    java.util.List<emu.grasscutter.net.proto.AchievementOuterClass.Achievement> 
        getAchievementListList();
    /**
     * <code>repeated .Achievement achievement_list = 2;</code>
     */
    emu.grasscutter.net.proto.AchievementOuterClass.Achievement getAchievementList(int index);
    /**
     * <code>repeated .Achievement achievement_list = 2;</code>
     */
    int getAchievementListCount();
    /**
     * <code>repeated .Achievement achievement_list = 2;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.AchievementOuterClass.AchievementOrBuilder> 
        getAchievementListOrBuilderList();
    /**
     * <code>repeated .Achievement achievement_list = 2;</code>
     */
    emu.grasscutter.net.proto.AchievementOuterClass.AchievementOrBuilder getAchievementListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * Name: PFKCLOLEDDE
   * CmdId: 2693
   * </pre>
   *
   * Protobuf type {@code AchievementUpdateNotify}
   */
  public static final class AchievementUpdateNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AchievementUpdateNotify)
      AchievementUpdateNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AchievementUpdateNotify.newBuilder() to construct.
    private AchievementUpdateNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AchievementUpdateNotify() {
      achievementList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AchievementUpdateNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AchievementUpdateNotify(
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
            case 18: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                achievementList_ = new java.util.ArrayList<emu.grasscutter.net.proto.AchievementOuterClass.Achievement>();
                mutable_bitField0_ |= 0x00000001;
              }
              achievementList_.add(
                  input.readMessage(emu.grasscutter.net.proto.AchievementOuterClass.Achievement.parser(), extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          achievementList_ = java.util.Collections.unmodifiableList(achievementList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.AchievementUpdateNotifyOuterClass.internal_static_AchievementUpdateNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AchievementUpdateNotifyOuterClass.internal_static_AchievementUpdateNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AchievementUpdateNotifyOuterClass.AchievementUpdateNotify.class, emu.grasscutter.net.proto.AchievementUpdateNotifyOuterClass.AchievementUpdateNotify.Builder.class);
    }

    public static final int ACHIEVEMENT_LIST_FIELD_NUMBER = 2;
    private java.util.List<emu.grasscutter.net.proto.AchievementOuterClass.Achievement> achievementList_;
    /**
     * <code>repeated .Achievement achievement_list = 2;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.AchievementOuterClass.Achievement> getAchievementListList() {
      return achievementList_;
    }
    /**
     * <code>repeated .Achievement achievement_list = 2;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.AchievementOuterClass.AchievementOrBuilder> 
        getAchievementListOrBuilderList() {
      return achievementList_;
    }
    /**
     * <code>repeated .Achievement achievement_list = 2;</code>
     */
    @java.lang.Override
    public int getAchievementListCount() {
      return achievementList_.size();
    }
    /**
     * <code>repeated .Achievement achievement_list = 2;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.AchievementOuterClass.Achievement getAchievementList(int index) {
      return achievementList_.get(index);
    }
    /**
     * <code>repeated .Achievement achievement_list = 2;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.AchievementOuterClass.AchievementOrBuilder getAchievementListOrBuilder(
        int index) {
      return achievementList_.get(index);
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
      for (int i = 0; i < achievementList_.size(); i++) {
        output.writeMessage(2, achievementList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < achievementList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, achievementList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.AchievementUpdateNotifyOuterClass.AchievementUpdateNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AchievementUpdateNotifyOuterClass.AchievementUpdateNotify other = (emu.grasscutter.net.proto.AchievementUpdateNotifyOuterClass.AchievementUpdateNotify) obj;

      if (!getAchievementListList()
          .equals(other.getAchievementListList())) return false;
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
      if (getAchievementListCount() > 0) {
        hash = (37 * hash) + ACHIEVEMENT_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getAchievementListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AchievementUpdateNotifyOuterClass.AchievementUpdateNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AchievementUpdateNotifyOuterClass.AchievementUpdateNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AchievementUpdateNotifyOuterClass.AchievementUpdateNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AchievementUpdateNotifyOuterClass.AchievementUpdateNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AchievementUpdateNotifyOuterClass.AchievementUpdateNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AchievementUpdateNotifyOuterClass.AchievementUpdateNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AchievementUpdateNotifyOuterClass.AchievementUpdateNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AchievementUpdateNotifyOuterClass.AchievementUpdateNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AchievementUpdateNotifyOuterClass.AchievementUpdateNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AchievementUpdateNotifyOuterClass.AchievementUpdateNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AchievementUpdateNotifyOuterClass.AchievementUpdateNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AchievementUpdateNotifyOuterClass.AchievementUpdateNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AchievementUpdateNotifyOuterClass.AchievementUpdateNotify prototype) {
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
     * <pre>
     * Name: PFKCLOLEDDE
     * CmdId: 2693
     * </pre>
     *
     * Protobuf type {@code AchievementUpdateNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AchievementUpdateNotify)
        emu.grasscutter.net.proto.AchievementUpdateNotifyOuterClass.AchievementUpdateNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AchievementUpdateNotifyOuterClass.internal_static_AchievementUpdateNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AchievementUpdateNotifyOuterClass.internal_static_AchievementUpdateNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AchievementUpdateNotifyOuterClass.AchievementUpdateNotify.class, emu.grasscutter.net.proto.AchievementUpdateNotifyOuterClass.AchievementUpdateNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AchievementUpdateNotifyOuterClass.AchievementUpdateNotify.newBuilder()
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
          getAchievementListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (achievementListBuilder_ == null) {
          achievementList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          achievementListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AchievementUpdateNotifyOuterClass.internal_static_AchievementUpdateNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AchievementUpdateNotifyOuterClass.AchievementUpdateNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AchievementUpdateNotifyOuterClass.AchievementUpdateNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AchievementUpdateNotifyOuterClass.AchievementUpdateNotify build() {
        emu.grasscutter.net.proto.AchievementUpdateNotifyOuterClass.AchievementUpdateNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AchievementUpdateNotifyOuterClass.AchievementUpdateNotify buildPartial() {
        emu.grasscutter.net.proto.AchievementUpdateNotifyOuterClass.AchievementUpdateNotify result = new emu.grasscutter.net.proto.AchievementUpdateNotifyOuterClass.AchievementUpdateNotify(this);
        int from_bitField0_ = bitField0_;
        if (achievementListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            achievementList_ = java.util.Collections.unmodifiableList(achievementList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.achievementList_ = achievementList_;
        } else {
          result.achievementList_ = achievementListBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.proto.AchievementUpdateNotifyOuterClass.AchievementUpdateNotify) {
          return mergeFrom((emu.grasscutter.net.proto.AchievementUpdateNotifyOuterClass.AchievementUpdateNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AchievementUpdateNotifyOuterClass.AchievementUpdateNotify other) {
        if (other == emu.grasscutter.net.proto.AchievementUpdateNotifyOuterClass.AchievementUpdateNotify.getDefaultInstance()) return this;
        if (achievementListBuilder_ == null) {
          if (!other.achievementList_.isEmpty()) {
            if (achievementList_.isEmpty()) {
              achievementList_ = other.achievementList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureAchievementListIsMutable();
              achievementList_.addAll(other.achievementList_);
            }
            onChanged();
          }
        } else {
          if (!other.achievementList_.isEmpty()) {
            if (achievementListBuilder_.isEmpty()) {
              achievementListBuilder_.dispose();
              achievementListBuilder_ = null;
              achievementList_ = other.achievementList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              achievementListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getAchievementListFieldBuilder() : null;
            } else {
              achievementListBuilder_.addAllMessages(other.achievementList_);
            }
          }
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
        emu.grasscutter.net.proto.AchievementUpdateNotifyOuterClass.AchievementUpdateNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.AchievementUpdateNotifyOuterClass.AchievementUpdateNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.AchievementOuterClass.Achievement> achievementList_ =
        java.util.Collections.emptyList();
      private void ensureAchievementListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          achievementList_ = new java.util.ArrayList<emu.grasscutter.net.proto.AchievementOuterClass.Achievement>(achievementList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.AchievementOuterClass.Achievement, emu.grasscutter.net.proto.AchievementOuterClass.Achievement.Builder, emu.grasscutter.net.proto.AchievementOuterClass.AchievementOrBuilder> achievementListBuilder_;

      /**
       * <code>repeated .Achievement achievement_list = 2;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.AchievementOuterClass.Achievement> getAchievementListList() {
        if (achievementListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(achievementList_);
        } else {
          return achievementListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .Achievement achievement_list = 2;</code>
       */
      public int getAchievementListCount() {
        if (achievementListBuilder_ == null) {
          return achievementList_.size();
        } else {
          return achievementListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .Achievement achievement_list = 2;</code>
       */
      public emu.grasscutter.net.proto.AchievementOuterClass.Achievement getAchievementList(int index) {
        if (achievementListBuilder_ == null) {
          return achievementList_.get(index);
        } else {
          return achievementListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .Achievement achievement_list = 2;</code>
       */
      public Builder setAchievementList(
          int index, emu.grasscutter.net.proto.AchievementOuterClass.Achievement value) {
        if (achievementListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAchievementListIsMutable();
          achievementList_.set(index, value);
          onChanged();
        } else {
          achievementListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Achievement achievement_list = 2;</code>
       */
      public Builder setAchievementList(
          int index, emu.grasscutter.net.proto.AchievementOuterClass.Achievement.Builder builderForValue) {
        if (achievementListBuilder_ == null) {
          ensureAchievementListIsMutable();
          achievementList_.set(index, builderForValue.build());
          onChanged();
        } else {
          achievementListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Achievement achievement_list = 2;</code>
       */
      public Builder addAchievementList(emu.grasscutter.net.proto.AchievementOuterClass.Achievement value) {
        if (achievementListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAchievementListIsMutable();
          achievementList_.add(value);
          onChanged();
        } else {
          achievementListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .Achievement achievement_list = 2;</code>
       */
      public Builder addAchievementList(
          int index, emu.grasscutter.net.proto.AchievementOuterClass.Achievement value) {
        if (achievementListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAchievementListIsMutable();
          achievementList_.add(index, value);
          onChanged();
        } else {
          achievementListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Achievement achievement_list = 2;</code>
       */
      public Builder addAchievementList(
          emu.grasscutter.net.proto.AchievementOuterClass.Achievement.Builder builderForValue) {
        if (achievementListBuilder_ == null) {
          ensureAchievementListIsMutable();
          achievementList_.add(builderForValue.build());
          onChanged();
        } else {
          achievementListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Achievement achievement_list = 2;</code>
       */
      public Builder addAchievementList(
          int index, emu.grasscutter.net.proto.AchievementOuterClass.Achievement.Builder builderForValue) {
        if (achievementListBuilder_ == null) {
          ensureAchievementListIsMutable();
          achievementList_.add(index, builderForValue.build());
          onChanged();
        } else {
          achievementListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Achievement achievement_list = 2;</code>
       */
      public Builder addAllAchievementList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.AchievementOuterClass.Achievement> values) {
        if (achievementListBuilder_ == null) {
          ensureAchievementListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, achievementList_);
          onChanged();
        } else {
          achievementListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .Achievement achievement_list = 2;</code>
       */
      public Builder clearAchievementList() {
        if (achievementListBuilder_ == null) {
          achievementList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          achievementListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .Achievement achievement_list = 2;</code>
       */
      public Builder removeAchievementList(int index) {
        if (achievementListBuilder_ == null) {
          ensureAchievementListIsMutable();
          achievementList_.remove(index);
          onChanged();
        } else {
          achievementListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .Achievement achievement_list = 2;</code>
       */
      public emu.grasscutter.net.proto.AchievementOuterClass.Achievement.Builder getAchievementListBuilder(
          int index) {
        return getAchievementListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .Achievement achievement_list = 2;</code>
       */
      public emu.grasscutter.net.proto.AchievementOuterClass.AchievementOrBuilder getAchievementListOrBuilder(
          int index) {
        if (achievementListBuilder_ == null) {
          return achievementList_.get(index);  } else {
          return achievementListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .Achievement achievement_list = 2;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.AchievementOuterClass.AchievementOrBuilder> 
           getAchievementListOrBuilderList() {
        if (achievementListBuilder_ != null) {
          return achievementListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(achievementList_);
        }
      }
      /**
       * <code>repeated .Achievement achievement_list = 2;</code>
       */
      public emu.grasscutter.net.proto.AchievementOuterClass.Achievement.Builder addAchievementListBuilder() {
        return getAchievementListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.AchievementOuterClass.Achievement.getDefaultInstance());
      }
      /**
       * <code>repeated .Achievement achievement_list = 2;</code>
       */
      public emu.grasscutter.net.proto.AchievementOuterClass.Achievement.Builder addAchievementListBuilder(
          int index) {
        return getAchievementListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.AchievementOuterClass.Achievement.getDefaultInstance());
      }
      /**
       * <code>repeated .Achievement achievement_list = 2;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.AchievementOuterClass.Achievement.Builder> 
           getAchievementListBuilderList() {
        return getAchievementListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.AchievementOuterClass.Achievement, emu.grasscutter.net.proto.AchievementOuterClass.Achievement.Builder, emu.grasscutter.net.proto.AchievementOuterClass.AchievementOrBuilder> 
          getAchievementListFieldBuilder() {
        if (achievementListBuilder_ == null) {
          achievementListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.AchievementOuterClass.Achievement, emu.grasscutter.net.proto.AchievementOuterClass.Achievement.Builder, emu.grasscutter.net.proto.AchievementOuterClass.AchievementOrBuilder>(
                  achievementList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          achievementList_ = null;
        }
        return achievementListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:AchievementUpdateNotify)
    }

    // @@protoc_insertion_point(class_scope:AchievementUpdateNotify)
    private static final emu.grasscutter.net.proto.AchievementUpdateNotifyOuterClass.AchievementUpdateNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AchievementUpdateNotifyOuterClass.AchievementUpdateNotify();
    }

    public static emu.grasscutter.net.proto.AchievementUpdateNotifyOuterClass.AchievementUpdateNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AchievementUpdateNotify>
        PARSER = new com.google.protobuf.AbstractParser<AchievementUpdateNotify>() {
      @java.lang.Override
      public AchievementUpdateNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AchievementUpdateNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AchievementUpdateNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AchievementUpdateNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AchievementUpdateNotifyOuterClass.AchievementUpdateNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AchievementUpdateNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AchievementUpdateNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035AchievementUpdateNotify.proto\032\021Achieve" +
      "ment.proto\"A\n\027AchievementUpdateNotify\022&\n" +
      "\020achievement_list\030\002 \003(\0132\014.AchievementB\033\n" +
      "\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.AchievementOuterClass.getDescriptor(),
        });
    internal_static_AchievementUpdateNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AchievementUpdateNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AchievementUpdateNotify_descriptor,
        new java.lang.String[] { "AchievementList", });
    emu.grasscutter.net.proto.AchievementOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
