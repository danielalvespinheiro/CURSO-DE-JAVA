package aula191;

public class Main {

	public static void main(String[] args) {
		Cliente cl = new Cliente("Daniel", "daniel@email");
		Cliente cl2 = new Cliente("Daniel", "daniel@email");
		
		String t1 = "AAAA";
		String t2 = "BBBB"; // Dessa forma o resultado sera true ja que o compilador prioriza essa setagem literal
		
		System.out.println("Result: " + cl.hashCode());
		System.out.println("Result: " + cl2.hashCode());
		System.out.println("Result: " + cl.equals(cl2));
		System.out.println(cl == cl2); // A posição na memória é diferente nesse tipo de vericação, 
									  //ja que no hip de memoria estao em locais diferentes
		System.out.println(t1 == t2);
	}

}
