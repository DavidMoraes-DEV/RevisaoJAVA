package ProgramacaoFuncional.InterfaceFuncional.entities;

import java.util.Comparator;

public class MyComparator implements Comparator<Product> {

	/*
	* Interface Funcional:
		- É uma interface que possui um único método abstrato.
		- Suas implementações serão tratadas como expressões Lambda.
		- Tem um Mapeamento direto com a expressão Lambda.
		- Mantem um mapeamento entre a programação orientada a objetos utilizando interfaces e a programação funcional
	
	* Alguns exemplos de interfaces funcionais:
		- Predicate -> Utilizado como predicado para algumas funções de coleções
		- Function	-> Utilizado para funções especiais
		- Consumer	-> Característica ESPECIAL: Ao contrário das outras interfaces funcionais, é esperado que ele possa gerar efeitos colaterais
		
	* Os conceitos é bem parecido com o método comparteTo da interface Comparable sendo:
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