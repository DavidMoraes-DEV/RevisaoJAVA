package RevisaoProgOrientadaObjetos.Generics.TiposCuringaDelimitados.Exemplo02;

public class Problematica {
}
/*
* Fazer um método que copia os elementos de uma lista para uma outra lista que
pode ser mais genérica que a primeira.
	
* EXEMPLO: 
List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
	List<Double> myDoubles = Arrays.asList(3.14, 6.28);
	List<Object> myObjs = new ArrayList<Object>();
		
	copy(myInts, myObjs);
	copy(myDoubles, myObjs);

* PRINCÍPIO GET/PUT:
	- COVARIÂNCIA:
		- Onde o método get que obtem o valor do arquivo funciona normalmente
		- Porém o put para adicionar algum elemente nessa lista não funciona da erro,
		pois o compilador não sabe se o tipo recebido é compatível com qualquer outro tipo.

	- CONTRAVARIÂNCIA:
		- É o contrário de COVARIÂNCIA sendo possível adicionar elementos na lista
		- Mas não é possível acessar os elementos dessa lista
*/