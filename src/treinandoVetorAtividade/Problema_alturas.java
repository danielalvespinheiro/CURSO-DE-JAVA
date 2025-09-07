package treinandoVetorAtividade;

import java.util.Locale;
import java.util.Scanner;

public class Problema_alturas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		Pessoa[] people = new Pessoa[n];
		
		for (int i=0; i<people.length; i++) {
			System.out.println("Dados da "+(i + 1)+"a pessoa:");
			System.out.print("Nome: ");
			String nome = sc.next();
			
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			
			System.out.print("Altura: ");
			float altura = sc.nextFloat();
			
			people[i] = new Pessoa(nome, idade, altura);
		}
		
		// Média de alturas
		float somaAltura = 0;
		int contMenorIdade = 0;
		String nomeMenor = "";
		for (int i=0; i<people.length; i++) {
			somaAltura += people[i].getAltura();
			if(people[i].getIdade() < 16) {
				contMenorIdade++;
				nomeMenor += people[i].getNome() + "\n";
			}
		}
		float media = somaAltura / n;
		float porcentMenorId = (float) contMenorIdade / n * 100;
		System.out.println();
		System.out.printf("Média altura: %.2f", media);
		System.out.println();
		System.out.printf("Pessoas com menos de 16 anos: %.2f%%", porcentMenorId);
		System.out.println(nomeMenor);
		
		sc.close();
	}

}
