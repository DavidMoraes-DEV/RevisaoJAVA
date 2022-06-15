package RevisaoConceitoJAVA.ClassesAbstratas.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import RevisaoConceitoJAVA.ClassesAbstratas.entities.Account;
import RevisaoConceitoJAVA.ClassesAbstratas.entities.BusinessAccount;
import RevisaoConceitoJAVA.ClassesAbstratas.entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		//Se declarado na classe que ela � ABSTRACT n�o ser� poss�vel INSTANCIAR objetos do tipo dessa classe apenas subclasses herdadas dessa classe.
		//VAI DAR ERRO SE INSTANCIAR: Account account1 = new Account(1001, "Alex", 1000.00);
		
		System.out.printf("------------------------------------------------------------------------------%n");
		Account account2 = new SavingsAccount(1002, "Maria", 1000.00, 0.01);
		
		System.out.printf("* DADOS DA CONTA:%n");
		System.out.println(account2);
		account2.withdraw(200.0); 
		System.out.printf("%n* CONTA DO TIPO: SAVINGS ACCOUNT(Saque -> Sem TAXAS):%n  - SAQUE DE R$ 200.00%n");
		System.out.printf("  - SALDO ATUALIZADO: $ %.2f", account2.getBalance());
		
		System.out.printf("%n------------------------------------------------------------------------------%n");
		Account account3 = new BusinessAccount(1003, "Junior", 1000.00, 500.00); 
		
		System.out.printf("* DADOS DA CONTA:%n");
		System.out.println(account3);
		account3.withdraw(200.0); 
		System.out.printf("%n* CONTA DO TIPO: BUSINESS ACCOUNT(Saque -> TAXA PADR�O + R$ 2.00):%n  - SAQUE DE R$ 200.00%n"); 
		System.out.printf("  - SALDO ATUALIZADO: $ %.2f", account3.getBalance());
		
		System.out.printf("%n------------------------------------------------------------------------------%n");
		
		List<Account> accounts = new ArrayList<>();
		accounts.add(account2);
		accounts.add(account3);
		
		//Totalizar o saldo de todas as contas.
		System.out.printf("%n* SALDO TOTAL DE TODAS AS CONTAS: ");
		Double sum = 0.0;
		for(Account acc : accounts) {
			sum += acc.getBalance();
		}
		
		System.out.printf("$ %.2f%n", sum);
		
		//Depositar $10.00 em todas as contas.
		System.out.printf("%n* DEP�SITO DE ($10.00) EM TODAS AS CONTAS, INDEPENDENTE DO TIPO DA SUBCLASSE:%n");
		for(Account acc : accounts) {
			acc.deposit(10.00);
			
			System.out.printf("  - CONTA: %d, SALDO ATUAL: $ %.2f%n", acc.getNumber(), acc.getBalance());
		}
		
	}
}
/*
* CLASSES ABSTRATAS:
	- S�o classes que n�o podem ser instanciadas
	- � uma forma de garantir heran�a total: Somente subclasses n�o abstratas podem ser instanciadas, mas nunca a super classe abstratas

* EXEMPLO
	- Suponha que em um neg�cio relacionado a banco, apenas contas poupan�a(Savings Account) e contas para empresas (BusinessAccount) s�o permitidas.
	- N�O existindo a modalidade conta comum (Account)
	- Para garantir que contas comuns n�o possam ser instanciadas, basta acrescentarmos a palavra "abstract" na declara��o da classe.

* QUESTIONAMENTO IMPORTANTE:
	- Se a classe Account n�o pode ser instanciada, por que simplesmente n�o criar somente SavingsAccount e BusinessAccount?
		* RESPOSTA:
			- REUSO de c�digo.
			- POLIMORFISMO: A superclasse(classe gen�rica) ACCOUNT nos permite tratar de forma f�cil e uniforme todos os tipos de conta, inclusive
			com polimorfismo se for o caso. Por exemplo, voc� pode colocar todos os tipos de contas em uma mesma cole��o.

* DEMO: Suponha que voc� queira:
	- Totalizar o saldo de todas as contas.
	- Depositar $10.00 em todas as contas.
*/