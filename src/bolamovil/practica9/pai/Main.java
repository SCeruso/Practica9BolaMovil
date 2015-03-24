package bolamovil.practica9.pai;

import javax.swing.JFrame;

public class Main {

	
	public static void main(String[] args) {
		 BallFrame frame = new BallFrame();
		 frame.setTitle("Ball");
		 frame.setSize(500, 500);
	 	 frame.setLocationRelativeTo(null); // Center the frame
	     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.setVisible(true);
		 frame.initialize();

	}

}
