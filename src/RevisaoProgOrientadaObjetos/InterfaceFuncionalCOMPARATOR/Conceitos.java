package RevisaoProgOrientadaObjetos.InterfaceFuncionalCOMPARATOR;

public class Conceitos {

}
/*
* INTERFACE COMPARATOR
 
 * PROBLEMA EXEMPLO:
 	- Suponha uma classe Product com os atributos name e price.
 	- Podemos implementar a compara��o de produtos por meio da implementa��o da interface Comparable<Product>
 		- Entretando, desta forma nossa classe n�o fica fechada para:
 			- Se o crit�rio de compara��o  mudar, precisaremos alterar a classe Product.
 		
 			- Podemos ent�o usar o default method "sort" da interface List:
 				- default void sort (Comparator<? super E> c)

* RESUMO DAS PARTES:
	* PARTE I:		Utilizando a compara��o com a interface COMPARABLE
	* PARTE II:		Utilizando a compara��o com a interface COMPARATOR objeto de classe separada
	* PARTE III:	Utilizando a compara��o com a interface COMPARATOR objeto de classe an�nima
	* PARTE IV:		Utilizando a compara��o com a interface COMPARATOR objeto de express�o lambda com e sem chaves V1 e V2
	* PARTE V:		Utilizando a compara��o com a interface COMPARATOR express�o LAMBDA "direto no argumento"
		

PARTE I:
	* Solu��o utilizando a interface COMPARABLE:
		- Classe Product n�o fica fechada para altera��es
		- Se os crit�rios de compara��o mudar ter� que abrir a classe e realizar as alter��es

PARTE II:
	* Interface Comparator<T> personalizada (MyComparator):
		- � uma interface funcional -> Interface funcional tem apenas UM m�todo ABSTRATO:
			- M�todo principal:
				- compare(T o1, T o2)
				- Esse m�todo compara dois objetos do mesmo tipo e retorna um INT:
					- 0 se os dois objetos for iguais
					- -1 Numero negativo se o primeiro for menor que o segundo
					- 1  Numero positivo se o primeiro for maior que o segundo
					
PARTE III:
	* Utilizando Comparator com uma sintaxe de CLASSE AN�NIMA:
		- Essa declara��o n�o necessita da classe MyComparator separadamente
			- Pois os crit�rios de compara��o no m�todo da interface Comparator (compare())
				- Ser� declarado dentro da fun��o an�nima
			
		- Por�m fica uma fun��o an�nima MUITO VERBOSA	
		
PARTE IV:
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
	
PARTE V:
	 * EXPRESS�O LAMBDA dentro da Fun��o an�nima diretamente como argumento para o m�todo .sort da lista
		- Fica muito mais consciso e resumido	
*/
