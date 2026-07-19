package secao18.aula_210_ATV_FEITO;

public class Products {
	private String name;
	private double price;
	
	public Products() {}
	
	public Products(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public static double avgPrice(double avg) {
		return avg;
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
	
}
