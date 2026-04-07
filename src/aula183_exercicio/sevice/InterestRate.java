package aula183_exercicio.sevice;

public interface InterestRate {

	public double getInterestRate();
	
	default double payment(double amount, double months) {
		if(months <= 0) {
			System.out.println("O mês precisar ser igual a 1 ou maior! ");
		}
		return amount * Math.pow(1.00 + getInterestRate() / 100, months);
	}
}
