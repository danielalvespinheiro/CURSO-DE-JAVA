package aula90_Produto;

public class Aula90_Produto {
	private String name;
	private double price;
	
	public Aula90_Produto(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public double getprice() {
		return price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
}
