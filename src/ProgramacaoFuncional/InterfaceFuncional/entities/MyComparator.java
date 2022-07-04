package ProgramacaoFuncional.InterfaceFuncional.entities;

import java.util.Comparator;

public class MyComparator implements Comparator<Product> {

	/*
	* Interface Funcional:
		- � uma interface que possui um �nico m�todo abstrato.
		- Suas implementa��es ser�o tratadas como express�es Lambda.
		- Tem um Mapeamento direto com a express�o Lambda.
		- Mantem um mapeamento entre a programa��o orientada a objetos utilizando interfaces e a programa��o funcional
	
	* Alguns exemplos de interfaces funcionais:
		- Predicate -> Utilizado como predicado para algumas fun��es de cole��es
		- Function	-> Utilizado para fun��es especiais
		- Consumer	-> Caracter�stica ESPECIAL: Ao contr�rio das outras interfaces funcionais, � esperado que ele possa gerar efeitos colaterais
		
	* Os conceitos � bem parecido com o m�todo comparteTo da interface Comparable sendo:
		- Retorna um numero inteiro:
			- 0 se os dois objetos for iguais
			- Numero negativo se o primeiro for menor que o segundo
			- Numero positivo se o primeiro for maior que o segundo
	*/	
	@Override
	public int compare(Product p1, Product p2) {
		//Comparando os objetos apenas pelo nome
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}
}