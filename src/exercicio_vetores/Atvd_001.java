package exercicio_vetores;

import java.util.Scanner;

public class Atvd_001 {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		
		if(N > 10) {
			System.out.println("O valor precisa ser menor ou igual a 10! \n");
			
		} else {
			for(int i=0; i<arr.length; i++) {
				System.out.print("Digite um número: ");
				int numUser = sc.nextInt();
				
				arr[i] = numUser;
			}
			
			for(int i=0; i<arr.length; i++) {
				
				if(arr[i] < 0) {
					System.out.print("Números negativos: ");
					System.out.print(arr[i] + " \n");
				}
			}
		}
		
		sc.close();
	}

}
