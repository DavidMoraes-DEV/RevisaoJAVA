package RevisaoProgOrientadaObjetos.Generics.ConceitoBasico.Solucao01_semGenerics.services;

import java.util.ArrayList;
import java.util.List;

public class PrintService {

	private List<Integer> numbers = new ArrayList<>();
	
	public void addValue(Integer value) {
		numbers.add(value);
	}
	
	public Integer first() {
		
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
