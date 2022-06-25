package RevisaoProgOrientadaObjetos.InterfaceComparable.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import RevisaoProgOrientadaObjetos.InterfaceComparable.model.entities.Employee;
import RevisaoProgOrientadaObjetos.InterfaceComparable.model.services.ConverterService;
import RevisaoProgOrientadaObjetos.InterfaceComparable.model.services.ArchiveCsvService;

public class Program {
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("How many employess will be registered? ");
		Integer numberEmployees = sc.nextInt();
		
		List<Employee> employees = new ArrayList<>();
		
		for(int i=0; i < numberEmployees; i++) {
			
			System.out.printf("%nEnter the data of the #%d employee:%n", i+1);
			System.out.print("Name : ");
			sc.nextLine();
			String employeeName = sc.nextLine();
			
			System.out.print("Salary: ");
			Double employeeSalary = sc.nextDouble();
			
			employees.add(new Employee(employeeName, employeeSalary));
		}
		
		try {
		System.out.printf("%nEnter the name of the folder which will store the CSV file: ");
		sc.nextLine();
		String folderName = sc.nextLine();
		
		ArchiveCsvService cs = new ArchiveCsvService(folderName);
		cs.newFolder();
		
		System.out.print("Enter the name of the file that will store employee data: ");
		String fileName = sc.nextLine();
		
		cs = new ArchiveCsvService(folderName, fileName);
		cs.newFileCSV();
		
		ConverterService converterService = new ConverterService();
		converterService.newConversionCSV(employees);
		
		
		
		
		
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}
	}
}
/*
DADOS:
Maria Brown, 4300.00
Alex Green, 3100.00
Bob Grey, 3100.00
Anna White, 3500.00
Alex Black, 2450.00
Eduardo Rose, 4390.00
Willian Red, 2900.00
Marta Blue, 6100.00
Alex Brown, 5000.00
*/