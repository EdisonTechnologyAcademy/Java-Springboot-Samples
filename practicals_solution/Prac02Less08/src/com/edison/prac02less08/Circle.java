package com.edison.prac02less08;

public class Circle {
	// private instance variable, not accessible from outside this class
	private double radius;
	private String color;

	// Constructors (overloaded)
	/** Constructs a Circle instance with default value for radius and color */
	public Circle() { // 1st (default) constructor
		radius = 1.0;
		color = "red";
	}

	/** Constructs a Circle instance with the given radius and default color */
	public Circle(double r) { // 2nd constructor
		radius = r;
		color = "red";
	}

	/** Sets the radius to the given value */
	public void setRadius(double radius) {
		this.radius = radius; // "this.radius" refers to the instance variable
								// "radius" refers to the method's argument
	}

	/** Returns the radius */
	public double getRadius() {
		return radius;
	}

	// Setter for instance variable color
	public void setColor(String color) {
		this.color = color;
	}

	/** Returns the color */
	public String getColor() {
		return color;
	}

	/** Returns the area of this Circle instance */
	public double getArea() {
		return radius * radius * Math.PI;
	}

	/**
	 * Return a self-descriptive string of this instance in the form of
	 * Circle[radius=?,color=?]
	 */
	public String toString() {
		return "Circle[radius=" + radius + " color=" + color + "]";
	}

}
