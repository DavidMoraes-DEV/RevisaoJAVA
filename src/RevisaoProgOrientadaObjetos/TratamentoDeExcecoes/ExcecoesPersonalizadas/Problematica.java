package RevisaoProgOrientadaObjetos.TratamentoDeExcecoes.ExcecoesPersonalizadas;
class Problematica {}
/*
 * PARA MELHOR COMPREENÇÃO DA IMPORTANCIA DO TRATAMENTO DE EXCEÇÕES ADEQUADAS SERÁ RESOLVIDO ESSE PROBLEMA ABAIXO DE TRÊS FORMAS:
	- SOLUÇÃO MUITO RUIM: Aplicar toda lógica de programação no programa principal
	- SOLUÇÃO RUIM: Implementar um método para retornar a mensagem de erro como String
	- SOLUÇÃO BOA: Utilizar o TRATAMENTO DE EXCEÇÕES de forma adequada
	
	- Solução 1 (MUITO RUIM): lógica de validação no programa principal
		- Lógica de validação não delegada à reserva
		
	- Solução 2 (RUIM): método retornando string
		- A semântica da operação é prejudicada
		- Retornar string não tem nada a ver com atualização de reserva
		- E se a operação tivesse que retornar um string?
		- Ainda não é possível tratar exceções em construtores
		- Ainda não há auxílio do compilador: o programador deve "lembrar" de verificar se houver erro
		- A lógica fica estruturada em condicionais aninhadas
		
	- Solução 3 (BOA): Tratamento de exceções
		- De forma adequada
		
 * INFORMAÇÕES IMPORTANTES:  
	- Cláusula throws: propaga a exceção ao invés de trata-la
	- Cláusula throw: lança a exceção / "corta" o método
 	- Exception: compilador obriga a tratar ou propagar
	- RuntimeException: compilador não obriga
 
 	- O modelo de tratamento de exceções permite que erros sejam tratados de forma consistente e flexível, usando boas práticas
 		- Vantagens:
			- Lógica delegada
			- Construtores podem ter tratamento de exceções
			- Possibilidade de auxílio do compilador (Exception)
			- Código mais simples. Não há aninhamento de condicionais: a qualquer momento que uma exceção for disparada, a execução é interrompida e cai no bloco catch correspondente.
			- É possível capturar inclusive outras exceções de sistema
 
* PROBLEMÁTICA:
	- Fazer um programa para ler os dados de uma reserva de hotel
	- Contendo: Número do quarto, data de entrada e data de saída
	- Mostrar os dados da reserva, inclusive sua duração em dias.
	- Depois ler novas datas de entrada e saída.
	- Atualizar a reserva com esses novos dados.
	- Mostrar novamente os dados atualizados da reserva
	- O programa não deve aceitar dados inválidos conforme as REGRAS:
		- Alterações de reserva só podem ocorrer para datas futuras
		- A data de saída deve ser maior que a data de entrada
		
	- EXEMPLOS DE ENTRADA E SAÍDA DE DADOS
		- ENTRADAS DE DADOS:
			Room number: 8021
			Check-in date (dd/MM/yyyy): 23/09/2030
			Check-out date (dd/MM/yyyy): 26/09/2030
			Reservation: Room 8021, check-in: 23/09/2030, check-out: 26/09/2030, 3 nights
			
			Enter data to update the reservation:
			Check-in date (dd/MM/yyyy): 24/09/2030
			Check-out date (dd/MM/yyyy): 29/09/2030
			Reservation: Room 8021, check-in: 24/09/2030, check-out: 29/09/2030, 5 nights

		- POSSÍVEIS ERROS(EXCEÇÕES) AO INSERIR OS DADOS:
			- POSSIBILIDADE 1: Digitar uma data de entrada superior a data de saída no momento do cadastro inicial da reserva.
				Room number: 8021
				Check-in date (dd/MM/yyyy): 23/09/2030
				Check-out date (dd/MM/yyyy): 21/09/2030
				Error in reservation: Check-out date must be after check-in date                -> O programa deve conseguir detectar essa exceção e trata-la para gerar esse aviso sem interromper o sistema

			- POSSIBILIDADE 2: Não pode ser possível atualizar uma reserva com datas abaixo da data de reserva.
				Room number: 8021
				Check-in date (dd/MM/yyyy): 23/09/2030
				Check-out date (dd/MM/yyyy): 26/09/2030
				Reservation: Room 8021, check-in: 23/09/2030, check-out: 26/09/2030, 3 nights
				
				Enter data to update the reservation:
				Check-in date (dd/MM/yyyy): 24/09/2015
				Check-out date (dd/MM/yyyy): 29/09/2015
				Error in reservation: Reservation dates for update must be future dates         -> A data de reserva deve ser data futura
				
			- POSSIBILIDADE 3: Digitar uma data de entrada superior a data de saída na atualização de dados da reserva.
				Room number: 8021
				Check-in date (dd/MM/yyyy): 23/09/2030
				Check-out date (dd/MM/yyyy): 26/09/2030
				Reservation: Room 8021, check-in: 23/09/2030, check-out: 26/09/2030, 3 nights
				
				Enter data to update the reservation:
				Check-in date (dd/MM/yyyy): 24/09/2040
				Check-out date (dd/MM/yyyy): 22/09/2040
				Error in reservation: Check-out date must be after check-in date
*/