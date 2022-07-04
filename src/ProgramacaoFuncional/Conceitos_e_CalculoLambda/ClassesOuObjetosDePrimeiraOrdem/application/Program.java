package ProgramacaoFuncional.Conceitos_e_CalculoLambda.ClassesOuObjetosDePrimeiraOrdem.application;

import java.util.ArrayList;
import java.util.List;

import ProgramacaoFuncional.Conceitos_e_CalculoLambda.ClassesOuObjetosDePrimeiraOrdem.entities.Product;

public class Program {
	/*
	* FUNÇÕES SÃO OBJETOS DE PRIMEIRA ORDEM (OU PRIMEIRA CLASSE)
		- Isso significa que funções podem, por exemplo, serem passadas como parâmetros de métdos -
		- Podem também ser retornadas como resultado de métodos.
	*/
	
	//Função que compara produtos por preço
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
			- Seu Operador é ::
			- SINTAXE: Classe::método	
		*/
		list.sort(Program::compareProducts); // -> Forma de Passar a referência da função compareProducts
		list.forEach(System.out::println);
		
		//Na programação Funcional podemos passar uma função como argumento para outra função
	}
}
