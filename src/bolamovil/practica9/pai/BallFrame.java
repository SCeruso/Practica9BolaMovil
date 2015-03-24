package bolamovil.practica9.pai;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BallFrame extends JFrame{
	private BallPanel ballPanel;
	private JPanel buttonsPanel;
	private JButton upButton;
	private JButton downButton;
	private JButton leftButton;
	private JButton rightButton;
	
	public BallFrame() {
		buttonsPanel = new JPanel(new BorderLayout());
		upButton = new JButton("UP");
		downButton = new JButton("DOWN");
		leftButton = new JButton("LEFT");
		rightButton = new JButton("right");
		ballPanel = new BallPanel();
		
		this.setLayout(new GridLayout(2, 1));
		this.add(ballPanel);
		
		upButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				 ballPanel.moveBallUp();		
			}
			
		});
		
		downButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				 ballPanel.moveBallDown();		
			}
			
		});
		
		leftButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				 ballPanel.moveBallLeft();		
			}
			
		});
		
		rightButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				 ballPanel.moveBallRight();		
			}
			
		});
		
		buttonsPanel.add(upButton, BorderLayout.NORTH);
		buttonsPanel.add(downButton, BorderLayout.SOUTH);
		buttonsPanel.add(leftButton, BorderLayout.WEST);
		buttonsPanel.add(rightButton, BorderLayout.EAST);
		
		this.add(buttonsPanel);
	}
	
	public void initialize() {
		ballPanel.updateBallPos();
	}

}
