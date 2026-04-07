package Aula173.aplication;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import Aula173.model.entities.CarRental;
import Aula173.model.entities.Vehicle;
import Aula173.model.service.BrazilTaxService;
import Aula173.model.service.RentalService;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Entre com os dados do aluguel: ");
		System.out.print("Modelo do carro: ");
		String carModel = sc.nextLine();
		
		System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
		LocalDateTime startData = LocalDateTime.parse(sc.nextLine(), dtf);
		
		System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
		LocalDateTime finishData = LocalDateTime.parse(sc.nextLine(), dtf);
		
		CarRental cr = new CarRental(startData, finishData, new Vehicle(carModel));
		
		System.out.print("Entre com o preço por hora: ");
		Double pricePerHour = sc.nextDouble();

		System.out.print("Entre com o preço por dia: ");
		Double pricePerDay = sc.nextDouble();
		
		RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
		
		rentalService.ProcessInvoice(cr);
		
		System.out.println("FATURA: ");
		System.out.println("Pagamento Basico: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
		System.out.println("Imposto: " + String.format("%.2f", cr.getInvoice().getTax()));;
		System.out.println("Pagamento total: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));
		
		sc.close();
	}

}
