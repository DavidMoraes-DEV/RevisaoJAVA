package ProgramacaoFuncional.FormatoStream;

public class Conceitos {
}
/*
* STREAM
	- � uma sequencia de elementos advinda de uma fonte de dados que oferece suporte a "opera��es agregadas".
		- Fonte de dados: Cole��o, Array, Fun��o de itera��o, Recurso de E/S	

* CARACTERISTICAS
	- Stream � uma solu��o para processar sequ�ncia de dados de forma:
		- Declarativa (itera��o interna: escondida do programador)
		- Parallel-friendly (imut�vel -> thread safe)
		- Sem efeitos colaterais
		- Sob demanda (lazy evaluation)

	- Acesso sequencial (n�o h� �ndices)
	- Single-use: S� pode ser "usada" uma vez
	- Pipeline: Opera��es em streams retornam novas streams. Ent�o � poss�vel criar uma cadeia de opera��es (fluxo de processamento).

* OPERA��ES INTERMEDI�RIAS E TERMINAIS
	- O pipeline � composto por zero ou mais opera��es intermedi�rias e uma terminal.
	- Opera��o INTERMEDI�RIA:
		- Produz uma nova streams (encadeamento)
		- S� executa quando uma opera��o terminal � invocada (lazy evaluation)
		
	- Opera��o TERMINAL:
		- Produz um objeto n�o-stream (cole��o ou outro)
		- Determina o fim do processamento da stream

* OPERA��ES INTERMEDI�RIAS:
	- filter()
	- map()
	- flatmap()
	- peek()
	- distinct()
	- sorted()
	- skip()
	- limit(*) -> � uma opera��o: short-circuit -> Quando n�o se sabe o tamanho da cole��o mais queremos pegar apenas uma quantidade limite de elementos da cole��o

		- Opera��es marcados com * s�o todas SHORT-CIRCUIT: Que � aquelas que quando atendem a condi��o entre () o processamento � cortado

* OPERA��ES TERMINAIS:
	- forEach()
	- forEachOrdered()
	- toArray()
	- reduce()
	- collect()
	- min()
	- max()
	- count()
	- anyMatch()
	- allMatch()
	- noneMatch()
	- findFirst(*)
	- findAny(*)
	
* COMO CRIAR UMA STREAM:
	- � criada apartir de uma fonte de dados(cole��es em geral)
	- Basta ent�o chamar o m�todo .stream() ou .parallelStream() a partir de qualquer objeto Collection.
	- Outras formas de se criar uma stream incluem:
		- Stream.of()
		- Stream.ofNullable()
		- Stream.iterate()
*/