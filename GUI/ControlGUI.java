package smartFarmingGUI;

import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import jt.smartFarmingService1.LiveStockService1Grpc;
import jt.smartFarmingService2.ClimateService2Grpc;
import jt.smartFarmingService3.CropHealthService3Grpc;

public class ControlGUI implements ActionListener {
				
	private JTextField entry1, reply1;
	private JTextField entry2, reply2;
	private JTextField entry3, reply3;
				
	private JPanel getService1JPanel() {

		JPanel panel = new JPanel();

		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

		JLabel label = new JLabel("Enter value")	;
		panel.add(label);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		entry1 = new JTextField("",10);
		panel.add(entry1);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		JButton button = new JButton("Invoke Service 1");
		button.addActionListener(this);
		panel.add(button);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		reply1 = new JTextField("", 10);
		reply1 .setEditable(false);
		panel.add(reply1 );

		panel.setLayout(boxlayout);

		return panel;

	}
	
	private JPanel getService2JPanel() {

		JPanel panel = new JPanel();

		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

		JLabel label = new JLabel("Enter value")	;
		panel.add(label);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		entry2 = new JTextField("",10);
		panel.add(entry2);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		JButton button = new JButton("Invoke Service 2");
		button.addActionListener(this);
		panel.add(button);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		reply2 = new JTextField("", 10);
		reply2 .setEditable(false);
		panel.add(reply2 );

		panel.setLayout(boxlayout);

		return panel;

	}

	private JPanel getService3JPanel() {

		JPanel panel = new JPanel();

		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

		JLabel label = new JLabel("Enter value")	;
		panel.add(label);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		entry3 = new JTextField("",10);
		panel.add(entry3);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		JButton button = new JButton("Invoke Service 3");
		button.addActionListener(this);
		panel.add(button);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		reply3 = new JTextField("", 10);
		reply3 .setEditable(false);
		panel.add(reply3 );

		panel.setLayout(boxlayout);

		return panel;

	}
	
	public static void main(String[] args) {

		ControlGUI gui = new ControlGUI();

		gui.build();
	}

	private void build() { 

		JFrame frame = new JFrame("Service Controller");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Set the panel to add buttons
		JPanel panel = new JPanel();

		// Set the BoxLayout to be X_AXIS: from left to right
		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);

		panel.setLayout(boxlayout);

		// Set border for the panel
		panel.setBorder(new EmptyBorder(new Insets(50, 100, 50, 100)));
	
		panel.add( getService1JPanel() );

		// Set size for the frame
		frame.setSize(300, 300); 

		// Set the window to be visible as the default to be false
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton button = (JButton)e.getSource();
		String label = button.getActionCommand();  
		
		if (label.equals("Invoke Service 1")) {
			System.out.println("service 1 to be invoked ...");

			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
			
			LiveStockService1Grpc.LiveStockService1BlockingStub blockingStub = LiveStockService1Grpc.newBlockingStub(channel);
			
			jt.smartFarmingService1.HeartRateRequest request = jt.smartFarmingService1.HeartRateRequest.newBuilder().setRate(entry1.getText()).build();
			
			jt.smartFarmingService1.HeartRateResponse response = blockingStub.getHeartRate(request);
			
			reply1.setText(String.valueOf(response.getRateResponse()));
			
		}
	}
}
			
/*************************************
 * 			
 */
			
/*		}else if (label.equals("Invoke Service 2")) {
			System.out.println("service 2 to be invoked ...");
			
			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50052).usePlaintext().build();
			
			ClimateService2Grpc.ClimateService2Stub asyncStub = ClimateService2Grpc.newStub(channel);
			
			jt.smartFarmingService2.ClimateRequest request = jt.smartFarmingService2.ClimateRequest.newBuilder().setRainfallRequest(entry2.getText()).build();
			
			jt.smartFarmingService2.ClimateResponse response = asyncStub.climateCondition(request);
			
			reply2.setText(String.valueOf(response.rainFallResponse));
			
			
			
	}	else if (label.equals("Invoke Service 3")) {
		System.out.println("service 3 to be invoked ...");	
		
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50053).usePlaintext().build();
		
		CropHealthService3Grpc.CropHealthService3Stub asyncStub = CropHealthService3Grpc.newStub(channel);
		
		jt.smartFarmingService3.cropHealthRequest request = jt.smartFarmingService3.cropHealthRequest.newBuilder().setHealth(entry3.getText()).build();
		
		jt.smartFarmingService3.cropHealthResponse response = asyncStub.cropInfestationLevel(request);
		
		reply3.setText(String.valueOf(response.healthResponse));		
}*/	
				
