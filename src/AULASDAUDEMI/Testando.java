package AULASDAUDEMI;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Testando {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("/Users/dani2/Desktop/teste.txt");
		Scanner sc = new Scanner(file);
		
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		

	}

}
