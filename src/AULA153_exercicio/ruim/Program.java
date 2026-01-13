package AULA153_exercicio.ruim;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Room Number: ");
		int roomNumber = sc.nextInt();
		
		System.out.print("Check-in date (dd/MM/yyyy): ");
		Date dateCheckIn = sdf.parse(sc.next());
	
		System.out.print("Check-out date (dd/MM/yyyy): ");
		Date dateCheckOut = sdf.parse(sc.next());
		
		if(!dateCheckOut.after(dateCheckIn)) {
			System.out.println("Error in reservation: Reservation dates for update must be future dates ");
			
		} else {
			Reservation reservation = new Reservation(roomNumber, dateCheckIn, dateCheckOut);
			System.out.println("Reservation: " + reservation);
			
			System.out.println();
			System.out.println("Enter data to update the reservation: ");
			
			System.out.print("Check-in date (dd/MM/yyyy): ");
			dateCheckIn = sdf.parse(sc.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			dateCheckOut = sdf.parse(sc.next());
			
			String error = reservation.updateDates(dateCheckIn, dateCheckOut);
			
			if(error != null) {
				System.out.println("Error in reservation: " + error);
			} else {
				System.out.println("Reservation: " + reservation);
			}
			
			
			
			
			
			
		}
		
		sc.close();
	}
	
}
