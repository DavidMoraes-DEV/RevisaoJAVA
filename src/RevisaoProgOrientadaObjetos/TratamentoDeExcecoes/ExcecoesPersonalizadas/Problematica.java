package RevisaoProgOrientadaObjetos.TratamentoDeExcecoes.ExcecoesPersonalizadas;
class Problematica {}
/*
 * PARA MELHOR COMPREENÇÃO DA IMPORTANCIA DO TRATAMENTO DE EXCEÇÕES ADEQUADAS SERÁ RESOLVIDO ESSE PROBLEMA ABAIXO DE TRÊS FORMAS:
   - SOLUÇÃO MUITO RUIM: Aplicar toda lógica de programação no programa principal
   - SOLUÇÃO RUIM: Implementar um método para retornar a mensagem de erro como String
   - SOLUÇÃO BOA: Utilizar o TRATAMENTO DE EXCEÇÕES de forma adequada
 
* Fazer um programa para ler os dados de uma reserva de hotel:
	- Contendo: Número do quarto, data de entrada e data de saída
	- Mostrar os dados da reserva, inclusive sua duração em dias.
	- Depois ler novas datas de entrada e saída.
	- Atualizar a reserva com esses novos dados.
	- Mostrar novamente os dados atualizados da reserva
	- O programa não deve aceitar dados inválidos conforme as REGRAS:
		- Alterações de reserva só podem ocorrer para datas futuras
		- A data de saída deve ser maior que a data de entrada
		
* EXEMPLOS DE ENTRADA E SAÍDA DE DADOS

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

		- POSSÍVEIS ERROS(EXCEÇÕES) AO INSERIR OS DADOS:
			- POSSIBILIDADE 1: Digitar uma data de entrada superior a data de saída no momento do cadastro inicial da reserva.
				Room number: 8021
				Check-in date (dd/MM/yyyy): 23/09/2019
				Check-out date (dd/MM/yyyy): 21/09/2019
				Error in reservation: Check-out date must be after check-in date                -> O programa deve conseguir detectar essa exceção e trata-la para gerar esse aviso sem interromper o sistema

			- POSSIBILIDADE 2: Não pode ser possível atualizar uma reserva com datas abaixo da data de reserva.
				Room number: 8021
				Check-in date (dd/MM/yyyy): 23/09/2019
				Check-out date (dd/MM/yyyy): 26/09/2019
				Reservation: Room 8021, check-in: 23/09/2019, check-out: 26/09/2019, 3 nights
				
				Enter data to update the reservation:
				Check-in date (dd/MM/yyyy): 24/09/2015
				Check-out date (dd/MM/yyyy): 29/09/2015
				Error in reservation: Reservation dates for update must be future dates         -> A data de reserva deve ser data futura
				
			- POSSIBILIDADE 3: Digitar uma data de entrada superior a data de saída na atualização de dados da reserva.
				Room number: 8021
				Check-in date (dd/MM/yyyy): 23/09/2019
				Check-out date (dd/MM/yyyy): 26/09/2019
				Reservation: Room 8021, check-in: 23/09/2019, check-out: 26/09/2019, 3 nights
				
				Enter data to update the reservation:
				Check-in date (dd/MM/yyyy): 24/09/2020
				Check-out date (dd/MM/yyyy): 22/09/2020
				Error in reservation: Check-out date must be after check-in date
*/