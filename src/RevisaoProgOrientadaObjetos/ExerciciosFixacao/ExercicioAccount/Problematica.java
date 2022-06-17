package RevisaoProgOrientadaObjetos.ExerciciosFixacao.ExercicioAccount;

public class Problematica {

}
/*
 * PROBLEMÁTICA
 	- Fazer um programa para ler os dados de uma conta bancária.
 	- Depois realizar um saque nesta conta bancária.
 	- Mostrar o novo Saldo
 	- REGRAS DE SAQUE:
 		- NÃO pode ocorrer o saque:
 			- Se não houver saldo na conta
 			- Se o valor do saque for superior ao limite de saque da conta.

* EXEMPLOS DE ENTRADA E SAÍDA DE DADOS:

	Enter account data
	Number: 8021
	Holder: Bob Brown
	Initial balance: 500.00
	Withdraw limit: 300.00
	
	Enter amount for withdraw: 100.00
	New balance: 400.00
	
* POSSÍVEIS ERROS:

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