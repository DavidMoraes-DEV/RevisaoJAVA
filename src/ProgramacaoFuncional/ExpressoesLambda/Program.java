package ProgramacaoFuncional.ExpressoesLambda;

import java.util.ArrayList;
import java.util.List;


public class Program {
	
	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
				
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));

		System.out.printf("%nUtilizando a interface COMPARATOR com FUN��O AN�NIMA diretamente no m�todo .sort():%n%n");
		
		/* 
		* C�LCULO LAMBDA
			- Formalismo matem�tico base da programa��o funcional
			
		* EXPRESS�O LAMBDA
		 	- Fun��o an�nima de primeira classe
		 	- Em programa��o funcional, express�o Lambda corresponde a uma FUN��O AN�NIMA de PRIMEIRA CLASSE.
			- No fundo a express�o lambda � tratada como uma interface funcional
		*/
		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
				
		for(Product p : list) {
			System.out.println(p);
		}
	}
}