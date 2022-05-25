package RevisaoConceitoJAVA.EstruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaFor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantos números serão adicionados na soma? ");
		int n1 = sc.nextInt();
		
		int soma = 0;
		System.out.println("Digite os números:");
		for(int i=0; i<n1; i++) {
			int n2 = sc.nextInt();
			soma += n2;
		}
		
		System.out.printf("Resultado: %d", soma);
		
		sc.close();
	}

}
/*
 Estrutura FOR: É uma estrutura de controle que repete um bloco de comandos para um certo intervalo de valores.
 QUANDO USAR: Quando se sabe previamente a quantidade de repetições, ou intervalo de valores.
 
 PROBLEMA EXEMPLO: Fazer um programa que lê um valor inteiro N e depois N números inteiros. Ao final, mostra a
 soma dos N números lidos.
 
 ENTRADA: 3, 5, 2, 4
 
 SAÍDA: 11
 
 */