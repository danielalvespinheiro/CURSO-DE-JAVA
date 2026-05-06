package AULASDAUDEMI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Aula189 {

	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		List<String> myStrs = new ArrayList<String>();
		printList(myStrs);

	}
	
	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
			}
		}

}
