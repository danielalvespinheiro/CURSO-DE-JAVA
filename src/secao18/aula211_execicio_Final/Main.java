package secao18.aula211_execicio_Final;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;
import secao18.aula211_execicio_Final.model.Employee;
import secao18.aula211_execicio_Final.model.EmployeeService;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> emp = new ArrayList<Employee>();
		EmployeeService empService = new EmployeeService();
		
		String path = "C:\\in\\p.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			
			while(line != null) {
				String[] division = line.split(",");
				emp.add(new Employee(division[0], division[1], Double.parseDouble(division[2])));
				
				line = br.readLine();
			}
			
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		System.out.print("Enter salary: ");
		double salary = sc.nextDouble();
		
		List<String> sala = emp.stream()
				.filter(e -> e.getSalary() >= salary)
				.map(e -> e.getEmail())
				.sorted()
				.collect(Collectors.toList());
		
		for(String s: sala) {
			System.out.println(s);
		}
		
		System.out.print("Sum of salary of people whose name starts with 'M': ");
		
		double sum = empService.Sum(emp, v -> v.getName().charAt(0) == 'M');
		
		System.out.printf("%.2f", sum);
		
		sc.close();
	}

}
