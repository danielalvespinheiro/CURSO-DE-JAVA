package AULASDAUDEMI;

import java.io.File;
import java.util.Scanner;

public class Aula156 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		sc.close();
	}

}
