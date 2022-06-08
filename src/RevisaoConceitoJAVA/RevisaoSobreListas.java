package RevisaoConceitoJAVA;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RevisaoSobreListas {

	public static void main(String[] args) {
		
		//Instacia uma lista
		List<String> list = new ArrayList<>();
		
		//Adiciona um elemento novo na lista
		list.add("Maria");  //Posi��o 0
		list.add("Alex");   //Posi��o 1
		list.add("Bob");    //Posi��o 2
		list.add("Anna");   //Posi��o 3
		
		List<String> list2 = new ArrayList<>();
		list2.addAll(list); //Adiciona todos os elementos de uma vez
		
		for (String obj : list) {System.out.println(obj);} //Imprime a lista
		System.out.printf("%n----------------------------%n%n");
		
		//Adiciona um elemento em uma determinada posi��o da lista com a SOBRECARGA do .add
		list.add(2, "Marco"); //Adicionar� o elemento na posi��o 2 da lista.
		
		for (String obj : list) {System.out.println(obj);} //Imprime a lista.
		System.out.printf("%n----------------------------%n%n");
		
		list.remove("Anna"); //Remove um elemento de acordo com o valor contido no elemento da lista
		list.remove(1); //Remove um elemento de acordo com a posi��o do elemento
		list.removeIf(x -> x.charAt(0) == 'M'); //Remove um elemento de acordo com uma condi��o/predicado
	
		for (String obj : list) {System.out.println(obj);}
		System.out.printf("%n----------------------------%n%n");
		
		System.out.println("Index of Bob: " + list.indexOf("Bob")); //Encontra a posi��o de um elemento.
		System.out.println("Index of Bob: " + list.indexOf("Marco")); //Retorna -1 se n�o encontrar
		System.out.printf("%n----------------------------%n%n");
		
		for (String obj : list2) {System.out.println(obj);}
		System.out.printf("%n----------------------------%n%n");
		
		//Filtra elementos de uma lista e cria outra lista com esses elementos.
		//� necess�rio primeiramente converter ela em stream, depois aplicar as opera��es de lambda e depois voltar para o formato list com o collect(Collectors.toList())
		List<String> result = list2.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
	
		for (String obj : result) {System.out.println(obj);}
		System.out.printf("%n----------------------------%n%n");
		
		//Retornar por exemplo o primeiro elemento da lista que come�a com a letra A
		String nomeComA = list2.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(nomeComA);
		
	}

}
