package RevisaoProgOrientadaObjetos.InterfaceSET;

public class Conceitos {
}
/*
* ESTRUTURA SET<T>: (É uma INTERFACE)
	- Representa um conjunto de elementos (similar ao da Álgebra)
		- Não admite repetições
		- Elementos não possuem posição, podendo ou não possuir ordem
		- Acesso, inserlçao e remoção de elementos são rápidos
		- Oferece operações eficientes de conjunto: interseção, união, diferença...
		
		- Principais implementações:
			- HashSet - Mais rápido (operações O(1) em tabela hash) e não ordenado
				- É o mais rápido de todos para comparar objetos porém ele NÃO garante a ordem em que os objetos foi adicionados na coleção.
					- Se a ordem dos produtos adicionados na coleção SET não importar então o HashSet será sempre o mais recomendado por ser muito mais rápido que os outros.
	
			- TreeSet - Mais lento (operações O(log(n)) em árvore rubro=negra) e ordenado pelo compareTo do objeto (ou Comparator)
			- LinkedHashSet - Velocidade intermediária e elementos na ordem em que são adicionados

* ALGUNS MÉTODOS IMPORTANTES:
	- add(obj) -> ADICIONA, remove(obj) -> REMOVE, contains(obj) -> VERIFICA SE O OBJ EXISTE
		- Baseado em equals e hashCode
		- Se equals e hashCode não existir, é usada comparação de ponteiros
	
	- clear() -> Esvazia o conjunto
	- size() -> Retorna o tamanho do conjunto
	- removeIf(predicate) -> Remove do conjunto todos os elementos que atenderem o predicato
	
	- addAll(other) - UNIÃO: Adiciona no conjunto os elementos do outro conjunto, sem repetição
	- retainAll(other) - INTERSEÇÃO: Remove do conjunto os elementos não contidos em other
	- removeAll(other) - DIFERENÇA: Remove do conjunto os elementos contidos em other.

* COMO AS COLEÇÕES HASH TESTAM IGUALDADE?
	- Se hashCode e equals estiverem implementados:
		- Primeiro hashCode. Se der igual, usa equals para confirmar.
		- Lembre-se: String, Integer, Double, etc. Já possuem equals e hashCode.
	
	- Se hashCode e equals NÃO estiverem implementados:
		- Compara as referências (ponteiros) dos objetos.

*/