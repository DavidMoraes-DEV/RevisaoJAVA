package RevisaoConceitoJAVA;

import java.util.Locale;
import java.util.Scanner;

public class RevisaoMatrizes {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas linhas ter� a matriz? ");
		int qtdLinhas = sc.nextInt();
		
		System.out.print("Quantas colunas ter� a matriz? ");
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
			System.out.println("Matriz n�o possui Diagonal Principal!!!");
		}
		
		System.out.printf("%nQuantidade de N�meros negativos na Matriz: ");
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
MATRIZES: Em programa��o, "MATRIZ" � o nome dado a arranjos bidimensionais (Aten��o: VETOR de vetores)

* Arranjo (Array) � uma estrutura de dados:
	- Homog�nea (dados do mesmo tipo)
	- Ordenada (elemento acessados por meio de posi��es)
	- Alocada de uma vez s�, em um bloco cont�guo de mem�ria
	
* Vantagens:
	- Acesso imediato aos elementos pela sua posi��o
  
* Desvantagens:
	- Tamanho fixo
  	- Dificuldade para se realizar inser��es e dele��es 	
  	
PROBLEMA EXEMPLO: Fazer um programa para ler um n�mero inteiro N e uma matriz de ordem N contendo n�meros inteiros.
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