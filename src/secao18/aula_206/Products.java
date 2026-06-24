package secao18.aula_206;

import java.util.Objects;

public class Products {
	
	private String name;
	private Double price;
	
	public Products(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Products other = (Products) obj;
		return Objects.equals(name, other.name) && Objects.equals(price, other.price);
	}


	public static String staticUperCaseName(Products p) {
		return p.getName().toUpperCase();
	}
	
	public String nonStaticUperCaseName() {
		return name.toUpperCase();
	}
	
	@Override
	public String toString() {
		return "Products [name=" + name + ", price=" + String.format("%.2f", price) + "]";
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
	
}
