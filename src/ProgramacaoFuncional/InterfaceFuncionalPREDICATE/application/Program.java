package ProgramacaoFuncional.InterfaceFuncionalPREDICATE.application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import ProgramacaoFuncional.InterfaceFuncionalPREDICATE.entities.Product;
import ProgramacaoFuncional.InterfaceFuncionalPREDICATE.entities.Product2;
import ProgramacaoFuncional.InterfaceFuncionalPREDICATE.entities.ProductPredicate;

public class Program {

	public static void main(String[] args) {
		
		//|---------------------------------------------------------------------------------------------------------------------------------------------------|
		List<Product> list1 = new ArrayList<>();
		
		list1.add(new Product("Tv", 950.00));
		list1.add(new Product("Mouse", 50.00));
		list1.add(new Product("Tablet", 350.00));
		list1.add(new Product("HD Case", 80.90));
		
		System.out.printf("%nLista Original:%n");
		for(Product prod : list1) {
			System.out.println(prod);
		}
		
		System.out.printf("%nRemovendo todos os Produtos que tem VALOR acima de $ 100.00 utilizando o RemoveIf():%n");
		
		//O removeIf recebendo uma implementa��o MANUAL do PREDICATE (Personalizado = ProductPredicate)
		list1.removeIf(new ProductPredicate());
		
		System.out.printf("%nResultado com PREDICATE PERSONALIZADO:%n");
		for(Product prod : list1) {
			System.out.println(prod);
		}
		
		
		//|---------------------------------------------------------------------------------------------------------------------------------------------------|
		List<Product2> list2 = new ArrayList<>();
		
		list2.add(new Product2("Tv", 950.00));
		list2.add(new Product2("Mouse", 50.00));
		list2.add(new Product2("Tablet", 350.00));
		list2.add(new Product2("HD Case", 80.90));
		
		//O removeIf recebendo um PREDICATE em formato de Method Reference COM M�todo Est�tico
		list2.removeIf(Product2::staticProductPredicate); //Product2::staticProductPredicat = (NomedaClasse::NomeDoMetodo) � chamado de Method Reference.

		System.out.printf("%nResultado com PREDICATE recebendo uma referencia para um m�todo EST�TICO:%n");
		for(Product2 prod : list2) {
			System.out.println(prod);
		}
		
		
		//|---------------------------------------------------------------------------------------------------------------------------------------------------|
		List<Product2> list3 = new ArrayList<>();
		
		list3.add(new Product2("Tv", 950.00));
		list3.add(new Product2("Mouse", 50.00));
		list3.add(new Product2("Tablet", 350.00));
		list3.add(new Product2("HD Case", 80.90));
		
		//O removeIf recebendo um PREDICATE em formato de Method Reference SEM M�todo Est�tico
		list3.removeIf(Product2::nonStaticProductPredicate); 
				
		System.out.printf("%nResultado com PREDICATE recebendo uma referencia para um m�todo SEM SER EST�TICO:%n");
		for(Product2 prod : list3) {
			System.out.println(prod);
		}


		//|---------------------------------------------------------------------------------------------------------------------------------------------------|
		List<Product> list4 = new ArrayList<>();
				
		list4.add(new Product("Tv", 950.00));
		list4.add(new Product("Mouse", 50.00));
		list4.add(new Product("Tablet", 350.00));
		list4.add(new Product("HD Case", 80.90));
				
		//O removeIf recebendo um PREDICATE em formato de EXPRESS�O LAMBDA DECLARADA
		Predicate<Product> pred = p -> p.getPrice() >= 100.0; //Fun��o LAMBDA que � uma FUN��O AN�NIMA que recebe como arugmento um produto "p" e retorna um valor booleano
		list4.removeIf(pred); 
		
		System.out.printf("%nResultado com PREDICATE recebendo uma uma vari�vel com a declara��o da EXPRESS�O LAMBDA:%n");
		for(Product prod : list4) {
			System.out.println(prod);
		}
		
		//|---------------------------------------------------------------------------------------------------------------------------------------------------|
		
		List<Product> list5 = new ArrayList<>();
		
		list5.add(new Product("Tv", 950.00));
		list5.add(new Product("Mouse", 50.00));
		list5.add(new Product("Tablet", 350.00));
		list5.add(new Product("HD Case", 80.90));
		
		//O removeIf recebendo um PREDICATE em formato de EXPRESS�O LAMBDA INLINE diretamente como argumento
		list5.removeIf(x -> x.getPrice() > 100);

		System.out.printf("%nResultado com PREDICATE recebendo uma EXPRESS�O LAMBDA diretamente como argumento:%n");
		for(Product prod : list5) {
			System.out.println(prod);
		}
		
		
		
		
	}
}
/*
* PREDICATE:
 - � uma interface funcional abstrata parametrizada com o tipo T que possui apenas um m�todo:
 	- M�todo boolean test(T t)

* SINTAXE:
	public interface Predicate<T> {
	
		boolean test(T t);
	
	}

* PROBLEMA EXEMPLO:
	- Fazer um programa que, a partir de uma lista de produtos, remova da lista somente aqueles cujo pre�o m�nimo seja 100.
*/