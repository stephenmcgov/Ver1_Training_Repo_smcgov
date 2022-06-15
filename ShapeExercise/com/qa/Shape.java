package com.qa;

public abstract class Shape {
	private String name;
	private String colour;
	private double x;
	private double y;
	
	public Shape(String name, String colour, double x, double y) {
		setName(name);
		setColour(colour);
		setX(x);
		setY(y);
	}
	
	public Shape(String name, String colour, double x) {
		setName(name);
		setColour(colour);
		setX(x);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	public double getArea(double x, double y) {
		double area;
		area = 0;
		
		return area;
	}
	
	public Point getCenterPoint(int x, int y) {
		Point centerPoint = new Point(x, y);
		
		return centerPoint;
	}
	
	public void print() {
		System.out.println("Name=" + name + " Colour =" + colour + " X=" + Double.toString(x) + " Y=" + Double.toString(y));
	}
}
