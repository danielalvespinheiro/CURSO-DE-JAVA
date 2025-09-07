package AULASDAUDEMI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Aula98 {
	
	public static void main(String[] args) {
		// Listas 
		
		List<String> ls = new ArrayList<>();
		
		ls.add("Daniel");
		ls.add("Analía");
		ls.add("Agata");
		ls.add("Renata");
		
		ls.add(2, "Ema");
		
		for(String x : ls) {
			System.out.println(x);
		}
		System.out.println("------------------------------------------");
		ls.removeIf(x -> x.charAt(0) == 'R');
		for(String x : ls) {
			System.out.println(x);
		}
		System.out.println("------------------------------------------");
		// Pegando posição de algum elemento
		System.out.println("Index of Agata: " + ls.indexOf("Agata"));
		// Caso ele não ache o elemento o indexOf retorna -1
		System.out.println("Index of Rhena: " + ls.indexOf("Rhena"));
		System.out.println("------------------------------------------");
		List<String> result = ls.stream()
				.filter(x -> x.charAt(0) == 'A')
				.collect(Collectors.toList());
		for(String x : result) {
			System.out.println(x);
		}
		System.out.println("------------------------------------------");
		String name = ls.stream().filter(x -> x.charAt(0) == 'P').findFirst().orElse(null);
		System.out.println(name);
	}

}