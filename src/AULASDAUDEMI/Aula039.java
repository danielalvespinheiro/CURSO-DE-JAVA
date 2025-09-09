package AULASDAUDEMI;

import java.util.Locale;
import java.util.Scanner;

public class Aula039 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double preco = 34.5;
		
		double resultado = (preco < 20) ? preco * 0.1 : preco * 0.05;
		
		System.out.println("O valor da compra foi: " + resultado);
		sc.close();
	}

}
