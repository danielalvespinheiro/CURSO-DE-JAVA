package secao18.aula_206;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String args[]) {
		List<Products> list = new ArrayList<>();
		
		list.add(new Products("Tv", 900.00));
		list.add(new Products("Mouse", 50.00));
		list.add(new Products("Tablet", 350.50));
		list.add(new Products("HD Case", 80.90));
		
		// stream é uma sequência de dados
		//List<String> names = list.stream().map(new UperCaseName()).collect(Collectors.toList());
		
		//Reference method com método estático
		//List<String> names = list.stream().map(Products::staticUperCaseName).collect(Collectors.toList());
		
		//Reference method com método não estático
		//List<String> names = list.stream().map(Products::nonStaticUperCaseName).collect(Collectors.toList());
		
		//Expressão lambda declarada
		//Function<Products, String> fun = p -> p.getName().toUpperCase(); 
		//List<String> names = list.stream().map(fun).collect(Collectors.toList());
		
		//Expressão lambda inline
		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		
		names.forEach(System.out::println);
		
	}
}
