package AULASDAUDEMI;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aula182_exercicio {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		List<String> ls = new ArrayList<String>();
		String path = "c:\\in\\p.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String name = br.readLine();
			while(name != null) {
				ls.add(name);
				name = br.readLine();
			}
			Collections.sort(ls);
			for (String s : ls) {
				System.out.println(s);
			}
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}

	}

}
