package RevisaoProgOrientadaObjetos.Polimorfismo.application;

import java.util.Locale;

import RevisaoProgOrientadaObjetos.Polimorfismo.entities.Account;
import RevisaoProgOrientadaObjetos.Polimorfismo.entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Account account1 = new Account(1001, "Alex", 1000.00);
		account1.withdraw(200.0);
		
		System.out.printf("Conta do tipo: ACCOUNT(Saque -> TAXA PADRÃO = R$ 5.00):%nSALDO INICIAL: 1000.00%nSaque de R$ 200.00%n");
		System.out.printf("%n- DADOS ATUALIZADOS DA CONTA:%n");
		System.out.println(account1);
		
		Account account2 = new SavingsAccount(1002, "Maria", 1000.00, 0.01); //POLIMORFISMO
		account2.withdraw(200.0); //VariáveL do mesmo TIPO ACCOUNT da variável ACCOUNT1, porém apontando para um tipo diferente: SAVINGSACCOUNT
		
		System.out.printf("%nConta do tipo: SAVINGS ACCOUNT(Saque -> Sem TAXAS):%nSALDO INICIAL: 1000.00%nSaque de R$ 200.00%n");
		System.out.printf("%n- DADOS ATUALIZADOS DA CONTA:%n");
		System.out.println(account2);
		
	}
}
/*
* POLIMORFISMO: 
	- Em programação Orientada a Objetos, polimorfismo é um recurso que permite que variáveis de um mesmo tipo mais genérico possam
	apontar para objetos de tipos específicos diferentes, tendo assim comportamentos diferentes conforme cada tipo específico.
	
	- Pegando os exemplo das classes account desse exemplo o objeto ACCOUNT1 e ACCOUNT2 embora seja do mesmo tipo ACCOUNT
		- Account1 foi instanciado um objeto do tipo Account
		- Account2 foi instanciado um  objeto do tipo SavingsAccount
		- Então embora sejam do mesmo tipo apontam para objetos de tipos diferentes tendo comportamentos diferentes pois
		a implementação da método WITHDRAW foi programadas com um comportamento diferentes específicas para cada tipo.
		
* IMPORTANTE INTENDER:
	- A associação do tipo específico com o tipo genérico é feita em tempo de execução (upcasting)
	- O compilador não sabe para qual tipo específico a chamada do método withdraw está sendo feita (compilador apenas sabe que são duas variáveis tipo Account)

*/