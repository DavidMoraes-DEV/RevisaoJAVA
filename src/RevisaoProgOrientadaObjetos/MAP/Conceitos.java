package RevisaoProgOrientadaObjetos.MAP;

public class Conceitos {
}
/*
* MAP<K,V>
	- É uma coleção de pares chave / valor -> Será armazenados valores nessa coleção identificados por uma chave, podendo ser qualquer tipo tanto a chave quanto o valor
		- Não admite repetições do objeto chave
		- Os elementos são indexados pelo objeto chave (não possuem posição)
		- Acesso, inserção e remoção de elementos são rápidos
	
	- Uso comum: Cookies, local Storage, qualquer modelo chave-valor
	
	- Principais Implementações:
		- HashMap - Mais rápido (operações O(1) em tabela hash) e não ordenado
		- TreeMap - mais lento (operações O(log(n)) em árvore rubro-negro) e ordenado pelo compareTo do objeto (ou Comparator)
		- LinkedHashMap - Velocidade intermediária e elementos na ordem em que são adicionados

* Alguns métodos importantes:
	- Baseado em EQUALS e HASHCODE
	- Se equals e hashCode não existir, é usada comparação de ponteiros no métodos:
		- put(key, value)	->  Adiciona um elemento para a chave definida
		- remove(key)		->  Remove o elemento baseado na chave
		- contains(key)		->  Verifica se aquela chave existe
		- get(key)			->  Retorna o conteúdo dessa chave
		- clear()			-> Limpa a coleção
		- size()			-> obtém o tamanho da coleção
		- keySet()			-> Retorna um Set<K> com as chaves contidas no Map
		- values()			-> Retorna um Collection<V> com os valores contidos no Map

*/