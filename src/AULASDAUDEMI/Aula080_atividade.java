package AULASDAUDEMI;

import java.util.Locale;
import java.util.Scanner;

import aula80Modelo.ContaBancaria;

public class Aula080_atividade {
	
	public static void main(String args[]) {
		// Cria um programa que simule um cadastro, deposito e saque em um banco.
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ContaBancaria contaBanco;
		
		// Inicio do programa!
		System.out.print("Digite o número da sua conta: ");
		int number = sc.nextInt();
		
		System.out.print("Digite o seu nome: ");
		sc.nextLine();
		String name = sc.nextLine();

		System.out.println("Você deseja realizar um depósito inicial? S/N ");
		char opc = sc.next().charAt(0);
		
		if(opc == 's' || opc == 'S') {
			System.out.println("Digite o valor para o depósito inicial: ");
			float depositoInicial = sc.nextFloat();
			
			contaBanco = new ContaBancaria(number, depositoInicial, name);
		}else {
			contaBanco = new ContaBancaria(number, name);
		}
		
		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(contaBanco);
		System.out.println();
		
		System.out.print("Valor de depósito: ");
		float valorDeposito = sc.nextFloat();
		contaBanco.deposito(valorDeposito);
		System.out.println("Dados atualizados! ");
		System.out.println(contaBanco);
		
		System.out.print("Valor de saque: ");
		float valorSaque = sc.nextFloat();
		contaBanco.sacar(valorSaque);
		System.out.println("Dados atualizados! ");
		System.out.println(contaBanco);
		
		sc.close();
	}
}