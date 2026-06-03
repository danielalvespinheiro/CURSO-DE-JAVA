package AULASDAUDEMI;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Aula192 {

	public static void main(String[] args) {
		// Set<String> set = new HashSet<>(); Rapido mas nao ordena
		// Set<String> set = new TreeSet<>(); ordena os elementos
		// Set<String> set = new LinkedHashSet<>(); Mantem a posicao dos elemtentos na
		// ordem em que foram setados
		Set<String> set = new LinkedHashSet<>();

		set.add("TV");
		set.add("Tablet");
		set.add("Notebook");

		set.removeIf(x -> x.charAt(0) == 'T');

		for (String p : set) {
			System.out.println(p);
		}

		System.out.println("____________________________________________________________________________________\n");
		
		Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));
		
		// union
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.println(c);
		
		// intersection
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println(d);
		
		// difference
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println(e);

	}

}
