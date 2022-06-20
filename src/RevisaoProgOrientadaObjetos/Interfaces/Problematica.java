package RevisaoProgOrientadaObjetos.Interfaces;

public class Problematica {

}
/*
* PROBLEMATICA:
 Uma locadora brasileira de carros cobra um valor por hora para loca��es de at� 12 horas.
Por�m, se a dura��o da loca��o ultrapassar 12 horas, a loca��o ser� cobrada com base em um valor di�rio.
Al�m do valor da loca��o, � acrescido no pre�o o valor do imposto conforme regras do pa�s que, no caso do Brasil
� 20% para valores at� 100.00, ou 15% para valores acima de 100.00.
Fazer um programa que l� os dados da loca��o(Modelo do carro, instante inicial e final da loca��o)
bem como o valor por hora e o valor di�rio de loca��o. O programa deve ent�o gerar a nota de pagamento
contendo valor da loca��o, valor do imposto e valor total do pagamento e depois informar os dados na tela

EXEMPLOS DE ENTRADA E SA�DA:

Enter rental data:
Car model: Civic
Pickup (dd/MM/yyyy hh:ss): 25/06/2018 10:30
Return (dd/MM/yyyy hh:ss): 25/06/2018 14:40
Enter price per hour: 10.00
Enter price per day: 130.00

INVOICE:
Basic payment: 50.00
Tax: 10.00
Total payment: 60.00 


//LEMBRETE:
* MINHA INTERPRETA��O para resolver futuramente, adicionando mais classes e funcionalidades:
	- Uma locadora brasileira de carros cobra:
		- Por hora para loca��es de at� 12 horas.
		- Por dia para loca��o acima de 12 horas
			
		- Al�m do valor da loca��o, � acrescido no pre�o o valor do imposto conforme regras do pa�s
			- No Brasil:
				- 20% para valores at� 100.00
				- 15% para valores acima de 100.00
	
	- Fazer um programa que l�:
		1� Os dados dos carros que a locadora possui:
			- Modelo
			- Ano
			- Consumo
			- Salvar em um arquivo em formato .csv
			
		2� Os dados do cliente
			- Nome
			- Endere�o
		
		3� Os valores para loca��o:
			- Valor por hora
			- Valor por dia
			
		3� Os dados da loca��o:
			- Cliente
			- Modelo do carro
			- Inicio da loca��o
			- Fim da loca��o
	
	- Depois gerar a nota de pagamento contendo:
		- Cliente
		- Carro
		- Dura��o
		- Valor do imposto
		- Valor total do pagamento
*/