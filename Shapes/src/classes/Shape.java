package classes;

public abstract class Shape {
	/**
	 * x-axis coordinate of this shape
	 */
	private double x;
	/**
	 * y-axis coordinate of this shape
	 */
	private double y;
	
	/**
	 * Sets x-axis coordinate of start point for this shape
	 * @param x x-axis coordinate
	 */
	public void setX(double x){
		this.x = x;
	}
	
	/**
	 * Sets y-axis coordinate of start point for this shape
	 * @param y y-axis coordinate
	 */
	public void setY(double y){
		this.y = y;
	}
	
	/**
	 * Returns x-axis coordinate of start point of this shape 
	 * @return x-axis coordinate
	 */
	public double getX(){
		return x;
	}
	/**
	 * Returns y-axis coordinate of start point of this shape
	 * @return y-axis coordinate
	 */
	public double getY(){
		return y;
	}

	/**
	 * Calculates perimeter of this shape
	 * @return perimeter of shape
	 */
	public abstract double perimeter();
	
	/**
	 * Verifies that the provided point is inside this shape
	 * @param x x-axis coordinate of Point
	 * @param y y-axis coordinate of Point
	 * @return true if point is inside the shape, false if point is outside the shape
	 */
	public abstract boolean isInside(double x, double y);
	
	/**
	 * Moves this shape to new point
	 * @param x x x-axis coordinate of new point
	 * @param y y-axis coordinate of new point
	 */
	public abstract void moveToPoint(double x, double y);
}
