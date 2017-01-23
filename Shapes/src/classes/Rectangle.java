package classes;

public class Rectangle extends Shape {

	/**
	 * Height of this rectangle
	 */
	private double height;
	/**
	 * Width of this rectangle
	 */
	private double width;
	
	/**
	 * Sets height of this rectangle
	 * @param height height of rectangle
	 */
	public void setHeight(double height){
		if(height > 0){
			this.height = height;
		}
		else{
			throw new IllegalArgumentException("Height should be more than 0");
		}
	}
	
	/**
	 * Sets width of this rectangle
	 * @param width width of rectangle
	 */
	public void setWidth(double width){
		if(width > 0){
			this.width = width;
		}
		else{
			throw new IllegalArgumentException("Width should be more than 0");
		}
	}
	/**
	 * Returns height of this rectangle
	 * @return height of rectangle
	 */
	public double getHeight(){
		return height;
	}
	/**
	 * Returns width of this rectangle
	 * @return width of rectangle
	 */
	public double getWidth(){
		return width;
	}
	/**
	 * Class constructor specifying coordinates of start point, height and width of this rectangle
	 * @param x x-axis coordinate of start point
	 * @param y y-axis coordinate of start point
	 * @param height height of rectangle
	 * @param width width of rectangle
	 */
	public Rectangle(double x, double y, double height, double width){
		this.setX(x);
		this.setY(y);
		this.setHeight(height);
		this.setWidth(width);
	}

	public double perimeter(){
		return 2.0*(this.getHeight() + this.getWidth());
	}
	
	public boolean isInside(double x, double y) {
		if(x > this.getX() && x < this.getY() + this.getWidth() && y > this.getY() && y < this.getY() + this.getHeight()){
			return true;
		}
		else{
			return false;
		}
	}
	
	public void moveToPoint(double x, double y) {
		this.setX(x);
		this.setY(y);
	}
	
}
