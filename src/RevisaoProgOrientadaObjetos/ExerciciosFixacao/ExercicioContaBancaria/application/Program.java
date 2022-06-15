package RevisaoProgOrientadaObjetos.ExerciciosFixacao.ExercicioContaBancaria.application;

import java.util.Locale;
import java.util.Scanner;

import RevisaoProgOrientadaObjetos.ExerciciosFixacao.ExercicioContaBancaria.entities.Account;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("CADASTRO DE CONTA BANC�RIA");
		System.out.print("N�mero da conta: ");
		int numConta = sc.nextInt();
		
		System.out.print("Nome do Titular: ");
		sc.nextLine(); //Limpeza de buffer por conta da entrada "ENTER" anterior pendente na mem�ria.
		String Titular = sc.nextLine();
		
		Account account = new Account(numConta, Titular);
		
		System.out.printf("Haver� deposito inicial (s/n)?: ");
		char descisao = sc.next().charAt(0);
		if(descisao == 's') {
			System.out.printf("Insira o valor de dep�sito: ");
			double depInicial = sc.nextDouble();
			account.deposito(depInicial);
		}
		
		System.out.printf("%nCONTA CADASTRADA:%n");
		System.out.println(account);
		
		System.out.printf("%nDep�sito: ");
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
 Em um banco, para se cadastrar uma conta banc�ria, � necess�rio informar o n�mero da conta, o nome do
titular da conta, e o valor de dep�sito inicial que o titular depositou ao abrir a conta. Este valor de dep�sito
inicial, entretanto, � opcional, ou seja: se o titular n�o tiver dinheiro a depositar no momento de abrir sua
conta, o dep�sito inicial n�o ser� feito e o saldo inicial da conta ser�, naturalmente, zero.
Importante: uma vez que uma conta banc�ria foi aberta, o n�mero da conta nunca poder� ser alterado. J�
o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasi�o de casamento, por
exemplo).
Por fim, o saldo da conta n�o pode ser alterado livremente. � preciso haver um mecanismo para proteger
isso. O saldo s� aumenta por meio de dep�sitos, e s� diminui por meio de saques. Para cada saque
realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo n�o for
suficiente para realizar o saque e/ou pagar a taxa.
Voc� deve fazer um programa que realize o cadastro de uma conta, dando op��o para que seja ou n�o
informado o valor de dep�sito inicial. Em seguida, realizar um dep�sito e depois um saque, sempre
mostrando os dados da conta ap�s cada opera��o. 

Digite o n�mero da conta: 8532
Digite o titular da conta: Alex Green
Existe um dep�sito inicial (s/n)? y
Insira o valor do dep�sito inicial: 500,00

Dados da conta:
Conta 8532, Titular: Alex Green, Saldo: $ 500,00

Insira um valor de dep�sito: 200,00
Dados da conta atualizados:
Conta 8532, Titular: Alex Green, Saldo: $ 700,00

Insira um valor de retirada: 300,00
Dados da conta atualizados:
Conta 8532, Titular: Alex Green, Saldo: $ 395,00

*/