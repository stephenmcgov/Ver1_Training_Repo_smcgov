package com.qa;

public class Main {

	public static void main(String[] args) {
		Rectangle a = new Rectangle("a", "blue", 5.0, 5.0);
		boolean ab = a.isSquare(a.getHeight(), a.getWidth());
		System.out.println("Rectangle " + a.getName() + " is square? : " + ab);
		
		Rectangle b = new Rectangle("b", "green", 3.0, 5.0);
		boolean bb = b.isSquare(b.getHeight(), b.getWidth());
		System.out.println("Rectangle " + b.getName() + " is square? : " + bb);
		
		Circle c = new Circle("c", "orange", 5.0);
		System.out.println("Circle " + b.getName() + " area : " + c.getArea(c.getRadius()));
	}
}
