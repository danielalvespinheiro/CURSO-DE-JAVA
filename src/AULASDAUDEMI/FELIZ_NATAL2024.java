package AULASDAUDEMI;

public class FELIZ_NATAL2024 {
	public static void main(String[] args) {

		System.out.println("FELIZ NATAL!");
		System.out.println(" ");
		int rows = 6;

		for (int i=0; i<rows; i++) {
			// Define o tamanho da árvore.
			for (int j=rows-i; j>=2; j--)
				System.out.print(" ");
			// Realizamos o espaçamento do topo e depois vai descendo.
			for (int j=0; j <= i; j++)
				System.out.print("* ");
			// Insere um espaço antes espaçamento o caractere
				System.out.println();
		}
	}
}
