package util;

public class DollarConverter {

	public static double converter(double priceDolar, double amountDolar) {
		double dollar = amountDolar * priceDolar;
		double withTax = amountDolar * priceDolar * 6 / 100;
		return dollar + withTax;
	}
	
}
