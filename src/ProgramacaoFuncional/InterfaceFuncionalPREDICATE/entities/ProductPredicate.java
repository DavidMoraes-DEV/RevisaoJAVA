package ProgramacaoFuncional.InterfaceFuncionalPREDICATE.entities;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {

	//� uma fun��o booleana padr�o da interface Precidate que executar� a compara��o e retornar� True ou False
	@Override
	public boolean test(Product p) {
		return p.getPrice() >= 100.0;
	}

}
