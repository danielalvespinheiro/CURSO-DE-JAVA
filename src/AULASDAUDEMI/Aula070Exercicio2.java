package AULASDAUDEMI;

import java.util.Locale;
import java.util.Scanner;

public class Aula070Exercicio2 {
	//Atividade para lê e mostrar na tela o salario e depois um aumento no salario
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//Você pode adicionar 2 zeros ao final: 10.00
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.printf("Salário bruto: ");
		double salarioBruto = sc.nextDouble();
		
		System.out.printf("Taxa: ");
		double taxa = sc.nextDouble();
		
		double salarioLiquido = salarioBruto - taxa;
		
		System.out.println(">>>>>>>>>>>>>");
		
		System.out.printf("Trabalhador: %s, $ %.2f%n", nome, salarioLiquido);
		
		System.out.println(">>>>>>>>>>>>>");
		//aqui é onde é feito o calculo do aumento do salario
		System.out.printf("aumentar salário: ");
		double porcentagem = sc.nextDouble();
		
		double calculoSalario = salarioBruto * porcentagem / 100;
		double calculoFinal = salarioLiquido + calculoSalario;
		
		System.out.printf("salario final %.2f%n", calculoFinal);
		sc.close();
	}
}
