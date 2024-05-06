// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReservationService.proto

package common.tharaka.ds.cw.communication.grpc.generated;

public interface ReservationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:common.tharaka.ds.cw.communication.grpc.generated.Reservation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string reservationId = 1;</code>
   * @return The reservationId.
   */
  java.lang.String getReservationId();
  /**
   * <code>string reservationId = 1;</code>
   * @return The bytes for reservationId.
   */
  com.google.protobuf.ByteString
      getReservationIdBytes();

  /**
   * <code>string itemId = 2;</code>
   * @return The itemId.
   */
  java.lang.String getItemId();
  /**
   * <code>string itemId = 2;</code>
   * @return The bytes for itemId.
   */
  com.google.protobuf.ByteString
      getItemIdBytes();

  /**
   * <code>string itemName = 3;</code>
   * @return The itemName.
   */
  java.lang.String getItemName();
  /**
   * <code>string itemName = 3;</code>
   * @return The bytes for itemName.
   */
  com.google.protobuf.ByteString
      getItemNameBytes();

  /**
   * <code>string buyerName = 4;</code>
   * @return The buyerName.
   */
  java.lang.String getBuyerName();
  /**
   * <code>string buyerName = 4;</code>
   * @return The bytes for buyerName.
   */
  com.google.protobuf.ByteString
      getBuyerNameBytes();

  /**
   * <code>int32 quantity = 5;</code>
   * @return The quantity.
   */
  int getQuantity();

  /**
   * <code>string reservationDate = 6;</code>
   * @return The reservationDate.
   */
  java.lang.String getReservationDate();
  /**
   * <code>string reservationDate = 6;</code>
   * @return The bytes for reservationDate.
   */
  com.google.protobuf.ByteString
      getReservationDateBytes();

  /**
   * <code>double paymentAmount = 7;</code>
   * @return The paymentAmount.
   */
  double getPaymentAmount();

  /**
   * <code>string sellerName = 8;</code>
   * @return The sellerName.
   */
  java.lang.String getSellerName();
  /**
   * <code>string sellerName = 8;</code>
   * @return The bytes for sellerName.
   */
  com.google.protobuf.ByteString
      getSellerNameBytes();
}