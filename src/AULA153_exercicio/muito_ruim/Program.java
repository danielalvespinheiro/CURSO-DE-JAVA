package AULA153_exercicio.muito_ruim;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import AULA153_exercicio.model.entities.Reservation;

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
		Reservation reserv = new Reservation(roomNumber, dateCheckIn, dateCheckOut);
		System.out.println("Reservation: " + reserv);
		
		
		
		System.out.println();
		System.out.println("Enter data to update the reservation: ");
		System.out.print("Check-in date (dd/MM/yyyy): ");
		dateCheckIn = sdf.parse(sc.next());
		System.out.print("Check-out date (dd/MM/yyyy): ");
		dateCheckOut = sdf.parse(sc.next());
		
		Date now = new Date();
		if(dateCheckIn.before(now) || dateCheckOut.before(now)) {
			System.out.println("Error in reservation: Reservation dates for update must be future dates ");
			
		} else if(!dateCheckOut.after(dateCheckIn)) {
			System.out.println("Error in reservation: Check-out date must be after check-in date ");
		
		} else {
			reserv.updateDates(dateCheckIn, dateCheckOut);
			System.out.println("Reservation: " + reserv);
		}
			
		
		sc.close();
	}
	
}
