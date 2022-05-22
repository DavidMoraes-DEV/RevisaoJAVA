package RevisaoConceitoJAVA.ExerciciosFixacao;

import java.util.Scanner;

public class Exercicio01LogicaBasica {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois números: ");
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		
		double soma = n1+n2;
		double subtracao = n1-n2;
		double multiplicacao = n1*n2;
		double divisao = n1/n2;
		double raizQuadrada1 = Math.sqrt(n1);
		double raizQuadrada2 = Math.sqrt(n2);
		double potencia = Math.pow(n1, n2);
		double n3 = -12.345;
		double valorAbsoluto = Math.abs(n3);
		
		System.out.printf("%nSOMA entre %.2f e %.2f = %.2f", n1, n2, soma);
		System.out.printf("%nSUBTRACAO entre %.2f e %.2f = %.2f", n1, n2, subtracao);
		System.out.printf("%nMULTIPLICACAO entre %.2f e %.2f = %.2f", n1, n2, multiplicacao);
		System.out.printf("%nDIVISÃO entre %.2f e %.2f = %.2f", n1, n2, divisao);
		System.out.printf("%nRaiz Quadrada de %.2f = %.2f", n1, raizQuadrada1);
		System.out.printf("%nRaiz Quadrada de %.2f = %.2f", n2, raizQuadrada2);
		System.out.printf("%nPOTENCIA de %.2f e %.2f = %.2f", n1, n2, potencia);
		System.out.printf("%nVALOR ABSOLUTO de %.2f = %.2f", n3, valorAbsoluto);
		
		sc.close();
	}

}
/*
Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.

Exemplo:

ENTRADAS:
10
30

SAÍDAS:
SOMA = 40
*/