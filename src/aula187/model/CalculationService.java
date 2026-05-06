package aula187.model;

import java.util.List;

public class CalculationService{
	// Generic <T> define que a classe trabalha explicitamente com o tipo T
	// O Comparable<? super T> esta habilitando o comparable ao tipo T e qualquer super classe tipo T
	public static <T extends Comparable<? super T>> T max(List<T> list) {
		
		if(list.isEmpty()) {
			throw new IllegalStateException("The list can't be empty");
		}
		
		T maior = list.get(0);
		
		for(T item : list) {
			if(item.compareTo(maior) > 0) {
				maior = item;
			}
		}
		
		return maior;
		
	}

}
