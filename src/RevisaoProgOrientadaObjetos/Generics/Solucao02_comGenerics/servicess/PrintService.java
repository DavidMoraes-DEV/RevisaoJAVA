package RevisaoProgOrientadaObjetos.Generics.Solucao02_comGenerics.servicess;

import java.util.ArrayList;
import java.util.List;

/*
* Definimos que a classe é do tipo "T"(Qualquer tipo)
	- Deixando a classe, seus atributos e métodos compatíveis para receber dados de qualquer tipo
	- Esse tipo será definido ao instanciar a classe PrintService<Tipo que será necessário>
*/
public class PrintService<T> {

	private List<T> numbers = new ArrayList<>();
	
	public void addValue(T value) {
		numbers.add(value);
	}
	
	public T first() {
		
		if (numbers.isEmpty()) {
			throw new IllegalStateException("List is Empty");
		}
		
		return numbers.get(0);
	}
	
	public void print() {
		
		StringBuilder sb = new StringBuilder();
		
		if(!numbers.isEmpty()) {
			sb.append("[" + numbers.get(0));	
		}
		
		for(int i=1; i<numbers.size(); i++) {
			sb.append(", ");
			sb.append(numbers.get(i));
		}
		sb.append("]");
		
		System.out.println(sb.toString());
	}
}
