package RevisaoConceitoJAVA.EstruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaRepetitivaWhile {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		int n = sc.nextInt();
		
		int soma = 0;
		
		while(n!=0) {
			soma += n;
			System.out.println("Digite um n�mero: ");
			n = sc.nextInt();
		}

		System.out.printf("Soma dos n�meros: %d", soma);
		
		sc.close();
	}

}
/*
	- ESTRUTURA REPETITIVA "ENQUANTO"
	� uma estrutura de controle que repete um bloco de comandos enquanto uma condi��o for verdadeira.
		QUANDO USAR: Quando N�O se sabe previamente a quantidade de repeti��es que ser� realizada.

	Problema exemplo: Criar um programa para ler n�meros inteiros at� que seja digitado 0.
	Quando for digitado o zero mostrar a soma dos numeros digitados.
*/