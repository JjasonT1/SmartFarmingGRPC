package jt.smartFarmingService1;

import java.io.IOException;
import java.util.Random;
import java.util.logging.Logger;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import jt.smartFarmingService1.LiveStockService1Grpc.LiveStockService1ImplBase;

public class Service1LivestockServer {
	
	private static final Logger logger = Logger.getLogger(Service1LivestockServer.class.getName());

	public static void main(String[] args) throws InterruptedException, IOException {
//		Service1LivestockServer service1 = new Service1LivestockServer();
		
		int port = 50051;
		Server server = ServerBuilder.forPort(port)
				.addService(new Service1Impl())
				.build();
				server.start();
				
		logger.info("Service 1 server is starting on port..." + port);
		
		Runtime.getRuntime().addShutdownHook(new Thread(() -> {
			System.out.println("Received Shutdown...");
			server.shutdown();
			System.out.println("Serive 1 stopped");
		}));
						
		server.awaitTermination();
	}
	
	//Extend abstract base class 
	static class Service1Impl extends LiveStockService1ImplBase {
		
		//method to get the heart rate
		@Override
		public void getHeartRate(HeartRateRequest request, StreamObserver<HeartRateResponse> responseObserver) {
			
			//Heart rate response 
			Random ran = new Random();
			int rateNum = ran.nextInt(100);
			
			HeartRateResponse.Builder response = HeartRateResponse.newBuilder();	
			System.out.println("Heart rate request received...");
			
			response.setRateResponse(rateNum);
			responseObserver.onNext(response.build());
			responseObserver.onCompleted();
		}
	}
}
