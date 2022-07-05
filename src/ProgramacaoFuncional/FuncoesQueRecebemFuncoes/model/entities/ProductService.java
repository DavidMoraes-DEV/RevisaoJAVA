package ProgramacaoFuncional.FuncoesQueRecebemFuncoes.model.entities;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {

	//Função filteredSum() recebendo uma outra função como argumento: Predicate<Product>
	public double filteredSum(List<Product> list, Predicate<Product> criteria) {
		
		double sum = 0.0;
		for(Product p : list) {
			
			//Passando o método da função Predicate<Product> para testar o produto "p"
			if(criteria.test(p)) {
				sum += p.getPrice();
			}
		}
	return sum;	
	}
}