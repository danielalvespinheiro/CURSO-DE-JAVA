package AULAS_DE_HERANCA_POLIMORFISMO.aula145;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import AULAS_DE_HERANCA_POLIMORFISMO.aula145.entities.Company;
import AULAS_DE_HERANCA_POLIMORFISMO.aula145.entities.Individual;
import AULAS_DE_HERANCA_POLIMORFISMO.aula145.entities.TaxPayer;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> ls = new ArrayList<TaxPayer>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Tax payer #"+ i +" data: ");
			System.out.print("Individual or company (i/c)? ");
			char type = sc.next().charAt(0);
			
			System.out.print("name: ");
			String name = sc.next();
			System.out.print("Anual income: ");
			Double income = sc.nextDouble();
			
			if(type == 'i') {
				System.out.print("Health expenditures: ");
				Double health = sc.nextDouble();
				ls.add(new Individual(name, income, health));
			} else {
				System.out.print("Number of employees: ");
				int employees = sc.nextInt();
				ls.add(new Company(name, income, employees));
			}
		}
		
		double totalTax = 0.0;
		System.out.println("TAXES PAID: ");
		for(TaxPayer t: ls) {
			System.out.println(t.getName() + ": $ " + String.format("%.2f", t.tax()));
			totalTax += t.tax();
		}
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + totalTax);
		
		sc.close();
	}

}
