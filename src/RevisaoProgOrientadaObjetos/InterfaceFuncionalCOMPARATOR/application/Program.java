package RevisaoProgOrientadaObjetos.InterfaceFuncionalCOMPARATOR.application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import RevisaoProgOrientadaObjetos.InterfaceFuncionalCOMPARATOR.model.entities.MyComparator;
import RevisaoProgOrientadaObjetos.InterfaceFuncionalCOMPARATOR.model.entities.Product1;
import RevisaoProgOrientadaObjetos.InterfaceFuncionalCOMPARATOR.model.entities.Product2;

public class Program {

	public static void main(String[] args) {
		
		/* PARTE I:
		* Solução utilizando a interface COMPARABLE:
			- Classe Product não fica fechada para alterações
			- Se os critérios de comparação mudar terá que abrir a classe e realizar as alterções
		*/
	
		List<Product1> list = new ArrayList<>();
		
		list.add(new Product1("TV", 900.00));
		list.add(new Product1("Notebook", 1200.00));
		list.add(new Product1("Tablet", 450.00));
		
		System.out.printf("Utilizando a interface COMPARABLE (Product1):%n%n");
		Collections.sort(list);
		
		for(Product1 p : list) {
			System.out.println(p);
		}
		
		/* PARTE II:
		* Interface Comparator<T> personalizada (MyComparator):
			- É uma interface funcional -> Interface funcional tem apenas UM método ABSTRATO:
				- Método principal:
					- compare(T o1, T o2)
					- Esse método compara dois objetos do mesmo tipo e retorna um INT:
						- 0 se os dois objetos for iguais
						- Numero negativo se o primeiro for menor que o segundo
						- Numero positivo se o primeiro for maior que o segundo
		 */
		
		List<Product2> list2 = new ArrayList<>();
		
		list2.add(new Product2("TV", 900.00));
		list2.add(new Product2("Notebook", 1200.00));
		list2.add(new Product2("Tablet", 450.00));

		System.out.printf("%nUtilizando a interface COMPARATOR (Product2):%n%n");
		list2.sort(new MyComparator());
		
		for(Product2 p : list2) {
			System.out.println(p);
		}
		
		/* PARTE III:
		* Utilizando Comparator com uma sintaxe de CLASSE ANÔNIMA:
			- Essa declaração não necessita da classe MyComparator separadamente
				- Pois os critérios de comparação no método da interface Comparator (compare())
					- Será declarado dentro da função anônima
			
			- Porém fica uma função anônima MUITO VERBOSA
		*/
		
		List<Product2> list3 = new ArrayList<>();
		
		list3.add(new Product2("TV", 900.00));
		list3.add(new Product2("Notebook", 1200.00));
		list3.add(new Product2("Tablet", 450.00));

		System.out.printf("%nUtilizando a interface COMPARATOR com CLASSE ANÔNIMA:%n%n");
		
		//Classe anônima
		Comparator<Product2> comp = new Comparator<Product2>() {

			@Override
			public int compare(Product2 p1, Product2 p2) {
				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
			}
			
		};
		
		list3.sort(comp);
		
		for(Product2 p : list3) {
			System.out.println(p);
		}
	}
}