package AULAS_DE_HERANCA_POLIMORFISMO.aula144;

import java.util.*;

import AULAS_DE_HERANCA_POLIMORFISMO.aula144.entites.Circle;
import AULAS_DE_HERANCA_POLIMORFISMO.aula144.entites.Rectangle;
import AULAS_DE_HERANCA_POLIMORFISMO.aula144.entites.Shape;
import AULAS_DE_HERANCA_POLIMORFISMO.aula144.enums.Color;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number os shape: ");
		int n = sc.nextInt();
		
		List<Shape> ls = new ArrayList<Shape>();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Shape #"+i+ " data: ");
			
			System.out.print("Rectagle or Circle (r/c)? ");
			char sha = sc.next().charAt(0);
			
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next().toUpperCase());
			
			if(sha == 'r') {
				System.out.print("Width: ");
				Double w = sc.nextDouble();
				
				System.out.print("Height: ");
				Double h = sc.nextDouble();
				
				ls.add(new Rectangle(color, w, h));
			} else {
				System.out.print("Radius: ");
				Double r = sc.nextDouble();
				
				ls.add(new Circle(color, r));
			}
		}
		
		System.out.println("SHAPE AREAS: ");
		for(Shape sh: ls) {
			System.out.println(String.format("%.2f",  sh.area()));;
		}
		
		sc.close();
	}

}
