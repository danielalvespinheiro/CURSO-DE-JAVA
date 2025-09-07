package AULASDAUDEMI;

public class Product {
	private String name;
	private double price;
	private int qtd;
	
	public Product() {}
	
	public Product(String name, double price, int qtd) {
		this.name = name;
		this.price = price;
		this.qtd = qtd;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQtd() {
		return qtd;
	}
	
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
	// Exemplo 2
	public void metodo1() {
		Product p = metodo2(); // Aqui chamaos metodo2 com o retorno da instancia
		System.out.println(p.getName());
	}
	
	public Product metodo2() {
		Product prod = new Product("TV", 900.00, 0); // Aqui é feito a instancia e retordo de Prod
		return prod;
	}
}
