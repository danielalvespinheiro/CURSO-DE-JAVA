package Aula182_exercicio;

public class Funcionario182 implements Comparable<Funcionario182>{
	
	private String name;
	private Double salary;
	
	public Funcionario182(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Funcionario182 other) {
//		Com o - na frente ele faz de forma decrescente: return -salary.compareTo(other.getSalary());
		return salary.compareTo(other.getSalary());
	}
	
}
