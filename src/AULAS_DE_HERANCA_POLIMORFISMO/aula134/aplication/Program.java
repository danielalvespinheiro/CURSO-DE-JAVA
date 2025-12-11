package AULAS_DE_HERANCA_POLIMORFISMO.aula134.aplication;

import AULAS_DE_HERANCA_POLIMORFISMO.aula134.entities.Account;
import AULAS_DE_HERANCA_POLIMORFISMO.aula134.entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		Account x = new Account(1001, "Daniel Alves", 1000.0);
		Account y = new SavingsAccount(1001, "Daniel Alves", 1000.0, 0.001);
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println("X = " + x.getBalance());
		System.out.println("Y = " + y.getBalance());
	}
}
