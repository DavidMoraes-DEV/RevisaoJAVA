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
* EXERC�CIO:
- Uma empresa possui funcion�rios pr�prios e terceirizados. Para cada funcion�rio, deseja-se registrar nome, horas trabalhadas e valor por hora.
Funcion�rios terceirizados possuem ainda uma despesa adicional.
- O pagamento dos funcion�rios corresponde ao valor da hora multiplicado pelas horas trabalhadas, sendo que os funcion�rios terceirizados ainda recebem um b�nus
correspondente a 110% de sua despesa adicional.
- Fazer um programa para ler os dados de N funcion�rios (N fornecido pelo usu�rio) e armazen�-los em uma lista. Depois de ler todos os dados, mostrar nome e pagamento
de cada funcion�rio na mesma ordem em que foram digitados.

EXEMPLOS DE ENTRADA E SA�DA DE DADOS:

Enter the number of employee: 3			(Digite a quantidade de funcionarios que ser�o cadastrados?)

Employee #1 data:						(Dados do Funcion�rio #1:)
Outsourced (y/n)? n						(� terceirizado (Sim/N�o) ?)
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