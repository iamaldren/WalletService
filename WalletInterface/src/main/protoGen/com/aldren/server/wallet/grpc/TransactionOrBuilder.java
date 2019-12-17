// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WalletService.proto

package com.aldren.server.wallet.grpc;

public interface TransactionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.aldren.server.wallet.grpc.Transaction)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>double amount = 1;</code>
   * @return The amount.
   */
  double getAmount();

  /**
   * <code>string currency = 2;</code>
   * @return The currency.
   */
  java.lang.String getCurrency();
  /**
   * <code>string currency = 2;</code>
   * @return The bytes for currency.
   */
  com.google.protobuf.ByteString
      getCurrencyBytes();

  /**
   * <code>string type = 3;</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <code>string type = 3;</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <code>string date = 4;</code>
   * @return The date.
   */
  java.lang.String getDate();
  /**
   * <code>string date = 4;</code>
   * @return The bytes for date.
   */
  com.google.protobuf.ByteString
      getDateBytes();
}
