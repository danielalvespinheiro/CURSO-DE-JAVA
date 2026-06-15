package aula198;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> vot = new LinkedHashMap<>();
		/*Usei o linkedHashMap para o output sair exatamente como no exemplo.
		 * Fique a vontade de usar o TreeMap ou HashMap pois eles só vão ordenar a entrada de valores*/
		
		System.out.print("Digite o caminho para o arquivo: ");
		String path = sc.next();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String words = br.readLine();
			
			while(words != null) {
				String[] parts = words.split(",");

				String nome = parts[0].trim();// o trim limpa espaços em branco
				int valor = Integer.parseInt(parts[1].trim());
				// Merger adiciona um valor se ele ainda não existe na lista
				vot.merge(nome, valor, Integer::sum);
				// existe outra forma de fazer esse Integer::sum
			    // vot.merge(nome, valor, (a, b) -> a + b);
				words = br.readLine();
			}
			
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		vot.forEach((chave, valor) -> System.out.println(chave + ": " + valor));
		
		sc.close();
	}

}
