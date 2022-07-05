package ProgramacaoFuncional.FormatoStream;

public class Conceitos {
}
/*
* STREAM
	- É uma sequencia de elementos advinda de uma fonte de dados que oferece suporte a "operações agregadas".
		- Fonte de dados: Coleção, Array, Função de iteração, Recurso de E/S	

* CARACTERISTICAS
	- Stream é uma solução para processar sequência de dados de forma:
		- Declarativa (iteração interna: escondida do programador)
		- Parallel-friendly (imutável -> thread safe)
		- Sem efeitos colaterais
		- Sob demanda (lazy evaluation)

	- Acesso sequencial (não há índices)
	- Single-use: Só pode ser "usada" uma vez
	- Pipeline: Operações em streams retornam novas streams. Então é possível criar uma cadeia de operações (fluxo de processamento).

* OPERAÇÕES INTERMEDIÁRIAS E TERMINAIS
	- O pipeline é composto por zero ou mais operações intermediárias e uma terminal.
	- Operação INTERMEDIÁRIA:
		- Produz uma nova streams (encadeamento)
		- Só executa quando uma operação terminal é invocada (lazy evaluation)
		
	- Operação TERMINAL:
		- Produz um objeto não-stream (coleção ou outro)
		- Determina o fim do processamento da stream

* OPERAÇÕES INTERMEDIÁRIAS:
	- filter()
	- map()
	- flatmap()
	- peek()
	- distinct()
	- sorted()
	- skip()
	- limit(*) -> É uma operação: short-circuit -> Quando não se sabe o tamanho da coleção mais queremos pegar apenas uma quantidade limite de elementos da coleção

		- Operações marcados com * são todas SHORT-CIRCUIT: Que é aquelas que quando atendem a condição entre () o processamento é cortado

* OPERAÇÕES TERMINAIS:
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
	- É criada apartir de uma fonte de dados(coleções em geral)
	- Basta então chamar o método .stream() ou .parallelStream() a partir de qualquer objeto Collection.
	- Outras formas de se criar uma stream incluem:
		- Stream.of()
		- Stream.ofNullable()
		- Stream.iterate()
*/