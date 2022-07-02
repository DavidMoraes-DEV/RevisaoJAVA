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
*/
