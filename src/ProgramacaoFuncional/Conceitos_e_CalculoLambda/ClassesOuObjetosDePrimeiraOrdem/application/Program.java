package ProgramacaoFuncional.Conceitos_e_CalculoLambda.ClassesOuObjetosDePrimeiraOrdem.application;

import java.util.ArrayList;
import java.util.List;

import ProgramacaoFuncional.Conceitos_e_CalculoLambda.ClassesOuObjetosDePrimeiraOrdem.entities.Product;

public class Program {
	/*
	* FUN��ES S�O OBJETOS DE PRIMEIRA ORDEM (OU PRIMEIRA CLASSE)
		- Isso significa que fun��es podem, por exemplo, serem passadas como par�metros de m�tdos -
		- Podem tamb�m ser retornadas como resultado de m�todos.
	*/
	
	//Fun��o que compara produtos por pre�o
	public static int compareProducts(Product p1, Product p2) {
		return p1.getPrice().compareTo(p2.getPrice());
	}

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
		/*
		* METHOD REFERENCES:
			- Seu Operador � ::
			- SINTAXE: Classe::m�todo	
		*/
		list.sort(Program::compareProducts); // -> Forma de Passar a refer�ncia da fun��o compareProducts
		list.forEach(System.out::println);
		
		//Na programa��o Funcional podemos passar uma fun��o como argumento para outra fun��o
	}
}
