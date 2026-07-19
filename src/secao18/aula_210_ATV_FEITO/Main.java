package secao18.aula_210_ATV_FEITO;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Products> pc = new ArrayList<Products>();
		
		// C:\in\p.txt
		System.out.print("Digite o caminho do arquivo: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String lines = br.readLine();
			
			while(lines != null) {
				String[] field = lines.split(",");
				pc.add(new Products(field[0], Double.parseDouble(field[1])));
				lines = br.readLine();
			}
			
			// Preciso pegar o preço médio e depois imprimir na tela o avgPrice
			// E depois o nome na ordem decrescente em relação ao avgPrice
			
			double avgPrice = pc.stream()
					.map(x -> x.getPrice())
					.reduce(0.0, ((x,y) -> x + y)) / pc.size();
					
			
			System.out.println("Avarage Price: " + String.format("%.2f", avgPrice));
			
			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			
			List<String> nLs = pc.stream()
					.filter(x -> x.getPrice() < avgPrice)
					.map(x -> x.getName())
					.sorted(comp.reversed())
					.collect(Collectors.toList());
					
			nLs.forEach(System.out::println);
			
		} catch (IOException e) {
			System.out.println("Error, escreve o caminho direito: " + e.getMessage());
		}
		
		sc.close();
	}

}
