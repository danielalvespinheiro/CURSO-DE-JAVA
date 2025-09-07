package treinandoVetorAtividade;

import java.util.Locale;
import java.util.Scanner;

public class Problema_negativos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		if(n > 10) {
			System.out.println("O valor máximo de vezes é 10, tente novamente! ");
		}
			
		int[] vetor = new int[n];
			
		for (int i=0; i<vetor.length; i++) {
			System.out.print("Digite um número: ");
			int num = sc.nextInt();
			vetor[i] = num;
		}
		
		System.out.println("NUMEROS NEGATIVOS: ");
		for (int i=0; i<vetor.length; i++) {
			if(vetor[i] < 0) {
				System.err.println(vetor[i]);
			}
		}
			
		sc.close();
	}	
}