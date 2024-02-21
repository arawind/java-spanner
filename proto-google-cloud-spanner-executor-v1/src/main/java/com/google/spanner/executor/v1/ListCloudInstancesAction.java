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
// source: google/spanner/executor/v1/cloud_executor.proto

// Protobuf Java Version: 3.25.2
package com.google.spanner.executor.v1;

/**
 *
 *
 * <pre>
 * Action that lists Cloud Spanner databases.
 * </pre>
 *
 * Protobuf type {@code google.spanner.executor.v1.ListCloudInstancesAction}
 */
public final class ListCloudInstancesAction extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.spanner.executor.v1.ListCloudInstancesAction)
    ListCloudInstancesActionOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListCloudInstancesAction.newBuilder() to construct.
  private ListCloudInstancesAction(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListCloudInstancesAction() {
    projectId_ = "";
    filter_ = "";
    pageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListCloudInstancesAction();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.spanner.executor.v1.CloudExecutorProto
        .internal_static_google_spanner_executor_v1_ListCloudInstancesAction_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.spanner.executor.v1.CloudExecutorProto
        .internal_static_google_spanner_executor_v1_ListCloudInstancesAction_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.spanner.executor.v1.ListCloudInstancesAction.class,
            com.google.spanner.executor.v1.ListCloudInstancesAction.Builder.class);
  }

  private int bitField0_;
  public static final int PROJECT_ID_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object projectId_ = "";
  /**
   *
   *
   * <pre>
   * Cloud project ID, e.g. "spanner-cloud-systest".
   * </pre>
   *
   * <code>string project_id = 1;</code>
   *
   * @return The projectId.
   */
  @java.lang.Override
  public java.lang.String getProjectId() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      projectId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Cloud project ID, e.g. "spanner-cloud-systest".
   * </pre>
   *
   * <code>string project_id = 1;</code>
   *
   * @return The bytes for projectId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getProjectIdBytes() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      projectId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FILTER_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object filter_ = "";
  /**
   *
   *
   * <pre>
   * A filter expression that filters what operations are returned in the
   * response.
   * The expression must specify the field name, a comparison operator,
   * and the value that you want to use for filtering.
   * Refer spanner_instance_admin.proto.ListInstancesRequest for
   * detail.
   * </pre>
   *
   * <code>optional string filter = 2;</code>
   *
   * @return Whether the filter field is set.
   */
  @java.lang.Override
  public boolean hasFilter() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * A filter expression that filters what operations are returned in the
   * response.
   * The expression must specify the field name, a comparison operator,
   * and the value that you want to use for filtering.
   * Refer spanner_instance_admin.proto.ListInstancesRequest for
   * detail.
   * </pre>
   *
   * <code>optional string filter = 2;</code>
   *
   * @return The filter.
   */
  @java.lang.Override
  public java.lang.String getFilter() {
    java.lang.Object ref = filter_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      filter_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A filter expression that filters what operations are returned in the
   * response.
   * The expression must specify the field name, a comparison operator,
   * and the value that you want to use for filtering.
   * Refer spanner_instance_admin.proto.ListInstancesRequest for
   * detail.
   * </pre>
   *
   * <code>optional string filter = 2;</code>
   *
   * @return The bytes for filter.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getFilterBytes() {
    java.lang.Object ref = filter_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      filter_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PAGE_SIZE_FIELD_NUMBER = 3;
  private int pageSize_ = 0;
  /**
   *
   *
   * <pre>
   * Number of instances to be returned in the response. If 0 or
   * less, defaults to the server's maximum allowed page size.
   * </pre>
   *
   * <code>optional int32 page_size = 3;</code>
   *
   * @return Whether the pageSize field is set.
   */
  @java.lang.Override
  public boolean hasPageSize() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * Number of instances to be returned in the response. If 0 or
   * less, defaults to the server's maximum allowed page size.
   * </pre>
   *
   * <code>optional int32 page_size = 3;</code>
   *
   * @return The pageSize.
   */
  @java.lang.Override
  public int getPageSize() {
    return pageSize_;
  }

  public static final int PAGE_TOKEN_FIELD_NUMBER = 4;

  @SuppressWarnings("serial")
  private volatile java.lang.Object pageToken_ = "";
  /**
   *
   *
   * <pre>
   * If non-empty, "page_token" should contain a next_page_token
   * from a previous ListInstancesResponse to the same "parent"
   * and with the same "filter".
   * </pre>
   *
   * <code>optional string page_token = 4;</code>
   *
   * @return Whether the pageToken field is set.
   */
  @java.lang.Override
  public boolean hasPageToken() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   *
   *
   * <pre>
   * If non-empty, "page_token" should contain a next_page_token
   * from a previous ListInstancesResponse to the same "parent"
   * and with the same "filter".
   * </pre>
   *
   * <code>optional string page_token = 4;</code>
   *
   * @return The pageToken.
   */
  @java.lang.Override
  public java.lang.String getPageToken() {
    java.lang.Object ref = pageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * If non-empty, "page_token" should contain a next_page_token
   * from a previous ListInstancesResponse to the same "parent"
   * and with the same "filter".
   * </pre>
   *
   * <code>optional string page_token = 4;</code>
   *
   * @return The bytes for pageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPageTokenBytes() {
    java.lang.Object ref = pageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      pageToken_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(projectId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, projectId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, filter_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt32(3, pageSize_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, pageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(projectId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, projectId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, filter_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(3, pageSize_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, pageToken_);
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
    if (!(obj instanceof com.google.spanner.executor.v1.ListCloudInstancesAction)) {
      return super.equals(obj);
    }
    com.google.spanner.executor.v1.ListCloudInstancesAction other =
        (com.google.spanner.executor.v1.ListCloudInstancesAction) obj;

    if (!getProjectId().equals(other.getProjectId())) return false;
    if (hasFilter() != other.hasFilter()) return false;
    if (hasFilter()) {
      if (!getFilter().equals(other.getFilter())) return false;
    }
    if (hasPageSize() != other.hasPageSize()) return false;
    if (hasPageSize()) {
      if (getPageSize() != other.getPageSize()) return false;
    }
    if (hasPageToken() != other.hasPageToken()) return false;
    if (hasPageToken()) {
      if (!getPageToken().equals(other.getPageToken())) return false;
    }
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
    hash = (37 * hash) + PROJECT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getProjectId().hashCode();
    if (hasFilter()) {
      hash = (37 * hash) + FILTER_FIELD_NUMBER;
      hash = (53 * hash) + getFilter().hashCode();
    }
    if (hasPageSize()) {
      hash = (37 * hash) + PAGE_SIZE_FIELD_NUMBER;
      hash = (53 * hash) + getPageSize();
    }
    if (hasPageToken()) {
      hash = (37 * hash) + PAGE_TOKEN_FIELD_NUMBER;
      hash = (53 * hash) + getPageToken().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.spanner.executor.v1.ListCloudInstancesAction parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.spanner.executor.v1.ListCloudInstancesAction parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.spanner.executor.v1.ListCloudInstancesAction parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.spanner.executor.v1.ListCloudInstancesAction parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.spanner.executor.v1.ListCloudInstancesAction parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.spanner.executor.v1.ListCloudInstancesAction parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.spanner.executor.v1.ListCloudInstancesAction parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.spanner.executor.v1.ListCloudInstancesAction parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.spanner.executor.v1.ListCloudInstancesAction parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.spanner.executor.v1.ListCloudInstancesAction parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.spanner.executor.v1.ListCloudInstancesAction parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.spanner.executor.v1.ListCloudInstancesAction parseFrom(
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
      com.google.spanner.executor.v1.ListCloudInstancesAction prototype) {
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
   * Action that lists Cloud Spanner databases.
   * </pre>
   *
   * Protobuf type {@code google.spanner.executor.v1.ListCloudInstancesAction}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.spanner.executor.v1.ListCloudInstancesAction)
      com.google.spanner.executor.v1.ListCloudInstancesActionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.spanner.executor.v1.CloudExecutorProto
          .internal_static_google_spanner_executor_v1_ListCloudInstancesAction_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.spanner.executor.v1.CloudExecutorProto
          .internal_static_google_spanner_executor_v1_ListCloudInstancesAction_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.spanner.executor.v1.ListCloudInstancesAction.class,
              com.google.spanner.executor.v1.ListCloudInstancesAction.Builder.class);
    }

    // Construct using com.google.spanner.executor.v1.ListCloudInstancesAction.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      projectId_ = "";
      filter_ = "";
      pageSize_ = 0;
      pageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.spanner.executor.v1.CloudExecutorProto
          .internal_static_google_spanner_executor_v1_ListCloudInstancesAction_descriptor;
    }

    @java.lang.Override
    public com.google.spanner.executor.v1.ListCloudInstancesAction getDefaultInstanceForType() {
      return com.google.spanner.executor.v1.ListCloudInstancesAction.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.spanner.executor.v1.ListCloudInstancesAction build() {
      com.google.spanner.executor.v1.ListCloudInstancesAction result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.spanner.executor.v1.ListCloudInstancesAction buildPartial() {
      com.google.spanner.executor.v1.ListCloudInstancesAction result =
          new com.google.spanner.executor.v1.ListCloudInstancesAction(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.spanner.executor.v1.ListCloudInstancesAction result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.projectId_ = projectId_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.filter_ = filter_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.pageSize_ = pageSize_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.pageToken_ = pageToken_;
        to_bitField0_ |= 0x00000004;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.spanner.executor.v1.ListCloudInstancesAction) {
        return mergeFrom((com.google.spanner.executor.v1.ListCloudInstancesAction) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.spanner.executor.v1.ListCloudInstancesAction other) {
      if (other == com.google.spanner.executor.v1.ListCloudInstancesAction.getDefaultInstance())
        return this;
      if (!other.getProjectId().isEmpty()) {
        projectId_ = other.projectId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasFilter()) {
        filter_ = other.filter_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasPageSize()) {
        setPageSize(other.getPageSize());
      }
      if (other.hasPageToken()) {
        pageToken_ = other.pageToken_;
        bitField0_ |= 0x00000008;
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
                projectId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                filter_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 24:
              {
                pageSize_ = input.readInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
            case 34:
              {
                pageToken_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000008;
                break;
              } // case 34
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

    private java.lang.Object projectId_ = "";
    /**
     *
     *
     * <pre>
     * Cloud project ID, e.g. "spanner-cloud-systest".
     * </pre>
     *
     * <code>string project_id = 1;</code>
     *
     * @return The projectId.
     */
    public java.lang.String getProjectId() {
      java.lang.Object ref = projectId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        projectId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Cloud project ID, e.g. "spanner-cloud-systest".
     * </pre>
     *
     * <code>string project_id = 1;</code>
     *
     * @return The bytes for projectId.
     */
    public com.google.protobuf.ByteString getProjectIdBytes() {
      java.lang.Object ref = projectId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        projectId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Cloud project ID, e.g. "spanner-cloud-systest".
     * </pre>
     *
     * <code>string project_id = 1;</code>
     *
     * @param value The projectId to set.
     * @return This builder for chaining.
     */
    public Builder setProjectId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      projectId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Cloud project ID, e.g. "spanner-cloud-systest".
     * </pre>
     *
     * <code>string project_id = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearProjectId() {
      projectId_ = getDefaultInstance().getProjectId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Cloud project ID, e.g. "spanner-cloud-systest".
     * </pre>
     *
     * <code>string project_id = 1;</code>
     *
     * @param value The bytes for projectId to set.
     * @return This builder for chaining.
     */
    public Builder setProjectIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      projectId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object filter_ = "";
    /**
     *
     *
     * <pre>
     * A filter expression that filters what operations are returned in the
     * response.
     * The expression must specify the field name, a comparison operator,
     * and the value that you want to use for filtering.
     * Refer spanner_instance_admin.proto.ListInstancesRequest for
     * detail.
     * </pre>
     *
     * <code>optional string filter = 2;</code>
     *
     * @return Whether the filter field is set.
     */
    public boolean hasFilter() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * A filter expression that filters what operations are returned in the
     * response.
     * The expression must specify the field name, a comparison operator,
     * and the value that you want to use for filtering.
     * Refer spanner_instance_admin.proto.ListInstancesRequest for
     * detail.
     * </pre>
     *
     * <code>optional string filter = 2;</code>
     *
     * @return The filter.
     */
    public java.lang.String getFilter() {
      java.lang.Object ref = filter_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        filter_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A filter expression that filters what operations are returned in the
     * response.
     * The expression must specify the field name, a comparison operator,
     * and the value that you want to use for filtering.
     * Refer spanner_instance_admin.proto.ListInstancesRequest for
     * detail.
     * </pre>
     *
     * <code>optional string filter = 2;</code>
     *
     * @return The bytes for filter.
     */
    public com.google.protobuf.ByteString getFilterBytes() {
      java.lang.Object ref = filter_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        filter_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A filter expression that filters what operations are returned in the
     * response.
     * The expression must specify the field name, a comparison operator,
     * and the value that you want to use for filtering.
     * Refer spanner_instance_admin.proto.ListInstancesRequest for
     * detail.
     * </pre>
     *
     * <code>optional string filter = 2;</code>
     *
     * @param value The filter to set.
     * @return This builder for chaining.
     */
    public Builder setFilter(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      filter_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A filter expression that filters what operations are returned in the
     * response.
     * The expression must specify the field name, a comparison operator,
     * and the value that you want to use for filtering.
     * Refer spanner_instance_admin.proto.ListInstancesRequest for
     * detail.
     * </pre>
     *
     * <code>optional string filter = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFilter() {
      filter_ = getDefaultInstance().getFilter();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A filter expression that filters what operations are returned in the
     * response.
     * The expression must specify the field name, a comparison operator,
     * and the value that you want to use for filtering.
     * Refer spanner_instance_admin.proto.ListInstancesRequest for
     * detail.
     * </pre>
     *
     * <code>optional string filter = 2;</code>
     *
     * @param value The bytes for filter to set.
     * @return This builder for chaining.
     */
    public Builder setFilterBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      filter_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private int pageSize_;
    /**
     *
     *
     * <pre>
     * Number of instances to be returned in the response. If 0 or
     * less, defaults to the server's maximum allowed page size.
     * </pre>
     *
     * <code>optional int32 page_size = 3;</code>
     *
     * @return Whether the pageSize field is set.
     */
    @java.lang.Override
    public boolean hasPageSize() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * Number of instances to be returned in the response. If 0 or
     * less, defaults to the server's maximum allowed page size.
     * </pre>
     *
     * <code>optional int32 page_size = 3;</code>
     *
     * @return The pageSize.
     */
    @java.lang.Override
    public int getPageSize() {
      return pageSize_;
    }
    /**
     *
     *
     * <pre>
     * Number of instances to be returned in the response. If 0 or
     * less, defaults to the server's maximum allowed page size.
     * </pre>
     *
     * <code>optional int32 page_size = 3;</code>
     *
     * @param value The pageSize to set.
     * @return This builder for chaining.
     */
    public Builder setPageSize(int value) {

      pageSize_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Number of instances to be returned in the response. If 0 or
     * less, defaults to the server's maximum allowed page size.
     * </pre>
     *
     * <code>optional int32 page_size = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPageSize() {
      bitField0_ = (bitField0_ & ~0x00000004);
      pageSize_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object pageToken_ = "";
    /**
     *
     *
     * <pre>
     * If non-empty, "page_token" should contain a next_page_token
     * from a previous ListInstancesResponse to the same "parent"
     * and with the same "filter".
     * </pre>
     *
     * <code>optional string page_token = 4;</code>
     *
     * @return Whether the pageToken field is set.
     */
    public boolean hasPageToken() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     *
     *
     * <pre>
     * If non-empty, "page_token" should contain a next_page_token
     * from a previous ListInstancesResponse to the same "parent"
     * and with the same "filter".
     * </pre>
     *
     * <code>optional string page_token = 4;</code>
     *
     * @return The pageToken.
     */
    public java.lang.String getPageToken() {
      java.lang.Object ref = pageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * If non-empty, "page_token" should contain a next_page_token
     * from a previous ListInstancesResponse to the same "parent"
     * and with the same "filter".
     * </pre>
     *
     * <code>optional string page_token = 4;</code>
     *
     * @return The bytes for pageToken.
     */
    public com.google.protobuf.ByteString getPageTokenBytes() {
      java.lang.Object ref = pageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        pageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * If non-empty, "page_token" should contain a next_page_token
     * from a previous ListInstancesResponse to the same "parent"
     * and with the same "filter".
     * </pre>
     *
     * <code>optional string page_token = 4;</code>
     *
     * @param value The pageToken to set.
     * @return This builder for chaining.
     */
    public Builder setPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      pageToken_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If non-empty, "page_token" should contain a next_page_token
     * from a previous ListInstancesResponse to the same "parent"
     * and with the same "filter".
     * </pre>
     *
     * <code>optional string page_token = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPageToken() {
      pageToken_ = getDefaultInstance().getPageToken();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If non-empty, "page_token" should contain a next_page_token
     * from a previous ListInstancesResponse to the same "parent"
     * and with the same "filter".
     * </pre>
     *
     * <code>optional string page_token = 4;</code>
     *
     * @param value The bytes for pageToken to set.
     * @return This builder for chaining.
     */
    public Builder setPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      pageToken_ = value;
      bitField0_ |= 0x00000008;
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

    // @@protoc_insertion_point(builder_scope:google.spanner.executor.v1.ListCloudInstancesAction)
  }

  // @@protoc_insertion_point(class_scope:google.spanner.executor.v1.ListCloudInstancesAction)
  private static final com.google.spanner.executor.v1.ListCloudInstancesAction DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.spanner.executor.v1.ListCloudInstancesAction();
  }

  public static com.google.spanner.executor.v1.ListCloudInstancesAction getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListCloudInstancesAction> PARSER =
      new com.google.protobuf.AbstractParser<ListCloudInstancesAction>() {
        @java.lang.Override
        public ListCloudInstancesAction parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListCloudInstancesAction> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListCloudInstancesAction> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.spanner.executor.v1.ListCloudInstancesAction getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}