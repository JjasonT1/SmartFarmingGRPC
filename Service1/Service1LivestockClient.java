package jt.smartFarmingService1;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import jt.smartFarmingService1.LiveStockService1Grpc.LiveStockService1BlockingStub;
import java.util.Random;
import java.util.logging.Logger;

public class Service1LivestockClient {
	
	private static final Logger logger = Logger.getLogger(Service1LivestockClient.class.getName());

	public static void main(String[] args) throws Exception{
		
		System.out.println("Service 1 client starting...");
		
		String host = "localhost";
		int port = 50051;
		
		ManagedChannel channel = ManagedChannelBuilder
				.forAddress(host, port)
				.usePlaintext()
				.build();
		
		LiveStockService1BlockingStub blockingStub = LiveStockService1Grpc.newBlockingStub(channel);
		
		Random ran = new Random();
		int rateNum = ran.nextInt(200);
		
		HeartRateRequest rateReq = HeartRateRequest.newBuilder().setRate("" + rateNum).build();
		
		HeartRateResponse rateRes = blockingStub.getHeartRate(rateReq);
		
		System.out.println("Heart rate response is: " + rateRes.getRateResponse());
		
//		System.out.println("Shutting down channel");
		channel.shutdown();
	}

}