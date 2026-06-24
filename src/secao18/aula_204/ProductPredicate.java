package secao18.aula_204;

import java.util.function.Predicate;

import secao18.aula_201.model.Products;

public class ProductPredicate implements Predicate<Products>{

	@Override
	public boolean test(Products p) {
		return p.getPrice() >= 100.00 ;
	}
	
}
