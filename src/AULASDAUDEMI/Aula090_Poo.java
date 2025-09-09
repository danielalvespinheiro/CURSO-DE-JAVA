package AULASDAUDEMI;

import java.util.Locale;
import java.util.Scanner;

import aula90_Produto.Aula90_Produto;

public class Aula090_Poo {
	public static void main(String args[]) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Aula90_Produto[] produto = new Aula90_Produto[n];
		
		for (int i=0; i<produto.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			produto[i] = new Aula90_Produto(name, price);
		}
		
		double soma = 0;
		for (int i=0; i<produto.length; i++) {
			soma += produto[i].getprice();
		}
		
		double avg = soma / produto.length;
		
		System.out.printf("Avarege Price = %.2f%n", avg);
		
		sc.close();
	}
}
