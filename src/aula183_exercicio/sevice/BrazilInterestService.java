package aula183_exercicio.sevice;

public class BrazilInterestService implements InterestRate{
	private double interestRate;
	
	public BrazilInterestService(double interestRate) {
		this.interestRate = interestRate;
	}
	
	@Override
	public double getInterestRate() {
		return interestRate;
	}
}
