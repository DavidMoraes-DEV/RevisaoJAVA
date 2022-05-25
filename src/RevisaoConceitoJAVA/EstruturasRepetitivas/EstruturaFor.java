package RevisaoConceitoJAVA.EstruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaFor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantos n�meros ser�o adicionados na soma? ");
		int n1 = sc.nextInt();
		
		int soma = 0;
		System.out.println("Digite os n�meros:");
		for(int i=0; i<n1; i++) {
			int n2 = sc.nextInt();
			soma += n2;
		}
		
		System.out.printf("Resultado: %d", soma);
		
		sc.close();
	}

}
/*
 Estrutura FOR: � uma estrutura de controle que repete um bloco de comandos para um certo intervalo de valores.
 QUANDO USAR: Quando se sabe previamente a quantidade de repeti��es, ou intervalo de valores.
 
 PROBLEMA EXEMPLO: Fazer um programa que l� um valor inteiro N e depois N n�meros inteiros. Ao final, mostra a
 soma dos N n�meros lidos.
 
 ENTRADA: 3, 5, 2, 4
 
 SA�DA: 11
 
 */