package RevisaoConceitoJAVA.EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class OperadorAtribuicaoCumulativa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite a quantidade de minutos gastos: ");
		int minutos = sc.nextInt();
		
		double valorPG = 50.00;
		
		if (minutos > 100) {
			valorPG += (minutos-100)*2.0;
			System.out.printf("Valor a pagar eh: R$ %.2f", valorPG);
		} else {
			System.out.printf("Valor a pagar eh: R$ %.2f", valorPG);
		}	
		
		sc.close();
	}
}
/*
EXEMPLOS DE OPERADORES DE ATRIBUI��O CUMULATIVA:
a += b;  � igual a Express�o:  a = a+b;
a -= b;  � igual a Express�o:  a = a-b;
a *= b;  � igual a Express�o:  a = a*b;
a /= b;  � igual a Express�o:  a = a/b;
a %= b;  � igual a Express�o:  a = a%b;

  ****Situa��o b�sica que precisa de uma atribui��o de acumula��o:
  - Uma operadora de telefonia cobra R$ 50.00 por um plano b�sico que d� direito a 100 minutos de telefone.
  Cada minuto que exceder a franquia de 100 minutos custa R$ 2.00. Fazer um programa para ler a quantidade
  de minutos que uma pessoa consumiu, da� mostrar o valor a ser pago.

EXEMPLO:
ENTRADA: 22
SA�DA: Valor a pagar: R$50.00
 
ENTRADA: 103
SA�DA: Valor a pagar: R$ 56.00 
 */
 