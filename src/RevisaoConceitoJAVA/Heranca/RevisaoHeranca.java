package RevisaoConceitoJAVA.Heranca;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class RevisaoHeranca {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		System.out.printf("TIPOS DE CONTA%n%n01 CONTA COMUM(PF):%n- N�O possui cr�dito Pr�-Aprovado%n%n02 CONTA EMPRESARIAL(PJ):"
				+ "%n- Cr�dito pr�-aprovado de: 10000.00%n%nCadastrar Conta do tipo 1 ou 2? ");
		int tipoConta = sc.nextInt();
		
		System.out.printf("%nFORMUL�RIO DE CADASTRO:");
		Random numberGeneratorAccount = new Random();
		int numberAccount = numberGeneratorAccount.nextInt(9999);
		System.out.printf("%n%nN�mero da conta: %d%n", numberAccount);
		
		System.out.print("Titular: ");
		sc.nextLine();
		String holderAccount = sc.nextLine();
		
		System.out.printf("%nDeposito inicial? (S/N): ");
		char posicao = sc.next().charAt(0);
		
		
		if(tipoConta == 1) {
			Account account = new Account(numberAccount, holderAccount);
			
			if(posicao == 'S') {
				System.out.printf("%nDep�sito Inicial: R$ ");
				account.deposit(sc.nextDouble());	
			}
			System.out.printf("%nCONTA COMUM REGISTRADA COM SUCESSO: %n");
			System.out.println(account.toString());
			
		} else {
			BusinessAccount account = new BusinessAccount(numberAccount, holderAccount, 10000.0);
			
			if(posicao == 'S') {
				System.out.printf("%nDep�sito Inicial: R$ ");
				account.deposit(sc.nextDouble());
			}
			
			System.out.printf("%nCONTA EMPRESARIAL REGISTRADA COM SUCESSO: %n");
			System.out.println(account.toString());
		}
		
		
		
		
		
		
		sc.close();
	}
}
/*
* HERAN�A:
	- � um tipo de associa��o que permite que uma classe herde TODOS dados e comportamentos de outra classe
	- PERMITE o reuso de atributos e m�todos (dados e comportamento)
	- Incluir na classe que esta herdando da outra classe apenas os atributos e m�todos que n�o possui a classe original

* VANTAGENS:
	- Reuso
	- Polimorfismo

* SINTAXE
	- Class A extends B (Significa que a classe A vai herdar tudo o que a classe B possui

* DEFINI��ES IMPORTANTES:
	- Rela��o "�-um" -> No PROBLEMA EXEMPLO ABAIXO: A Conta Empresarial(Business Account) � UMA Conta (Account), por�m com algumas coisas a mais.
	- Generaliza��o/especializa��o -> No PROBLEMA EXEMPLO ABAIXO: A classe Account � uma GENERALIZA��O e a classe BusinessAccount � uma especializa��o.
	- Superclasse (classe base) / subclasse (classe derivada) -> No PROBLEMA EXEMPLO ABAIXO: Account � a Superclasse(CLASSE BASE) e BusinessAccount � a Subclasse(CLASSE DERIVADA)
	- Heran�a / extens�o -> No PROBLEMA EXEMPLO ABAIXO: A classe BusinessAccount extende a classe Account, ou seja, BusinessAccount tem tudo que Account possui, por�m acrescente funcionalidades a mais espec�fica para si.
	- Heran�a � uma associa��o entre classes (e n�o entre objetos) -> Se diferencia de composi��o que cria dois objetos. No caso da heran�a cria apenas um objeto contendo todas as funcionalidades da classe BASE e DERIVADA se o objeto criado for do tipo da classe DERIVADA.



PROBLEMA EXEMPLO: Suponha um neg�cio de banco que possui uma conta comum e uma conta para empresas,
sendo que a conta para empresa possui todos membros da conta comum, mais um limite de empr�stimo e
uma opera��o de realizar empr�stimo.


Account
--------------------------------
number : Integer
holder : String
balance : Double
--------------------------------
withdraw(amount : Double) : void
deposit(amount : Double) : void

----------------------------------------------

BusinessAccount
----------------------------
loanLimit : Double
----------------------------
loan(amount : Double) : void
*/