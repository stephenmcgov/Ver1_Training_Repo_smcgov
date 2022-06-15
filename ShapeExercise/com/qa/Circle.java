package com.qa;

public class Circle extends Shape {
	
	private double radius;
	
	public Circle(String name, String colour, double radius) {
		super(name, colour, radius);
		
		this.radius = radius;
	}
	
	public void print() {
		System.out.println("Name=" + getName() + " Colour =" + getColour() + " Radius=" + Double.toString(radius));
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea(double radius) {
		double area = Math.PI * radius * radius;;
		return area;
	}
	
	public Point getCenterPoint(double height, double width) {
		Point centerPoint = new Point((int)radius/2, 0);
		
		return centerPoint;
	}
}
