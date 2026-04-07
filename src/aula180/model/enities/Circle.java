package aula180.model.enities;

import aula180.model.enums.Color;

public class Circle extends AbstracShape{
	private double radius;

	public Circle(Color color, double radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

}
