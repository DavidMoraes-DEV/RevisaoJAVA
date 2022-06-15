package RevisaoProgOrientadaObjetos.UpCastingDownCasting.entities;

public class SavingsAccount extends Account {

	private Double interestRate; //Taxa de juros
	
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
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "Taxa de Juros: " + interestRate;
	}
}
