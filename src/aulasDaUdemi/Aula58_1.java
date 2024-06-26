package aulasDaUdemi;

import java.util.Scanner;

public class Aula58_1 {
	
	public static void main(String argd[]) {
		Scanner sc = new Scanner(System.in);
		
		int testeDeBit = 0b00100000;
		int n = sc.nextInt();
		
		if ( (n & testeDeBit) != 0 ) {
			System.out.println("the 6th bit return true");
		} else {
			System.out.println("the 6th bit return false");
		}
		
		sc.close();
	}

}
