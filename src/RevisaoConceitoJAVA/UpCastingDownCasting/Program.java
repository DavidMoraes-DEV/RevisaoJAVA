package RevisaoConceitoJAVA.UpCastingDownCasting;

import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		//***********TEORIA SOBRE UPCASTING E DOWNCASTING***********
		
		//EXEMPLOS PARA APLICAR UPCASTING E DOWNCASTING:
		Account acc1 = new Account(1001, "Alex", 0.0);
		acc1.getBalance();
		BusinessAccount bacc1 = new BusinessAccount(1011, "Maria", 0.0, 500.00);		
		
		//UPCASTING -> Atribui um objeto por exemplo do tipo BusinessAccount � um Account tamb�m. Isso n�o da erro porque Account nesse exemplo � a superclasse e businessAccount � a subclasse.
		Account acc2 = bacc1;
		acc2.getHolder();
		Account acc3 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc4 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		//DOWNCASTING -> Processo inverso. Vai pegar a super classe e atribuir a uma subclasse. Da erro de incompatibilidade de tipos se fizer da mesma forma que o upcasting
		//MODO ERRADO: Se fizer igual a forma do UPCASTING dara erro conforme esse exemplo
		//BusinessAccount bcca1 = acc1;
		//MODO CORRETO: Ser� necess�rio fazer um casting manual conforme abaixo:
		BusinessAccount bacc2 = (BusinessAccount)acc3;
		bacc2.loan(500.00);
		//Embora esse c�digo n�o apresente erro imediato o erro apenas ser� identificado quando o programa for executado. Pois embora a vari�vel � do tipo Account, foi instanciado como SavingsAccount e isso o compilador apenas identifica no momento da execu��o. Gera a excess�o ClassCastException
		// DA ERRO: BusinessAccount bcca3 = (BusinessAccount)acc4; 
		
		//Para evitar o erro acima no momento da execu��o � necess�rio testar o tipo antes, utilizando o instanceOf()
		if(acc4 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc4;
			acc5.loan(200.00);
			System.out.println("Loan");
		} else if (acc4 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc4;
			acc5.updateBalance();
			System.out.println("Update");
		}
	}
}
/*
* UPCASTING:
	- Casting da subclasse para a superclasse
	- Uso comum: Polimorfismo
	
* DOWNCASTING:
	- Casting da superclasse para subclasse
	- Palavra instanceof
	- Uso comum: M�todos que recebem par�metros gen�ricos (Ex: Equals)
*/