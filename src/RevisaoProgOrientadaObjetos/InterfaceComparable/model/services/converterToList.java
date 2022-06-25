package RevisaoProgOrientadaObjetos.InterfaceComparable.model.services;

import java.io.IOException;
import java.util.List;

import RevisaoProgOrientadaObjetos.InterfaceComparable.model.entities.Employee;

public interface converterToList {

	public List<Employee> formatList(String filePath) throws IOException;
}
