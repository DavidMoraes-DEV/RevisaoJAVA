package RevisaoConceitoJAVA.ExerciciosFixacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05LogicaBasica {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite o cód da peça 01: ");
		int idPeca1 = sc.nextInt();
		System.out.printf("Digite a quantidade: ");
		int qtdPeca = sc.nextInt();
		System.out.printf("Digite o valor unitário: ");
		double valorUnd = sc.nextDouble();
		
		double aPagarPeca1 = qtdPeca * valorUnd;
		
		System.out.printf("%nDigite o cód da peça 02: ");
		int idPeca2 = sc.nextInt();
		System.out.printf("Digite a quantidade: ");
		qtdPeca = sc.nextInt();
		System.out.printf("Digite o valor unitário: ");
		valorUnd = sc.nextDouble();
		
		double aPagarPeca2 = qtdPeca * valorUnd;
		
		double totalPg = aPagarPeca1 + aPagarPeca2;
		
		System.out.printf("Cód das peças 01 e 02: %d e %d", idPeca1, idPeca2);
		System.out.printf("%nVALOR A PAGAR: %.2f", totalPg);
		
		sc.close();
	}

}
/*
	Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

EXEMPLOS:

ENTRADA:
12 1 5.30
16 2 5.10

SAÍDA:
VALOR A PAGAR: R$ 15.50
*/