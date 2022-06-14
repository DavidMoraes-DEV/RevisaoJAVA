package RevisaoConceitoJAVA.PalavraSuper;

public class SavingsAccount extends Account {

	private Double interestRate;
	
	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate; 
	}
	
	public Double getInterestRate() {
		return interestRate;
	}
	
	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	@Override 
	public void withdraw(Double amount) {
		balance -= amount;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\nTaxa de Juros padr�o para EMPR�STIMO: " + String.format("%.0f", interestRate*100) + "%";
	}
}
