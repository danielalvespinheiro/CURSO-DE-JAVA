package AULAS_DE_HERANCA_POLIMORFISMO.aula143.aplication;

import java.util.ArrayList;
import java.util.List;

import AULAS_DE_HERANCA_POLIMORFISMO.aula143.entities.Account;
import AULAS_DE_HERANCA_POLIMORFISMO.aula143.entities.BusinessAccount;
import AULAS_DE_HERANCA_POLIMORFISMO.aula143.entities.SavingsAccount;
public class Program {

	public static void main(String[] args) {
		/* Abstract serve para impossibilitar que uma classe 
		 * possa ser instanciada. */
		
		List<Account> list = new ArrayList<Account>();
		
		list.add(new SavingsAccount(1001, "Rhena", 1000.00, 10.00));
		list.add(new BusinessAccount(1002, "Adogner", 1000.00, 10.00));
		list.add(new SavingsAccount(1003, "Derruoy", 1000.00, 10.00));
		list.add(new BusinessAccount(1004, "Manusa", 1000.00, 10.00));
		
		double sum = 0.0;
		double increase = 10.0;
		
		for(Account c: list) {
			sum += c.getBalance();
			c.deposit(increase);
		}
		
		System.out.printf("Total balance: %.2f%n ", sum);
		
		for(Account c: list) {
			System.out.printf("Update balance: %d: %.2f%n ",c.getNumber(), c.getBalance());
		}
		
		
	}
}
