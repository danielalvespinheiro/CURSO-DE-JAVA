package exercicio_vetores;

import java.util.Scanner;

public class Atvd_002 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double[] arr = new double[n];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("Digite um número: ");
			double numUser = sc.nextDouble();
			
			arr[i] = numUser;
		}
		
		double soma = 0;
		
		System.out.print("Valores:");
		for(int i=0; i<arr.length; i++) {
			soma = soma + arr[i];
			System.out.print(" "+arr[i]);
			
		}
		double media = soma / arr.length;
		
		System.out.println("\nSoma: " + soma);
		System.out.println("Média: " + media);
		
		sc.close();
	}
	
}
