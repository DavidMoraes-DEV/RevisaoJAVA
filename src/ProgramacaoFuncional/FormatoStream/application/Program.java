package ProgramacaoFuncional.FormatoStream.application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		
		//Cria uma STREAM apartir de uma LISTA
		Stream<Integer> st1 = list.stream();
		
		//Converte o formato STREAM em um VETOR
		String result1 = Arrays.toString(st1.toArray());
		System.out.printf("Lista Original:  %s%n", result1);
	
		//.map() Aplica uma condi��o para cada elemento
		Stream<Integer> st2 = list.stream().map(x -> x * 10);

		String result2 = Arrays.toString(st2.toArray());
		System.out.printf("%nUtilizando .map(x10):  %s%n", result2);

		//Stream.of() Cria diretamente uma nova Stream sem precisar passar algum tipo de cole��o
		Stream<String> st3 = Stream.of("Maria", "Alex", "Bob");

		String result3 = Arrays.toString(st3.toArray());
		System.out.printf("%nNova Stream utilizando Stream.of():  %s%n", result3);

		/*
		Stream.iterate() � poss�vel criar diretamente uma Stream sem depender de alguma cole��o
			- passa o primeiro valor da Stream, qual a condi��o de itera��o para a gera��o dos elementos da STREAM
				- Podendo passar em formato de uma EXPRESS�O LAMBDA
		*/
		Stream<Integer> st4 = Stream.iterate(0, x -> x+2);

		//.limit Ir� limitar ou cortar em 10 elementos a Stream gerada pelo .iterate() e gerar� uma nova STREAM pois .limit � uma opera��o intermedi�ria.
		String result4 = Arrays.toString(st4.limit(10).toArray());
		System.out.printf("%nNova Stream utilizando Stream.iterate() limitida pelo .limit(10):  %s%n", result4);

	}
}
