package secao18.aula_205;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
	
	public static void main(String args[]) {
		List<Products> list = new ArrayList<>();
		
		list.add(new Products("Tv", 900.00));
		list.add(new Products("Mouse", 50.00));
		list.add(new Products("Tablet", 350.50));
		list.add(new Products("HD Case", 80.90));
		
		// Exemplo 01 
		//list.forEach(new PriceUpdate());
		
		// Exemplo 02 Reference method com método estático
		//list.forEach(Products::staticPriceUpdate);
		
		// Exemplo 03 Reference method com método não estático
		//list.forEach(Products::nonStaticPriceUpdate);
		
		// Exemplo 04 Expressão lambda declarada
//		double factor = 1.1;
//		Consumer<Products> con = p -> {
//			p.setPrice(p.getPrice() * factor);
//		};
//		
//		list.forEach(con);
		
		// Exemplo 05 Expressão lambda inline
		
		list.forEach(p -> p.setPrice(p.getPrice() * 1.1));
		
		list.forEach(System.out::println);
		
	}
}
