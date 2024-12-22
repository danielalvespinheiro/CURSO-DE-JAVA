package aulasDaUdemi;

import java.util.Locale;
import java.util.Scanner;

import util.DollarConverter;

public class Aula71Exercicio {
	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o valor do dolár hoje? ");
		double priceDolar = sc.nextDouble();
		
		System.out.print("Quantos dolares você vai comprar? ");
		double amountDolar = sc.nextDouble();
		
		double finalPriceDolar = 
				DollarConverter.converter(priceDolar, amountDolar);
		System.out.printf("Aqui está o valor a ser pago em reais R$%.2f%n ",
				finalPriceDolar);
		
		sc.close();
	}
}
