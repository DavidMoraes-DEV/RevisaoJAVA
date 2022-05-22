package RevisaoConceitoJAVA.ExerciciosFixacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03LogicaBasica {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite 4 valores inteiros: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		
		int diferenca = n1*n2 - n3*n4;
		
		System.out.printf("A diferença = %d", diferenca);
		
		sc.close();
	}

}
/*
  Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

EXEMPLOS:

ENTRADAS: 5, 6, 7, 8
SAÍDAS: -26

ENTRADAS: 5, 6, -7, 8
SAÍDAS: 86
*/
