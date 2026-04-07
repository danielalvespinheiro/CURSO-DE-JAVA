package aula180.model.enities;

import aula180.model.enums.Color;

public class Rectangle extends AbstracShape{
	private double Width;
	private double height;

	public Rectangle(Color color, double width, double height) {
		super(color);
		Width = width;
		this.height = height;
	}

	@Override
	public double area() {
		return Width * height;
	}

	public double getWidth() {
		return Width;
	}

	public void setWidth(double width) {
		Width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
