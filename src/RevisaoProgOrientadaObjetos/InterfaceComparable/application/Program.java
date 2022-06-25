package RevisaoProgOrientadaObjetos.InterfaceComparable.application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import RevisaoProgOrientadaObjetos.InterfaceComparable.model.entities.Employee;
import RevisaoProgOrientadaObjetos.InterfaceComparable.model.services.ArchiveCsvService;
import RevisaoProgOrientadaObjetos.InterfaceComparable.model.services.ConverterService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> employees = new ArrayList<>();
		ArchiveCsvService cs = new ArchiveCsvService();
		ConverterService converterService = new ConverterService();

		try {
			System.out.print("Does the file with employee data already exist? (s/n): "); //O arquivo com os dados dos funcion�rios j� existe (SIM/N�O)?
			char position = sc.next().charAt(0);

			String folderName;
			String fileName;

			if (position == 'n') {

				// Cria uma pasta
				System.out.printf("%nEnter the name of the folder which will store the CSV file: "); //Digite o nome da pasta que armazenar� o arquivo CSV:
				sc.nextLine();
				folderName = sc.nextLine();

				cs = new ArchiveCsvService(folderName);
				cs.newFolder();

				// Cria um Arquivo
				System.out.print("Enter the name of the file that will store employee data: "); //Digite o nome do arquivo que armazenar� os dados do funcion�rio:
				fileName = sc.nextLine();
				
				System.out.printf("%n|-----------------------------------------------------------------------|");
				System.out.printf("%n|-------------------- REGISTRATION OF EMPLOYEE DATA --------------------|"); //Cadastro dos Dados dos Funcion�rios:
				System.out.printf("%n|-----------------------------------------------------------------------|%n%n");
				
				System.out.printf("How many employees will be recorded in the file? "); //Quantos funcion�rios ser�o registrados no arquivo?
				Integer numberEmployees = sc.nextInt();

				// Cria uma Lista de Funcion�rios
				for (int i = 0; i < numberEmployees; i++) {

					System.out.printf("%nEnter the data of the #%d employee:%n", i + 1); //Insira os dados do funcion�rio n� n:
					System.out.print("Name: ");
					sc.nextLine();
					String employeeName = sc.nextLine();

					System.out.print("Salary: ");
					Double employeeSalary = sc.nextDouble();

					employees.add(new Employee(employeeName, employeeSalary));
				}

				//Cria um novo Arquivo em branco com o nome fornecido pelo usu�rio
				cs = new ArchiveCsvService(folderName, fileName);
				cs.newFileCSV();

				// Converte os dados de uma lista para o formato de um arquivo CSV e grava esses dados no arquivo.
				converterService.formatCSV(employees, cs.filePath());

				System.out.printf("%n|-----------------------------------------------------------------------|");
				System.out.printf("%n|--------- REGISTRATION COMPLETED AND FILE SAVED SUCCESSFULLY ----------|"); //Cadastro finalizado e arquivo salvo com sucesso:
				System.out.printf("%n|-----------------------------------------------------------------------|%n%n");
			}
			
			System.out.printf("Get data from a .csv file? (s/n): ");
			position = sc.next().charAt(0);
			
			if(position == 's') {
				System.out.printf("%n|-----------------------------------------------------------------------|");
				System.out.printf("%n|------------------------------ FILE DATA ------------------------------|"); //Dados do Arquivo:
				System.out.printf("%n|-----------------------------------------------------------------------|%n%n");
			
				// Obtem o nome da pasta que cont�m o arquivo
				System.out.printf("Enter the file folder name: "); //Digite o nome da pasta do arquivo:
				sc.nextLine();
				folderName = sc.nextLine();

				// Obtem o nome do arquivo de funcion�rios que j� foi criado
				System.out.print("Enter the file name: "); //Digite o nome do arquivo:
				fileName = sc.nextLine();

				cs = new ArchiveCsvService(folderName, fileName);
			
				System.out.printf("%nFILE DATA:%n%n"); //Dados do Arquivo:

				List<Employee> newListEmployees = new ArrayList<>();
				newListEmployees.addAll(converterService.formatList(cs.filePath()));

				/*
				* INTERFACE: COMPARABLE:
					- Funciona sem precisar implementar a interface COMPARABLE:
						- SOMENTE quando for de tipos normais como STRING que j� possuem a implementa��o da interface
						
					- Nesse caso do tipo EMPLOYEE apenas ir� funcionar:
						- SOMENTE se implementar a INTERFACE: Comparable e cumprir o contrato adicionando sua opera��o na classe do tipo espec�fico que criamos: EMPLOYEE
				*/
				Collections.sort(newListEmployees);

				for (Employee emp : newListEmployees) {
					System.out.println(emp);
				}
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
			System.out.printf("%n|-----------------------------------------------------------------------|");
			System.out.printf("%n|-------------------------- FINISHED PROGRAM ---------------------------|"); //Dados do Arquivo:
			System.out.printf("%n|-----------------------------------------------------------------------|");
		}
	}
}
