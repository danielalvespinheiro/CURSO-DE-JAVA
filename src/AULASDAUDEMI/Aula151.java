package AULASDAUDEMI;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Aula151 {

	public static void main(String[] args) {
		
		metodo1();
		
		System.out.println("end program! ");
		
	}
	
	public static void metodo1() {
		System.out.println("***Metodo1 start***");
		metodo2();
		System.out.println("***Metodo1 end***");
	}
	
	public static void metodo2() {
		System.out.println("***Metodo2 start***");
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
			
		} catch (InputMismatchException e) {
			System.out.println("\nDigite apenas números!\n");
			e.printStackTrace(); //printa na tela o rastreamento do erro.
		
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("\nDigite apenas a quantidade existente de elementos!\n");
			e.printStackTrace();
		}
		
		System.out.println("***Metodo2 end***");
		sc.close();
	}

}
