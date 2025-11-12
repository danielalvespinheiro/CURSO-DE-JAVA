package aula_123.src;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import aula_123.entities.Department;
import aula_123.entities.HourContract;
import aula_123.entities.Worker;
import aula_123.enums.WorkerLevel;

public class Main {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		//SimpleDateFormat sdfToIcome = new SimpleDateFormat("MM/yyyy");
		//Calendar cal = Calendar.getInstance();
		
		System.out.print("Enter a department's name: ");
		String departName = sc.nextLine();
		
		System.out.println("Enter a worker data: ");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		
		System.out.print("Base salary: ");
		double workerSalary = sc.nextDouble();
		
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel.toUpperCase()), 
								   workerSalary, new Department(departName));
		
		System.out.print("Whou many contracts to this worker? ");
		int quantiWorkers = sc.nextInt();
		
		for (int i = 0; i<quantiWorkers; i++) {
			System.out.print("Enter contract #" + (1+i) + " data");
			
			System.out.print("Date (DD/MM/YYYY): ");
			Date dateParse = sdf.parse(sc.next());
			
			System.out.print("Value per hour: ");
			Double valuehour = sc.nextDouble();
			
			System.out.print("Duration (hour): ");
			Integer duration = sc.nextInt();
			
			System.out.println();
			
			HourContract hourContract = new HourContract(dateParse, valuehour, duration);
			worker.addContract(hourContract);
		}
		
		System.out.print("Enter a month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		Integer month = Integer.parseInt(monthAndYear.substring(0, 2));
		Integer year = Integer.parseInt(monthAndYear.substring(3));

		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
		
		sc.close();
	}

}
