package RevisaoProgOrientadaObjetos.Composicao.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import RevisaoProgOrientadaObjetos.Composicao.entities.ContractPerHour;
import RevisaoProgOrientadaObjetos.Composicao.entities.Department;
import RevisaoProgOrientadaObjetos.Composicao.entities.Worker;
import RevisaoProgOrientadaObjetos.Composicao.entities.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		//PROGRAMA PRINCIPAL
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Digite o departamento: ");
		String nomeDepartamento = sc.nextLine();
		
		System.out.printf("%nDigite os dados do funcionario: ");
		System.out.printf("%nNome: ");
		String nomeTrab = sc.nextLine();
		
		System.out.print("N�vel: ");
		String nivelTrab = sc.nextLine();

		System.out.print("Salario base: ");
		Double salarioTrab = sc.nextDouble();
		
		Worker worker = new Worker(nomeTrab, WorkerLevel.valueOf(nivelTrab), salarioTrab, new Department(nomeDepartamento));
	
		System.out.printf("%nQuantos contratos para esse trabalhador: ");
		int qtdContratos = sc.nextInt();
	
		for(int i=0; i<qtdContratos; i++) {
			System.out.printf("%nDigite os dados do contrato #%d:%n", i+1);
			System.out.print("Dia (DD/MM/YYYY): ");
			Date dataContrato = sdf.parse(sc.next());
			
			System.out.print("Valor por hora: ");
			Double valorPorHora = sc.nextDouble();
			
			System.out.print("Quantidade de horas: ");
			int horas = sc.nextInt();
			
			ContractPerHour contrato = new ContractPerHour(dataContrato, valorPorHora, horas);
			
			worker.addContrato(contrato); //Associa o contrato com o trabalhador.
		}
		
		System.out.printf("%nDigite o mes e o ano para calcular o salario (MM/YYYY): ");
		String mesEano = sc.next();
		int mes = Integer.parseInt(mesEano.substring(0, 2));
		int ano = Integer.parseInt(mesEano.substring(3));
		
		System.out.printf("%n%nNome do trabalhador: %s", worker.getNome());
		System.out.printf("%nDepartamento: %s", worker.getDepartamento().getNome());
		System.out.printf("%nSalario para %s: ", mesEano);
		System.out.print(worker.rendaMes(mes, ano));
	
		sc.close();
	}
}
/*
* COMPOSI��O:
	- � um tipo de associa��o que permite que um pbjeto contenha outro
	- Rela��o "tem-um" ou "tem-v�rios"

* Vantagens:
	- ORGANIZA��O = Divis�o de responsabilidades
	- COES�O = Cada Objeto � respons�vel por uma �nica coisa, sendo simples e bem definida
	- FLEXIBILIDADE = Trabalhar com uma coisa divida em partes � mais flex�vel do que trabalhar alguma coisa muito grande ou mal dividida
	- REUSO = O mesmo objeto ser� reutilizado e mais de um lugar
	
* Nota: Embora o s�mbolo UML para composil��o (todo-parte) seja o diamante preto, neste contexto estamos chamando de composi��o qualquer associa��o tipo "tem-um" e "tem-v�rios".


* PROBLEMA EXEMPLO:
	- Ler os dados de um trabalhador com N contratos (N fornecido pelo usu�rio). Depois, solicitar do usu�rio um m�s e mostrar qual foi o sal�rio do funcion�rio nesse m�s, conforme exemplo:

Enter department's name: Design
Enter worker data:
Name: Alex
Level: MID_LEVEL
Base salary: 1200.00
How many contracts to this worker? 3
Enter contract #1 data:
Date (DD/MM/YYYY): 20/08/2018
Value per hour: 50.00
Duration (hours): 20
Enter contract #2 data:
Date (DD/MM/YYYY): 13/06/2018
Value per hour: 30.00
Duration (hours): 18
Enter contract #3 data:
Date (DD/MM/YYYY): 25/08/2018
Value per hour: 80.00
Duration (hours): 10
Enter month and year to calculate income (MM/YYYY): 08/2018
Name: Alex
Department: Design
Income for 08/2018: 3000.00
*/