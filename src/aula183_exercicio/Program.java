package aula183_exercicio;

import java.util.Scanner;

import aula183_exercicio.sevice.USAInterestService;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Write the amount: ");
		double amount = sc.nextDouble();
		System.out.print("Write the amount of months: ");
		double months = sc.nextDouble();
		
		USAInterestService bs = new USAInterestService(1.0);
		double result = bs.payment(amount, months);
		
		System.out.print(String.format("%.2f", result));
		
		sc.close();

	}

}
