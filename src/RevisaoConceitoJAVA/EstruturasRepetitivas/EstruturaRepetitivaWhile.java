package RevisaoConceitoJAVA.EstruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaRepetitivaWhile {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int n = sc.nextInt();
		
		int soma = 0;
		
		while(n!=0) {
			soma += n;
			System.out.println("Digite um número: ");
			n = sc.nextInt();
		}

		System.out.printf("Soma dos números: %d", soma);
		
		sc.close();
	}

}
/*
	- ESTRUTURA REPETITIVA "ENQUANTO"
	É uma estrutura de controle que repete um bloco de comandos enquanto uma condição for verdadeira.
		QUANDO USAR: Quando NÃO se sabe previamente a quantidade de repetições que será realizada.

	Problema exemplo: Criar um programa para ler números inteiros até que seja digitado 0.
	Quando for digitado o zero mostrar a soma dos numeros digitados.
*/