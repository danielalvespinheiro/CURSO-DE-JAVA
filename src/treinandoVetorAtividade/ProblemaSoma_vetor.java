package treinandoVetorAtividade;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaSoma_vetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		float[] vect = new float[n];
		
		for(int i=0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			float numUser = sc.nextFloat();
			
			vect[i] = numUser;
		}
		
		// Passar os valores, soma e média
		float soma = 0;
		
		System.out.print("Valores: ");
		
		for (int i=0; i<vect.length; i++) {
			System.err.print(vect[i] + " ");
			
			soma += vect[i];
		}
		float media = soma / n;
		
		System.out.println();
		System.err.printf("SOMA: %.2f%n", soma);
		System.err.printf("MÉDIA: %.2f%n", media);
		
		sc.close();
	}

}
