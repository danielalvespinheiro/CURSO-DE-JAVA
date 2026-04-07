package aula183_exercicio.sevice;

public class USAInterestService implements InterestRate{
	private double interestRate;
	
	public USAInterestService(double interestRate) {
		this.interestRate = interestRate;
	}
	
	@Override
	public double getInterestRate() {
		return interestRate;
	}
}
