package AULASDAUDEMI;

import java.util.ArrayList;
import java.util.List;

public class ClasseDeTeste {

	public static void main(String[] args) {

		List<?> myObjs = new ArrayList<Object>();
		List<Integer> myNumbers = new ArrayList<Integer>();
		myObjs = myNumbers;
		
		System.out.println(myObjs);
		
	}

}
