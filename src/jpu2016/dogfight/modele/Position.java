package jpu2016.dogfight.modele;

public class Position {
	private double x;
	private double y;
	private double maxX;
	private double maxY;
	
	public void Position(double x, double y, double maxX, double maxY){
		
	}
	
	public void Position(Position position){
		
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	protected void setMaxX(double maxX) {
		this.maxX = maxX;
	}

	protected void setMaxY(double maxY) {
		this.maxY = maxY;
	}
	
	
}
