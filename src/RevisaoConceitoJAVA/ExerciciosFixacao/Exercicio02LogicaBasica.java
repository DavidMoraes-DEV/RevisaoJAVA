package RevisaoConceitoJAVA.ExerciciosFixacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02LogicaBasica {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double pi = 3.14159;
		
		System.out.printf("Digite o valor do Raio de um círculo: ");
		double raio = sc.nextDouble();
		
		double area = pi * (Math.pow(raio, 2));
		
		System.out.printf("A área desse círculo eh: %.4f", area);
		
		sc.close();
	}

}
/*
	Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.

Fórmula da área: area = pi . raio²
Considere o valor de pi = 3.14159

EXEMPLOS:
ENTRADA: 2.00
SAÍDA: 12.5664

ENTRADA: 100.64
SAÍDA: 31819.3103

ENTRADA: 150.00
SAÍDA: 70685.7750
*/