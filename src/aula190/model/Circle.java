package aula190.model;

public class Circle implements Shape{
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	@Override
	public String toString() {
		return "Resultado da operação para area: " + 
				String.format("%.3f", area());
	}

}
