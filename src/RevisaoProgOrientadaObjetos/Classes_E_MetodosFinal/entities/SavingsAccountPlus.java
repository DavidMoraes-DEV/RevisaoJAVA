package RevisaoProgOrientadaObjetos.Classes_E_MetodosFinal.entities;

//Define que n�o ser� poss�vel fazer outra varia��o da classe SavingsAccountPlus que j� � uma varia��o da classe SavingsAccount que vem da classe Account(evitar esse tipo de problama��o pois abre brechas para inconsistencia e falhas)
public final class SavingsAccountPlus extends SavingsAccount{

	public SavingsAccountPlus(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance, interestRate);
		// TODO Auto-generated constructor stub
	}
	
	//Podemos definir tamb�m m�todos como FINAL para evitar que um m�todo da super classe seja sobreposto na subclasse igual nesse exemplo abaixo que na superclasse SavingsAccount foi definido o m�todo withdraw como FINAL ent�o aqui na subclasse apresentar� um erro se tentar sobrescrever o m�todo.
	/*@Override
	public void withdraw (Double amount) {
		balance -= amount + 2.0;
	}*/
}
