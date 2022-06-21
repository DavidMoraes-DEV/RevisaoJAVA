package RevisaoProgOrientadaObjetos.Interfaces.ProblemaExLocation;

public class Problematica {

}
/*
* PROBLEMATICA:
 Uma locadora brasileira de carros cobra um valor por hora para locações de até 12 horas.
Porém, se a duração da locação ultrapassar 12 horas, a locação será cobrada com base em um valor diário.
Além do valor da locação, é acrescido no preço o valor do imposto conforme regras do país que, no caso do Brasil
é 20% para valores até 100.00, ou 15% para valores acima de 100.00.
Fazer um programa que lê os dados da locação(Modelo do carro, instante inicial e final da locação)
bem como o valor por hora e o valor diário de locação. O programa deve então gerar a nota de pagamento
contendo valor da locação, valor do imposto e valor total do pagamento e depois informar os dados na tela

* O PRINCIPAL PROBLEMA OCORRIDO NA SOLUÇÃO SEM INTERFACE É O FORTE ACOPLAMENTE ENTRE OS DOIS SERVIÇOS RentalService e BrazilTaxService
	- Se precisar por exemplo criar um novo TaxService como UsaTaxService teria que criar uma nova classe e auterar dois pontos no programa principal devido ao forte acoplamento
	- Sendo nesse ponto que entra a questão da INTERFACE:
		- Utilizando então nesse exemplo uma INTERFACE: TaxService sendo que a classe RentalService terá agora dependencia com a interface e não com o serviço específico
		- Para manutenção aí será apenas necessário trocar a classe BrazilTaxService sem mexer na classe RentalService

EXEMPLOS DE ENTRADA E SAÍDA:

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
* MINHA INTERPRETAÇÃO para resolver futuramente, adicionando mais classes e funcionalidades:
	- Uma locadora brasileira de carros cobra:
		- Por hora para locações de até 12 horas.
		- Por dia para locação acima de 12 horas
			
		- Além do valor da locação, é acrescido no preço o valor do imposto conforme regras do país
			- No Brasil:
				- 20% para valores até 100.00
				- 15% para valores acima de 100.00
	
	- Fazer um programa que lê:
		1º Os dados dos carros que a locadora possui:
			- Modelo
			- Ano
			- Consumo
			- Salvar em um arquivo em formato .csv
			
		2º Os dados do cliente
			- Nome
			- Endereço
		
		3º Os valores para locação:
			- Valor por hora
			- Valor por dia
			
		3º Os dados da locação:
			- Cliente
			- Modelo do carro
			- Inicio da locação
			- Fim da locação
	
	- Depois gerar a nota de pagamento contendo:
		- Cliente
		- Carro
		- Duração
		- Valor do imposto
		- Valor total do pagamento
*/