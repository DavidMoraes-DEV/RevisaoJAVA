package RevisaoConceitoJAVA.ExerciciosFixacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04LogicaBasica {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite o n�mero ID do funcion�rio: ");
		int idFunc = sc.nextInt();
		
		System.out.printf("Digite a quantidade de horas trabalhadas: ");
		int hrsTrab = sc.nextInt();
		
		System.out.printf("Digite o valor recebido por hora: ");
		double valorHr = sc.nextDouble();
		
		double salario = hrsTrab * valorHr;
		
		System.out.printf("Numero: %d%nSalario: R$ %.2f", idFunc, salario);
	
		sc.close();
	}

}
/*
	Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, o valor que recebe por
hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas
decimais.

EXEMPLOS:
ENTRADAS:
25
100
5.50

SA�DAS:
NUMERO: 25
SAL�RIO: R$ 550.00
*/
