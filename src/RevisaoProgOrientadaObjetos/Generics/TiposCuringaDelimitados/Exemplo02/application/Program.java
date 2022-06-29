package RevisaoProgOrientadaObjetos.Generics.TiposCuringaDelimitados.Exemplo02.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		/*
		* PRINC�PIO GET/PUT:
			- COVARI�NCIA:
				- get = OK
				- put = ERROR
		*/
		List<Integer> intList = new ArrayList<Integer>(); //-> Lista de Integer
		intList.add(10);
		intList.add(5);
		
		List<? extends Number> list = intList; //Lista que recebe Tipo Number e qualquer subTipo de Number(Int, double, float, long, byte e etc...)
		
		//Number x = list.get(0); //� poss�vel acessar os elementos da lista
		
		//list.add(20); //N�o � poss�vel adicionar elementos nessa lista -> Vai dar erro de compila��o pois o compilador n�o sabe se o valor contido nessa lista gen�rica ser� compat�vel com algum outro poss�vel tipo Number
	
		/*
		* PRINC�PIO GET/PUT:
			- CONTRAVARI�NCIA:
				- get = ERROR
				- put = OK
		*/
		
		List<Object> myObjs = new ArrayList<Object>();
		myObjs.add("Maria");
		myObjs.add("Alex");
		
		List<? super Number> myNums = myObjs; //Nesse caso pode ser um Number ou o seu SUPER TIPO que no caso � OBJECT
		
		myNums.add(10); // � o contr�rio da covari�ncia pois agora � poss�vel adicionar elementos na lista por ser uma lista de OBJECT que � o SUPER TIPO de todos os outros
		myNums.add(3.14); 
		
		//Number x = myNums.get(0); // Por�m n�o � poss�vel obter os elementos da lista
	
		
		
		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> myObjs2 = new ArrayList<Object>();
		
		System.out.print("Lista de Numeros Inteiros: ");
		printList(myInts);
		
		System.out.print("Lista de Numeros Double: ");
		printList(myDoubles);
		
		System.out.printf("%nResultado das c�pias de listas espec�ficas para uma lista Object: %n");
		//Esse m�todo copy() recebe uma lista que fornecer� os valores(myInts) e outra lista que receber� esses valores(myObjs)
		copy(myInts, myObjs2);
		printList(myObjs2);
		
		copy(myDoubles, myObjs2);
		printList(myObjs2);
	}
	
	/*
	* No M�todo abaixo:
	 
		- Lista de Origem(source) � um caso de:
			- COVARI�NCIA podendo apenas acessar os elementos
				- Pois Trabalha com SUBTIPOS<? extends Number>)
				
		- Lista de Destino(destiny) � um caso de:
			- CONTRAVARI�NCIA podendo apenas adicionar os elementos 
				- Pois Trabalha com SUPERTIPOS<? super Number>)
	*/
	public static void copy(List<? extends Number> source, List<? super Number> destiny) {
		for(Number number : source) {
			destiny.add(number);
		}
	}
	
	public static void printList(List<?> list) {
		for(Object obj : list) {
			System.out.printf(obj + " ");
		}
		System.out.println();
	}
}
