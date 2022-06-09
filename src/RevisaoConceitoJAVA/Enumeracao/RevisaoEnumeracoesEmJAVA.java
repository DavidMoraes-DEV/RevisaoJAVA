package RevisaoConceitoJAVA.Enumeracao;

import java.util.Date;

public class RevisaoEnumeracoesEmJAVA {

	public static void main(String[] args) {

		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
		//CONVERSÃO DE STRING PARA ENUM
		OrderStatus os1 = OrderStatus.DELIVERED; //Tipo enumerado
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED"); //Tipo String
		
		System.out.println(os1);
		System.out.println(os2);
		
	}
}
/*
* CHECKLIST:
 	- Definição / Discussão
 	- Exemplo: Estados de um pedido
 	- Conversão de string para enum
 	- Representação UML
 	
* BASE TEÓRICA:
	- É um tipo especial que serve para especificar de forma literal um conjunto de constantes relacionadas
	- Palavra chave em JAVA: enum
	- Vantagem: Melhor semãntica, código mais legível e auxiliado pelo compilador.


*/
