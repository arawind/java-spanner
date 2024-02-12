/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/admin/database/v1/spanner_database_admin.proto

package com.google.spanner.admin.database.v1;

/**
 *
 *
 * <pre>
 * The response for [ListDatabaseRoles][google.spanner.admin.database.v1.DatabaseAdmin.ListDatabaseRoles].
 * </pre>
 *
 * Protobuf type {@code google.spanner.admin.database.v1.ListDatabaseRolesResponse}
 */
public final class ListDatabaseRolesResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.spanner.admin.database.v1.ListDatabaseRolesResponse)
    ListDatabaseRolesResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListDatabaseRolesResponse.newBuilder() to construct.
  private ListDatabaseRolesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListDatabaseRolesResponse() {
    databaseRoles_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListDatabaseRolesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.spanner.admin.database.v1.SpannerDatabaseAdminProto
        .internal_static_google_spanner_admin_database_v1_ListDatabaseRolesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.spanner.admin.database.v1.SpannerDatabaseAdminProto
        .internal_static_google_spanner_admin_database_v1_ListDatabaseRolesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.spanner.admin.database.v1.ListDatabaseRolesResponse.class,
            com.google.spanner.admin.database.v1.ListDatabaseRolesResponse.Builder.class);
  }

  public static final int DATABASE_ROLES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.spanner.admin.database.v1.DatabaseRole> databaseRoles_;
  /**
   *
   *
   * <pre>
   * Database roles that matched the request.
   * </pre>
   *
   * <code>repeated .google.spanner.admin.database.v1.DatabaseRole database_roles = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.spanner.admin.database.v1.DatabaseRole> getDatabaseRolesList() {
    return databaseRoles_;
  }
  /**
   *
   *
   * <pre>
   * Database roles that matched the request.
   * </pre>
   *
   * <code>repeated .google.spanner.admin.database.v1.DatabaseRole database_roles = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.spanner.admin.database.v1.DatabaseRoleOrBuilder>
      getDatabaseRolesOrBuilderList() {
    return databaseRoles_;
  }
  /**
   *
   *
   * <pre>
   * Database roles that matched the request.
   * </pre>
   *
   * <code>repeated .google.spanner.admin.database.v1.DatabaseRole database_roles = 1;</code>
   */
  @java.lang.Override
  public int getDatabaseRolesCount() {
    return databaseRoles_.size();
  }
  /**
   *
   *
   * <pre>
   * Database roles that matched the request.
   * </pre>
   *
   * <code>repeated .google.spanner.admin.database.v1.DatabaseRole database_roles = 1;</code>
   */
  @java.lang.Override
  public com.google.spanner.admin.database.v1.DatabaseRole getDatabaseRoles(int index) {
    return databaseRoles_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Database roles that matched the request.
   * </pre>
   *
   * <code>repeated .google.spanner.admin.database.v1.DatabaseRole database_roles = 1;</code>
   */
  @java.lang.Override
  public com.google.spanner.admin.database.v1.DatabaseRoleOrBuilder getDatabaseRolesOrBuilder(
      int index) {
    return databaseRoles_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * `next_page_token` can be sent in a subsequent
   * [ListDatabaseRoles][google.spanner.admin.database.v1.DatabaseAdmin.ListDatabaseRoles]
   * call to fetch more of the matching roles.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * `next_page_token` can be sent in a subsequent
   * [ListDatabaseRoles][google.spanner.admin.database.v1.DatabaseAdmin.ListDatabaseRoles]
   * call to fetch more of the matching roles.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    for (int i = 0; i < databaseRoles_.size(); i++) {
      output.writeMessage(1, databaseRoles_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < databaseRoles_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, databaseRoles_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.spanner.admin.database.v1.ListDatabaseRolesResponse)) {
      return super.equals(obj);
    }
    com.google.spanner.admin.database.v1.ListDatabaseRolesResponse other =
        (com.google.spanner.admin.database.v1.ListDatabaseRolesResponse) obj;

    if (!getDatabaseRolesList().equals(other.getDatabaseRolesList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getDatabaseRolesCount() > 0) {
      hash = (37 * hash) + DATABASE_ROLES_FIELD_NUMBER;
      hash = (53 * hash) + getDatabaseRolesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.spanner.admin.database.v1.ListDatabaseRolesResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.spanner.admin.database.v1.ListDatabaseRolesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.spanner.admin.database.v1.ListDatabaseRolesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.spanner.admin.database.v1.ListDatabaseRolesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.spanner.admin.database.v1.ListDatabaseRolesResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.spanner.admin.database.v1.ListDatabaseRolesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.spanner.admin.database.v1.ListDatabaseRolesResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.spanner.admin.database.v1.ListDatabaseRolesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.spanner.admin.database.v1.ListDatabaseRolesResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.spanner.admin.database.v1.ListDatabaseRolesResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.spanner.admin.database.v1.ListDatabaseRolesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.spanner.admin.database.v1.ListDatabaseRolesResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.spanner.admin.database.v1.ListDatabaseRolesResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * The response for [ListDatabaseRoles][google.spanner.admin.database.v1.DatabaseAdmin.ListDatabaseRoles].
   * </pre>
   *
   * Protobuf type {@code google.spanner.admin.database.v1.ListDatabaseRolesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.spanner.admin.database.v1.ListDatabaseRolesResponse)
      com.google.spanner.admin.database.v1.ListDatabaseRolesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.spanner.admin.database.v1.SpannerDatabaseAdminProto
          .internal_static_google_spanner_admin_database_v1_ListDatabaseRolesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.spanner.admin.database.v1.SpannerDatabaseAdminProto
          .internal_static_google_spanner_admin_database_v1_ListDatabaseRolesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.spanner.admin.database.v1.ListDatabaseRolesResponse.class,
              com.google.spanner.admin.database.v1.ListDatabaseRolesResponse.Builder.class);
    }

    // Construct using com.google.spanner.admin.database.v1.ListDatabaseRolesResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (databaseRolesBuilder_ == null) {
        databaseRoles_ = java.util.Collections.emptyList();
      } else {
        databaseRoles_ = null;
        databaseRolesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.spanner.admin.database.v1.SpannerDatabaseAdminProto
          .internal_static_google_spanner_admin_database_v1_ListDatabaseRolesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.spanner.admin.database.v1.ListDatabaseRolesResponse
        getDefaultInstanceForType() {
      return com.google.spanner.admin.database.v1.ListDatabaseRolesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.spanner.admin.database.v1.ListDatabaseRolesResponse build() {
      com.google.spanner.admin.database.v1.ListDatabaseRolesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.spanner.admin.database.v1.ListDatabaseRolesResponse buildPartial() {
      com.google.spanner.admin.database.v1.ListDatabaseRolesResponse result =
          new com.google.spanner.admin.database.v1.ListDatabaseRolesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.spanner.admin.database.v1.ListDatabaseRolesResponse result) {
      if (databaseRolesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          databaseRoles_ = java.util.Collections.unmodifiableList(databaseRoles_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.databaseRoles_ = databaseRoles_;
      } else {
        result.databaseRoles_ = databaseRolesBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.spanner.admin.database.v1.ListDatabaseRolesResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.spanner.admin.database.v1.ListDatabaseRolesResponse) {
        return mergeFrom((com.google.spanner.admin.database.v1.ListDatabaseRolesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.spanner.admin.database.v1.ListDatabaseRolesResponse other) {
      if (other
          == com.google.spanner.admin.database.v1.ListDatabaseRolesResponse.getDefaultInstance())
        return this;
      if (databaseRolesBuilder_ == null) {
        if (!other.databaseRoles_.isEmpty()) {
          if (databaseRoles_.isEmpty()) {
            databaseRoles_ = other.databaseRoles_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDatabaseRolesIsMutable();
            databaseRoles_.addAll(other.databaseRoles_);
          }
          onChanged();
        }
      } else {
        if (!other.databaseRoles_.isEmpty()) {
          if (databaseRolesBuilder_.isEmpty()) {
            databaseRolesBuilder_.dispose();
            databaseRolesBuilder_ = null;
            databaseRoles_ = other.databaseRoles_;
            bitField0_ = (bitField0_ & ~0x00000001);
            databaseRolesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getDatabaseRolesFieldBuilder()
                    : null;
          } else {
            databaseRolesBuilder_.addAllMessages(other.databaseRoles_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                com.google.spanner.admin.database.v1.DatabaseRole m =
                    input.readMessage(
                        com.google.spanner.admin.database.v1.DatabaseRole.parser(),
                        extensionRegistry);
                if (databaseRolesBuilder_ == null) {
                  ensureDatabaseRolesIsMutable();
                  databaseRoles_.add(m);
                } else {
                  databaseRolesBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 18:
              {
                nextPageToken_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.spanner.admin.database.v1.DatabaseRole> databaseRoles_ =
        java.util.Collections.emptyList();

    private void ensureDatabaseRolesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        databaseRoles_ =
            new java.util.ArrayList<com.google.spanner.admin.database.v1.DatabaseRole>(
                databaseRoles_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.spanner.admin.database.v1.DatabaseRole,
            com.google.spanner.admin.database.v1.DatabaseRole.Builder,
            com.google.spanner.admin.database.v1.DatabaseRoleOrBuilder>
        databaseRolesBuilder_;

    /**
     *
     *
     * <pre>
     * Database roles that matched the request.
     * </pre>
     *
     * <code>repeated .google.spanner.admin.database.v1.DatabaseRole database_roles = 1;</code>
     */
    public java.util.List<com.google.spanner.admin.database.v1.DatabaseRole>
        getDatabaseRolesList() {
      if (databaseRolesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(databaseRoles_);
      } else {
        return databaseRolesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Database roles that matched the request.
     * </pre>
     *
     * <code>repeated .google.spanner.admin.database.v1.DatabaseRole database_roles = 1;</code>
     */
    public int getDatabaseRolesCount() {
      if (databaseRolesBuilder_ == null) {
        return databaseRoles_.size();
      } else {
        return databaseRolesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Database roles that matched the request.
     * </pre>
     *
     * <code>repeated .google.spanner.admin.database.v1.DatabaseRole database_roles = 1;</code>
     */
    public com.google.spanner.admin.database.v1.DatabaseRole getDatabaseRoles(int index) {
      if (databaseRolesBuilder_ == null) {
        return databaseRoles_.get(index);
      } else {
        return databaseRolesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Database roles that matched the request.
     * </pre>
     *
     * <code>repeated .google.spanner.admin.database.v1.DatabaseRole database_roles = 1;</code>
     */
    public Builder setDatabaseRoles(
        int index, com.google.spanner.admin.database.v1.DatabaseRole value) {
      if (databaseRolesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDatabaseRolesIsMutable();
        databaseRoles_.set(index, value);
        onChanged();
      } else {
        databaseRolesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Database roles that matched the request.
     * </pre>
     *
     * <code>repeated .google.spanner.admin.database.v1.DatabaseRole database_roles = 1;</code>
     */
    public Builder setDatabaseRoles(
        int index, com.google.spanner.admin.database.v1.DatabaseRole.Builder builderForValue) {
      if (databaseRolesBuilder_ == null) {
        ensureDatabaseRolesIsMutable();
        databaseRoles_.set(index, builderForValue.build());
        onChanged();
      } else {
        databaseRolesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Database roles that matched the request.
     * </pre>
     *
     * <code>repeated .google.spanner.admin.database.v1.DatabaseRole database_roles = 1;</code>
     */
    public Builder addDatabaseRoles(com.google.spanner.admin.database.v1.DatabaseRole value) {
      if (databaseRolesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDatabaseRolesIsMutable();
        databaseRoles_.add(value);
        onChanged();
      } else {
        databaseRolesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Database roles that matched the request.
     * </pre>
     *
     * <code>repeated .google.spanner.admin.database.v1.DatabaseRole database_roles = 1;</code>
     */
    public Builder addDatabaseRoles(
        int index, com.google.spanner.admin.database.v1.DatabaseRole value) {
      if (databaseRolesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDatabaseRolesIsMutable();
        databaseRoles_.add(index, value);
        onChanged();
      } else {
        databaseRolesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Database roles that matched the request.
     * </pre>
     *
     * <code>repeated .google.spanner.admin.database.v1.DatabaseRole database_roles = 1;</code>
     */
    public Builder addDatabaseRoles(
        com.google.spanner.admin.database.v1.DatabaseRole.Builder builderForValue) {
      if (databaseRolesBuilder_ == null) {
        ensureDatabaseRolesIsMutable();
        databaseRoles_.add(builderForValue.build());
        onChanged();
      } else {
        databaseRolesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Database roles that matched the request.
     * </pre>
     *
     * <code>repeated .google.spanner.admin.database.v1.DatabaseRole database_roles = 1;</code>
     */
    public Builder addDatabaseRoles(
        int index, com.google.spanner.admin.database.v1.DatabaseRole.Builder builderForValue) {
      if (databaseRolesBuilder_ == null) {
        ensureDatabaseRolesIsMutable();
        databaseRoles_.add(index, builderForValue.build());
        onChanged();
      } else {
        databaseRolesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Database roles that matched the request.
     * </pre>
     *
     * <code>repeated .google.spanner.admin.database.v1.DatabaseRole database_roles = 1;</code>
     */
    public Builder addAllDatabaseRoles(
        java.lang.Iterable<? extends com.google.spanner.admin.database.v1.DatabaseRole> values) {
      if (databaseRolesBuilder_ == null) {
        ensureDatabaseRolesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, databaseRoles_);
        onChanged();
      } else {
        databaseRolesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Database roles that matched the request.
     * </pre>
     *
     * <code>repeated .google.spanner.admin.database.v1.DatabaseRole database_roles = 1;</code>
     */
    public Builder clearDatabaseRoles() {
      if (databaseRolesBuilder_ == null) {
        databaseRoles_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        databaseRolesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Database roles that matched the request.
     * </pre>
     *
     * <code>repeated .google.spanner.admin.database.v1.DatabaseRole database_roles = 1;</code>
     */
    public Builder removeDatabaseRoles(int index) {
      if (databaseRolesBuilder_ == null) {
        ensureDatabaseRolesIsMutable();
        databaseRoles_.remove(index);
        onChanged();
      } else {
        databaseRolesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Database roles that matched the request.
     * </pre>
     *
     * <code>repeated .google.spanner.admin.database.v1.DatabaseRole database_roles = 1;</code>
     */
    public com.google.spanner.admin.database.v1.DatabaseRole.Builder getDatabaseRolesBuilder(
        int index) {
      return getDatabaseRolesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Database roles that matched the request.
     * </pre>
     *
     * <code>repeated .google.spanner.admin.database.v1.DatabaseRole database_roles = 1;</code>
     */
    public com.google.spanner.admin.database.v1.DatabaseRoleOrBuilder getDatabaseRolesOrBuilder(
        int index) {
      if (databaseRolesBuilder_ == null) {
        return databaseRoles_.get(index);
      } else {
        return databaseRolesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Database roles that matched the request.
     * </pre>
     *
     * <code>repeated .google.spanner.admin.database.v1.DatabaseRole database_roles = 1;</code>
     */
    public java.util.List<? extends com.google.spanner.admin.database.v1.DatabaseRoleOrBuilder>
        getDatabaseRolesOrBuilderList() {
      if (databaseRolesBuilder_ != null) {
        return databaseRolesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(databaseRoles_);
      }
    }
    /**
     *
     *
     * <pre>
     * Database roles that matched the request.
     * </pre>
     *
     * <code>repeated .google.spanner.admin.database.v1.DatabaseRole database_roles = 1;</code>
     */
    public com.google.spanner.admin.database.v1.DatabaseRole.Builder addDatabaseRolesBuilder() {
      return getDatabaseRolesFieldBuilder()
          .addBuilder(com.google.spanner.admin.database.v1.DatabaseRole.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Database roles that matched the request.
     * </pre>
     *
     * <code>repeated .google.spanner.admin.database.v1.DatabaseRole database_roles = 1;</code>
     */
    public com.google.spanner.admin.database.v1.DatabaseRole.Builder addDatabaseRolesBuilder(
        int index) {
      return getDatabaseRolesFieldBuilder()
          .addBuilder(
              index, com.google.spanner.admin.database.v1.DatabaseRole.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Database roles that matched the request.
     * </pre>
     *
     * <code>repeated .google.spanner.admin.database.v1.DatabaseRole database_roles = 1;</code>
     */
    public java.util.List<com.google.spanner.admin.database.v1.DatabaseRole.Builder>
        getDatabaseRolesBuilderList() {
      return getDatabaseRolesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.spanner.admin.database.v1.DatabaseRole,
            com.google.spanner.admin.database.v1.DatabaseRole.Builder,
            com.google.spanner.admin.database.v1.DatabaseRoleOrBuilder>
        getDatabaseRolesFieldBuilder() {
      if (databaseRolesBuilder_ == null) {
        databaseRolesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.spanner.admin.database.v1.DatabaseRole,
                com.google.spanner.admin.database.v1.DatabaseRole.Builder,
                com.google.spanner.admin.database.v1.DatabaseRoleOrBuilder>(
                databaseRoles_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        databaseRoles_ = null;
      }
      return databaseRolesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * `next_page_token` can be sent in a subsequent
     * [ListDatabaseRoles][google.spanner.admin.database.v1.DatabaseAdmin.ListDatabaseRoles]
     * call to fetch more of the matching roles.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * `next_page_token` can be sent in a subsequent
     * [ListDatabaseRoles][google.spanner.admin.database.v1.DatabaseAdmin.ListDatabaseRoles]
     * call to fetch more of the matching roles.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * `next_page_token` can be sent in a subsequent
     * [ListDatabaseRoles][google.spanner.admin.database.v1.DatabaseAdmin.ListDatabaseRoles]
     * call to fetch more of the matching roles.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * `next_page_token` can be sent in a subsequent
     * [ListDatabaseRoles][google.spanner.admin.database.v1.DatabaseAdmin.ListDatabaseRoles]
     * call to fetch more of the matching roles.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * `next_page_token` can be sent in a subsequent
     * [ListDatabaseRoles][google.spanner.admin.database.v1.DatabaseAdmin.ListDatabaseRoles]
     * call to fetch more of the matching roles.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.spanner.admin.database.v1.ListDatabaseRolesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.spanner.admin.database.v1.ListDatabaseRolesResponse)
  private static final com.google.spanner.admin.database.v1.ListDatabaseRolesResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.spanner.admin.database.v1.ListDatabaseRolesResponse();
  }

  public static com.google.spanner.admin.database.v1.ListDatabaseRolesResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListDatabaseRolesResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListDatabaseRolesResponse>() {
        @java.lang.Override
        public ListDatabaseRolesResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<ListDatabaseRolesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListDatabaseRolesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.spanner.admin.database.v1.ListDatabaseRolesResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
