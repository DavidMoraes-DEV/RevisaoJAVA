package RevisaoConceitoJAVA.ClassesAbstratas.entities;

//Classe abstrata para n�o ser poss�vel instanciar objetos do tipo ACCOUNT apenas as subclasses de Account (BusinessAccount, SavingsAccount)
public abstract class Account {

	//Atributos
	private Integer number;
	private String holder;
	protected Double balance;
	
	//Construtor
	public Account (Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}
	
	//M�todos GETTERS e SETTERS
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
	
	//OPERA��ES
	public void withdraw(Double amount) {
		balance -= amount + 5.0;
	}
	
	public void deposit(Double amount) {
		balance += amount;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("  - Conta N�: ");
		sb.append(number + "\n");
		sb.append("  - Titular: ");
		sb.append(holder + "\n");
		sb.append("  - SALDO ATUALIZADO: ");
		sb.append(String.format("%.2f", balance));
		
		return sb.toString();
	}
}
