package ProgramacaoFuncional.FuncoesQueRecebemFuncoes.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import ProgramacaoFuncional.FuncoesQueRecebemFuncoes.model.entities.Product;
import ProgramacaoFuncional.FuncoesQueRecebemFuncoes.model.entities.ProductService;


public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		ProductService ps = new ProductService();
		
		//Aqui estamos passando uma expressão lambda para a função Predicate<Product> definida em ProductService na FUNÇÃO filteredSum()
		double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');
		
		System.out.println("Sum = " + String.format("%.2f", sum));
		
	}
}
/*
* RECORDANDO: 
.revomeIf( Predicate )
.forEach( Consumer )
.map( Function )

PROBLEMA EXEMPLO:

Fazer um programa que, a partir de uma lista de produtos, calcule a soma dos preços somente dos produtos cujo nome começa com "T"
*/