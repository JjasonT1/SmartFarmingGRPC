package jt.smartFarmingService2;

import java.io.IOException;
import java.util.logging.Logger;
import io.grpc.Server;
import io.grpc.ServerBuilder;

public class Service2ClimateServer {
	
	private static final Logger logger = Logger.getLogger(Service2ClimateServer.class.getName());

	public static void main(String[] args) throws InterruptedException, IOException {
						
		/*
		 * declaring port and intialise
		 */
		int port = 50052;		
		Server server = ServerBuilder.forPort(port)
				.addService(new Service2Impl())
				.build()
				.start();
		
		logger.info("Service 2...Server started, listening on port..." + port);
		
		server.awaitTermination();
	}		
}