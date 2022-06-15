package RevisaoProgOrientadaObjetos.Polimorfismo.application;

import java.util.Locale;

import RevisaoProgOrientadaObjetos.Polimorfismo.entities.Account;
import RevisaoProgOrientadaObjetos.Polimorfismo.entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Account account1 = new Account(1001, "Alex", 1000.00);
		account1.withdraw(200.0);
		
		System.out.printf("Conta do tipo: ACCOUNT(Saque -> TAXA PADR�O = R$ 5.00):%nSALDO INICIAL: 1000.00%nSaque de R$ 200.00%n");
		System.out.printf("%n- DADOS ATUALIZADOS DA CONTA:%n");
		System.out.println(account1);
		
		Account account2 = new SavingsAccount(1002, "Maria", 1000.00, 0.01); //POLIMORFISMO
		account2.withdraw(200.0); //Vari�veL do mesmo TIPO ACCOUNT da vari�vel ACCOUNT1, por�m apontando para um tipo diferente: SAVINGSACCOUNT
		
		System.out.printf("%nConta do tipo: SAVINGS ACCOUNT(Saque -> Sem TAXAS):%nSALDO INICIAL: 1000.00%nSaque de R$ 200.00%n");
		System.out.printf("%n- DADOS ATUALIZADOS DA CONTA:%n");
		System.out.println(account2);
		
	}
}
/*
* POLIMORFISMO: 
	- Em programa��o Orientada a Objetos, polimorfismo � um recurso que permite que vari�veis de um mesmo tipo mais gen�rico possam
	apontar para objetos de tipos espec�ficos diferentes, tendo assim comportamentos diferentes conforme cada tipo espec�fico.
	
	- Pegando os exemplo das classes account desse exemplo o objeto ACCOUNT1 e ACCOUNT2 embora seja do mesmo tipo ACCOUNT
		- Account1 foi instanciado um objeto do tipo Account
		- Account2 foi instanciado um  objeto do tipo SavingsAccount
		- Ent�o embora sejam do mesmo tipo apontam para objetos de tipos diferentes tendo comportamentos diferentes pois
		a implementa��o da m�todo WITHDRAW foi programadas com um comportamento diferentes espec�ficas para cada tipo.
		
* IMPORTANTE INTENDER:
	- A associa��o do tipo espec�fico com o tipo gen�rico � feita em tempo de execu��o (upcasting)
	- O compilador n�o sabe para qual tipo espec�fico a chamada do m�todo withdraw est� sendo feita (compilador apenas sabe que s�o duas vari�veis tipo Account)

*/