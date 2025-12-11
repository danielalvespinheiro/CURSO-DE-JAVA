package AULAS_DE_HERANCA_POLIMORFISMO.aula132.aplication;

import AULAS_DE_HERANCA_POLIMORFISMO.aula132.entities.Account;
import AULAS_DE_HERANCA_POLIMORFISMO.aula132.entities.BusinessAccount;
import AULAS_DE_HERANCA_POLIMORFISMO.aula132.entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		Account acc1 = new Account(1001, "Alex", 1000.0);
		
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());
	
		Account acc2 = new SavingsAccount(1002, "Lebrom", 500.0, 0.01);
		acc2.withdraw(100.0);
		System.out.println(acc2.getBalance());
		
		Account acc3 = new BusinessAccount(1003, "George", 1000.0, 0.01);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());
	}
}
