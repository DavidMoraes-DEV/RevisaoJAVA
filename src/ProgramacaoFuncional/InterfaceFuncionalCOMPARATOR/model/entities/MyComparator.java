package ProgramacaoFuncional.InterfaceFuncionalCOMPARATOR.model.entities;

import java.util.Comparator;

public class MyComparator implements Comparator<Product2> {

	/*
	* Os conceitos é bem parecido com o método comparteTo da interface Comparable sendo:
		- Retorna um numero inteiro:
			- 0 se os dois objetos for iguais
			- Numero negativo se o primeiro for menor que o segundo
			- Numero positivo se o primeiro for maior que o segundo
	*/	
	@Override
	public int compare(Product2 p1, Product2 p2) {
		//Comparando os objetos apenas pelo nome
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}

}
