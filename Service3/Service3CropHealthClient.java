package jt.smartFarmingService3;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class Service3CropHealthClient {

	private static final Logger logger = Logger.getLogger(Service3CropHealthClient.class.getName());
	
	public static void main(String[] args) {
		
		final Service3CropHealthClient main = new Service3CropHealthClient();
		main.run();
		
	}
	
		private void run() {
			
			int port = 50053;	
			final ManagedChannel channel = ManagedChannelBuilder
					.forAddress("localhost", port)
					.usePlaintext()
					.build();
			
			/*
			 * invoking server streaming 
			 */
			StreamHealth(channel);
			
			/*
			 * invoking client streaming
			 */
			StreamCrop(channel);
			
			System.out.println("Resquests completed...Channel is shutting down...");
			channel.shutdown();
	}
		

	/*
		 * Server streaming
		 */
	private void StreamHealth(ManagedChannel channel) {
		final CropHealthService3Grpc.CropHealthService3BlockingStub healthCondition = CropHealthService3Grpc.newBlockingStub(channel);
		
		/*
		 * random number generator for water and soil level
		 */
		Random ran = new Random();
		int waterLevel = ran.nextInt(100);
		int soilLevel = ran.nextInt(100);
		
		/*
		 * Here we prepare the request to send to the server
		 */
		final cropHealthRequest healthRequest = cropHealthRequest.newBuilder()
				.setHealth(health.newBuilder().setHealthCondition("Current Crop condition is healthy"))
				.build();
		
		final cropHealthRequest healthRequest2 = cropHealthRequest.newBuilder()
				.setWater(water.newBuilder().setWaterLevel("Current water level is at " + waterLevel + "%"))
				.build();
		
		final cropHealthRequest healthRequest3 = cropHealthRequest.newBuilder()
				.setSoil(soil.newBuilder().setSoilCondition("Current soil level is at " + soilLevel + "%"))
				.build(); 
		
		/*
		 * getting the request in client printing the response from server
		 */
		healthCondition.cropHealth(healthRequest).forEachRemaining(cropHealthResponse -> {
			System.out.println(cropHealthResponse.getHealthResponse());
		});
		
		healthCondition.cropHealth(healthRequest2).forEachRemaining(cropHealthResponse -> {
			System.out.println(cropHealthResponse.getWaterResponse());
		});
		
		healthCondition.cropHealth(healthRequest3).forEachRemaining(cropHealthResponse -> {
			System.out.println(cropHealthResponse.getSoilResponse());
		});
	}
	
	
	/*******************************************************************************************
	 * Client streaming
	 */
	private void StreamCrop(ManagedChannel channel) {
		
		/*
		 * create an Asychronous client
		 */
		CropHealthService3Grpc.CropHealthService3Stub asyncStub = CropHealthService3Grpc.newStub(channel);
		
		CountDownLatch c_latch = new CountDownLatch(1);
		
		final StreamObserver<infestationRequest> requestObserver = asyncStub.cropInfestationLevel(new StreamObserver<infestationResponse>(){

			@Override
			public void onNext(infestationResponse value) {
				/*
				 * response from server
				 */
				System.out.println(" ");
				System.out.println("Response from Server");
				System.out.println(value.getGrowthResponse() + "%");
				System.out.println(value.getInfestationLevelResponse() + "%");			
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
		
		/*
		 * message 1
		 */
		requestObserver.onNext(infestationRequest.newBuilder()
				.setGrowth(growth.newBuilder()
				.setGrowthLevel(num)
				.build()).build());
		
		/*
		 * message 2
		 */
		requestObserver.onNext(infestationRequest
				.newBuilder().setInfestationLevel(infestation.newBuilder()
				.setInfestation(num2)
				.build()).build());
		
		/*
		 * client is finish sending request
		 */
		requestObserver.onCompleted();
		
		try {
			c_latch.await(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}	
}