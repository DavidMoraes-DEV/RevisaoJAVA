package RevisaoProgOrientadaObjetos.HashCode_e_Equals.application;

import RevisaoProgOrientadaObjetos.HashCode_e_Equals.entities.Client;

public class Program {

	public static void main(String[] args) {

		//Método .equals() -> Compara se o objeto é igual a outro, retornando TRUE ou FALSE.
		String a = "Maria";
		String b = "Alex";
		System.out.println(a.equals(b)); //Nesse caso retornará FALSE porque MARIA não é igual a ALEX.
		
		//Método .hashCode() -> Método que retorna um número inteiro representando um código gerado a partir das informações do objeto.
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println();
		
		//Métodos HASHCODE E EQUAL personalizados: Criados dentro da classe CLIENT comparando o nome e Email
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Alex", "alex@gmail.com");
		
		System.out.println("hashCode para o cliente MARIA: " + c1.hashCode());
		System.out.println("hashCode para o cliente ALEX: " + c2.hashCode());
		System.out.println("São iguais? " + c1.equals(c2));
		
		Client c3 = new Client("Joao", "JoaoSilva@gmail.com");
		Client c4 = new Client("Joao", "JoaoSilva@gmail.com");
		
		System.out.println();
		System.out.println("hashCode para o cliente JOAO: " + c3.hashCode());
		System.out.println("hashCode para outro cliente JOAO: " + c4.hashCode());
		System.out.println("São iguais? " + c3.equals(c4));
		//Nessa caso de comparar diretamente as variáveis dara FALSE porque o que será comparado não é o conteúdo da variável e sim suas referencias
		System.out.println("Comparando diretamente as variáveis com (==) são iguais? " + (c3 == c4));
	
		String s1 = "teste";
		String s2 = "teste";
		
		System.out.println();
		//Nesse casso ao contrário das variáveis do tipo CLIENT dará VERDADEIRO porque o JAVA trata o conteúdo LITERAL do tipo String de uma forma ESPECIAL para esses conteúdos LITERAIS
		System.out.println("S1 é igual a S2? " + (s1 == s2));
		//O resultado apenas daria FALSE se colocasse um new String() em cada variável para declacarar o conteúdo
	}
}