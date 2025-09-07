package atvd100.model;

import java.util.Random;

public class Funcionario {
	private Integer id;
	private String name;
	private double salario;
	
	public Funcionario() {}
	
	public Funcionario(Integer id, String name, double salario) {
		this.id = id;
		this.name = name;
		this.salario = salario;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public Integer gerarId() {
		return new Random().nextInt(1000) + 100;
	}
	
	// Valor é em porcentagem
	public void aumento(double valor) {
		 salario += (salario * valor / 100.00);
	}
	
	@Override
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salario);
	}
	
}
