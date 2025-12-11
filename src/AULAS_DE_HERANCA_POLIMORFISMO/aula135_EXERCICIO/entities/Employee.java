package AULAS_DE_HERANCA_POLIMORFISMO.aula135_EXERCICIO.entities;

public class Employee {
	private String name;
	private Integer hour;
	private Double ValuesPerHour;
	
	
	public Employee() {}
	
	public Employee(String name, Integer hour, Double valuesPerHour) {
		this.name = name;
		this.hour = hour;
		ValuesPerHour = valuesPerHour;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getHour() {
		return hour;
	}
	public void setHour(Integer hour) {
		this.hour = hour;
	}
	public Double getValuesPerHour() {
		return ValuesPerHour;
	}
	public void setValuesPerHour(Double valuesPerHour) {
		ValuesPerHour = valuesPerHour;
	}
	
	public double payment() {
		return hour * ValuesPerHour;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
