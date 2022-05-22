package RevisaoConceitoJAVA.ExerciciosFixacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02LogicaBasica {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double pi = 3.14159;
		
		System.out.printf("Digite o valor do Raio de um c�rculo: ");
		double raio = sc.nextDouble();
		
		double area = pi * (Math.pow(raio, 2));
		
		System.out.printf("A �rea desse c�rculo eh: %.4f", area);
		
		sc.close();
	}

}
/*
	Fa�a um programa para ler o valor do raio de um c�rculo, e depois mostrar o valor da �rea deste c�rculo com quatro
casas decimais conforme exemplos.

F�rmula da �rea: area = pi . raio�
Considere o valor de pi = 3.14159

EXEMPLOS:
ENTRADA: 2.00
SA�DA: 12.5664

ENTRADA: 100.64
SA�DA: 31819.3103

ENTRADA: 150.00
SA�DA: 70685.7750
*/