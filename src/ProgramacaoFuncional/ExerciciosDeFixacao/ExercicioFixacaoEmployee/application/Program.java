package ProgramacaoFuncional.ExerciciosDeFixacao.ExercicioFixacaoEmployee.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import ProgramacaoFuncional.ExerciciosDeFixacao.ExercicioFixacaoEmployee.entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> employees = new ArrayList<>();
		
		//Caminho do arquivo: C:\\Temp\\RecordsEmployees\\Employees.csv
		System.out.print("Enter full file path: ");
		String path = sc.next();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			while(line != null) {
				
				String[] fields = new String[3];
				fields = line.split(",");
				
				String employeeName = fields[0];
				String employeeEmail = fields[1];
				Double employeeSalary = Double.parseDouble(fields[2]);
				
				employees.add(new Employee(employeeName, employeeEmail, employeeSalary));
				
				line = br.readLine();
				
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
		
		System.out.printf("%nEnter salary: ");
		Double baseSalary = sc.nextDouble();
		
		List<String> names = employees.stream()
				.filter(x -> x.getSalary() > baseSalary)
				.map(x -> x.getEmail())
				.sorted()
				.collect(Collectors.toList());
		
		System.out.printf("%nEmail of people whose salary is more than %.2f:%n", baseSalary);
		names.forEach(System.out::println);
		
		Double sum = employees.stream()
				.filter(x -> x.getName().charAt(0) == 'M')
				.map(x -> x.getSalary())
				.reduce(0.0, (x, y) -> x + y);
		
		System.out.printf("%nSum of salary of people whose name starts with 'M': %.2f", sum);
		
		
		sc.close();
	}
}
