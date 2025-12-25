package AULAS_DE_HERANCA_POLIMORFISMO.aula144.entites;

import AULAS_DE_HERANCA_POLIMORFISMO.aula144.enums.Color;

public class Circle extends Shape{
	private Double radius;

	public Circle() {}
	
	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

	// calculo da área do circulo;
	@Override
	public Double area() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}
	
}
