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
// source: google/spanner/v1/transaction.proto

package com.google.spanner.v1;

public final class TransactionProto {
  private TransactionProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_spanner_v1_TransactionOptions_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_TransactionOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_spanner_v1_TransactionOptions_ReadWrite_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_TransactionOptions_ReadWrite_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_spanner_v1_TransactionOptions_PartitionedDml_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_TransactionOptions_PartitionedDml_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_spanner_v1_TransactionOptions_ReadOnly_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_TransactionOptions_ReadOnly_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_spanner_v1_Transaction_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_Transaction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_spanner_v1_TransactionSelector_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_TransactionSelector_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n#google/spanner/v1/transaction.proto\022\021g"
          + "oogle.spanner.v1\032\036google/protobuf/durati"
          + "on.proto\032\037google/protobuf/timestamp.prot"
          + "o\"\353\005\n\022TransactionOptions\022E\n\nread_write\030\001"
          + " \001(\0132/.google.spanner.v1.TransactionOpti"
          + "ons.ReadWriteH\000\022O\n\017partitioned_dml\030\003 \001(\013"
          + "24.google.spanner.v1.TransactionOptions."
          + "PartitionedDmlH\000\022C\n\tread_only\030\002 \001(\0132..go"
          + "ogle.spanner.v1.TransactionOptions.ReadO"
          + "nlyH\000\032\262\001\n\tReadWrite\022T\n\016read_lock_mode\030\001 "
          + "\001(\0162<.google.spanner.v1.TransactionOptio"
          + "ns.ReadWrite.ReadLockMode\"O\n\014ReadLockMod"
          + "e\022\036\n\032READ_LOCK_MODE_UNSPECIFIED\020\000\022\017\n\013PES"
          + "SIMISTIC\020\001\022\016\n\nOPTIMISTIC\020\002\032\020\n\016Partitione"
          + "dDml\032\250\002\n\010ReadOnly\022\020\n\006strong\030\001 \001(\010H\000\0228\n\022m"
          + "in_read_timestamp\030\002 \001(\0132\032.google.protobu"
          + "f.TimestampH\000\0222\n\rmax_staleness\030\003 \001(\0132\031.g"
          + "oogle.protobuf.DurationH\000\0224\n\016read_timest"
          + "amp\030\004 \001(\0132\032.google.protobuf.TimestampH\000\022"
          + "4\n\017exact_staleness\030\005 \001(\0132\031.google.protob"
          + "uf.DurationH\000\022\035\n\025return_read_timestamp\030\006"
          + " \001(\010B\021\n\017timestamp_boundB\006\n\004mode\"M\n\013Trans"
          + "action\022\n\n\002id\030\001 \001(\014\0222\n\016read_timestamp\030\002 \001"
          + "(\0132\032.google.protobuf.Timestamp\"\244\001\n\023Trans"
          + "actionSelector\022;\n\nsingle_use\030\001 \001(\0132%.goo"
          + "gle.spanner.v1.TransactionOptionsH\000\022\014\n\002i"
          + "d\030\002 \001(\014H\000\0226\n\005begin\030\003 \001(\0132%.google.spanne"
          + "r.v1.TransactionOptionsH\000B\n\n\010selectorB\263\001"
          + "\n\025com.google.spanner.v1B\020TransactionProt"
          + "oP\001Z5cloud.google.com/go/spanner/apiv1/s"
          + "pannerpb;spannerpb\252\002\027Google.Cloud.Spanne"
          + "r.V1\312\002\027Google\\Cloud\\Spanner\\V1\352\002\032Google:"
          + ":Cloud::Spanner::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_spanner_v1_TransactionOptions_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_spanner_v1_TransactionOptions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_spanner_v1_TransactionOptions_descriptor,
            new java.lang.String[] {
              "ReadWrite", "PartitionedDml", "ReadOnly", "Mode",
            });
    internal_static_google_spanner_v1_TransactionOptions_ReadWrite_descriptor =
        internal_static_google_spanner_v1_TransactionOptions_descriptor.getNestedTypes().get(0);
    internal_static_google_spanner_v1_TransactionOptions_ReadWrite_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_spanner_v1_TransactionOptions_ReadWrite_descriptor,
            new java.lang.String[] {
              "ReadLockMode",
            });
    internal_static_google_spanner_v1_TransactionOptions_PartitionedDml_descriptor =
        internal_static_google_spanner_v1_TransactionOptions_descriptor.getNestedTypes().get(1);
    internal_static_google_spanner_v1_TransactionOptions_PartitionedDml_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_spanner_v1_TransactionOptions_PartitionedDml_descriptor,
            new java.lang.String[] {});
    internal_static_google_spanner_v1_TransactionOptions_ReadOnly_descriptor =
        internal_static_google_spanner_v1_TransactionOptions_descriptor.getNestedTypes().get(2);
    internal_static_google_spanner_v1_TransactionOptions_ReadOnly_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_spanner_v1_TransactionOptions_ReadOnly_descriptor,
            new java.lang.String[] {
              "Strong",
              "MinReadTimestamp",
              "MaxStaleness",
              "ReadTimestamp",
              "ExactStaleness",
              "ReturnReadTimestamp",
              "TimestampBound",
            });
    internal_static_google_spanner_v1_Transaction_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_spanner_v1_Transaction_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_spanner_v1_Transaction_descriptor,
            new java.lang.String[] {
              "Id", "ReadTimestamp",
            });
    internal_static_google_spanner_v1_TransactionSelector_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_spanner_v1_TransactionSelector_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_spanner_v1_TransactionSelector_descriptor,
            new java.lang.String[] {
              "SingleUse", "Id", "Begin", "Selector",
            });
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
