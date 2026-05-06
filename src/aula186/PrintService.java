package aula186;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {

	public PrintService() {}
	

	private List<T> ls = new ArrayList<>();
	
	public void addValue(T value) {
		ls.add(value);
	}
	
	public T first() {
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
