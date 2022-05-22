package RevisaoConceitoJAVA.ExerciciosFixacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05LogicaBasica {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite o c�d da pe�a 01: ");
		int idPeca1 = sc.nextInt();
		System.out.printf("Digite a quantidade: ");
		int qtdPeca = sc.nextInt();
		System.out.printf("Digite o valor unit�rio: ");
		double valorUnd = sc.nextDouble();
		
		double aPagarPeca1 = qtdPeca * valorUnd;
		
		System.out.printf("%nDigite o c�d da pe�a 02: ");
		int idPeca2 = sc.nextInt();
		System.out.printf("Digite a quantidade: ");
		qtdPeca = sc.nextInt();
		System.out.printf("Digite o valor unit�rio: ");
		valorUnd = sc.nextDouble();
		
		double aPagarPeca2 = qtdPeca * valorUnd;
		
		double totalPg = aPagarPeca1 + aPagarPeca2;
		
		System.out.printf("C�d das pe�as 01 e 02: %d e %d", idPeca1, idPeca2);
		System.out.printf("%nVALOR A PAGAR: %.2f", totalPg);
		
		sc.close();
	}

}
/*
	Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o valor unit�rio de cada pe�a 1, o
c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago.

EXEMPLOS:

ENTRADA:
12 1 5.30
16 2 5.10

SA�DA:
VALOR A PAGAR: R$ 15.50
*/