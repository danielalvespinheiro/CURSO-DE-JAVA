package exercicio_aula168.model;

public class Product {
	private String name;
	private Double price;
	private int qtd;

	public Product() {}

	public Product(String name, Double price, int qtd) {
		super();
		this.name = name;
		this.price = price;
		this.qtd = qtd;
	}

	public double total() {
		return price * qtd;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
}
