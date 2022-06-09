package RevisaoConceitoJAVA.Enumeracao;

import java.util.Date;

public class RevisaoEnumeracoesEmJAVA {

	public static void main(String[] args) {

		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
		//CONVERS�O DE STRING PARA ENUM
		OrderStatus os1 = OrderStatus.DELIVERED; //Tipo enumerado
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED"); //Tipo String
		
		System.out.println(os1);
		System.out.println(os2);
		
	}
}
/*
* CHECKLIST:
 	- Defini��o / Discuss�o
 	- Exemplo: Estados de um pedido
 	- Convers�o de string para enum
 	- Representa��o UML
 	
* BASE TE�RICA:
	- � um tipo especial que serve para especificar de forma literal um conjunto de constantes relacionadas
	- Palavra chave em JAVA: enum
	- Vantagem: Melhor sem�ntica, c�digo mais leg�vel e auxiliado pelo compilador.


*/
