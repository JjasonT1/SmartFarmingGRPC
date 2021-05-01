package jt.smartFarmingService2;

import java.util.Random;

import io.grpc.stub.StreamObserver;

public class Service2Impl extends ClimateService2Grpc.ClimateService2ImplBase {

	/*
	 * bi-directional streaming
	 */
	@Override
	public StreamObserver<ClimateRequest> climateCondition(StreamObserver<ClimateResponse> responseObserver) {
		
		final StreamObserver<ClimateRequest> requestObserver = new StreamObserver<ClimateRequest>() {

			@Override
			public void onNext(ClimateRequest value) {
				
				String result = "Percipitation Level: " + value.getRainfallRequest().getRainfall();
				String result2 = "Current Temperature: " + value.getTemperatureRequest().getTemperatureDegree();
				
				final ClimateResponse climateRes = ClimateResponse.newBuilder()
						.setRianfallResponse(result)
						.setTemperatureResponse(result2)
						.build();
				
				responseObserver.onNext(climateRes);
			}

			@Override
			public void onError(Throwable t) {
				t.printStackTrace();
				
			}

			@Override
			public void onCompleted() {
				responseObserver.onCompleted();				
			}	
		};	
		
		return requestObserver;		
	}
}
