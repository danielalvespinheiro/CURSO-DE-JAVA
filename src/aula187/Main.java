package aula187;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import aula187.model.CalculationService;
import aula187.model.Product;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> p = new ArrayList<>();
		
		String path = "C:\\in\\product.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String prod = br.readLine();
			
			while(prod != null) {
				String[] parts = prod.split(",");
				p.add(new Product(parts[0], Float.parseFloat(parts[1])));
				prod = br.readLine();
			}
			
			//Collections.sort(p);
			for(Product a: p) {
				System.out.println(a);
			}
			Product x = CalculationService.max(p);
			System.out.println("Maior: " + x);

		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
