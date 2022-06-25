package RevisaoProgOrientadaObjetos.InterfaceComparable.model.services;

import java.io.IOException;
import java.util.List;

import RevisaoProgOrientadaObjetos.InterfaceComparable.model.entities.Employee;

public interface converterToCSV {

	public void formatCSV (List<Employee> list, String filePath) throws IOException;
}
