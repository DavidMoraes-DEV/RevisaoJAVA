package RevisaoProgOrientadaObjetos.InterfaceComparable.model.services;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.List;

import RevisaoProgOrientadaObjetos.InterfaceComparable.model.entities.Employee;

public class ConverterService implements converterToList, converterToCSV {

	@Override
	public void newFormatCSV(List<Employee> list ) {
		
		for(Employee emp : list) {
			
			String line = emp.getName() + "," + String.format("%.2f", emp.getSalary());
			
			
			//CONTINUA.... (PRECISO PEGAR ESSA LINHA NO FORMATO CSV E GRAVAR NO ARQUIVO CRIADO)
		}
		
	}

	@Override
	public List<String> newFormatList(File fileCSV) {
		// TODO Auto-generated method stub
		return null;
	}
}
