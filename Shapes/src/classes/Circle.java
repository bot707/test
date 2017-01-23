package classes;

public class Circle extends Shape {

	/**
	 * Radius of this circle
	 */
	private double r;
	
	/**
	 * Class constructor specifying coordinates of start point and radius of this circle
	 * @param x x-axis coordinate of central point
	 * @param y y-axis coordinate of central point
	 * @param r radius of this circle
	 */
	public Circle(double x, double y, double r){
		this.setX(x);
		this.setY(y);
		this.setRadius(r);
	}

	/**
	 * Sets radius of this circle
	 * @param r radius of circle
	 */
	public void setRadius(double r){
		if(r > 0){
			this.r = r;
		}
		else{
			throw new IllegalArgumentException("Radius should be more than 0");
		}
	}
	/**
	 * Returns radius of this circle
	 * @return radius of circle
	 */
	public double getRadius(){
		return r;
	}
	
	public double perimeter() {
		return 2.0*Math.PI*r;
	}

	@Override
	public boolean isInside(double x, double y) {
		if(Math.sqrt(Math.pow(this.getX() - x, 2.0) + Math.pow(this.getY() - y, 2.0)) < r)
			return true;
		else
			return false;
	}

	@Override
	public void moveToPoint(double x, double y) {
		this.setX(x);
		this.setY(y);
	}

	/**
	 * Creates new smallest rectangle that contains this circle
	 * @return new Rectangle instance
	 */
	public Rectangle boundingBox(){
		return new Rectangle(this.getX() - r, this.getY() - r, 2.0*r, 2.0*r);
	}
}
