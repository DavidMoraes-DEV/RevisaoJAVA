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
*/
