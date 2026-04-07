package Aula173.model.service;

public class BrazilTaxService implements TaxService{
	
	@Override
	public double Tax(double amount) {
		if (amount <= 100.0) {
			return amount * 0.2;
		}
		else {
			return amount * 0.15;
		}
	}
}
