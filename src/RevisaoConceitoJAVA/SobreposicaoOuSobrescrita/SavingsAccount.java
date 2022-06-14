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
	
	//SOBREPOSIÇÃO DO MÉTODO WITHDRAW ORIGINALMENTE DECLARADO NA CLASSE ACCOUNT:
	//É bom colocar o anotação para avisar o compilador que é uma sobreposição e se caso por exemplo escrever WITHDRAW de forma errado o compilador ao procurar na classe original e não achar vai mostrar um erro avisando que não existe esse método na classe original
	@Override 
	public void withdraw(Double amount) {
		balance -= amount; //RETIRA A TAXA DE 5 REAIS PARA REALIZAR O SAQUE NA CONTA DO TIPO POUPANÇA (SAVINGS ACCOUNT)
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "Taxa de Juros: " + interestRate;
	}
}
