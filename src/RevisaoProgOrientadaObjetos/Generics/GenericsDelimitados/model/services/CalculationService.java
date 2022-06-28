package RevisaoProgOrientadaObjetos.Generics.GenericsDelimitados.model.services;

import java.util.List;

public class CalculationService<T> {

	/*
	* <T extends Comparable<? super T>>
		- Com essa declara��o definimos que esse m�todo vai trabalhar com qualquer tipo T
			- Desde que esse tipo T seja qualquer subTipo de Compareble<T>
		
	* <? super T>
	* 	- � os tipos de declara��o curinga		
	*/
	public static <T extends Comparable<? super T>> T max(List<T> list) {
		
		if(list.isEmpty()) {
			throw new IllegalStateException("List can't be empty");
		}
		
		T max = list.get(0);
		for(T item : list) {
			if(item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
	}
}
