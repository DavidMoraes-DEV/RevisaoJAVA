package RevisaoProgOrientadaObjetos.Generics.TiposCuringaDelimitados.Exemplo02.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		/*
		* PRINCÍPIO GET/PUT:
			- COVARIÂNCIA:
				- get = OK
				- put = ERROR
		*/
		List<Integer> intList = new ArrayList<Integer>(); //-> Lista de Integer
		intList.add(10);
		intList.add(5);
		
		List<? extends Number> list = intList; //Lista que recebe Tipo Number e qualquer subTipo de Number(Int, double, float, long, byte e etc...)
		
		//Number x = list.get(0); //É possível acessar os elementos da lista
		
		//list.add(20); //Não é possível adicionar elementos nessa lista -> Vai dar erro de compilação pois o compilador não sabe se o valor contido nessa lista genérica será compatível com algum outro possível tipo Number
	
		/*
		* PRINCÍPIO GET/PUT:
			- CONTRAVARIÂNCIA:
				- get = ERROR
				- put = OK
		*/
		
		List<Object> myObjs = new ArrayList<Object>();
		myObjs.add("Maria");
		myObjs.add("Alex");
		
		List<? super Number> myNums = myObjs; //Nesse caso pode ser um Number ou o seu SUPER TIPO que no caso é OBJECT
		
		myNums.add(10); // É o contrário da covariância pois agora é possível adicionar elementos na lista por ser uma lista de OBJECT que é o SUPER TIPO de todos os outros
		myNums.add(3.14); 
		
		//Number x = myNums.get(0); // Porém não é possível obter os elementos da lista
	
		
		
		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> myObjs2 = new ArrayList<Object>();
		
		System.out.print("Lista de Numeros Inteiros: ");
		printList(myInts);
		
		System.out.print("Lista de Numeros Double: ");
		printList(myDoubles);
		
		System.out.printf("%nResultado das cópias de listas específicas para uma lista Object: %n");
		//Esse método copy() recebe uma lista que fornecerá os valores(myInts) e outra lista que receberá esses valores(myObjs)
		copy(myInts, myObjs2);
		printList(myObjs2);
		
		copy(myDoubles, myObjs2);
		printList(myObjs2);
	}
	
	/*
	* No Método abaixo:
	 
		- Lista de Origem(source) é um caso de:
			- COVARIÂNCIA podendo apenas acessar os elementos
				- Pois Trabalha com SUBTIPOS<? extends Number>)
				
		- Lista de Destino(destiny) é um caso de:
			- CONTRAVARIÂNCIA podendo apenas adicionar os elementos 
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
