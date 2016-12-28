package main;

import classes.Circle;
import classes.Rectangle;
import classes.Square;

public class Programm {
	public static void main(String[] args){
		Rectangle testRectangle = new Rectangle(2,1,3,4);
		Square testSquare = new Square(5,6,4);
		Circle testCircle = new Circle(-1, 4, 6);
		
		System.out.println("Start point of rectangle: x = " + testRectangle.getX() + ", y = " + testRectangle.getY());
		System.out.println("Height = " + testRectangle.getHeight() + ", width = " + testRectangle.getWidth());
		System.out.println("Perimeter of rectangle: " + testRectangle.perimeter());
		System.out.println("Point is in rectangle (x = 4, y = 3): " + testRectangle.isInside(4,3));
		System.out.println("Change start point position of rectangle to x = 5, y = 1...");
		testRectangle.moveToPoint(5, 1);
		System.out.println("Point is in rectangle (x = 4, y = 3): " + testRectangle.isInside(4,3));
		
		System.out.println("Trying create rectangle with incorrect height (-1):");
		try{
			Rectangle testRh = new Rectangle(1,1,-1,5);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		System.out.println("Trying create rectangle with incorrect width (0):");
		try{
			Rectangle testRw = new Rectangle(1,1,5,0);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		System.out.println("*-----------------------*");
		System.out.println("Start point of square: x = " + testSquare.getX() + ", y = " + testSquare.getY());
		System.out.println("Height = " + testSquare.getHeight() + ", width = " + testSquare.getWidth());
		System.out.println("Perimeter of square: " + testSquare.perimeter());
		System.out.println("Point is in square (x = 7, y = 8): " + testSquare.isInside(7,8));
		System.out.println("Change start point position of square to x = 5, y = 1...");
		testSquare.moveToPoint(5, 1);
		System.out.println("Point is in square (x = 4, y = 3): " + testSquare.isInside(4,3));
		
		System.out.println("Trying create square with incorrect side (-1):");
		try{
			Square testS = new Square(1,1,-1);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		System.out.println("*-----------------------*");
		System.out.println("Start point of circle: x = " + testCircle.getX() + ", y = " + testCircle.getY());
		System.out.println("Height = " + testCircle.getHeight() + ", width = " + testCircle.getWidth());
		System.out.println("Perimeter of circle: " + testCircle.perimeter());
		System.out.println("Point is in circle (x = 4, y = 3): " + testCircle.isInside(4,3));
		System.out.println("Change start point position of circle to x = 5, y = 1...");
		testCircle.moveToPoint(5, 1);
		System.out.println("Point is in circle (x = 7, y = 9): " + testCircle.isInside(7,9));
		
		System.out.println("Trying create circle with incorrect radius (-1):");
		try{
			Circle testC = new Circle(1,1,-1);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
