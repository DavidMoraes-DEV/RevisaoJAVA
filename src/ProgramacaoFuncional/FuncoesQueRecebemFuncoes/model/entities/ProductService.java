package ProgramacaoFuncional.FuncoesQueRecebemFuncoes.model.entities;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {

	//Fun��o filteredSum() recebendo uma outra fun��o como argumento: Predicate<Product>
	public double filteredSum(List<Product> list, Predicate<Product> criteria) {
		
		double sum = 0.0;
		for(Product p : list) {
			
			//Passando o m�todo da fun��o Predicate<Product> para testar o produto "p"
			if(criteria.test(p)) {
				sum += p.getPrice();
			}
		}
	return sum;	
	}
}