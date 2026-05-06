package aula190;

import java.util.ArrayList;
import java.util.List;

public class Covariancia {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(5);
		
		List<? extends Number> list = intList;
		
		// Covariancia é essa ocorrencia o GET foi OK
		Number x = list.get(0);
		// o PUT ocorre erro
		
		//list.add(20);

	}

}
