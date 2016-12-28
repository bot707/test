package classes;

public abstract class Shape {
	private double x;
	private double y;
	private double height;
	private double width;
	
	public void setX(double x){
		this.x = x;
	}
	public void setY(double y){
		this.y = y;
	}
	public void setHeight(double height){
		if(height > 0)
			this.height = height;
		
	}
	public void setWidth(double width){
		if(height > 0)
			this.width = width;
	}
	
	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}
	public double getHeight(){
		return height;
	}
	public double getWidth(){
		return width;
	}
	
	public abstract double perimeter();
	public abstract boolean isInside(double x, double y);
	public abstract void moveToPoint(double x, double y);
}
