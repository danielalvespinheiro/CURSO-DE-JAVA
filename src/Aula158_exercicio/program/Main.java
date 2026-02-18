package Aula158_exercicio.program;

import java.util.Locale;
import java.util.Scanner;

import Aula158_exercicio.model.Account;
import Aula158_exercicio.model.exception.ErroWithDraw;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
			System.out.println("Enter account data");
			System.out.print("Number: ");
			Integer number = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			Double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			Double limit = sc.nextDouble();
			
			Account acc = new Account(number, holder, balance, limit);
			
			System.out.println();
			System.out.print("Enter amout for withdraw: ");
			Double withdraw = sc.nextDouble();
			
		try {
			acc.withDraw(withdraw);
			System.out.printf("New balance: %.2f" + acc.getBalance());
		} catch (ErroWithDraw e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}

}
