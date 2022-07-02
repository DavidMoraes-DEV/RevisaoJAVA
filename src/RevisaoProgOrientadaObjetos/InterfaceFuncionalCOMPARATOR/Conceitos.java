package RevisaoProgOrientadaObjetos.InterfaceFuncionalCOMPARATOR;

public class Conceitos {

}
/*
* INTERFACE COMPARATOR
 
 * PROBLEMA EXEMPLO:
 	- Suponha uma classe Product com os atributos name e price.
 	- Podemos implementar a comparação de produtos por meio da implementação da interface Comparable<Product>
 		- Entretando, desta forma nossa classe não fica fechada para:
 			- Se o critério de comparação  mudar, precisaremos alterar a classe Product.
 		
 			- Podemos então usar o default method "sort" da interface List:
 				- default void sort (Comparator<? super E> c)

* RESUMO DAS PARTES:
	* PARTE I:		Utilizando a comparação com a interface COMPARABLE
	* PARTE II:		Utilizando a comparação com a interface COMPARATOR objeto de classe separada
	* PARTE III:	Utilizando a comparação com a interface COMPARATOR objeto de classe anônima
	* PARTE IV:		Utilizando a comparação com a interface COMPARATOR objeto de expressão lambda com e sem chaves V1 e V2
	* PARTE V:		Utilizando a comparação com a interface COMPARATOR expressão LAMBDA "direto no argumento"
		

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
					
PARTE III:
	* Utilizando Comparator com uma sintaxe de CLASSE ANÔNIMA:
		- Essa declaração não necessita da classe MyComparator separadamente
			- Pois os critérios de comparação no método da interface Comparator (compare())
				- Será declarado dentro da função anônima
			
		- Porém fica uma função anônima MUITO VERBOSA	
		
PARTE IV:
	* Utilizando Comparator com uma sintaxe de FUNÇÃO ANÔNIMA (Também conhecida como: arrow function):
		- Utiliza expressões LAMBDA que em programação é uma FUNÇÃO ANÔNIMA.
			- Fica muito mais enxuto.
		- Faz inferencia de tipos, dispensando a declaração do tipo das variáveis p1 e p2, pois se torna opicional a declaração
	
* SINTAXE V1 Função Anônima: Recomendada para quando se tem várias linhas na função anônima.
	Comparator<Product2> comp2 = (p1, p2) -> {
		
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		Código...
		Código...
		Código...
	};
		
* SINTAXE V2 Função Anônima: Recomendada para quando se tem apenas UMA linha na função anônima.
	Comparator<Product2> comp2 = (p1, p2) -> {
			
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
			
	};
	
PARTE V:
	 * EXPRESSÃO LAMBDA dentro da Função anônima diretamente como argumento para o método .sort da lista
		- Fica muito mais consciso e resumido	
*/
