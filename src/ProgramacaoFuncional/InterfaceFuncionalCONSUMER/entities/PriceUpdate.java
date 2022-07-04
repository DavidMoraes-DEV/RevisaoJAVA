package ProgramacaoFuncional.InterfaceFuncionalCONSUMER.entities;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Product> {

	/*
	* M�todo padr�o DEFAULT da interface CONSUMER:
		- Essa fun��o vai atualizar o pre�o do produto "p" aumentando o pre�o em 10% utilizando o m�todo padr�o Accept com a l�gica definida
	*/
	@Override
	public void accept(Product p) {
		
		p.setPrice(p.getPrice() * 1.1);
		
	}
}