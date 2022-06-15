package RevisaoProgOrientadaObjetos.Classes_E_MetodosFinal.entities;

//Define que não será possível fazer outra variação da classe SavingsAccountPlus que já é uma variação da classe SavingsAccount que vem da classe Account(evitar esse tipo de problamação pois abre brechas para inconsistencia e falhas)
public final class SavingsAccountPlus extends SavingsAccount{

	public SavingsAccountPlus(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance, interestRate);
		// TODO Auto-generated constructor stub
	}
	
	//Podemos definir também métodos como FINAL para evitar que um método da super classe seja sobreposto na subclasse igual nesse exemplo abaixo que na superclasse SavingsAccount foi definido o método withdraw como FINAL então aqui na subclasse apresentará um erro se tentar sobrescrever o método.
	/*@Override
	public void withdraw (Double amount) {
		balance -= amount + 2.0;
	}*/
}
