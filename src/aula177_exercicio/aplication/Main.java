package aula177_exercicio.aplication;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
import aula177_exercicio.model.entities.Contract;
import aula177_exercicio.model.entities.Installment;
import aula177_exercicio.model.service.ContractService;
import aula177_exercicio.model.service.PaypalService;

public class Main {

	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre os dados do contrato:");
		System.out.print("Número: ");
		int numero = sc.nextInt();
		
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), fmt);
		System.out.print("Valor do contrato: ");
		Double totalValue = sc.nextDouble();
		
		Contract ct = new Contract(numero, date, totalValue);
		
		System.out.print("Entre com o número de parcelas: ");
		int n = sc.nextInt();
		
		ContractService contractService = new ContractService(new PaypalService());
		
		System.out.println("PARCELAS: ");
		contractService.processContract(ct, n);
		for(Installment in : ct.getInstallment()) {
			System.out.println(in);
		}
		
		sc.close();
	}
}
