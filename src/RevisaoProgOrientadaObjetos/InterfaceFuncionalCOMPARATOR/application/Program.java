package RevisaoProgOrientadaObjetos.InterfaceFuncionalCOMPARATOR.application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import RevisaoProgOrientadaObjetos.InterfaceFuncionalCOMPARATOR.model.entities.Product;

public class Program {

	public static void main(String[] args) {
		
		/*
		* Solução utilizando a interface COMPARABLE:
			- Classe Product não fica fechada para alterações
			- Se os critérios de comparação mudar terá que abrir a classe e realizar as alterções
		*/
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
		Collections.sort(list);
		
		for(Product p : list) {
			System.out.println(p);
		}
	}
}
