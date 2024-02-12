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

package com.google.spanner.executor.v1;

public interface UpdateCloudDatabaseDdlActionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.spanner.executor.v1.UpdateCloudDatabaseDdlAction)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Cloud instance ID (not path), e.g. "test-instance".
   * </pre>
   *
   * <code>string instance_id = 1;</code>
   *
   * @return The instanceId.
   */
  java.lang.String getInstanceId();
  /**
   *
   *
   * <pre>
   * Cloud instance ID (not path), e.g. "test-instance".
   * </pre>
   *
   * <code>string instance_id = 1;</code>
   *
   * @return The bytes for instanceId.
   */
  com.google.protobuf.ByteString getInstanceIdBytes();

  /**
   *
   *
   * <pre>
   * Cloud project ID, e.g. "spanner-cloud-systest".
   * </pre>
   *
   * <code>string project_id = 2;</code>
   *
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   *
   *
   * <pre>
   * Cloud project ID, e.g. "spanner-cloud-systest".
   * </pre>
   *
   * <code>string project_id = 2;</code>
   *
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString getProjectIdBytes();

  /**
   *
   *
   * <pre>
   * Cloud database ID (not full path), e.g. "db0".
   * </pre>
   *
   * <code>string database_id = 3;</code>
   *
   * @return The databaseId.
   */
  java.lang.String getDatabaseId();
  /**
   *
   *
   * <pre>
   * Cloud database ID (not full path), e.g. "db0".
   * </pre>
   *
   * <code>string database_id = 3;</code>
   *
   * @return The bytes for databaseId.
   */
  com.google.protobuf.ByteString getDatabaseIdBytes();

  /**
   *
   *
   * <pre>
   * SDL statements to apply to the database.
   * </pre>
   *
   * <code>repeated string sdl_statement = 4;</code>
   *
   * @return A list containing the sdlStatement.
   */
  java.util.List<java.lang.String> getSdlStatementList();
  /**
   *
   *
   * <pre>
   * SDL statements to apply to the database.
   * </pre>
   *
   * <code>repeated string sdl_statement = 4;</code>
   *
   * @return The count of sdlStatement.
   */
  int getSdlStatementCount();
  /**
   *
   *
   * <pre>
   * SDL statements to apply to the database.
   * </pre>
   *
   * <code>repeated string sdl_statement = 4;</code>
   *
   * @param index The index of the element to return.
   * @return The sdlStatement at the given index.
   */
  java.lang.String getSdlStatement(int index);
  /**
   *
   *
   * <pre>
   * SDL statements to apply to the database.
   * </pre>
   *
   * <code>repeated string sdl_statement = 4;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the sdlStatement at the given index.
   */
  com.google.protobuf.ByteString getSdlStatementBytes(int index);

  /**
   *
   *
   * <pre>
   * Op ID can be used to track progress of the update. If set, it must be
   * unique per database. If not set, Cloud Spanner will generate operation ID
   * automatically.
   * </pre>
   *
   * <code>string operation_id = 5;</code>
   *
   * @return The operationId.
   */
  java.lang.String getOperationId();
  /**
   *
   *
   * <pre>
   * Op ID can be used to track progress of the update. If set, it must be
   * unique per database. If not set, Cloud Spanner will generate operation ID
   * automatically.
   * </pre>
   *
   * <code>string operation_id = 5;</code>
   *
   * @return The bytes for operationId.
   */
  com.google.protobuf.ByteString getOperationIdBytes();

  /**
   * <code>optional bytes proto_descriptors = 6;</code>
   *
   * @return Whether the protoDescriptors field is set.
   */
  boolean hasProtoDescriptors();
  /**
   * <code>optional bytes proto_descriptors = 6;</code>
   *
   * @return The protoDescriptors.
   */
  com.google.protobuf.ByteString getProtoDescriptors();
}
