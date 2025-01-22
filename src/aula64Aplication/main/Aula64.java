package aula64Aplication.main;

import java.util.Locale;
import java.util.Scanner;

import aula64Aplication.triangulo.Triangulo;

public class Aula64 {
	//Calculo da área de dois triangulo;
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangulo x, y;
		//Renomeando a classe Triangulo;
		
		x = new Triangulo();
		y = new Triangulo();
		
		//Instanciando a classe Triangulo 
		
		System.out.println("insira as medidas do triangulo x: ");
		 x.a = sc.nextDouble();
		 x.b = sc.nextDouble();
		 x.c = sc.nextDouble();
		 
		 //Area dos scanners, aqui é onde as informações sao passadas do terminal para este lugar;
		System.out.println("insira as medidas do triangulo y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double resultX = x.calculoTriangulo();
		
		
		double areaY = y.calculoTriangulo();
		
		System.out.printf("Área do triângulo x: %.4f%n", resultX);

		System.out.printf("Área do triangulo y: %.4f%n ", areaY);
		
		if (resultX > areaY) {
			System.out.println("A maior área é do trinagulo x: "
					+ resultX);
		} else {
			System.out.println("A maior área é do trinagulo Y: "
					+ areaY);
		}
		
		/* 
		 * x ememplo
		 * 3.00
		 * 4.00
		 * 5.00
		 * 
		 * y exemplo
		7.50
		4.50
		4.02
		*/
		
		sc.close();
	}
}
