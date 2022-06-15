package RevisaoProgOrientadaObjetos.Classes_E_MetodosFinal.entities;

//Utilizando a palavra FINAL no m�todo, ela n�o deixar� por exemplo criar uma outra classe derivada da classe (SavingsAccount) como por exemplo (SavingsAccountPLUS) SE RETIRAR a palavra o erro na classe sumir� por a� ser� permitido
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
	
	//Podemos definir tamb�m m�todos como FINAL para...(continua a explica��o na subclasse)
	@Override 
	public final void withdraw(Double amount) {
		balance -= amount;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\nTaxa de Juros padr�o para EMPR�STIMO: " + String.format("%.0f", interestRate*100) + "%";
	}
}
