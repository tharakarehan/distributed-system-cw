// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReservationService.proto

package common.tharaka.ds.cw.communication.grpc.generated;

public interface StatusResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:common.tharaka.ds.cw.communication.grpc.generated.StatusResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.common.tharaka.ds.cw.communication.grpc.generated.Status status = 1;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.common.tharaka.ds.cw.communication.grpc.generated.Status status = 1;</code>
   * @return The status.
   */
  common.tharaka.ds.cw.communication.grpc.generated.Status getStatus();

  /**
   * <code>string message = 2;</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <code>string message = 2;</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();
}
