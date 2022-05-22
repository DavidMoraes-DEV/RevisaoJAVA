package RevisaoConceitoJAVA.ExerciciosFixacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04LogicaBasica {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite o número ID do funcionário: ");
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
	Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.

EXEMPLOS:
ENTRADAS:
25
100
5.50

SAÍDAS:
NUMERO: 25
SALÁRIO: R$ 550.00
*/
