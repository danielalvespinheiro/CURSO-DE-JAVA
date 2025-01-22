package AULA_82_EXERCICIO;

import java.util.Scanner;

import AULA_82_EXERCICIO.model.Titular;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Titular titu = new Titular();
		
		System.out.print("Digite o numero da conta: ");
		titu.numberAcount = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("Digite a conta do titular: ");
		titu.acountHolder = sc.nextLine();
		
		while(true) {
			try {
				System.out.print("Deseja realizar um deposito inicial? (S/N)? ");
				String respDeposit = sc.next();
				
				if (respDeposit.equalsIgnoreCase("S")) {
					System.out.println("Digite o valor a ser depositado: ");
					titu.balance = sc.nextDouble();
					
					
				} else if (respDeposit.equalsIgnoreCase("N")){
					break;
				} else {
					System.out.println("Entrada inválida. Por favor, digite 'S' ou 'N' ");
				}
				
			} catch (Exception e) {
				System.out.println("Ocorreu um erro: " + e.getMessage());
				break;
			}
		}
		
		System.out.println("");
		
		System.out.println("Atualização da conta: ");
		System.out.println("Conta: " + titu.getNumberAcount() + ", "
		+ "Titular: " + titu.getAcountHolder() + ", "
		+ "Saldo: $" + titu.getBalance());
		
		System.out.print("Digite o valor a ser depositado: ");
		titu.balance = sc.nextDouble();
		
		System.out.println("Atualização da conta: ");
		System.out.println("Conta: " + titu.getNumberAcount() + ", "
		+ "Titular: " + titu.getAcountHolder() + ", "
		+ "Saldo: $" + titu.getBalance());
		
		System.out.println("");
		
		System.out.print("Digite o valor a ser retirado: ");
		double withdraw = sc.nextDouble();
		titu.balance -= withdraw + 5; //taxa da retirada
		
		System.out.print("Atualização da conta: ");
		System.out.println("Conta: " + titu.getNumberAcount() + ", "
		+ "Titular: " + titu.getAcountHolder() + ", "
		+ "Saldo: $" + titu.getBalance());
	}

}
