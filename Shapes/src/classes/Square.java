package classes;

public class Square extends Shape {

	/**
	 * Size of this square side
	 */
	private double side;
	
	/**
	 * Sets size of this square side 
	 * @param side size of square side
	 */
	public void setSide(double side){
		if(side > 0){
			this.side = side;
		}
		else{
			throw new IllegalArgumentException("Square side should be more than 0");
		}
	}
	
	/**
	 * Returns size of side this square
	 * @return size of square side
	 */
	public double getSide(){
		return side;
	}
	
	/**
	 * Class constructor specifying coordinates of start point and
	 * size of square side
	 * @param x x-axis coordinate of start point
	 * @param y y-axis coordinate of start point
	 * @param side size of square side
	 */
	public Square(double x, double y, double side){
		this.setX(x);
		this.setY(y);
		this.setSide(side);
	}

	@Override
	public double perimeter() {
		return 4.0 * this.getSide();
	}

	@Override
	public boolean isInside(double x, double y) {
		if(x > this.getX() && x < this.getY() + this.getSide() && y > this.getY() && y < this.getY() + this.getSide()){
			return true;
		}
		else{
			return false;
	
		}
	}
	@Override
	public void moveToPoint(double x, double y) {
		this.setX(x);
		this.setY(y);
	}

}
