package com.qa;

public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		setX(x);
		setY(y);
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void printVals() {
		System.out.println("X=" + Integer.toString(x) + " Y=" + Integer.toString(y));
	}
}
