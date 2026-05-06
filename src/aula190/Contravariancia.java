package aula190;

import java.util.ArrayList;
import java.util.List;

public class Contravariancia {

	public static void main(String[] args) {
		List<Object> myObjs = new ArrayList<Object>();
		myObjs.add("Maria");
		
		myObjs.add("Alex");
		
		List<? super Number> myNums = myObjs;
		// Agora é possivel adicionar variaveis do tipo number e Obj
		myNums.add(10);
		myNums.add(3.14);
		// Mas não consigo acessar esses valores
		// Number x = myNums.get(0);

	}

}
