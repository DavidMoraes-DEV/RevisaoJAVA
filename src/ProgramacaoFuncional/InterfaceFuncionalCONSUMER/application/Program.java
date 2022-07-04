package ProgramacaoFuncional.InterfaceFuncionalCONSUMER.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

import ProgramacaoFuncional.InterfaceFuncionalCONSUMER.entities.PriceUpdate;
import ProgramacaoFuncional.InterfaceFuncionalCONSUMER.entities.Product;

public class Program {
public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
	
		//|---------------------------------------------------------------------------------------------------------------------------------------------------|
		List<Product> list1 = new ArrayList<>();
		
		list1.add(new Product("Tv", 900.00));
		list1.add(new Product("Mouse", 50.00));
		list1.add(new Product("Tablet", 350.50));
		list1.add(new Product("HD Case", 80.90));
		
		System.out.printf("%nLista Original:%n");
		for(Product prod : list1) {
			System.out.println(prod);
		}
		
		System.out.printf("%nAcrescenta 10%% ao valor de cada produto utilizando o forEach() do List<>():%n");
		//|---------------------------------------------------------------------------------------------------------------------------------------------------|
		
		//O forEach é um DEFAULT METHOD que percorre a coleção executando um CONSUMER para cada elemento da coleção.
		list1.forEach(new PriceUpdate()); //Irá atualizar cada produto da lista
		
		System.out.printf("%nResultado com CONSUMER PERSONALIZADO:%n");
		list1.forEach(System.out::println); //Imprime cada elemento da lista utilizando um REFERENCE METHOD para chamar o println para imprimir na tela
		
		
		//|---------------------------------------------------------------------------------------------------------------------------------------------------|
		List<Product> list2 = new ArrayList<>();
		
		list2.add(new Product("Tv", 900.00));
		list2.add(new Product("Mouse", 50.00));
		list2.add(new Product("Tablet", 350.50));
		list2.add(new Product("HD Case", 80.90));
		
		//ForEach recebendo um CONSUMER em formato de REFERENCE METHOD COM um método estático.
		list2.forEach(Product::staticPriceUpdate);
		
		System.out.printf("%nResultado com CONSUMER recebendo uma referencia COM um método ESTÁTICO:%n");
		list2.forEach(System.out::println); 
		
		
		//|---------------------------------------------------------------------------------------------------------------------------------------------------|
		List<Product> list3 = new ArrayList<>();
		
		list3.add(new Product("Tv", 900.00));
		list3.add(new Product("Mouse", 50.00));
		list3.add(new Product("Tablet", 350.50));
		list3.add(new Product("HD Case", 80.90));
		
		//ForEach recebendo um CONSUMER em formato de REFERENCE METHOD SEM um método estático.
		list3.forEach(Product::nonStaticPriceUpdate);
		
		System.out.printf("%nResultado com CONSUMER recebendo uma referencia SEM um método ESTÁTICO:%n");
		list3.forEach(System.out::println);
		

		//|---------------------------------------------------------------------------------------------------------------------------------------------------|
		List<Product> list4 = new ArrayList<>();
		
		list4.add(new Product("Tv", 900.00));
		list4.add(new Product("Mouse", 50.00));
		list4.add(new Product("Tablet", 350.50));
		list4.add(new Product("HD Case", 80.90));

		//ForEach recebendo um CONSUMER em formato de uma EXPRESSÃO LAMBDA DECLARADA.
		Consumer<Product> cons = x -> { 
			x.setPrice(x.getPrice() * 1.1);
		};
		list4.forEach(cons);		
		
		System.out.printf("%nResultado com CONSUMER recebendo uma uma VARIÁVEL com a declaração da EXPRESSÃO LAMBDA:%n");
		list4.forEach(System.out::println);
		
		//|---------------------------------------------------------------------------------------------------------------------------------------------------|
		List<Product> list5 = new ArrayList<>();
		
		list5.add(new Product("Tv", 900.00));
		list5.add(new Product("Mouse", 50.00));
		list5.add(new Product("Tablet", 350.50));
		list5.add(new Product("HD Case", 80.90));

		//ForEach recebendo um CONSUMER em formato de uma EXPRESSÃO LAMBDA INLINE diretamente como argumento.
		list5.forEach(x -> x.setPrice(x.getPrice() * 1.1));
		
		System.out.printf("%nResultado com CONSUMER recebendo uma EXPRESSÃO LAMBDA INLINE diretamente como argumento:%n");
		list5.forEach(System.out::println);
	}
}
/*
CONSUMER: É uma interface funcional parametrizada por tipo "T" e possui apenas um método também
*/