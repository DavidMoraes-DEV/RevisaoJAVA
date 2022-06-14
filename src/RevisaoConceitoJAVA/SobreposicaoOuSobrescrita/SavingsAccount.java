package RevisaoConceitoJAVA.SobreposicaoOuSobrescrita;

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
	
	//SOBREPOSI��O DO M�TODO WITHDRAW ORIGINALMENTE DECLARADO NA CLASSE ACCOUNT:
	//� bom colocar o anota��o para avisar o compilador que � uma sobreposi��o e se caso por exemplo escrever WITHDRAW de forma errado o compilador ao procurar na classe original e n�o achar vai mostrar um erro avisando que n�o existe esse m�todo na classe original
	@Override 
	public void withdraw(Double amount) {
		balance -= amount; //RETIRA A TAXA DE 5 REAIS PARA REALIZAR O SAQUE NA CONTA DO TIPO POUPAN�A (SAVINGS ACCOUNT)
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "Taxa de Juros: " + interestRate;
	}
}
