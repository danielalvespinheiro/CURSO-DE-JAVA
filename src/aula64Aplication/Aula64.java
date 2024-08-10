package aula64Aplication;

import java.util.Locale;
import java.util.Scanner;

public class Aula64 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double xA, xB, xC, yA, yB, yC; 
		System.out.println("insira as medidas do triangulo x: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		System.out.println("insira as medidas do triangulo y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		double p = (xA + xB + xC) / 2;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		
		p = (yA + yB + yC) / 2;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
		
		System.out.printf("Área do triângulo x: %.4f%n", areaX);

		System.out.printf("Área do triangulo y: %.4f%n ", areaY);
		
		if (areaX > areaY) {
			System.out.println("A maior área é do trinagulo x: "
					+ areaX);
		} else {
			System.out.println("A maior área é do trinagulo Y: "
					+ areaY);
		}
		
		/* 
		 * y exemplo
		7.50
		4.50
		4.02
		*/
		
		sc.close();
	}
}
