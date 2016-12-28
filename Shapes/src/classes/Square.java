package classes;

public class Square extends Rectangle {

	public Square(double x, double y, double side){
		super(0,0,1,1);
		this.setX(x);
		this.setY(y);
		if(side > 0){
			this.setHeight(side);
			this.setWidth(side);
		}
		else
			throw new IllegalArgumentException("Side of square should be more than 0");

	}

}
