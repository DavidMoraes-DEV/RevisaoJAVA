package RevisaoProgOrientadaObjetos.ExerciciosFixacaoProgOrientObjetos;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFuncionario {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.println("CADASTRO DE FUNCION�RIO:");
		System.out.printf("%nNome: ");
		funcionario.nome = sc.nextLine();
		
		System.out.print("Salario Bruto: ");
		funcionario.salarioBruto = sc.nextDouble();
		
		System.out.print("Imposto: ");
		funcionario.imposto = sc.nextDouble();
		
		System.out.printf("%nFuncion�rio cadastrado: ");
		System.out.println(funcionario);
		
		System.out.printf("%nDigite a porcentagem do aumento salarial: ");
		funcionario.aumentoSalario(sc.nextDouble());

		System.out.printf("Novo Sal�rio l�quido do funcionario: " + funcionario);
		sc.close();
	}

}
/*
EXERCICIO: Fazer um programa para ler os dados de um funcion�rio (nome, sal�rio bruto e importo).
Em seguida, mostrar os dados do funcion�rio (nome, salario l�quido)
Em seguida, aumentar o sal�rio do funcion�rio com base em uma porcentagem dada (somente o sal�rio bruto � afetado)
mostrar novamente os dados do funcion�rio.
DIAGRAMA UML BASE:

Funcionario
-------------------------
Nome : string
SalarioBruto : double
Imposto : double
-------------------------
SalarioLiquido() : double
AumentoSalario(porcentagem : double) : void
*/