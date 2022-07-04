package ProgramacaoFuncional.InterfaceFuncionalPREDICATE.entities;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {

	//É uma função booleana padrão da interface Precidate que executará a comparação e retornará True ou False
	@Override
	public boolean test(Product p) {
		return p.getPrice() >= 100.0;
	}

}
