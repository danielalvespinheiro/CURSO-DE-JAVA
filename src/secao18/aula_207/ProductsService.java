package secao18.aula_207;

import java.util.List;
import java.util.function.Predicate;

public class ProductsService {

	public double filteredSum(List<Products> ls, Predicate<Products> criteria) {
		double sum = 0.0;
		
		for(Products p: ls) {
			if(criteria.test(p)) {
				sum += p.getPrice();
			}
		}
		return sum;
	}
	
}
