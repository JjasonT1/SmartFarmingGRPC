// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Service2Climate.proto

package jt.smartFarmingService2;

public final class Service2ClimateImpl {
  private Service2ClimateImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_service2Climate_rainfall_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_service2Climate_rainfall_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_service2Climate_temperature_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_service2Climate_temperature_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_service2Climate_ClimateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_service2Climate_ClimateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_service2Climate_ClimateResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_service2Climate_ClimateResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025Service2Climate.proto\022\017service2Climate" +
      "\"\034\n\010rainfall\022\020\n\010rainfall\030\001 \001(\005\")\n\013temper" +
      "ature\022\032\n\022temperature_degree\030\002 \001(\005\"~\n\016Cli" +
      "mateRequest\0222\n\017rainfallRequest\030\001 \001(\0132\031.s" +
      "ervice2Climate.rainfall\0228\n\022temperatureRe" +
      "quest\030\002 \001(\0132\034.service2Climate.temperatur" +
      "e\"H\n\017ClimateResponse\022\030\n\020rianfallResponse" +
      "\030\001 \001(\t\022\033\n\023temperatureResponse\030\002 \001(\t2n\n\017C" +
      "limateService2\022[\n\020climateCondition\022\037.ser" +
      "vice2Climate.ClimateRequest\032 .service2Cl" +
      "imate.ClimateResponse\"\000(\0010\001B0\n\027jt.smartF" +
      "armingService2B\023Service2ClimateImplP\001b\006p" +
      "roto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_service2Climate_rainfall_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_service2Climate_rainfall_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_service2Climate_rainfall_descriptor,
        new java.lang.String[] { "Rainfall", });
    internal_static_service2Climate_temperature_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_service2Climate_temperature_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_service2Climate_temperature_descriptor,
        new java.lang.String[] { "TemperatureDegree", });
    internal_static_service2Climate_ClimateRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_service2Climate_ClimateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_service2Climate_ClimateRequest_descriptor,
        new java.lang.String[] { "RainfallRequest", "TemperatureRequest", });
    internal_static_service2Climate_ClimateResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_service2Climate_ClimateResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_service2Climate_ClimateResponse_descriptor,
        new java.lang.String[] { "RianfallResponse", "TemperatureResponse", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
