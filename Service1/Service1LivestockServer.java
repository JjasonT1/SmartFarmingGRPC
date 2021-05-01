package jt.smartFarmingService1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.util.Properties;
import java.util.Random;
import java.util.logging.Logger;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

//import javax.jmdns.JmDNS;
//import javax.jmdns.ServiceInfo;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import jt.smartFarmingService1.LiveStockService1Grpc.LiveStockService1ImplBase;

public class Service1LivestockServer {
	private static final Logger logger = Logger.getLogger(Service1LivestockServer.class.getName());

	public static void main(String[] args) throws InterruptedException, IOException {
		
		/*
		 * Jmdns
		 */
		Service1LivestockServer livestockServer = new Service1LivestockServer();
		Properties prop = livestockServer.getProperties();
		livestockServer.registerService(prop);

		int port = Integer.valueOf(prop.getProperty("service_port"));
		try {
			
//			int port = 50051;
			Server server = ServerBuilder.forPort(port)
					.addService(new Service1Impl())
					.build();
					server.start();
					
			logger.info("Service 1 server is starting on port..." + port);
								
			server.awaitTermination();
			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	private Properties getProperties() {

		Properties prop = null;
		
		try (InputStream input = new FileInputStream("src/main/resources/service1.properties")) {
			
			prop = new Properties();
			
			prop.load(input);
			
			System.out.println("Livestock properies ...");
            System.out.println("\t service_type: " + prop.getProperty("service_type"));
            System.out.println("\t service_name: " +prop.getProperty("service_name"));
            System.out.println("\t service_description: " +prop.getProperty("service_description"));
	        System.out.println("\t service_port: " +prop.getProperty("service_port"));
	        
		} catch(IOException e) {
			e.printStackTrace();
		}
			
			return prop;
		}
		
	
	
	private void registerService(Properties prop) {

		 try {
	            // Create a JmDNS instance
	            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
	            
	            String service_type = prop.getProperty("service_type") ;
	            String service_name = prop.getProperty("service_name")  ;
	          
	            int service_port = Integer.valueOf( prop.getProperty("service_port") );

	            
	            String service_description_properties = prop.getProperty("service_description")  ;//"path=index.html";
	            
	            // Register a service
	            ServiceInfo serviceInfo = ServiceInfo.create(service_type, service_name, service_port, service_description_properties);
	            jmdns.registerService(serviceInfo);
	            
	            System.out.printf("registrering service with type %s and name %s \n", service_type, service_name);
	            
	            // Wait a bit
	            Thread.sleep(1000);

	            // Unregister all services
	            //jmdns.unregisterAllServices();

	        } catch (IOException e) {
	            System.out.println(e.getMessage());
	        } catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
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
