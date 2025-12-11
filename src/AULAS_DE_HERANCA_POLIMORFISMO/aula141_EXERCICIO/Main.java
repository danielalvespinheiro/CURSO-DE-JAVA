package AULAS_DE_HERANCA_POLIMORFISMO.aula141_EXERCICIO;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import AULAS_DE_HERANCA_POLIMORFISMO.aula141_EXERCICIO.entities.ImportedProduct;
import AULAS_DE_HERANCA_POLIMORFISMO.aula141_EXERCICIO.entities.Product;
import AULAS_DE_HERANCA_POLIMORFISMO.aula141_EXERCICIO.entities.UsedProduct;

public class Main {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> ls = new ArrayList<Product>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Product #" + i + " data");
			System.out.print("Common, used or imported (c/u/i)? ");
			char type = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("price: ");
			Double price = sc.nextDouble();
			
			if(type == 'c') {
				ls.add(new Product(name, price));
			} 
			
			else if(type == 'u') {
				System.out.print("Manufacture data (DD/MM/YYYY): ");
				LocalDate dateFormat = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				
				ls.add(new UsedProduct(name, price, dateFormat));
				
			} 
			
			else{
				System.out.print("Customs feed: ");
				Double custom = sc.nextDouble();
				
				ls.add(new ImportedProduct(name, price, custom));
			}
		}
		System.out.println();
		System.out.println("PRICE TAGS");
		for(Product pd : ls) {
			System.out.println(pd.priceTag());
		}
		
		sc.close();
	}

}
