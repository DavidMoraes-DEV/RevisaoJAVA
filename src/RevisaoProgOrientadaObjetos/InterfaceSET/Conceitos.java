package RevisaoProgOrientadaObjetos.InterfaceSET;

public class Conceitos {
}
/*
* ESTRUTURA SET<T>: (� uma INTERFACE)
	- Representa um conjunto de elementos (similar ao da �lgebra)
		- N�o admite repeti��es
		- Elementos n�o possuem posi��o, podendo ou n�o possuir ordem
		- Acesso, inserl�ao e remo��o de elementos s�o r�pidos
		- Oferece opera��es eficientes de conjunto: interse��o, uni�o, diferen�a...
		
		- Principais implementa��es:
			- HashSet - Mais r�pido (opera��es O(1) em tabela hash) e n�o ordenado
				- � o mais r�pido de todos para comparar objetos por�m ele N�O garante a ordem em que os objetos foi adicionados na cole��o.
					- Se a ordem dos produtos adicionados na cole��o SET n�o importar ent�o o HashSet ser� sempre o mais recomendado por ser muito mais r�pido que os outros.
	
			- TreeSet - Mais lento (opera��es O(log(n)) em �rvore rubro=negra) e ordenado pelo compareTo do objeto (ou Comparator)
			- LinkedHashSet - Velocidade intermedi�ria e elementos na ordem em que s�o adicionados

* ALGUNS M�TODOS IMPORTANTES:
	- add(obj) -> ADICIONA, remove(obj) -> REMOVE, contains(obj) -> VERIFICA SE O OBJ EXISTE
		- Baseado em equals e hashCode
		- Se equals e hashCode n�o existir, � usada compara��o de ponteiros
	
	- clear() -> Esvazia o conjunto
	- size() -> Retorna o tamanho do conjunto
	- removeIf(predicate) -> Remove do conjunto todos os elementos que atenderem o predicato
	
	- addAll(other) - UNI�O: Adiciona no conjunto os elementos do outro conjunto, sem repeti��o
	- retainAll(other) - INTERSE��O: Remove do conjunto os elementos n�o contidos em other
	- removeAll(other) - DIFEREN�A: Remove do conjunto os elementos contidos em other.

* COMO AS COLE��ES HASH TESTAM IGUALDADE?
	- Se hashCode e equals estiverem implementados:
		- Primeiro hashCode. Se der igual, usa equals para confirmar.
		- Lembre-se: String, Integer, Double, etc. J� possuem equals e hashCode.
	
	- Se hashCode e equals N�O estiverem implementados:
		- Compara as refer�ncias (ponteiros) dos objetos.

*/