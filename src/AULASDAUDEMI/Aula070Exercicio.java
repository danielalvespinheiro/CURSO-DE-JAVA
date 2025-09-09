package AULASDAUDEMI;

import java.util.Locale;
import java.util.Scanner;

// import acharOTriangulo.entites.Triangulo;

//exercicio, mostrar no terminal o valor da diagonal, da area e do perimetro
//de um triangulo.
//EX: 3.00 4.00

public class Aula070Exercicio {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// Triangulo tr = new Triangulo();
		
		System.out.println("Por favor, coloque os valores: ");
		
		double base = sc.nextDouble();
		double altura = sc.nextDouble();
		
		double area = base * altura;
		double perimetro = 2 * (base + altura);
		double diagonal = (base * base) + (altura * altura);
		double result = Math.sqrt(diagonal);
		
		System.out.println("");
		System.out.println("Área: " + area);
		System.out.println("Perimetro: " + perimetro);
		System.out.println("Diagonal: " + result);
		
		sc.close();
	}

}
