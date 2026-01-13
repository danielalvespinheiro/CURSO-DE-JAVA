package AULA153_exercicio.boa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import AULA153_exercicio.boa.model.Reservation;
import AULA153_exercicio.boa.model.exception.DomainException;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.print("Room Number: ");
			int roomNumber = sc.nextInt();
			System.out.print("Check-in date (dd/MM/yyyy): ");
			Date dateCheckIn = sdf.parse(sc.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			Date dateCheckOut = sdf.parse(sc.next());
			Reservation reserv = new Reservation(roomNumber, dateCheckIn, dateCheckOut);
			System.out.println("Reservation: " + reserv);
			
			System.out.println();
			System.out.println("Enter data to update the reservation: ");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			dateCheckIn = sdf.parse(sc.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			dateCheckOut = sdf.parse(sc.next());
			
			reserv.updateDates(dateCheckIn, dateCheckOut);
			System.out.println("Reservation: " + reserv);
				
			// Com o DomainException sendo Runtime já não é necessário tratar as exception, porém o programa vai quebrar
		} catch (ParseException e) {
			System.out.println("Invald date format: " + e);
		} catch (DomainException e) {
			System.out.println("Erro in reservation: " + e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Unexpected error ");
		}
			
		
		sc.close();

	}

}
