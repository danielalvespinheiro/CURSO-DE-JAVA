package AULAS_DE_HERANCA_POLIMORFISMO.aula144.entites;

import AULAS_DE_HERANCA_POLIMORFISMO.aula144.enums.Color;

public abstract class Shape {
	private Color color;

	public Shape() {}
	
	public Shape(Color color) {
		super();
		this.color = color;
	}
	
	public abstract Double area();

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

}
