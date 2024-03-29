// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WalletService.proto

package com.aldren.wallet.grpc;

public final class WalletServiceOuterClass {
  private WalletServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_aldren_wallet_grpc_User_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_aldren_wallet_grpc_User_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_aldren_wallet_grpc_Money_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_aldren_wallet_grpc_Money_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_aldren_wallet_grpc_WalletRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_aldren_wallet_grpc_WalletRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_aldren_wallet_grpc_Balance_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_aldren_wallet_grpc_Balance_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_aldren_wallet_grpc_Empty_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_aldren_wallet_grpc_Empty_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_aldren_wallet_grpc_Currency_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_aldren_wallet_grpc_Currency_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_aldren_wallet_grpc_Transaction_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_aldren_wallet_grpc_Transaction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_aldren_wallet_grpc_Transactions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_aldren_wallet_grpc_Transactions_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023WalletService.proto\022\026com.aldren.wallet" +
      ".grpc\"\026\n\004User\022\016\n\006userId\030\001 \001(\t\")\n\005Money\022\016" +
      "\n\006amount\030\001 \001(\001\022\020\n\010currency\030\002 \001(\t\"i\n\rWall" +
      "etRequest\022*\n\004user\030\001 \001(\0132\034.com.aldren.wal" +
      "let.grpc.User\022,\n\005money\030\002 \001(\0132\035.com.aldre" +
      "n.wallet.grpc.Money\"c\n\007Balance\022*\n\004user\030\001" +
      " \001(\0132\034.com.aldren.wallet.grpc.User\022,\n\005mo" +
      "ney\030\002 \003(\0132\035.com.aldren.wallet.grpc.Money" +
      "\"\007\n\005Empty\"&\n\010Currency\022\014\n\004code\030\001 \001(\t\022\014\n\004n" +
      "ame\030\002 \001(\t\"K\n\013Transaction\022\016\n\006amount\030\001 \001(\001" +
      "\022\020\n\010currency\030\002 \001(\t\022\014\n\004type\030\003 \001(\t\022\014\n\004date" +
      "\030\004 \001(\t\"t\n\014Transactions\022*\n\004user\030\001 \001(\0132\034.c" +
      "om.aldren.wallet.grpc.User\0228\n\013transactio" +
      "n\030\002 \003(\0132#.com.aldren.wallet.grpc.Transac" +
      "tion2\332\002\n\rWalletService\022O\n\007deposit\022%.com." +
      "aldren.wallet.grpc.WalletRequest\032\035.com.a" +
      "ldren.wallet.grpc.Empty\022P\n\010withdraw\022%.co" +
      "m.aldren.wallet.grpc.WalletRequest\032\035.com" +
      ".aldren.wallet.grpc.Empty\022M\n\014checkBalanc" +
      "e\022\034.com.aldren.wallet.grpc.User\032\037.com.al" +
      "dren.wallet.grpc.Balance\022W\n\021checkTransac" +
      "tions\022\034.com.aldren.wallet.grpc.User\032$.co" +
      "m.aldren.wallet.grpc.Transactions2\243\001\n\013Us" +
      "erService\022I\n\ncreateUser\022\034.com.aldren.wal" +
      "let.grpc.User\032\035.com.aldren.wallet.grpc.E" +
      "mpty\022I\n\ndeleteUser\022\034.com.aldren.wallet.g" +
      "rpc.User\032\035.com.aldren.wallet.grpc.Empty2" +
      "\267\001\n\017CurrencyService\022Q\n\016createCurrency\022 ." +
      "com.aldren.wallet.grpc.Currency\032\035.com.al" +
      "dren.wallet.grpc.Empty\022Q\n\016deleteCurrency" +
      "\022 .com.aldren.wallet.grpc.Currency\032\035.com" +
      ".aldren.wallet.grpc.EmptyB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_aldren_wallet_grpc_User_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_aldren_wallet_grpc_User_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_aldren_wallet_grpc_User_descriptor,
        new java.lang.String[] { "UserId", });
    internal_static_com_aldren_wallet_grpc_Money_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_aldren_wallet_grpc_Money_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_aldren_wallet_grpc_Money_descriptor,
        new java.lang.String[] { "Amount", "Currency", });
    internal_static_com_aldren_wallet_grpc_WalletRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_aldren_wallet_grpc_WalletRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_aldren_wallet_grpc_WalletRequest_descriptor,
        new java.lang.String[] { "User", "Money", });
    internal_static_com_aldren_wallet_grpc_Balance_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_aldren_wallet_grpc_Balance_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_aldren_wallet_grpc_Balance_descriptor,
        new java.lang.String[] { "User", "Money", });
    internal_static_com_aldren_wallet_grpc_Empty_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_aldren_wallet_grpc_Empty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_aldren_wallet_grpc_Empty_descriptor,
        new java.lang.String[] { });
    internal_static_com_aldren_wallet_grpc_Currency_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_com_aldren_wallet_grpc_Currency_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_aldren_wallet_grpc_Currency_descriptor,
        new java.lang.String[] { "Code", "Name", });
    internal_static_com_aldren_wallet_grpc_Transaction_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_com_aldren_wallet_grpc_Transaction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_aldren_wallet_grpc_Transaction_descriptor,
        new java.lang.String[] { "Amount", "Currency", "Type", "Date", });
    internal_static_com_aldren_wallet_grpc_Transactions_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_com_aldren_wallet_grpc_Transactions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_aldren_wallet_grpc_Transactions_descriptor,
        new java.lang.String[] { "User", "Transaction", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
