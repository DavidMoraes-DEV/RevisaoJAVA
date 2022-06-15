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
		
		//Se declarado na classe que ela é ABSTRACT não será possível INSTANCIAR objetos do tipo dessa classe apenas subclasses herdadas dessa classe.
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
		System.out.printf("%n* CONTA DO TIPO: BUSINESS ACCOUNT(Saque -> TAXA PADRÃO + R$ 2.00):%n  - SAQUE DE R$ 200.00%n"); 
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
		System.out.printf("%n* DEPÓSITO DE ($10.00) EM TODAS AS CONTAS, INDEPENDENTE DO TIPO DA SUBCLASSE:%n");
		for(Account acc : accounts) {
			acc.deposit(10.00);
			
			System.out.printf("  - CONTA: %d, SALDO ATUAL: $ %.2f%n", acc.getNumber(), acc.getBalance());
		}
		
	}
}
/*
* CLASSES ABSTRATAS:
	- São classes que não podem ser instanciadas
	- É uma forma de garantir herança total: Somente subclasses não abstratas podem ser instanciadas, mas nunca a super classe abstratas

* EXEMPLO
	- Suponha que em um negócio relacionado a banco, apenas contas poupança(Savings Account) e contas para empresas (BusinessAccount) são permitidas.
	- NÃO existindo a modalidade conta comum (Account)
	- Para garantir que contas comuns não possam ser instanciadas, basta acrescentarmos a palavra "abstract" na declaração da classe.

* QUESTIONAMENTO IMPORTANTE:
	- Se a classe Account não pode ser instanciada, por que simplesmente não criar somente SavingsAccount e BusinessAccount?
		* RESPOSTA:
			- REUSO de código.
			- POLIMORFISMO: A superclasse(classe genérica) ACCOUNT nos permite tratar de forma fácil e uniforme todos os tipos de conta, inclusive
			com polimorfismo se for o caso. Por exemplo, você pode colocar todos os tipos de contas em uma mesma coleção.

* DEMO: Suponha que você queira:
	- Totalizar o saldo de todas as contas.
	- Depositar $10.00 em todas as contas.
*/