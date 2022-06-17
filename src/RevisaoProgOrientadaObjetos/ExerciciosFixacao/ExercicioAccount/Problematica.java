package RevisaoProgOrientadaObjetos.ExerciciosFixacao.ExercicioAccount;

public class Problematica {

}
/*
 * PROBLEM�TICA
 	- Fazer um programa para ler os dados de uma conta banc�ria.
 	- Depois realizar um saque nesta conta banc�ria.
 	- Mostrar o novo Saldo
 	- REGRAS DE SAQUE:
 		- N�O pode ocorrer o saque:
 			- Se n�o houver saldo na conta
 			- Se o valor do saque for superior ao limite de saque da conta.

* EXEMPLOS DE ENTRADA E SA�DA DE DADOS:

	Enter account data
	Number: 8021
	Holder: Bob Brown
	Initial balance: 500.00
	Withdraw limit: 300.00
	
	Enter amount for withdraw: 100.00
	New balance: 400.00
	
* POSS�VEIS ERROS:

	- ERRO 01:
		Enter account data
		Number: 8021
		Holder: Bob Brown
		Initial balance: 0.0
		Withdraw limit: 300.00
	
		Enter amount for withdraw: 300.00
		Withdraw error: No account balance
	
	- ERRO 02:
		Enter account data
		Number: 8021
		Holder: Bob Brown
		Initial balance: 500.00
		Withdraw limit: 300.00
	
		Enter amount for withdraw: 800.00
		Withdraw error: The amount exceeds withdraw limit
	
	- ERRO 03:
		Enter account data
		Number: 8021
		Holder: Bob Brown
		Initial balance: 200.00
		Withdraw limit: 300.00
	
		Enter amount for withdraw: 250.00
		Withdraw error: Not enough balance
*/