package AULASDAUDEMI;

public class Aula096 {

	public static void main(String[] args) {
		
		// Unboxing
		
		int x = 20;
		int y = 0;
		
		Object obj = x; // encaxoto o valor
		y = (int) obj; // desencaxoto o valor
		
		System.out.println(y);
		// Wrapper Classes são classes que tem valor equivalente a variável
		// Exemplo: int -> Integer : long -> Long : char -> Character
	}

}
	