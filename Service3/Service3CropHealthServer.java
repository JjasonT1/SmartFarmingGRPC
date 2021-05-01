package jt.smartFarmingService3;

import java.io.IOException;
import java.util.logging.Logger;
import io.grpc.Server;
import io.grpc.ServerBuilder;

public class Service3CropHealthServer{

	private static final Logger logger = Logger.getLogger(Service3CropHealthServer.class.getName());

	public static void main(String[] args) throws IOException, InterruptedException {
		
		/*
		 * declaring port and intialise
		 */
		int port = 50053;		
		Server server = ServerBuilder.forPort(port)
				.addService(new Service3Impl())
				.build()
				.start();
		
		logger.info("Service 3...Server started, listening on port..." + port);
		
		server.awaitTermination();		
	}
}		