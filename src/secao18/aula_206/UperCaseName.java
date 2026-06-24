package secao18.aula_206;

import java.util.function.Function;

public class UperCaseName implements Function<Products, String>{

	@Override
	public String apply(Products p) {
		return p.getName().toUpperCase();
	}

}
