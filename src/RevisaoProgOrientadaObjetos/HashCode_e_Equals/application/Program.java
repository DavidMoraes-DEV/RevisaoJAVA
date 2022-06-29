package RevisaoProgOrientadaObjetos.HashCode_e_Equals.application;

import RevisaoProgOrientadaObjetos.HashCode_e_Equals.entities.Client;

public class Program {

	public static void main(String[] args) {

		//M�todo .equals() -> Compara se o objeto � igual a outro, retornando TRUE ou FALSE.
		String a = "Maria";
		String b = "Alex";
		System.out.println(a.equals(b)); //Nesse caso retornar� FALSE porque MARIA n�o � igual a ALEX.
		
		//M�todo .hashCode() -> M�todo que retorna um n�mero inteiro representando um c�digo gerado a partir das informa��es do objeto.
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println();
		
		//M�todos HASHCODE E EQUAL personalizados: Criados dentro da classe CLIENT comparando o nome e Email
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Alex", "alex@gmail.com");
		
		System.out.println("hashCode para o cliente MARIA: " + c1.hashCode());
		System.out.println("hashCode para o cliente ALEX: " + c2.hashCode());
		System.out.println("S�o iguais? " + c1.equals(c2));
		
		Client c3 = new Client("Joao", "JoaoSilva@gmail.com");
		Client c4 = new Client("Joao", "JoaoSilva@gmail.com");
		
		System.out.println();
		System.out.println("hashCode para o cliente JOAO: " + c3.hashCode());
		System.out.println("hashCode para outro cliente JOAO: " + c4.hashCode());
		System.out.println("S�o iguais? " + c3.equals(c4));
		//Nessa caso de comparar diretamente as vari�veis dara FALSE porque o que ser� comparado n�o � o conte�do da vari�vel e sim suas referencias
		System.out.println("Comparando diretamente as vari�veis com (==) s�o iguais? " + (c3 == c4));
	
		String s1 = "teste";
		String s2 = "teste";
		
		System.out.println();
		//Nesse casso ao contr�rio das vari�veis do tipo CLIENT dar� VERDADEIRO porque o JAVA trata o conte�do LITERAL do tipo String de uma forma ESPECIAL para esses conte�dos LITERAIS
		System.out.println("S1 � igual a S2? " + (s1 == s2));
		//O resultado apenas daria FALSE se colocasse um new String() em cada vari�vel para declacarar o conte�do
	}
}