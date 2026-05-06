package aula190;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problema2 {
	public static void main(String args[]) {
		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> myObjs = new ArrayList<Object>();
		
		copy(myInts, myObjs);
		printList(myObjs);
		copy(myDoubles, myObjs);
		printList(myObjs);
	
	}
	
	// Mistoramos a covariancas que permite a busca de elementos List<? extends Number> source
	// E a contravarianca permite a adição mas não a busca List<? super Number> destiny
	public static void copy(List<? extends Number> source, List<? super Number> destiny) {
		for(Number number: source) {// aqui foi a covariança
			destiny.add(number); // e aqui foi a contravariança
		}
	}
	
	public static void printList(List<?> list) {
		for(Object obj: list) {
			System.out.print(obj + " | ");
		}
		System.out.println();
	}
	
}
