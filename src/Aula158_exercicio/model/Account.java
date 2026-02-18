package Aula158_exercicio.model;

import Aula158_exercicio.model.exception.ErroWithDraw;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withDrawLimit;
	
	public Account() {}
	
	public Account(Integer number, String holder, Double balance, Double withDrawLimit) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withDrawLimit = withDrawLimit;
	}

	public void deposit(Double amount) {
		balance += amount;
	}
	
	public void withDraw(Double amount) {
		tryWithDraw(amount);
		balance -= amount;
	}
	
	public void tryWithDraw(Double amount) {
		if(amount > getWithDrawLimit()) {
			throw new ErroWithDraw("Erro ao sacar: o valor passado exede o limite de saque! ");
		}
		if(amount > getBalance()) {
			throw new ErroWithDraw("Erro ao sacar: saldo insuficiente! ");
		}
	}
	
	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getWithDrawLimit() {
		return withDrawLimit;
	}

	public void setWithDrawLimit(Double withDrawLimit) {
		this.withDrawLimit = withDrawLimit;
	}
	
//	@Override
//	public String toString() {
//		return "New balance: " + balance;
//	}
}
