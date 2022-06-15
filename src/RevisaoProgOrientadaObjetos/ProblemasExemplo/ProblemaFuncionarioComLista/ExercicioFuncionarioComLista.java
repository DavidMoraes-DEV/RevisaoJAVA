package RevisaoProgOrientadaObjetos.ProblemasExemplo.ProblemaFuncionarioComLista;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioFuncionarioComLista {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos funcion�rios ser�o cadastrados? ");
		int nFuncionario = sc.nextInt();
		
		List<Funcionario> listaFuncionarios = new ArrayList<>();
		
		for(int i=0; i<nFuncionario; i++) {
			System.out.printf("%nFuncion�rio #%d:", i+1);
			System.out.printf("%nId: ");
			int idFuncionario = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine();
			String nomeFuncionario = sc.nextLine();
			System.out.print("Sal�rio: ");
			double salarioFuncionario = sc.nextDouble();
			
			Funcionario funcionario = new Funcionario(idFuncionario, nomeFuncionario, salarioFuncionario);
			listaFuncionarios.add(funcionario);
		}
		
		System.out.printf("%nInforme o ID do funcion�rio que ter� aumento de sal�rio:");
		int idFuncionarioAumento = sc.nextInt();
		
		Funcionario funcionario = listaFuncionarios.stream().filter(x -> x.getId() == idFuncionarioAumento).findFirst().orElse(null);
			if(funcionario == null) {
				System.out.println("Esse ID n�o existe!!!");
			}else {
				System.out.print("Digite o valor de aumento(%): ");
				double valorPercAumento = sc.nextDouble();
				funcionario.aumentoSalario(valorPercAumento);
			}
		
		for(Funcionario obj : listaFuncionarios) {
			System.out.println(obj);
		}
		
		sc.close();
	}
}
/*
EXERCICIO: Fazer um programa para ler um n�mero inteiro N e depois os dados (id, nome e salario) de N funcion�rios. N�o deve haver repeti��o de id.
Em seguida, efetuar o aumento de X por cento no sa�rio de um determinado funcion�rio.
Para isso, o programa deve ler um id e o valor X. Se o id informado n�o existir, mostrar uma mensagem e abortar a opera��o. Ao final, mostrar a listagem atualizada dos funcion�rios, conforme exemplos.
Lembre-se de aplicar a t�cnica de encapsulamento para n�o permitir que o sal�rio possa ser mudado livremente. Um sal�rio s� pode ser aumentado com base em uma opera��o de aumento por porcentagem dada.

Quantos funcion�rios ser�o registrados? 3

Funcion�rio #1:
Id: 333
Nome: Maria Brown
Salary: 4000.00

Funcion�rio #2:
Id: 536
Nome: Alex Grey
Salary: 3000.00

Funcion�rio #3:
Id: 772
Nome: Bob Green
Salary: 5000.00

Informe o ID do funcion�rio que ter� aumento de sal�rio: 536
Digite o valor de aumento(%): 10.0

Lista de funcion�rios:
333, Maria Brown, 4000.00
536, Alex Grey, 3300.00
772, Bob Green, 5000.00

*/