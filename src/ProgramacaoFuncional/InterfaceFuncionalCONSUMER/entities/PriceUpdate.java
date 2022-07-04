package ProgramacaoFuncional.InterfaceFuncionalCONSUMER.entities;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Product> {

	/*
	* Método padrão DEFAULT da interface CONSUMER:
		- Essa função vai atualizar o preço do produto "p" aumentando o preço em 10% utilizando o método padrão Accept com a lógica definida
	*/
	@Override
	public void accept(Product p) {
		
		p.setPrice(p.getPrice() * 1.1);
		
	}
}