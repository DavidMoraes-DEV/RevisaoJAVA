package RevisaoProgOrientadaObjetos.Generics.TiposCuringa.application;

import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		System.out.println();
		
		List<String> myStrs = Arrays.asList("Maria", "Alex", "Bob");
		printList(myStrs);
		
		System.out.println();
		
		List<Double> myDbl = Arrays.asList(24.5, 40.8, 90.5);
		printList(myDbl);
	}
	
	public static void printList(List<?> list) {
		for(Object obj : list) {
			System.out.println(obj);
		}
	}
	
}
