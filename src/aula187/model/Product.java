package aula187.model;

public class Product implements Comparable<Product>{
	private String name;
	private Float price;
	
	public Product(String name, Float price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public Float getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return name + " | " + String.format("%.2f", price);
	}

	@Override
	public int compareTo(Product other) {
		return price.compareTo(other.price);
	}
	
}
