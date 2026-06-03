package exercicio195.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import exercicio195.entities.Peoples;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter a file full path (C:\\in\\p.txt)");
		String path = sc.next();
		
		try (BufferedReader bf = new BufferedReader(new FileReader(path))){
			Set<Peoples> set = new HashSet<Peoples>();
			String lines = bf.readLine();

			while(lines != null) {
				
				String[] field = lines.split(" ");
				String username = field[0];
				Date moment = Date.from(Instant.parse(field[1]));
				
				set.add(new Peoples(username, moment));
				lines = bf.readLine();
			}
			
			System.out.println("Total users: " + set.size());
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
	}

}
