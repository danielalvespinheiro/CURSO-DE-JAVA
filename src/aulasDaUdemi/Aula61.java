package aulasDaUdemi;

import java.util.Scanner;

public class Aula61 {
	
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	
	int maiorNumero = maximo(a, b, c);
	
	resultado(maiorNumero);
	
	sc.close();
	}
	
	public static int maximo(int x, int y, int z) {
	int aux;
		if(x > y && x > z) {
			aux = x;
		} else if(y > z) {
			aux = y;
		} else {
			aux = z;
		}
	return aux;
	}
	
	public static void resultado(int numb) {
		System.out.println("O maior número é " + numb);
	}
}
