package RevisaoProgOrientadaObjetos.Classes_E_MetodosFinal.entities;

//Utilizando a palavra FINAL no método, ela não deixará por exemplo criar uma outra classe derivada da classe (SavingsAccount) como por exemplo (SavingsAccountPLUS) SE RETIRAR a palavra o erro na classe sumirá por aí será permitido
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
	
	//Podemos definir também métodos como FINAL para...(continua a explicação na subclasse)
	@Override 
	public final void withdraw(Double amount) {
		balance -= amount;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\nTaxa de Juros padrão para EMPRÉSTIMO: " + String.format("%.0f", interestRate*100) + "%";
	}
}
