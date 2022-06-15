package RevisaoProgOrientadaObjetos.ProblemasExemplo.ProblemaFuncionarioComLista;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioFuncionarioComLista {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos funcionários serão cadastrados? ");
		int nFuncionario = sc.nextInt();
		
		List<Funcionario> listaFuncionarios = new ArrayList<>();
		
		for(int i=0; i<nFuncionario; i++) {
			System.out.printf("%nFuncionário #%d:", i+1);
			System.out.printf("%nId: ");
			int idFuncionario = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine();
			String nomeFuncionario = sc.nextLine();
			System.out.print("Salário: ");
			double salarioFuncionario = sc.nextDouble();
			
			Funcionario funcionario = new Funcionario(idFuncionario, nomeFuncionario, salarioFuncionario);
			listaFuncionarios.add(funcionario);
		}
		
		System.out.printf("%nInforme o ID do funcionário que terá aumento de salário:");
		int idFuncionarioAumento = sc.nextInt();
		
		Funcionario funcionario = listaFuncionarios.stream().filter(x -> x.getId() == idFuncionarioAumento).findFirst().orElse(null);
			if(funcionario == null) {
				System.out.println("Esse ID não existe!!!");
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
EXERCICIO: Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de N funcionários. Não deve haver repetição de id.
Em seguida, efetuar o aumento de X por cento no saário de um determinado funcionário.
Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários, conforme exemplos.
Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa ser mudado livremente. Um salário só pode ser aumentado com base em uma operação de aumento por porcentagem dada.

Quantos funcionários serão registrados? 3

Funcionário #1:
Id: 333
Nome: Maria Brown
Salary: 4000.00

Funcionário #2:
Id: 536
Nome: Alex Grey
Salary: 3000.00

Funcionário #3:
Id: 772
Nome: Bob Green
Salary: 5000.00

Informe o ID do funcionário que terá aumento de salário: 536
Digite o valor de aumento(%): 10.0

Lista de funcionários:
333, Maria Brown, 4000.00
536, Alex Grey, 3300.00
772, Bob Green, 5000.00

*/