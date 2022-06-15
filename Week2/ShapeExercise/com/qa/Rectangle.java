package com.qa;

public class Rectangle extends Shape {
	
	private double height;
	private double width;
	private boolean result;
	
	public Rectangle(String name, String colour, double x, double y) {
		super(name, colour, x, y);
		this.height = y;
		this.width = x;
	}
	
	public boolean isSquare(double height, double width) {
		if (height == width) result = true;
		else result = false;
		
		return result;
	}
	
	public void print() {
		System.out.println("Name=" + getName() + " Colour =" + getColour() + " H=" + Double.toString(height) + " W=" + Double.toString(width));
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getWidth() {
		return width;
	}
	
	@Override
	public double getArea(double height, double width) {
		double area = width*height;
		return area;
	}
	
	public Point getCenterPoint(double height, double width) {
		Point centerPoint = new Point((int)height/2, (int)width/2);
		
		return centerPoint;
	}
}
