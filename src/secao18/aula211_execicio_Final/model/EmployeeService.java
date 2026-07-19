package secao18.aula211_execicio_Final.model;

import java.util.List;
import java.util.function.Predicate;

public class EmployeeService {
	
	public Double Sum(List<Employee> emp, Predicate<Employee> criteria) {
		double sum = 0.0;
		
		for(Employee e: emp) {
			if(criteria.test(e)) {
				sum += e.getSalary();
			}
		}
		
		return sum;
	}

}
