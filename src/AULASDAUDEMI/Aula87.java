package AULASDAUDEMI;

public class Aula87 {
	
	public static void main (String args[]) {
//      Gabager Coletor cuida da desalocação desse uma variavel que não tem referencia		
//		Product p1, p2;
//		
//		p1 = new Product("TV", 900.00, 0);
//		p2 = new Product("Mouse", 30, 0);
//		
//		p2 = p1;
		
//	    Desalocação por escopo
//	Exemplo 1   
//		teste();
		
//  Exemplo 2
		Product p = new Product();
		p.metodo1();
		
	}
	 // Exemplo 1
	static int y;
	public static void teste() {
		int x = 10; // aqui está armazenado no stack quando executado o metodo
		if(x > 0) {
			y = 20; // isso aqui fica armazenado durando o processamento do if
		}
		System.out.println(x);
	}
	
	
}
