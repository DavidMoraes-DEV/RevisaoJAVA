package RevisaoProgOrientadaObjetos.Generics.TiposCuringaDelimitados.Exemplo02;

public class Problematica {
}
/*
* Fazer um m�todo que copia os elementos de uma lista para uma outra lista que
pode ser mais gen�rica que a primeira.
	
* EXEMPLO: 
List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
	List<Double> myDoubles = Arrays.asList(3.14, 6.28);
	List<Object> myObjs = new ArrayList<Object>();
		
	copy(myInts, myObjs);
	copy(myDoubles, myObjs);

* PRINC�PIO GET/PUT:
	- COVARI�NCIA:
		- Onde o m�todo get que obtem o valor do arquivo funciona normalmente
		- Por�m o put para adicionar algum elemente nessa lista n�o funciona da erro,
		pois o compilador n�o sabe se o tipo recebido � compat�vel com qualquer outro tipo.

	- CONTRAVARI�NCIA:
		- � o contr�rio de COVARI�NCIA sendo poss�vel adicionar elementos na lista
		- Mas n�o � poss�vel acessar os elementos dessa lista
*/