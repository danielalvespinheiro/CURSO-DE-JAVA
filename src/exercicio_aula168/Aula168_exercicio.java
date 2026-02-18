package exercicio_aula168;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exercicio_aula168.model.Product;

public class Aula168_exercicio {

	public static void main(String[] args) throws ParseException, FileNotFoundException, IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		System.out.println("Enter a file path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		String folderPath = path.getParent();
		
		boolean success = new File(path + "\\out").mkdir();
		
		String fileTarget = folderPath + "\\out\\summery.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String itemCSV = br.readLine();
			while(itemCSV != null) {

				String[] fields = itemCSV.split(",");
				String name = fields[0];
				Double price = Double.parseDouble(fields[1]);
				int qtd = Integer.parseInt(fields[2]);
				
				list.add(new Product(name, price, qtd));
				
				itemCSV = br.readLine();
			}
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileTarget))){
				
				for(Product item: list) {
					bw.write(item.getName() + ", " + String.format("%.2f", item.total()));
					bw.newLine();
				}
				
				System.out.println("file target created! ");
				
			}catch (IOException e) {
				System.out.println("Error write: "+ e.getMessage());
			}
			
		}catch (IOException e) {
			System.out.println("Error read: "+ e.getMessage());
		}
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
