package secao18.aula_205;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Products>{

	@Override
	public void accept(Products t) {
		t.setPrice(t.getPrice() * 1.1);
	}

}
