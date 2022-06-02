package RevisaoProgOrientadaObjetos.ExerciciosFixacaoProgOrientObjetos;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFuncionario {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.println("CADASTRO DE FUNCIONÁRIO:");
		System.out.printf("%nNome: ");
		funcionario.nome = sc.nextLine();
		
		System.out.print("Salario Bruto: ");
		funcionario.salarioBruto = sc.nextDouble();
		
		System.out.print("Imposto: ");
		funcionario.imposto = sc.nextDouble();
		
		System.out.printf("%nFuncionário cadastrado: ");
		System.out.println(funcionario);
		
		System.out.printf("%nDigite a porcentagem do aumento salarial: ");
		funcionario.aumentoSalario(sc.nextDouble());

		System.out.printf("Novo Salário líquido do funcionario: " + funcionario);
		sc.close();
	}

}
/*
EXERCICIO: Fazer um programa para ler os dados de um funcionário (nome, salário bruto e importo).
Em seguida, mostrar os dados do funcionário (nome, salario líquido)
Em seguida, aumentar o salário do funcionário com base em uma porcentagem dada (somente o salário bruto é afetado)
mostrar novamente os dados do funcionário.
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