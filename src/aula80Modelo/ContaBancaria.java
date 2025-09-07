package aula80Modelo;

public class ContaBancaria {
	int numberAcount;
	float balance; 
	String nome;

	public ContaBancaria(int numberAcount, String nome) {
		this.numberAcount = numberAcount;
		this.nome = nome;
	}

	public ContaBancaria(int numberAcount, float initialBalance, String nome) {
		this.numberAcount = numberAcount;
		deposito(initialBalance);
		this.nome = nome;
	}

	public ContaBancaria() {
		// TODO Auto-generated constructor stub
	}
	
	public void deposito(float valor) {
		balance += valor;
	}
	
	public void sacar(float valor) {
		balance -= valor + 5;
	}

	public int getNumberAcount() {
		return numberAcount;
	}
	

	public float getBalance() {
		return balance;
	}
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Número da conta: " + getNumberAcount() 
		+ ", Titular: " 
		+ getNome()
		+ ", Saldo: $" 
		+ String.format("%.2f", balance);
	}
}
