package classes;

public class Rectangle extends Shape {

	public Rectangle(double x, double y, double height, double width){
		this.setX(x);
		this.setY(y);
		if(height > 0)
			this.setHeight(height);
		else
			throw new IllegalArgumentException("Height should be more than 0");
		if(width > 0)
			this.setWidth(width);
		else
			throw new IllegalArgumentException("Width should be more than 0");
	}

	public double perimeter(){
		return 2.0*(this.getHeight() + this.getWidth());
	}
	
	public boolean isInside(double x, double y) {
		if(x > this.getX() && x < this.getY() + this.getWidth() && y > this.getY() && y < this.getY() + this.getHeight())
			return true;
		else
			return false;
	}
	
	public void moveToPoint(double x, double y) {
		this.setX(x);
		this.setY(y);
	}
	
}
