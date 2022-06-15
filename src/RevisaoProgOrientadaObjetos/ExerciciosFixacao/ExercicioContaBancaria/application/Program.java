package RevisaoProgOrientadaObjetos.ExerciciosFixacao.ExercicioContaBancaria.application;

import java.util.Locale;
import java.util.Scanner;

import RevisaoProgOrientadaObjetos.ExerciciosFixacao.ExercicioContaBancaria.entities.Account;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("CADASTRO DE CONTA BANCÁRIA");
		System.out.print("Número da conta: ");
		int numConta = sc.nextInt();
		
		System.out.print("Nome do Titular: ");
		sc.nextLine(); //Limpeza de buffer por conta da entrada "ENTER" anterior pendente na memória.
		String Titular = sc.nextLine();
		
		Account account = new Account(numConta, Titular);
		
		System.out.printf("Haverá deposito inicial (s/n)?: ");
		char descisao = sc.next().charAt(0);
		if(descisao == 's') {
			System.out.printf("Insira o valor de depósito: ");
			double depInicial = sc.nextDouble();
			account.deposito(depInicial);
		}
		
		System.out.printf("%nCONTA CADASTRADA:%n");
		System.out.println(account);
		
		System.out.printf("%nDepósito: ");
		account.deposito(sc.nextDouble());
		
		System.out.printf("%nDADOS DA CONTA ATUALIZADOS:%n");
		System.out.println(account);
		
		System.out.printf("%nSaque: ");
		account.saque(sc.nextDouble());
		
		System.out.printf("%nDADOS DA CONTA ATUALIZADOS:%n");
		System.out.println(account);
		
		sc.close();
	}
}
/*
 Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do
titular da conta, e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito
inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua
conta, o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero.
Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já
o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por
exemplo).
Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger
isso. O saldo só aumenta por meio de depósitos, e só diminui por meio de saques. Para cada saque
realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo não for
suficiente para realizar o saque e/ou pagar a taxa.
Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não
informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre
mostrando os dados da conta após cada operação. 

Digite o número da conta: 8532
Digite o titular da conta: Alex Green
Existe um depósito inicial (s/n)? y
Insira o valor do depósito inicial: 500,00

Dados da conta:
Conta 8532, Titular: Alex Green, Saldo: $ 500,00

Insira um valor de depósito: 200,00
Dados da conta atualizados:
Conta 8532, Titular: Alex Green, Saldo: $ 700,00

Insira um valor de retirada: 300,00
Dados da conta atualizados:
Conta 8532, Titular: Alex Green, Saldo: $ 395,00

*/