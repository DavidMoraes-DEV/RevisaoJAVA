package RevisaoProgOrientadaObjetos.MAP;

public class Conceitos {
}
/*
* MAP<K,V>
	- � uma cole��o de pares chave / valor -> Ser� armazenados valores nessa cole��o identificados por uma chave, podendo ser qualquer tipo tanto a chave quanto o valor
		- N�o admite repeti��es do objeto chave
		- Os elementos s�o indexados pelo objeto chave (n�o possuem posi��o)
		- Acesso, inser��o e remo��o de elementos s�o r�pidos
	
	- Uso comum: Cookies, local Storage, qualquer modelo chave-valor
	
	- Principais Implementa��es:
		- HashMap - Mais r�pido (opera��es O(1) em tabela hash) e n�o ordenado
		- TreeMap - mais lento (opera��es O(log(n)) em �rvore rubro-negro) e ordenado pelo compareTo do objeto (ou Comparator)
		- LinkedHashMap - Velocidade intermedi�ria e elementos na ordem em que s�o adicionados

* Alguns m�todos importantes:
	- Baseado em EQUALS e HASHCODE
	- Se equals e hashCode n�o existir, � usada compara��o de ponteiros no m�todos:
		- put(key, value)	->  Adiciona um elemento para a chave definida
		- remove(key)		->  Remove o elemento baseado na chave
		- contains(key)		->  Verifica se aquela chave existe
		- get(key)			->  Retorna o conte�do dessa chave
		- clear()			-> Limpa a cole��o
		- size()			-> obt�m o tamanho da cole��o
		- keySet()			-> Retorna um Set<K> com as chaves contidas no Map
		- values()			-> Retorna um Collection<V> com os valores contidos no Map

*/