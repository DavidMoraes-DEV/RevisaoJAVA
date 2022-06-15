package RevisaoProgOrientadaObjetos.PalavraSuper.entities;

public class BusinessAccount extends Account {

	private Double loanLimit;

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}
	
	public Double getLoanLimit() {
		return loanLimit;
	}
	
	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(Double amount) {
		if(amount <= loanLimit) {
			balance += amount - 10.0;
		}
	}
	
	@Override
	public void withdraw(Double amount) {
		super.withdraw(amount); //Reutiliza o c�digo com a palavra super para utilizar o m�todo de saque da classe Account espec�ficando abaixo que na classe BusinessAccount ir� realizar ainda um desconto de R$ 2.00 no valor do SALDO(BALANCE) por SAQUE realizado nas contas do tipo BusinessAccount
		balance -= 2.0;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nLimite Empr�stimo: " + String.format("%.2f", loanLimit);
	}
}
