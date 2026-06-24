package secao18.aula_202.exemplo4;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		int sum = list.stream().reduce(0, Integer::sum);

		System.out.println(sum);
	}

}
