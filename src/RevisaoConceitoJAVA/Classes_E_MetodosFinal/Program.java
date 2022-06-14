package RevisaoConceitoJAVA.Classes_E_MetodosFinal;

import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Account account1 = new Account(1001, "Alex", 1000.00);
		
		System.out.printf("Conta do tipo: ACCOUNT%n");
		System.out.printf("%n- DADOS DA CONTA:%n");
		System.out.println(account1);
		
		Account account2 = new SavingsAccount(1002, "Maria", 1000.00, 0.05);
		
		System.out.printf("%nConta do tipo: SAVINGS ACCOUNT%n");
		System.out.printf("%n- DADOS DA CONTA:%n");
		System.out.println(account2);
		
		Account account3 = new SavingsAccount(1003, "Jos�", 1000.00, 0.01);
		
		System.out.printf("%nConta do tipo: SAVINGS ACCOUNT PLUS%n");
		System.out.printf("%n- DADOS DA CONTA:%n");
		System.out.println(account3);
		
		Account account4 = new BusinessAccount(1004, "Junior", 1000.00, 500.00); 
		
		System.out.printf("%nConta do tipo: BUSINESS ACCOUNT%n"); 
		System.out.printf("%n- DADOS DA CONTA:%n");
		System.out.println(account4);
		
	}
}
/*
* CLASSE FINAL: Nesse exemplo ser� a classe (SavingsAccountPlus) que ser� definida como FINAL
	- Objetivo: Impedir a cria��o de subclasses de SavingsAccountPlus que j� � subclasse de SavingAccount que � subclasse da classe base Account.

* Pra que?
	- SEGURAN�A: Dependendo das regras do neg�cio, �s vezes � desej�vel garantir que uma classe n�o seja herdada, ou que um m�todo n�o seja sobreposto.
		- Geralmente conv�m acrescentar FINAL em m�todos sobrepostos, pois sobreposi��es m�ltiplas podem ser uma porta de entrada para inconsist�ncias
	
	- PERFORMANCE: Atributos de tipo de uma classe final s�o analisados de forma mais r�pida em tempo de execu��o.
		- Exemplo cl�ssico: A classe String que � definida como FINAL 
	
*/