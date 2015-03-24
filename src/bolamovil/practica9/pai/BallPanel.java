package bolamovil.practica9.pai;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JPanel;

public class BallPanel extends JPanel{
	private Ball ball;
	public final int BALL_RADIUS = 50;
	
	public BallPanel() {
		ball = new Ball(new Point(this.getWidth() / 2, this.getHeight() / 2), BALL_RADIUS, 10);
		this.setBackground(Color.CYAN);
	}

	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);		
		g.setColor(Color.RED);
		g.fillOval(ball.getCenter().x - ball.getRadius() , ball.getCenter().y - ball.getRadius(), ball.getRadius() * 2, ball.getRadius() * 2);
		
	}
	
	public void updateBallPos() {
		ball.setCenter(new Point(this.getWidth() / 2, this.getHeight() / 2));
	}
	
	public void moveBallUp() {
		if (ball.getCenter().y - ball.getSpeed() - ball.getRadius() >= 0) {
			ball.moveBallUp();
			this.repaint();
		}
	}
	
	
	public void moveBallDown() {
		if (ball.getCenter().y + ball.getSpeed() + ball.getRadius() <= this.getHeight()) {
			ball.moveBallDown();
			this.repaint();
		}
	}
	
	public void moveBallLeft() {
		if (ball.getCenter().x - ball.getSpeed() - ball.getRadius() >= 0){
			ball.moveBallLeft();
			this.repaint();
		}
	}
	
	public void moveBallRight() {
		if (ball.getCenter().x + ball.getSpeed() + ball.getRadius()  <= this.getWidth()) {
			ball.moveBallRight();
			this.repaint();
		}
	}
	
	
}
