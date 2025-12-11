package AULAS_DE_HERANCA_POLIMORFISMO.aula131.aplication;

import AULAS_DE_HERANCA_POLIMORFISMO.aula131.entities.Account;
import AULAS_DE_HERANCA_POLIMORFISMO.aula131.entities.BusinessAccount;
import AULAS_DE_HERANCA_POLIMORFISMO.aula131.entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		// UPCASTING
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
	
		// DOWNCASTING
		// acc2.loan() isso não funciona pois acc2 é orinalmente Account
		// mas quando faço o downcasting posso usar o loan.
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		// acc4.loan(100.0);
		
		// BusinessAccount acc5 = (BusinessAccount) acc3; isso causa um erro na execução
		
		// Fazendo verificação se o acc3 é instancia do tipo BusinessAccount
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.0);
			System.out.println("Loan! ");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update! ");
		}
		
	}

}
