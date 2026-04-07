package aula180.model.enities;

import aula180.model.enums.Color;

public abstract class AbstracShape implements Shape{
	private Color color;

	public AbstracShape(Color color) {
		super();
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
}
