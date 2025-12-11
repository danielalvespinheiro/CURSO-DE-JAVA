package AULAS_DE_HERANCA_POLIMORFISMO.aula141_EXERCICIO.entities;

public class ImportedProduct extends Product{
	
	private Double customFeed;

	public ImportedProduct() {}
	
	public ImportedProduct(String name, Double price, Double customFeed) {
		super(name, price);
		this.customFeed = customFeed;
	}
	
	@Override
	public String priceTag() {
		// TODO Auto-generated method stub
		return getName() + " $ " + totalPrice();
	}
	
	public Double totalPrice() {
		return getPrice() + customFeed;
	}

	public Double getCustomFeed() {
		return customFeed;
	}

	public void setCustomFeed(Double customFeed) {
		this.customFeed = customFeed;
	}
	
}
