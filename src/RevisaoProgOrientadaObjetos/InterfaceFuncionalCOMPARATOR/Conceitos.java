package RevisaoProgOrientadaObjetos.InterfaceFuncionalCOMPARATOR;

public class Conceitos {

}
/*
* INTERFACE COMPARATOR
	- 
 
 
 * PROBLEMA EXEMPLO:
 	- Suponha uma classe Product com os atributos name e price.
 	- Podemos implementar a compara��o de produtos por meio da implementa��o da interface Comparable<Product>
 		- Entretando, desta forma nossa classe n�o fica fechada para:
 			- Se o crit�rio de compara��o  mudar, precisaremos alterar a classe Product.
 		
 			- Podemos ent�o usar o default method "sort" da interface List:
 				- default void sort (Comparator<? super E> c)

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
												 				
*/
