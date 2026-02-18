package AULASDAUDEMI;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Aula162 {

	public static void main(String[] args) {
		File file = new File("C:\\temp\\in.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
			
		} catch (IOException e) {
			System.out.println("error: "+ e.getMessage());
		}
		finally {
			if(sc != null) {
				sc.close();
			}
		}
	}

}
