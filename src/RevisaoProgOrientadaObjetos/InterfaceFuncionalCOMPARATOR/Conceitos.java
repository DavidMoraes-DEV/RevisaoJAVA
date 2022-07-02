package RevisaoProgOrientadaObjetos.InterfaceFuncionalCOMPARATOR;

public class Conceitos {

}
/*
* INTERFACE COMPARATOR
	- 
 
 
 * PROBLEMA EXEMPLO:
 	- Suponha uma classe Product com os atributos name e price.
 	- Podemos implementar a comparação de produtos por meio da implementação da interface Comparable<Product>
 		- Entretando, desta forma nossa classe não fica fechada para:
 			- Se o critério de comparação  mudar, precisaremos alterar a classe Product.
 		
 			- Podemos então usar o default method "sort" da interface List:
 				- default void sort (Comparator<? super E> c)

PARTE I:
	* Solução utilizando a interface COMPARABLE:
		- Classe Product não fica fechada para alterações
		- Se os critérios de comparação mudar terá que abrir a classe e realizar as alterções

PARTE II:
	* Interface Comparator<T> personalizada (MyComparator):
		- É uma interface funcional -> Interface funcional tem apenas UM método ABSTRATO:
			- Método principal:
				- compare(T o1, T o2)
				- Esse método compara dois objetos do mesmo tipo e retorna um INT:
					- 0 se os dois objetos for iguais
					- -1 Numero negativo se o primeiro for menor que o segundo
					- 1  Numero positivo se o primeiro for maior que o segundo
												 				
*/
