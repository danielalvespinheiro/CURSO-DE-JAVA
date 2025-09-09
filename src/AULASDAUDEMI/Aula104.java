package AULASDAUDEMI;

import java.util.Random;
import java.util.Scanner;

public class Aula104 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		System.out.println("Digite o número de linhas e de colunas");
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int[][] mat = new int[M][N];
		
		System.out.println();
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				mat[i][j] = rd.nextInt(50) + 10;
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Digite o número para ver posições: ");
		
		int X = sc.nextInt();
		
		//Pegando linhas mat.length
		//Pegando colunas mat[i].length
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				if(mat[i][j] == X) {
					System.out.println();
					
					System.out.println("Posição " + "i: " + i + ", " + "j: " + j + " :");
					
					if(j > 0) {
						System.out.println("Esquerda: " + mat[i][j-1]);
					}
					if(j < mat[i].length-1) { // Aqui pega o valor de j e se ele é menor que a posição da linha -1
						System.out.println("Direita: " + mat[i][j+1]);
					}
					if(i > 0) {
						System.out.println("Acima: " + mat[i-1][j]); // linha -1 mas na mesma coluna, Acima
						//             Coluna    0 1 2
						// 			   linha 0 = 4 5 6
						// Se estou na linha 1 = 7 8 9    e coluna 1
						// 			   linha 2 = 10 11 12
					}
					if(i < mat.length-1) {
						System.out.println("Abaixo: " + mat[i+1][j]);
					}
					// System.out.println("Posi da mat[i].length: "+ mat[i].length);
				}
			}
		}
		sc.close();
	}
}
