package AULASDAUDEMI;

import java.util.Locale;
import java.util.Scanner;

public class Aula090 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String[] vectName = new String[n];
		double[] vectPrice = new double[n];
		
		for (int i=0; i<n; i++) {
			vectName[i] = sc.next();
			vectPrice[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		for (int i=0; i<n; i++) {
			sum += vectPrice[i];
		}
		double avgPrice = sum / n;
		System.out.printf("AVERAGE PRICE: %.2f", avgPrice);
		
		sc.close();
	}

}
