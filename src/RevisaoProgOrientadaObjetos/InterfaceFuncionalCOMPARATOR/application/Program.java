package RevisaoProgOrientadaObjetos.InterfaceFuncionalCOMPARATOR.application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import RevisaoProgOrientadaObjetos.InterfaceFuncionalCOMPARATOR.model.entities.MyComparator;
import RevisaoProgOrientadaObjetos.InterfaceFuncionalCOMPARATOR.model.entities.Product1;
import RevisaoProgOrientadaObjetos.InterfaceFuncionalCOMPARATOR.model.entities.Product2;

public class Program {

	public static void main(String[] args) {
		
		/* PARTE I:
		* Solu��o utilizando a interface COMPARABLE:
			- Classe Product n�o fica fechada para altera��es
			- Se os crit�rios de compara��o mudar ter� que abrir a classe e realizar as alter��es
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
			- � uma interface funcional -> Interface funcional tem apenas UM m�todo ABSTRATO:
				- M�todo principal:
					- compare(T o1, T o2)
					- Esse m�todo compara dois objetos do mesmo tipo e retorna um INT:
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
	}
}