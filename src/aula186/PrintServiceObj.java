package aula186;

import java.util.ArrayList;
import java.util.List;

public class PrintServiceObj {

	public PrintServiceObj() {}

	private List<Object> ls = new ArrayList<Object>();
	
	public void addValue(int value) {
		ls.add(value);
	}
	
	public Object first() {
		if(ls.isEmpty()) {
			throw new IllegalStateException("List is empty! ");
		}
		return ls.get(0);
	}
	
	public void print() {
		System.out.print("[");
		if(!ls.isEmpty()) {
			System.out.print(ls.get(0));
		}
		
		for(int i=1; i<ls.size(); i++) {
			System.out.print(", " + ls.get(i));
		}
		
		System.out.print("]");
	}
	
}
