package AULASDAUDEMI;

import java.util.Locale;
import java.util.Scanner;

public class Aula089 {

	public static void main(String[] args) {
		// AULA SOBRE VETORES
		// vantagem acesso imediato
		// desvantegem inserir e deletar elementos é dificultoso
		Locale.setDefault(Locale.US);;
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		// Vetor em java
		double[] vect = new double[n];
		
		// inserindo os valores em cada posição (Sim deve começar do zero)
		for (int i=0; i<n; i++) {
			vect[i] = sc.nextDouble();
		}
		// percorre todo o vetor e soma os elementos dele dentro da variavel soma
		double soma = 0.0;
		for (int i = 0; i<n; i++) {
			soma += vect[i];
		}
		
		double avg = soma / n;
		
		System.out.println("AVAREGE HEIGHT" + avg);
		
		sc.close();
	}

}