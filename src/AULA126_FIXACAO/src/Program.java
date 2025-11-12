package AULA126_FIXACAO.src;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import AULA126_FIXACAO.entities.Client;
import AULA126_FIXACAO.entities.Order;
import AULA126_FIXACAO.entities.OrderItem;
import AULA126_FIXACAO.entities.Product;
import AULA126_FIXACAO.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		// Dados para a entidade cliente! 
		System.out.println("Enter a client data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		sc.next();
		String email = sc.nextLine();
		System.out.print("Birth data: ");
		Date birth = sdf.parse(sc.next());
		
		Client cl = new Client(name, email, birth);
		
		// Estatus da ordem!
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrderStatus orderStatus = OrderStatus.valueOf(sc.next().toUpperCase());
		
		Order order = new Order(new Date(), orderStatus, cl);
		
		System.out.print("Who many itens to this order? ");
		int n = sc.nextInt();
		for(int i = 0; i<n; i++){
			System.out.println("Enter " + (i+1) + " item data: ");
			System.out.print("Product name: ");
			String productName = sc.next();
			System.out.print("Product price: ");
			Double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int productQuantity = sc.nextInt();
			
			Product product = new Product(productName, productPrice);
			
			OrderItem orderItem = new OrderItem(productQuantity, productPrice, product);
			
			order.addItem(orderItem);
		}
		
		System.out.println();
		System.out.println("Order summary: ");
		System.out.println(order);
		
		sc.close();
	}

}
