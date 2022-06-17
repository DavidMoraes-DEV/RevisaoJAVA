package RevisaoProgOrientadaObjetos.ExerciciosFixacao.ExercicioAccount.model.entities;

import RevisaoProgOrientadaObjetos.ExerciciosFixacao.ExercicioAccount.model.exceptions.DomainException;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withDrawLimit;
	
	public Account(Integer number, String holder, Double balance, Double withDrawLimit) {

		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withDrawLimit = withDrawLimit;
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

	public Double getWithDrawLimit() {
		return withDrawLimit;
	}

	public void setWithDrawLimit(Double withDrawLimit) {
		this.withDrawLimit = withDrawLimit;
	}
	
	public void deposit(Double amount) {
		balance += amount;
	}
	
	public void withdraw(Double amount) {
		
		if(balance == 0.0 || amount > balance) {
			throw new DomainException("Not enough balance");
		}
		if (amount > withDrawLimit) {
			throw new DomainException("The amount exceeds withdraw limit");
		}
		
		balance -= amount;
	}
	
}
