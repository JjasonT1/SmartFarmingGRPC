package jt.smartFarmingService3;

import io.grpc.stub.StreamObserver;

public class Service3Impl extends CropHealthService3Grpc.CropHealthService3ImplBase {

	/*
	 * method for server streaming 
	 */
	@Override
	public void cropHealth(cropHealthRequest request, StreamObserver<cropHealthResponse> responseObserver) {
			
			//declaring variables 
			final String health = request.getHealth().getHealthCondition();
			final String health2 = request.getWater().getWaterLevel();
			final String health3 = request.getSoil().getSoilCondition();
			
			  try { //for loop
		            for (int i = 0; i < 1; i++) {
		            	
		                String result = health;
		                String result2 = health2;
		                String result3 = health3;
		                		
		                cropHealthResponse response = cropHealthResponse.newBuilder()
		                        .setHealthResponse(result)
		                        .setWaterResponse(result2)
		                        .setSoilResponse(result3)
		                        .build();	                		               
		                
		                responseObserver.onNext(response);
		                
		                Thread.sleep(1000L);
		            }
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        } finally {
		            responseObserver.onCompleted();
		        }	
		}
	
	
	/*************************************************************************************************************************
	 * method for client streaming
	 */
	@Override
	public StreamObserver<infestationRequest> cropInfestationLevel(StreamObserver<infestationResponse> responseObserver){
		
		/*
		 * create the requestObserver to return in this function
		 */
		final StreamObserver<infestationRequest> requestObserver = new StreamObserver<infestationRequest>(){
			
			String res = "";
			String res2 = "";

			@Override
			public void onNext(infestationRequest value) {
				/*
				 * client message
				 */
				res += "Growth Level: " + value.getGrowth().getGrowthLevel();
				res2 += "Infestation Level: " + value.getInfestationLevel().getInfestation();		
			}

			@Override
			public void onError(Throwable t) {
				t.printStackTrace();			
			}

			@Override
			public void onCompleted() {
				responseObserver.onNext(infestationResponse.newBuilder()
						.setGrowthResponse(res)
						.setInfestationLevelResponse(res2)
						.build());		
				
				responseObserver.onCompleted();
			}		
		}; 
		return requestObserver;	
	}	
}
