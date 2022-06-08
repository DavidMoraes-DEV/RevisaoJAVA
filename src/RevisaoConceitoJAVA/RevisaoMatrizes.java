package RevisaoConceitoJAVA;

import java.util.Locale;
import java.util.Scanner;

public class RevisaoMatrizes {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas linhas terá a matriz? ");
		int qtdLinhas = sc.nextInt();
		
		System.out.print("Quantas colunas terá a matriz? ");
		int qtdColunas = sc.nextInt();
		
		int[][] matrizDeNumeros = new int[qtdLinhas][qtdColunas];
		
		for(int i=0; i<matrizDeNumeros.length; i++) {
			System.out.printf("Digite os valores da %d linha: %n", i+1);
			for(int j=0; j<matrizDeNumeros[0].length; j++) {
				matrizDeNumeros[i][j] = sc.nextInt();
			}
		}
		
		if(matrizDeNumeros.length == matrizDeNumeros[0].length) {
			System.out.print("Diagonal Principal da Matriz: ");
			for(int i=0; i<matrizDeNumeros.length; i++) {
				for(int j=0; j<matrizDeNumeros[0].length; j++) {
					if(i==j) {
						System.out.printf(matrizDeNumeros[i][j] + " ");
					}
				}
			}
		}else {
			System.out.println("Matriz não possui Diagonal Principal!!!");
		}
		
		System.out.printf("%nQuantidade de Números negativos na Matriz: ");
		int qtdNegativos = 0;
		for(int i=0; i<matrizDeNumeros.length; i++) {
			for(int j=0; j<matrizDeNumeros[0].length; j++) {
				if(matrizDeNumeros[i][j] < 0) {
					qtdNegativos++; 
				}
			}
		}
		System.out.print(qtdNegativos);
		
		sc.close();
	}

}
/*
MATRIZES: Em programação, "MATRIZ" é o nome dado a arranjos bidimensionais (Atenção: VETOR de vetores)

* Arranjo (Array) é uma estrutura de dados:
	- Homogênea (dados do mesmo tipo)
	- Ordenada (elemento acessados por meio de posições)
	- Alocada de uma vez só, em um bloco contíguo de memória
	
* Vantagens:
	- Acesso imediato aos elementos pela sua posição
  
* Desvantagens:
	- Tamanho fixo
  	- Dificuldade para se realizar inserções e deleções 	
  	
PROBLEMA EXEMPLO: Fazer um programa para ler um número inteiro N e uma matriz de ordem N contendo números inteiros.
Em seguida, mostrar a diagonal principal e a quantidade de valores negativos da matriz.

entradas:

3
5 -3 10
15 8  2
7 9 -4

Diagonal principal
5 8 -4
quantidade de Numeros negativos = 2
*/