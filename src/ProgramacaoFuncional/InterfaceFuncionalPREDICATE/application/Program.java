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
		
		//O removeIf recebendo uma implementação MANUAL do PREDICATE (Personalizado = ProductPredicate)
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
		
		//O removeIf recebendo um PREDICATE em formato de Method Reference COM Método Estático
		list2.removeIf(Product2::staticProductPredicate); //Product2::staticProductPredicat = (NomedaClasse::NomeDoMetodo) É chamado de Method Reference.

		System.out.printf("%nResultado com PREDICATE recebendo uma referencia para um método ESTÁTICO:%n");
		for(Product2 prod : list2) {
			System.out.println(prod);
		}
		
		
		//|---------------------------------------------------------------------------------------------------------------------------------------------------|
		List<Product2> list3 = new ArrayList<>();
		
		list3.add(new Product2("Tv", 950.00));
		list3.add(new Product2("Mouse", 50.00));
		list3.add(new Product2("Tablet", 350.00));
		list3.add(new Product2("HD Case", 80.90));
		
		//O removeIf recebendo um PREDICATE em formato de Method Reference SEM Método Estático
		list3.removeIf(Product2::nonStaticProductPredicate); 
				
		System.out.printf("%nResultado com PREDICATE recebendo uma referencia para um método SEM SER ESTÁTICO:%n");
		for(Product2 prod : list3) {
			System.out.println(prod);
		}


		//|---------------------------------------------------------------------------------------------------------------------------------------------------|
		List<Product> list4 = new ArrayList<>();
				
		list4.add(new Product("Tv", 950.00));
		list4.add(new Product("Mouse", 50.00));
		list4.add(new Product("Tablet", 350.00));
		list4.add(new Product("HD Case", 80.90));
				
		//O removeIf recebendo um PREDICATE em formato de EXPRESSÃO LAMBDA DECLARADA
		Predicate<Product> pred = p -> p.getPrice() >= 100.0; //Função LAMBDA que é uma FUNÇÃO ANÔNIMA que recebe como arugmento um produto "p" e retorna um valor booleano
		list4.removeIf(pred); 
		
		System.out.printf("%nResultado com PREDICATE recebendo uma uma variável com a declaração da EXPRESSÃO LAMBDA:%n");
		for(Product prod : list4) {
			System.out.println(prod);
		}
		
		//|---------------------------------------------------------------------------------------------------------------------------------------------------|
		
		List<Product> list5 = new ArrayList<>();
		
		list5.add(new Product("Tv", 950.00));
		list5.add(new Product("Mouse", 50.00));
		list5.add(new Product("Tablet", 350.00));
		list5.add(new Product("HD Case", 80.90));
		
		//O removeIf recebendo um PREDICATE em formato de EXPRESSÃO LAMBDA INLINE diretamente como argumento
		list5.removeIf(x -> x.getPrice() > 100);

		System.out.printf("%nResultado com PREDICATE recebendo uma EXPRESSÃO LAMBDA diretamente como argumento:%n");
		for(Product prod : list5) {
			System.out.println(prod);
		}
		
		
		
		
	}
}
/*
* PREDICATE:
 - É uma interface funcional abstrata parametrizada com o tipo T que possui apenas um método:
 	- Método boolean test(T t)

* SINTAXE:
	public interface Predicate<T> {
	
		boolean test(T t);
	
	}

* PROBLEMA EXEMPLO:
	- Fazer um programa que, a partir de uma lista de produtos, remova da lista somente aqueles cujo preço mínimo seja 100.
*/