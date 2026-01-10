package AULASDAUDEMI;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Aula150 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
			
		} catch (InputMismatchException e) {
			System.out.println("Digite apenas números!");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("\n\u001B[1m\u001B[31mDigite apenas a quantidade existente de elementos!\u001B[0m\n");
			System.out.println("\u001B[31mDigite apenas a quantidade existente de elementos!\u001B[0m\n");
		}
		
		System.out.println("end program! ");
		
		sc.close();

	}

}
