package jt.smartFarmingService2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.util.Properties;
import java.util.logging.Logger;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class Service2ClimateServer {
	
	private static final Logger logger = Logger.getLogger(Service2ClimateServer.class.getName());

	public static void main(String[] args) throws InterruptedException, IOException {
					
		
		Service2ClimateServer server2 = new Service2ClimateServer();
		Properties prop = server2.getProperties();
		server2.registerService(prop);
		
		int port = Integer.valueOf( prop.getProperty("service_port"));
		try {
			/*
			 * declaring port and intialise
			 */
//			int port = 50052;		
			Server server = ServerBuilder.forPort(port)
					.addService(new Service2Impl())
					.build()
					.start();
			
			logger.info("Service 2...Server started, listening on port..." + port);
			
			server.awaitTermination();
			
			
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	private Properties getProperties() {
		Properties prop = null;		
		
		 try (InputStream input = new FileInputStream("E:\\01.NCI_Higher_Diploma_in_Computing_Science\\02.Semester 2\\03.Distributed Systems\\CA1\\My_Project _Proposal\\SmartFarming\\src\\main\\resources\\service2.properties")) {

	            prop = new Properties();

	            // load a properties file
	            prop.load(input);

	            // get the property value and print it out
	            System.out.println("Climate condition service properies ...");
	            System.out.println("\t service_type: " + prop.getProperty("service_type"));
	            System.out.println("\t service_name: " +prop.getProperty("service_name"));
	            System.out.println("\t service_description: " +prop.getProperty("service_description"));
		        System.out.println("\t service_port: " +prop.getProperty("service_port"));

	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }
	
		 return prop;
	}
	

	private void registerService(Properties prop) {
		
		try {
            // Create a JmDNS instance
            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
            
            String service_type = prop.getProperty("service_type") ;//"_http._tcp.local.";
            String service_name = prop.getProperty("service_name")  ;// "example";
           // int service_port = 1234;
            int service_port = Integer.valueOf( prop.getProperty("service_port") );//

            
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
}