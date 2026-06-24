package secao18.aula_201;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import secao18.aula_201.model.Products;

public class Program {

	public static void main(String[] args) {
		List<Products> stock = new ArrayList<>();
		
		stock.add(new Products("Tv", 900.0));
		stock.add(new Products("Notebook", 1200.0));
		stock.add(new Products("Tablet", 450.0));

		// stock.sort(new MyComparator());
		
//		Comparator<Products> comp = new Comparator<Products>() {
//			// Isso aqui é uma classe anônima dentro do main
//			@Override
//			public int compare(Products p1, Products p2) {
//				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
//			}
//		};
		
		// Expressão lambda com uma função anônima
		// Também pode ser conhecido como arrow function
//		Comparator<Products> comp = (p1, p2) -> {
//			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
//		};
		
		// Como só tem uma linha posso colocar dessa forma		
		Comparator<Products> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		
		// você pode fazer assim também
		// stock.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		stock.sort(comp);
		
		for(Products s: stock) {
			System.out.println(s);
		}

	}

}
