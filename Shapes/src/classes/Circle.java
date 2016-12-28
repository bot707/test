package classes;

public class Circle extends Shape {

	private double r;
	
	public Circle(double x, double y, double r){
		this.setX(x);
		this.setY(y);
		if(r > 0)
			this.r = r;
		else{
			throw new IllegalArgumentException("Radius should be more than 0");
		}
	}
	
	public void setRadius(double r){
		if(r > 0)
			this.r = r;
	}
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

	public Rectangle boundingBox(){
		return new Rectangle(this.getX() - r, this.getY() - r, 2.0*r, 2.0*r);
	}
}
