package RevisaoConceitoJAVA;

import java.util.Locale;
import java.util.Scanner;

public class ConceitoBasicoDeFuncoes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int maiorN = max(a, b, c); //Chama a fun��o max para a fun��o executar a l�gica para descobrir qual o numero maior entre as 3 vari�veis
		
		retornaResult(maiorN); //Chama a fun��o retornaResult para executar a l�gica para imprimir na tela.
		
		sc.close();
	}

	public static int max(int x, int y, int z) {

		int maior;
		
		if (x > y && x > z) {
			maior = x;
		} else if(y > z) {
			maior = y;
		}else {
			maior = z;
		}
		
		return maior;
	}
	
	public static void retornaResult(int value) {
		
		System.out.printf("%nO maior n�mero eh: %d", value);	
	}
}
/*
FUN��ES: Representa um processamento que possui significado

Exemplo: Math.sqrt(double) -> Fun��o que realiza o calculo matem�tico de rais quadrada

PRINCIPAIS VANTAGENS: Modulariza��o, delega��o e reaproveitamento

DADOS DE ENTRADA E SA�DA:
- Fun��es podem receber dados de entrada (par�metro ou argumentos)
- Fun��es podem ou n�o retornar uma sa�da

Em orienta��o a objetos, fun��es em classes recebem o nome "m�todos".
*/