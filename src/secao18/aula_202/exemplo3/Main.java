package secao18.aula_202.exemplo3;

import java.util.ArrayList;
import java.util.List;

import secao18.aula_201.model.Products;

public class Main {

	public static void main(String[] args) {
		List<Products> list = new ArrayList<>();
		
		list.add(new Products("TV", 900.00));
		list.add(new Products("Notebook", 1200.00));
		list.add(new Products("Tablet", 450.00));
		
		list.sort((p1, p2) -> p1.getPrice().compareTo(p2.getPrice()));
		
		list.forEach(System.out::println);
	}
	
}
