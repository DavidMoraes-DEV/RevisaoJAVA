package RevisaoProgOrientadaObjetos.InterfaceSET.application;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {

		/*
		- HashSet - Mais r�pido (opera��es O(1) em tabela hash) e n�o ordenado
			- � o mais r�pido de todos para comparar objetos por�m ele N�O garante a ordem em que os objetos foi adicionados na cole��o.
				- Se a ordem dos produtos adicionados na cole��o SET n�o importar ent�o o HashSet ser� sempre o mais recomendado por ser muito mais r�pido que os outros.
		*/Set<String> set1 = new HashSet<>();

		set1.add("Tv");
		set1.add("Tablet");
		set1.add("Notebook");
		
		//.contains() -> Verifica se "NOTEBOOK" existe na cole��o set e retorna um valor booleano
		System.out.println(set1.contains("Notebook"));
		
		System.out.printf("%nResultado Utilizando new HashSet<>():%n");
		for (String p : set1) {
			System.out.println(p);
		}
		
		/*
		- O TreeSet - Ordena os dados, ou seja, mantem os dados ordenados em ordem alfab�tica ou num�rica
		 */
		Set<String> set2 = new TreeSet<>();
		set2.add("Tv");
		set2.add("Tablet");
		set2.add("Notebook");
		
		System.out.printf("%nResultado Utilizando new TreeSet<>():%n");
		for (String p : set2) {
			System.out.println(p);
		}
		
		/*
		- O LinkedHashSet - Mant�m os dados na ordem em que foi adicionados
		 */
		Set<String> set3 = new LinkedHashSet<>();
		set3.add("Tv");
		set3.add("Tablet");
		set3.add("Notebook");
		
		System.out.printf("%nResultado Utilizando new LinkedHashSet<>():%n");
		for (String p : set3) {
			System.out.println(p);
		}
		
		set1.remove("Tv");
		System.out.printf("%nRemovendo o objeto(Tv) Utilizando .remove():%n");
		for (String p : set1) {
			System.out.println(p);
		}
		
		set2.removeIf(x -> x.length() >= 3);
		System.out.printf("%nRemovendo todos os elementos que tem pelo menos 3 caracteres com o .removeIf():%n");
		for (String p : set2) {
			System.out.println(p);
		}
		
		//OPERA��ES DE CONJUNTO:
		System.out.printf("%n--------------------- OPERA��ES COM CONJUNTOS ---------------------%n");
		Set<Integer> A = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
		Set<Integer> B = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));
		
		System.out.printf("%nCOLE��O A: ");
		for (Integer obj : A) {
			System.out.printf(obj + " ");
		}
		
		System.out.printf("%nCOLE��O B: ");
		for (Integer obj : B) {
			System.out.printf(obj + " ");
		}
		
		//UNI�O:
		Set<Integer> C = new TreeSet<>(A);
		C.addAll(B);
		
		System.out.printf("%n%nResultado da UNI�O entre o conjunto A e B:%n");
		for (Integer obj : C) {
			System.out.printf(obj + " ");
		}
		System.out.println();
		
		//INTERSE��O:
		Set<Integer> D = new TreeSet<>(A);
		D.retainAll(B);
				
		System.out.printf("%n%nResultado da INTERSE��O entre o conjunto A e B:%n");
		for (Integer obj : D) {
			System.out.printf(obj + " ");
		}
		System.out.println();
		
		//DIFEREN�A:
		Set<Integer> E = new TreeSet<>(A);
		E.removeAll(B);
				
		System.out.printf("%n%nResultado da DIFEREN�A do conjunto A para o B:%n");
		for (Integer obj : E) {
			System.out.printf(obj + " ");
		}
		System.out.println();
	}
}
