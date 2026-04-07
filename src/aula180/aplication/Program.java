package aula180.aplication;

import aula180.model.enities.AbstracShape;
import aula180.model.enities.Circle;
import aula180.model.enities.Rectangle;
import aula180.model.enums.Color;

public class Program {

	public static void main(String[] args) {

		AbstracShape shape1 = new Circle(Color.Black, 2.0);
		AbstracShape shape2 = new Rectangle(Color.White, 3.0, 4.0);
		
		System.out.println("Circle color: " + shape1.getColor());
		System.out.println("Circle area: " + String.format("%.3f", shape1.area()));
		System.out.println("Rectangle color: " + shape2.getColor());
		System.out.println("Rectangle area: " + String.format("%.3f", shape2.area()));
		
	}

}
