package AULASDAUDEMI;

public class Aula97 {

	public static void main(String[] args) {
		String[] vector = new String[]{"Maria", "Bob", "Jão"};
		
		for (int i=0; i<vector.length; i++) {
			System.out.println("for normal: " + vector[i]);
		}
		
		System.out.println();
		// for each 
		
		for (String obj : vector) {
			System.out.println("for each: " + obj);
		}
	}

}
