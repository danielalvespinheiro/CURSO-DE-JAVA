package AULAS_DE_HERANCA_POLIMORFISMO.aula135_EXERCICIO.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import AULAS_DE_HERANCA_POLIMORFISMO.aula135_EXERCICIO.entities.Employee;
import AULAS_DE_HERANCA_POLIMORFISMO.aula135_EXERCICIO.entities.OutsourcedEmployee;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> lsEmployee = new ArrayList<>();
		
		System.out.print("Enter the number of employee: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Employee #" + i + " data");
			
			System.out.print("Outsourced (y/n)? ");
			char res = sc.next().charAt(0);
			
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Hour: ");
			int hour = sc.nextInt();
			
			System.out.print("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			
			if(res == 'y') {
				System.out.print("Addictional charge: ");
				Double addictionalCharge = sc.nextDouble();
				
				lsEmployee.add(new OutsourcedEmployee(name, hour, valuePerHour, addictionalCharge));
			} else {
				lsEmployee.add(new Employee(name, hour, valuePerHour));
			}
		}
		
		System.out.println("");
		System.out.println("PAYMENTS: ");
		for(Employee emp: lsEmployee) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment() ));
		}
		
		sc.close();
	}
}