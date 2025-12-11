package AULAS_DE_HERANCA_POLIMORFISMO.aula135_EXERCICIO.entities;

import java.util.List;

public class OutsourcedEmployee extends Employee{
	private Double addictionalCharge;

	public OutsourcedEmployee() {}

	public OutsourcedEmployee(String name, Integer hour, Double valuesPerHour, Double addictionalCharge) {
		super(name, hour, valuesPerHour);
		this.addictionalCharge = addictionalCharge;
	}

	public Double getAddictionalCharge() {
		return addictionalCharge;
	}

	public void setAddictionalCharge(Double addictionalCharge) {
		this.addictionalCharge = addictionalCharge;
	}
	
	@Override
	public double payment() {
		return super.payment() + addictionalCharge * 1.1;
	}
	
}
