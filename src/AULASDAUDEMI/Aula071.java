package AULASDAUDEMI;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Aula071 {
	
	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Digite o valor do raio: ");
		double raio = sc.nextDouble();
		double c = Calculator.Circunferencia(raio);
		double v = Calculator.Volume(raio);
		
		System.out.printf("Circunferência: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI: %.2f%n", Calculator.PI);
		
		sc.close();
	}
	
}
