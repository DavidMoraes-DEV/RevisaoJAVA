package RevisaoProgOrientadaObjetos.InterfaceComparable.model.services;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import RevisaoProgOrientadaObjetos.InterfaceComparable.model.entities.Employee;

public class ConverterService implements converterToList, converterToCSV {

	@Override
	public void formatCSV(List<Employee> list, String filePath) throws IOException {

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {

			for (Employee emp : list) {
				String line = emp.getName() + "," + String.format("%.2f", emp.getSalary());
				bw.write(line);
				bw.newLine();
			}
		}
	}

	@Override
	public List<Employee> formatList(String filePath) throws IOException {
		
		List<Employee> employees = new ArrayList<>();
		
		try (BufferedReader bw = new BufferedReader(new FileReader(filePath))) {
			
			String line = bw.readLine();
			String[] vect = new String[1];
			
			while(line != null) {
				
				vect = line.split(",");	
				employees.add(new Employee(vect[0], Double.parseDouble(vect[1])));
				
				line = bw.readLine();
			}
		}
		
		return employees;
	}
}
