package RevisaoConceitoJAVA.EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaSwitchCase {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o n�mero correspondente ao dia da semana come�ando pelo Domingo(1) e terminando no S�bado(7): ");
		int nDia= sc.nextInt();
		
		String diaSemana;
		
		switch(nDia) {
		case 1:
			diaSemana = "Domingo";
			break;

		case 2:
			diaSemana = "Segunda-Feira";
			break;
			
		case 3:
			diaSemana = "Ter�a-Feira";
			break;
			
		case 4:
			diaSemana = "Quarta-feira";
			break;
			
		case 5:
			diaSemana = "Quinta-feira";
			break;
			
		case 6:
			diaSemana = "Sexta-feira";
			break;
			
		case 7:
			diaSemana = "S�bado";
			break;
		
		default:
			diaSemana = "Valor Inv�lido";
			break;
		}
		
		System.out.println(diaSemana);
		sc.close();
	}

}
/*
PREFERENCIALMENTE UTILIZADA QUANDO: Se tem v�rias op��es de fluxo a serem tratadas com base no valor de uma vari�vel,
ao inv�s de v�rias estruturas if-else encadeadas, alguns preferem utilizar a estrutura switch-case.

PROBLEMA EXEMPLO:
Fazer um programa para ler um valor inteiro de 1 a 7 representando um dia da semana (sendo 1=domingo, 2=segunda, e assim por diante).
Escrever na tela o dia da semana correspondente, conforme exemplos.

ENTRADA: 1
SA�DA: Dia da semana: DOMINGO

ENTRADA: 4
SA�DA: Dia da semana: QUARTA

ENTRADA: 9
SA�DA: Dia da semana: Valor Inv�lido
*/