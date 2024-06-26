package aulasDaUdemi;

import java.util.Scanner;

public class Aula50 {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = 15;
		
		int soma = 0;
		for(int i=0; i<N; i++) {
			System.out.println("i value: " + i + (" soma value: " + soma ) );
			int q = 4;
			soma = soma + q;
		}
		System.out.println(soma);
		
		sc.close();
		
	}
	
}
