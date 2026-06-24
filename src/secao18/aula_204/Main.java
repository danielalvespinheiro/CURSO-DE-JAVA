package secao18.aula_204;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		List<Products> list = new ArrayList<>();
		
		list.add(new Products("Tv", 900.00));
		list.add(new Products("Mouse", 50.00));
		list.add(new Products("Tablet", 350.50));
		list.add(new Products("HD Case", 80.90));
		
		// Exemplo 01
		//list.removeIf(new ProductPredicate());
		
		// Exemplo 02
		//list.removeIf(Products::staticProductPredicate);
		
		// Exemplo 03
		//list.removeIf(Products::noStaticProductPredicate);
		
		// Exemplo 04
		/*
		double min = sc.nextDouble();
		double min = 100.0
		Predicate<Products> pred = p -> p.getPrice() >= 100.0;
		
		list.removeIf(pred);
		*/
		
		// Exemplo 05
		
		list.removeIf(p -> p.getPrice() >= 100.0);
		
		for(Products p: list) {
			System.out.println(p);
		}
		
	}

}
