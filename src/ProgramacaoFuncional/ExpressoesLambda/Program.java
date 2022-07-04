package ProgramacaoFuncional.ExpressoesLambda;

import java.util.ArrayList;
import java.util.List;


public class Program {
	
	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
				
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));

		System.out.printf("%nUtilizando a interface COMPARATOR com FUNÇÃO ANÔNIMA diretamente no método .sort():%n%n");
		
		/* 
		* CÁLCULO LAMBDA
			- Formalismo matemático base da programação funcional
			
		* EXPRESSÃO LAMBDA
		 	- Função anônima de primeira classe
		 	- Em programação funcional, expressão Lambda corresponde a uma FUNÇÃO ANÔNIMA de PRIMEIRA CLASSE.
			- No fundo a expressão lambda é tratada como uma interface funcional
		*/
		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
				
		for(Product p : list) {
			System.out.println(p);
		}
	}
}