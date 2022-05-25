package RevisaoConceitoJAVA.EstruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaDoWhile {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char resp;
		do{
			System.out.printf("Digite a temperatura em Celsius: ");
			double TempC = sc.nextDouble();
			
			double conversorF = (TempC*9)/5 + 32;
			System.out.printf("Equivalente em Fahrenheit: %.2f%n", conversorF);
			
			System.out.printf("%nDeseja repetir (s/n)? ");
			resp = sc.next().charAt(0);
		} while (resp == 's');
		
		sc.close();
	}

}
/*
Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente em Fahrenheit.
Perguntar se o usário deseja repetir (s/n). Caso o usuário digite "s", repetir o programa.

Fórmula: F = 9C/5 + 32

EXEMPLO:

Digite a temperatura em Celsius: 30.0
Equivalente em Fahrenheit: 86.0
Deseja repetir (s/n)? s

Digite a temperatura em Celsius: 21.0
Equivalente em Fahrenheit: 69.8
Deseja repetir (s/n)? s

Digite a temperatura em Celsius: -10.5
Equivalente em Fahrenheit: 13.1
Deseja repetir (s/n)? n
*/