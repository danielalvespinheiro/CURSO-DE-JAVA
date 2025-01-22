package AULA_82_EXERCICIO.model;

public class Titular {

	public int numberAcount;
	public String acountHolder; //titular = dono da conta;
	public double balance;
	
	public Titular() {
		
	}
	
	public Titular(int numberAcount, String acountHolder, double balance) {
		this.numberAcount = numberAcount;
		this.acountHolder = acountHolder;
		this.balance = balance;
	}
	
	public int getNumberAcount() {
		return numberAcount;
	}

	public String getAcountHolder() {
		return acountHolder;
	}

	public void setAcountHolder(String acountHolder) {
		this.acountHolder = acountHolder;
	}

	public double getBalance() {
		return balance;
	}
	
}
