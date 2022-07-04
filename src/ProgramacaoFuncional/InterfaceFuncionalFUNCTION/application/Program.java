package ProgramacaoFuncional.InterfaceFuncionalFUNCTION.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

import ProgramacaoFuncional.InterfaceFuncionalFUNCTION.entities.UpperCaseName;
import ProgramacaoFuncional.InterfaceFuncionalFUNCTION.entities.Product;

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
		list1.forEach(System.out::println);
		
		System.out.printf("%nMudando os nomes dos produtos para LETRAS MAÍUSCULAS do List<>():%n");
		//|---------------------------------------------------------------------------------------------------------------------------------------------------|
		
		/*
		* .stream
			- OBTEM um STREAM(Sequencia de dados) apartir da lista = list1
		
		* .map
			- A função map() funciona APENAS para STREAM(Por isso tem a necessidade de converter para STREAM
			- APLICA uma FUNÇÃO que foi colocada como ARGUMENTO de map() para cada elemento da STREAM
			- Gera uma NOVA STREAM com os elementos transformados
			- .map() RECEBE como argumento um FUNCTION
		*/
		List<String> names1 = list1.stream().map(new UpperCaseName()).collect(Collectors.toList()); //Depois de aplicar o FUNCTION na Stream será necessário converter de STREAM para LISTA com: .collect(Collectors.toList()) e depois atribuir para um nova lista
		
		System.out.printf("%nResultado com FUNCTION PERSONALIZADO:%n");
		names1.forEach(System.out::println); //Imprime cada elemento da lista utilizando um REFERENCE METHOD para chamar o println para imprimir na tela
		
		
		//|---------------------------------------------------------------------------------------------------------------------------------------------------|
		List<Product> list2 = new ArrayList<>();
		
		list2.add(new Product("Tv", 900.00));
		list2.add(new Product("Mouse", 50.00));
		list2.add(new Product("Tablet", 350.50));
		list2.add(new Product("HD Case", 80.90));
		
		List<String> names2 = list1.stream().map(Product::staticUpperCaseName).collect(Collectors.toList()); //Depois de aplicar o FUNCTION na Stream será necessário converter de STREAM para LISTA com: .collect(Collectors.toList()) e depois atribuir para um nova lista
		
		System.out.printf("%nResultado com FUNCTION recebendo uma referencia COM um método ESTÁTICO:%n");
		names2.forEach(System.out::println); 
		
		
		//|---------------------------------------------------------------------------------------------------------------------------------------------------|
		List<Product> list3 = new ArrayList<>();
		
		list3.add(new Product("Tv", 900.00));
		list3.add(new Product("Mouse", 50.00));
		list3.add(new Product("Tablet", 350.50));
		list3.add(new Product("HD Case", 80.90));
		
		List<String> names3 = list1.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList()); //Depois de aplicar o FUNCTION na Stream será necessário converter de STREAM para LISTA com: .collect(Collectors.toList()) e depois atribuir para um nova lista
		
		System.out.printf("%nResultado com FUNCTION recebendo uma referencia SEM um método ESTÁTICO:%n");
		names3.forEach(System.out::println);
		

		//|---------------------------------------------------------------------------------------------------------------------------------------------------|
		List<Product> list4 = new ArrayList<>();
		
		list4.add(new Product("Tv", 900.00));
		list4.add(new Product("Mouse", 50.00));
		list4.add(new Product("Tablet", 350.50));
		list4.add(new Product("HD Case", 80.90));

		Function<Product, String> cons = x -> { 
			 return x.getName().toUpperCase();
		};
		
		List<String> names4 = list1.stream().map(cons).collect(Collectors.toList()); //Depois de aplicar o FUNCTION na Stream será necessário converter de STREAM para LISTA com: .collect(Collectors.toList()) e depois atribuir para um nova lista
		
		System.out.printf("%nResultado com FUNCTION recebendo uma uma VARIÁVEL com a declaração da EXPRESSÃO LAMBDA:%n");
		names4.forEach(System.out::println);
		
		
		//|---------------------------------------------------------------------------------------------------------------------------------------------------|
		List<Product> list5 = new ArrayList<>();
		
		list5.add(new Product("Tv", 900.00));
		list5.add(new Product("Mouse", 50.00));
		list5.add(new Product("Tablet", 350.50));
		list5.add(new Product("HD Case", 80.90));

		List<String> names5 = list1.stream().map(x -> x.getName().toUpperCase()).collect(Collectors.toList()); //Depois de aplicar o FUNCTION na Stream será necessário converter de STREAM para LISTA com: .collect(Collectors.toList()) e depois atribuir para um nova lista
		
		System.out.printf("%nResultado com FUNCTION recebendo uma EXPRESSÃO LAMBDA INLINE diretamente como argumento:%n");
		names5.forEach(System.out::println);
	}
}
/*
FUNCTION: Possui 2 parâmetros: Tipo T e Tipo R e possui um único método que recebe um tipo T e retorna um Tipo R

* Nesses exemplos trabalhamos com a FUNÇÃO: map
	- ATENÇÃO: Não confundir a FUNÇÃO map com a ESTRUTURA DE DADOS: Map(Map = Trabalha com coleções)
	- A FUNÇÃO map aplica uma função a todos elementos de uma stream.

* CONVERTER STREAMS:
	- De LIST para STREAM: .stream()
	- De STREAM para LIST: .collect(Collectors.toList())
*/