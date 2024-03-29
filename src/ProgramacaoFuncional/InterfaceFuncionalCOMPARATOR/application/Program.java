package ProgramacaoFuncional.InterfaceFuncionalCOMPARATOR.application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import ProgramacaoFuncional.InterfaceFuncionalCOMPARATOR.model.entities.MyComparator;
import ProgramacaoFuncional.InterfaceFuncionalCOMPARATOR.model.entities.Product1;
import ProgramacaoFuncional.InterfaceFuncionalCOMPARATOR.model.entities.Product2;

public class Program {
	
	public static void main(String[] args) {
		
		/*
		* RESUMO DAS PARTES:
			* PARTE I:		Utilizando a compara��o com a interface COMPARABLE
			* PARTE II:		Utilizando a compara��o com a interface COMPARATOR objeto de classe separada
			* PARTE III:	Utilizando a compara��o com a interface COMPARATOR objeto de classe an�nima
			* PARTE IV:		Utilizando a compara��o com a interface COMPARATOR objeto de express�o lambda com e sem chaves V1 e V2
			* PARTE V:		Utilizando a compara��o com a interface COMPARATOR express�o LAMBDA "direto no argumento"
		*/
		
		
		/* PARTE I:
		* Solu��o utilizando a interface COMPARABLE:
			- Classe Product n�o fica fechada para altera��es
			- Se os crit�rios de compara��o mudar ter� que abrir a classe e realizar as alter��es
		*/
	
		List<Product1> list = new ArrayList<>();
		
		list.add(new Product1("TV", 900.00));
		list.add(new Product1("Notebook", 1200.00));
		list.add(new Product1("Tablet", 450.00));
		
		System.out.printf("Utilizando a interface COMPARABLE (Product1):%n%n");
		Collections.sort(list);
		
		for(Product1 p : list) {
			System.out.println(p);
		}
		
		/* PARTE II:
		* Interface Comparator<T> personalizada (MyComparator):
			- � uma interface funcional -> Interface funcional tem apenas UM m�todo ABSTRATO:
				- M�todo principal:
					- compare(T o1, T o2)
					- Esse m�todo compara dois objetos do mesmo tipo e retorna um INT:
						- 0 se os dois objetos for iguais
						- Numero negativo se o primeiro for menor que o segundo
						- Numero positivo se o primeiro for maior que o segundo
		 */
		
		List<Product2> list2 = new ArrayList<>();
		
		list2.add(new Product2("TV", 900.00));
		list2.add(new Product2("Notebook", 1200.00));
		list2.add(new Product2("Tablet", 450.00));

		System.out.printf("%nUtilizando a interface COMPARATOR (Product2):%n%n");
		list2.sort(new MyComparator());
		
		for(Product2 p : list2) {
			System.out.println(p);
		}
		
		/* PARTE III:
		* Utilizando Comparator com uma sintaxe de CLASSE AN�NIMA:
			- Essa declara��o n�o necessita da classe MyComparator separadamente
				- Pois os crit�rios de compara��o no m�todo da interface Comparator (compare())
					- Ser� declarado dentro da fun��o an�nima
			
			- Por�m fica uma fun��o an�nima MUITO VERBOSA
		*/
		
		List<Product2> list3 = new ArrayList<>();
		
		list3.add(new Product2("TV", 900.00));
		list3.add(new Product2("Notebook", 1200.00));
		list3.add(new Product2("Tablet", 450.00));

		System.out.printf("%nUtilizando a interface COMPARATOR com CLASSE AN�NIMA:%n%n");
		
		//Classe an�nima
		Comparator<Product2> comp = new Comparator<Product2>() {

			@Override
			public int compare(Product2 p1, Product2 p2) {
				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
			}
			
		};
		
		list3.sort(comp);
		
		for(Product2 p : list3) {
			System.out.println(p);
		}
		
		/* PARTE IV:
		* Utilizando Comparator com uma sintaxe de FUN��O AN�NIMA (Tamb�m conhecida como: arrow function):
			- Utiliza express�es LAMBDA que em programa��o � uma FUN��O AN�NIMA.
				- Fica muito mais enxuto.
			- Faz inferencia de tipos, dispensando a declara��o do tipo das vari�veis p1 e p2, pois se torna opicional a declara��o
		
		* SINTAXE V1 Fun��o An�nima: Recomendada para quando se tem v�rias linhas na fun��o an�nima.
		Comparator<Product2> comp2 = (p1, p2) -> {
			
			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
			C�digo...
			C�digo...
			C�digo...
		};
		
		* SINTAXE V2 Fun��o An�nima: Recomendada para quando se tem apenas UMA linha na fun��o an�nima.
		Comparator<Product2> comp2 = (p1, p2) -> {
			
			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
			
		};
		*/
		
		List<Product2> list4 = new ArrayList<>();
		
		list4.add(new Product2("TV", 900.00));
		list4.add(new Product2("Notebook", 1200.00));
		list4.add(new Product2("Tablet", 450.00));

		System.out.printf("%nUtilizando a interface COMPARATOR com FUN��O AN�NIMA:%n%n");
		
		//Fun��o an�nima V2:
		Comparator<Product2> comp2 = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
				
		list4.sort(comp2);
		
		for(Product2 p : list4) {
			System.out.println(p);
		}
		
		/*PARTE V:
		 * EXPRESS�O LAMBDA dentro da Fun��o an�nima diretamente como argumento para o m�todo .sort da lista
			- Fica muito mais consciso e resumido
		*/
		List<Product2> list5 = new ArrayList<>();
				
		list5.add(new Product2("TV", 900.00));
		list5.add(new Product2("Notebook", 1200.00));
		list5.add(new Product2("Tablet", 450.00));

		System.out.printf("%nUtilizando a interface COMPARATOR com FUN��O AN�NIMA diretamente no m�todo .sort():%n%n");
				
		//Fun��o an�nima dentro do m�todo .sort():	
		list5.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
				
		for(Product2 p : list5) {
			System.out.println(p);
		}
	}
}