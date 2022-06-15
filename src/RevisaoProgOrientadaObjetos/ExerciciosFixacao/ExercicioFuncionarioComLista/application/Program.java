package RevisaoProgOrientadaObjetos.ExerciciosFixacao.ExercicioFuncionarioComLista.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import RevisaoProgOrientadaObjetos.ExerciciosFixacao.ExercicioFuncionarioComLista.entities.Employee;
import RevisaoProgOrientadaObjetos.ExerciciosFixacao.ExercicioFuncionarioComLista.entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of employees: ");
		int qtdEmployees = sc.nextInt();
		
		List<Employee> employees = new ArrayList<>();
		
		for(int i=0; i<qtdEmployees; i++) {
			System.out.printf("%nEmployee #%d data:", i+1);
			System.out.printf("%nOutsourced (y/n)? ");
			char descisao = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String employeeName = sc.nextLine();
			
			System.out.print("Hours: ");
			Integer employeeHours = sc.nextInt();
			
			System.out.print("Value Per Hours: ");
			Double employeeValuePerHours = sc.nextDouble();
			
			if(descisao == 'y') {
				System.out.print("Additional charge: ");
				Double employeeAdditionalCharge = sc.nextDouble();
				employees.add(new OutsourcedEmployee(employeeName, employeeHours, employeeValuePerHours, employeeAdditionalCharge));
				
			} else if(descisao == 'n') {
				employees.add(new Employee(employeeName, employeeHours, employeeValuePerHours));
			
			}	
		}
		
		System.out.printf("%nPAYMENTS:%n%n");
		for(Employee emp : employees) {
			System.out.println(emp);
		}

		sc.close();
	}
}
/*
* EXERCÍCIO:
- Uma empresa possui funcionários próprios e terceirizados. Para cada funcionário, deseja-se registrar nome, horas trabalhadas e valor por hora.
Funcionários terceirizados possuem ainda uma despesa adicional.
- O pagamento dos funcionários corresponde ao valor da hora multiplicado pelas horas trabalhadas, sendo que os funcionários terceirizados ainda recebem um bônus
correspondente a 110% de sua despesa adicional.
- Fazer um programa para ler os dados de N funcionários (N fornecido pelo usuário) e armazená-los em uma lista. Depois de ler todos os dados, mostrar nome e pagamento
de cada funcionário na mesma ordem em que foram digitados.

EXEMPLOS DE ENTRADA E SAÍDA DE DADOS:

Enter the number of employee: 3			(Digite a quantidade de funcionarios que serão cadastrados?)

Employee #1 data:						(Dados do Funcionário #1:)
Outsourced (y/n)? n						(É terceirizado (Sim/Não) ?)
Name: Alex								(Nome:)
Hours: 50								(Horas:)
Value Per Hours: 20.00					(Valor por horas:)

Employee #2 data:
Outsourced (y/n)? y
Name: Bob
Hours: 100
Value Per Hours: 15.00
Additional charge: 200.00

Employee #3 data:
Outsourced (y/n)? n
Name: Maria
Hours: 60
Value Per Hours: 20.00

PAYMENTS:								(Pagamentos:)
Alex - $ 1000.00
Bob - $ 1720.00
Maria - $ 1200.00
*/