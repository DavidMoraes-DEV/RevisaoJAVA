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

		int maiorN = max(a, b, c); //Chama a função max para a função executar a lógica para descobrir qual o numero maior entre as 3 variáveis
		
		retornaResult(maiorN); //Chama a função retornaResult para executar a lógica para imprimir na tela.
		
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
		
		System.out.printf("%nO maior número eh: %d", value);	
	}
}
/*
FUNÇÕES: Representa um processamento que possui significado

Exemplo: Math.sqrt(double) -> Função que realiza o calculo matemático de rais quadrada

PRINCIPAIS VANTAGENS: Modularização, delegação e reaproveitamento

DADOS DE ENTRADA E SAÍDA:
- Funções podem receber dados de entrada (parâmetro ou argumentos)
- Funções podem ou não retornar uma saída

Em orientação a objetos, funções em classes recebem o nome "métodos".
*/