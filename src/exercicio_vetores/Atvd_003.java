package exercicio_vetores;

import java.util.Locale;
import java.util.Scanner;

public class Atvd_003 {
	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		float soma = 0;
		int nIdade = 0;
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		float[] altura = new float[n];
		
		for(int i=0; i<n; i++) {
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			System.out.print("Nome: ");
			nome[i] = sc.next();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			System.out.print("Altura: ");
			altura[i] = sc.nextFloat();
			
			soma = soma + altura[i];
		}
		
		float media = soma / idade.length;
		
		System.out.println();
		System.out.printf("Média: %.2f", media);
		System.out.println();
		
		for(int i=0; i<idade.length; i++) {

			if(idade[i] < 16) {
				nIdade ++;
			}
		}
		
		double percentualMenores = ((double)nIdade / n) * 100.0;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);
		
		 for(int i=0; i<n; i++) {
		        if (idade[i] < 16) {
		        	System.out.printf("%s\n", nome[i]);
		        }
		 }
		
		sc.close();
	}
}
