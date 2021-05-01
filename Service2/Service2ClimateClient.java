package jt.smartFarmingService2;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;


public class Service2ClimateClient {
	
	private static final Logger logger = Logger.getLogger(Service2ClimateClient.class.getName());

	public static void main(String[] args) throws InterruptedException {
			
			ManagedChannel channel = ManagedChannelBuilder
					.forAddress("localhost", 50052)
					.usePlaintext()
					.build();
			
			climate(channel);
			
			System.out.println("Requests completed...Channel is shutting down...");
			channel.shutdown();
	}

	private static void climate(ManagedChannel channel) {
		
		ClimateService2Grpc.ClimateService2Stub asyncStub = ClimateService2Grpc.newStub(channel);
		
		CountDownLatch c_latch = new CountDownLatch(1);
		
		final StreamObserver<ClimateRequest> requestObserver = asyncStub.climateCondition(new StreamObserver<ClimateResponse>() {

			@Override
			public void onNext(ClimateResponse value) {
				
				
				/*
				 * response from server
				 */
				System.out.println("Server response: " + value.getRianfallResponse());
				System.out.println("Server response: " + value.getTemperatureResponse());
			}

			@Override
			public void onError(Throwable t) {
				t.printStackTrace();
				
			}

			@Override
			public void onCompleted() {
				
				System.out.println(" ");
				System.out.println("Server has completed sending response");
				c_latch.countDown();	
			}		
		});		
		
		Random ran = new Random();
		int num = ran.nextInt(100);
		int num2 = ran.nextInt(100);
		
			System.out.println("Sending..." + num + "%");
			requestObserver.onNext(ClimateRequest.newBuilder()
					.setRainfallRequest(rainfall.newBuilder()
					.setRainfall(num))
					.build());
			
			System.out.println("Sending..." + num2 + "%");
			requestObserver.onNext(ClimateRequest.newBuilder()
					.setTemperatureRequest(temperature.newBuilder()
					.setTemperatureDegree(num2))
					.build());		
			
			requestObserver.onCompleted();
			
			try {
				c_latch.await(5, TimeUnit.SECONDS);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
	}	
}
