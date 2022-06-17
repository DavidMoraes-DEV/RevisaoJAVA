package RevisaoProgOrientadaObjetos.TratamentoDeExcecoes.ExcecoesPersonalizadas;
class Problematica {}
/*
 * PARA MELHOR COMPREEN��O DA IMPORTANCIA DO TRATAMENTO DE EXCE��ES ADEQUADAS SER� RESOLVIDO ESSE PROBLEMA ABAIXO DE TR�S FORMAS:
	- SOLU��O MUITO RUIM: Aplicar toda l�gica de programa��o no programa principal
	- SOLU��O RUIM: Implementar um m�todo para retornar a mensagem de erro como String
	- SOLU��O BOA: Utilizar o TRATAMENTO DE EXCE��ES de forma adequada
	
	- Solu��o 1 (MUITO RUIM): l�gica de valida��o no programa principal
		- L�gica de valida��o n�o delegada � reserva
		
	- Solu��o 2 (RUIM): m�todo retornando string
		- A sem�ntica da opera��o � prejudicada
		- Retornar string n�o tem nada a ver com atualiza��o de reserva
		- E se a opera��o tivesse que retornar um string?
		- Ainda n�o � poss�vel tratar exce��es em construtores
		- Ainda n�o h� aux�lio do compilador: o programador deve "lembrar" de verificar se houver erro
		- A l�gica fica estruturada em condicionais aninhadas
		
	- Solu��o 3 (BOA): Tratamento de exce��es
		- De forma adequada
		
 * INFORMA��ES IMPORTANTES:  
	- Cl�usula throws: propaga a exce��o ao inv�s de trata-la
	- Cl�usula throw: lan�a a exce��o / "corta" o m�todo
 	- Exception: compilador obriga a tratar ou propagar
	- RuntimeException: compilador n�o obriga
 
 	- O modelo de tratamento de exce��es permite que erros sejam tratados de forma consistente e flex�vel, usando boas pr�ticas
 		- Vantagens:
			- L�gica delegada
			- Construtores podem ter tratamento de exce��es
			- Possibilidade de aux�lio do compilador (Exception)
			- C�digo mais simples. N�o h� aninhamento de condicionais: a qualquer momento que uma exce��o for disparada, a execu��o � interrompida e cai no bloco catch correspondente.
			- � poss�vel capturar inclusive outras exce��es de sistema
 
* PROBLEM�TICA:
	- Fazer um programa para ler os dados de uma reserva de hotel
	- Contendo: N�mero do quarto, data de entrada e data de sa�da
	- Mostrar os dados da reserva, inclusive sua dura��o em dias.
	- Depois ler novas datas de entrada e sa�da.
	- Atualizar a reserva com esses novos dados.
	- Mostrar novamente os dados atualizados da reserva
	- O programa n�o deve aceitar dados inv�lidos conforme as REGRAS:
		- Altera��es de reserva s� podem ocorrer para datas futuras
		- A data de sa�da deve ser maior que a data de entrada
		
	- EXEMPLOS DE ENTRADA E SA�DA DE DADOS
		- ENTRADAS DE DADOS:
			Room number: 8021
			Check-in date (dd/MM/yyyy): 23/09/2030
			Check-out date (dd/MM/yyyy): 26/09/2030
			Reservation: Room 8021, check-in: 23/09/2030, check-out: 26/09/2030, 3 nights
			
			Enter data to update the reservation:
			Check-in date (dd/MM/yyyy): 24/09/2030
			Check-out date (dd/MM/yyyy): 29/09/2030
			Reservation: Room 8021, check-in: 24/09/2030, check-out: 29/09/2030, 5 nights

		- POSS�VEIS ERROS(EXCE��ES) AO INSERIR OS DADOS:
			- POSSIBILIDADE 1: Digitar uma data de entrada superior a data de sa�da no momento do cadastro inicial da reserva.
				Room number: 8021
				Check-in date (dd/MM/yyyy): 23/09/2030
				Check-out date (dd/MM/yyyy): 21/09/2030
				Error in reservation: Check-out date must be after check-in date                -> O programa deve conseguir detectar essa exce��o e trata-la para gerar esse aviso sem interromper o sistema

			- POSSIBILIDADE 2: N�o pode ser poss�vel atualizar uma reserva com datas abaixo da data de reserva.
				Room number: 8021
				Check-in date (dd/MM/yyyy): 23/09/2030
				Check-out date (dd/MM/yyyy): 26/09/2030
				Reservation: Room 8021, check-in: 23/09/2030, check-out: 26/09/2030, 3 nights
				
				Enter data to update the reservation:
				Check-in date (dd/MM/yyyy): 24/09/2015
				Check-out date (dd/MM/yyyy): 29/09/2015
				Error in reservation: Reservation dates for update must be future dates         -> A data de reserva deve ser data futura
				
			- POSSIBILIDADE 3: Digitar uma data de entrada superior a data de sa�da na atualiza��o de dados da reserva.
				Room number: 8021
				Check-in date (dd/MM/yyyy): 23/09/2030
				Check-out date (dd/MM/yyyy): 26/09/2030
				Reservation: Room 8021, check-in: 23/09/2030, check-out: 26/09/2030, 3 nights
				
				Enter data to update the reservation:
				Check-in date (dd/MM/yyyy): 24/09/2040
				Check-out date (dd/MM/yyyy): 22/09/2040
				Error in reservation: Check-out date must be after check-in date
*/