package bolamovil.practica9.pai;

import java.awt.Point;

public class Ball {
	private Point center;
	private int radius;
	private int speed;
	
	public Ball() {
		radius = 1;
		speed = 1;
		center = new Point(10, 10);
	}
	
	public Ball(Point cent, int r, int spd) {
		setCenter(cent);
		setRadius(r);
		setSpeed(spd);
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void moveBallUp() {
		this.setCenter(new Point(this.getCenter().x, this.getCenter().y - this.getSpeed()));
		
	}
	
	
	public void moveBallDown() {
		this.setCenter(new Point(this.getCenter().x, this.getCenter().y + this.getSpeed()));
		
	}
	
	public void moveBallLeft() {
		this.setCenter(new Point(this.getCenter().x  - this.getSpeed(), this.getCenter().y));
		
	}
	
	public void moveBallRight() {
		this.setCenter(new Point(this.getCenter().x  + this.getSpeed(), this.getCenter().y));
		
	}

}
