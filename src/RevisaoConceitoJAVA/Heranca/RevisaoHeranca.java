package RevisaoConceitoJAVA.Heranca;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class RevisaoHeranca {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		System.out.printf("TIPOS DE CONTA%n%n01 CONTA COMUM(PF):%n- NÃO possui crédito Pré-Aprovado%n%n02 CONTA EMPRESARIAL(PJ):"
				+ "%n- Crédito pré-aprovado de: 10000.00%n%nCadastrar Conta do tipo 1 ou 2? ");
		int tipoConta = sc.nextInt();
		
		System.out.printf("%nFORMULÁRIO DE CADASTRO:");
		Random numberGeneratorAccount = new Random();
		int numberAccount = numberGeneratorAccount.nextInt(9999);
		System.out.printf("%n%nNúmero da conta: %d%n", numberAccount);
		
		System.out.print("Titular: ");
		sc.nextLine();
		String holderAccount = sc.nextLine();
		
		System.out.printf("%nDeposito inicial? (S/N): ");
		char posicao = sc.next().charAt(0);
		
		
		if(tipoConta == 1) {
			Account account = new Account(numberAccount, holderAccount);
			
			if(posicao == 'S') {
				System.out.printf("%nDepósito Inicial: R$ ");
				account.deposit(sc.nextDouble());	
			}
			System.out.printf("%nCONTA COMUM REGISTRADA COM SUCESSO: %n");
			System.out.println(account.toString());
			
		} else {
			BusinessAccount account = new BusinessAccount(numberAccount, holderAccount, 10000.0);
			
			if(posicao == 'S') {
				System.out.printf("%nDepósito Inicial: R$ ");
				account.deposit(sc.nextDouble());
			}
			
			System.out.printf("%nCONTA EMPRESARIAL REGISTRADA COM SUCESSO: %n");
			System.out.println(account.toString());
		}
		
		
		
		
		
		
		sc.close();
	}
}
/*
* HERANÇA:
	- É um tipo de associação que permite que uma classe herde TODOS dados e comportamentos de outra classe
	- PERMITE o reuso de atributos e métodos (dados e comportamento)
	- Incluir na classe que esta herdando da outra classe apenas os atributos e métodos que não possui a classe original

* VANTAGENS:
	- Reuso
	- Polimorfismo

* SINTAXE
	- Class A extends B (Significa que a classe A vai herdar tudo o que a classe B possui

* DEFINIÇÕES IMPORTANTES:
	- Relação "é-um" -> No PROBLEMA EXEMPLO ABAIXO: A Conta Empresarial(Business Account) É UMA Conta (Account), porém com algumas coisas a mais.
	- Generalização/especialização -> No PROBLEMA EXEMPLO ABAIXO: A classe Account é uma GENERALIZAÇÃO e a classe BusinessAccount é uma especialização.
	- Superclasse (classe base) / subclasse (classe derivada) -> No PROBLEMA EXEMPLO ABAIXO: Account é a Superclasse(CLASSE BASE) e BusinessAccount é a Subclasse(CLASSE DERIVADA)
	- Herança / extensão -> No PROBLEMA EXEMPLO ABAIXO: A classe BusinessAccount extende a classe Account, ou seja, BusinessAccount tem tudo que Account possui, porém acrescente funcionalidades a mais específica para si.
	- Herança é uma associação entre classes (e não entre objetos) -> Se diferencia de composição que cria dois objetos. No caso da herança cria apenas um objeto contendo todas as funcionalidades da classe BASE e DERIVADA se o objeto criado for do tipo da classe DERIVADA.



PROBLEMA EXEMPLO: Suponha um negócio de banco que possui uma conta comum e uma conta para empresas,
sendo que a conta para empresa possui todos membros da conta comum, mais um limite de empréstimo e
uma operação de realizar empréstimo.


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