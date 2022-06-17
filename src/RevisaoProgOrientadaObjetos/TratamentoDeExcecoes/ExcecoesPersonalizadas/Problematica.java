package RevisaoProgOrientadaObjetos.TratamentoDeExcecoes.ExcecoesPersonalizadas;
class Problematica {}
/*
 * PARA MELHOR COMPREEN��O DA IMPORTANCIA DO TRATAMENTO DE EXCE��ES ADEQUADAS SER� RESOLVIDO ESSE PROBLEMA ABAIXO DE TR�S FORMAS:
   - SOLU��O MUITO RUIM: Aplicar toda l�gica de programa��o no programa principal
   - SOLU��O RUIM: Implementar um m�todo para retornar a mensagem de erro como String
   - SOLU��O BOA: Utilizar o TRATAMENTO DE EXCE��ES de forma adequada
 
* Fazer um programa para ler os dados de uma reserva de hotel:
	- Contendo: N�mero do quarto, data de entrada e data de sa�da
	- Mostrar os dados da reserva, inclusive sua dura��o em dias.
	- Depois ler novas datas de entrada e sa�da.
	- Atualizar a reserva com esses novos dados.
	- Mostrar novamente os dados atualizados da reserva
	- O programa n�o deve aceitar dados inv�lidos conforme as REGRAS:
		- Altera��es de reserva s� podem ocorrer para datas futuras
		- A data de sa�da deve ser maior que a data de entrada
		
* EXEMPLOS DE ENTRADA E SA�DA DE DADOS

	- EXEMPLOS
		- ENTRADAS DE DADOS:
			Room number: 8021
			Check-in date (dd/MM/yyyy): 23/09/2019
			Check-out date (dd/MM/yyyy): 26/09/2019
			Reservation: Room 8021, check-in: 23/09/2019, check-out: 26/09/2019, 3 nights
			
			Enter data to update the reservation:
			Check-in date (dd/MM/yyyy): 24/09/2019
			Check-out date (dd/MM/yyyy): 29/09/2019
			Reservation: Room 8021, check-in: 24/09/2019, check-out: 29/09/2019, 5 nights

		- POSS�VEIS ERROS(EXCE��ES) AO INSERIR OS DADOS:
			- POSSIBILIDADE 1: Digitar uma data de entrada superior a data de sa�da no momento do cadastro inicial da reserva.
				Room number: 8021
				Check-in date (dd/MM/yyyy): 23/09/2019
				Check-out date (dd/MM/yyyy): 21/09/2019
				Error in reservation: Check-out date must be after check-in date                -> O programa deve conseguir detectar essa exce��o e trata-la para gerar esse aviso sem interromper o sistema

			- POSSIBILIDADE 2: N�o pode ser poss�vel atualizar uma reserva com datas abaixo da data de reserva.
				Room number: 8021
				Check-in date (dd/MM/yyyy): 23/09/2019
				Check-out date (dd/MM/yyyy): 26/09/2019
				Reservation: Room 8021, check-in: 23/09/2019, check-out: 26/09/2019, 3 nights
				
				Enter data to update the reservation:
				Check-in date (dd/MM/yyyy): 24/09/2015
				Check-out date (dd/MM/yyyy): 29/09/2015
				Error in reservation: Reservation dates for update must be future dates         -> A data de reserva deve ser data futura
				
			- POSSIBILIDADE 3: Digitar uma data de entrada superior a data de sa�da na atualiza��o de dados da reserva.
				Room number: 8021
				Check-in date (dd/MM/yyyy): 23/09/2019
				Check-out date (dd/MM/yyyy): 26/09/2019
				Reservation: Room 8021, check-in: 23/09/2019, check-out: 26/09/2019, 3 nights
				
				Enter data to update the reservation:
				Check-in date (dd/MM/yyyy): 24/09/2020
				Check-out date (dd/MM/yyyy): 22/09/2020
				Error in reservation: Check-out date must be after check-in date
*/