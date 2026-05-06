package aula190;

import java.util.ArrayList;
import java.util.List;

import aula190.model.Circle;
import aula190.model.Rectangle;
import aula190.model.Shape;

public class Main {

	public static void main(String[] args) {
		List<Shape> myShape = new ArrayList<>();
		myShape.add(new Rectangle(3.0, 2.0));
		myShape.add(new Circle(2));
		
		List<Circle> myCircle = new ArrayList<>();
		myCircle.add(new Circle(5));
		myCircle.add(new Circle(8));
		
		System.out.println("Area total: " + totalArea(myCircle));
	}
	
    //Agora o metodo pode aceitar o tipo Shape e qualquer subtipo dele 									
	public static double totalArea(List<? extends Shape> list) {
		double sum = 0.0;
		
		for(Shape s: list) {
			sum += s.area();
		}
		
		return sum;
	}

}
