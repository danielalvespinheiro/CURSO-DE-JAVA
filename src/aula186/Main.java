package aula186;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
	
		Scanner sc = new Scanner(System.in);
		
		/* Isso cria um type safe que impede que seja passado
		 * valores diferentes no decorrer do uso desse Service
		 */ 
		
		PrintService<Integer> ps = new PrintService<>();
		
		System.out.print("Who many values? ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			Integer value = sc.nextInt();
			ps.addValue(value);
		}
		
		ps.print();
		System.out.println();
		System.out.println("First: " + ps.first());
		
		sc.close();
	}
}
