package Aula182_exercicio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aula182ATVD2 {

	public static void main(String[] args) {
		List<Funcionario182> f = new ArrayList<>();
		String path = "c:\\in\\f.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String funcionarioCSV = br.readLine();
			
			while(funcionarioCSV != null) {
				String[] field = funcionarioCSV.split(",");
				f.add(new Funcionario182(field[0], Double.parseDouble(field[1])));
				funcionarioCSV = br.readLine();
			}
			
			Collections.sort(f);
			for(Funcionario182 n : f) {
				System.out.println(n.getName() + "," + n.getSalary());
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}