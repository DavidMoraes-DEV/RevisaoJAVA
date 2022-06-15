package RevisaoProgOrientadaObjetos.Classes_E_MetodosFinal.application;

import java.util.Locale;

import RevisaoProgOrientadaObjetos.Classes_E_MetodosFinal.entities.Account;
import RevisaoProgOrientadaObjetos.Classes_E_MetodosFinal.entities.BusinessAccount;
import RevisaoProgOrientadaObjetos.Classes_E_MetodosFinal.entities.SavingsAccount;
import RevisaoProgOrientadaObjetos.Classes_E_MetodosFinal.entities.SavingsAccountPlus;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Account account1 = new Account(1001, "Alex", 1000.00);
		
		System.out.printf("Conta do tipo: ACCOUNT%n");
		System.out.printf("%n- DADOS DA CONTA:%n");
		System.out.println(account1);
		
		Account account2 = new SavingsAccount(1002, "Maria", 1000.00, 0.05);
		
		System.out.printf("%nConta do tipo: SAVINGS ACCOUNT%n");
		System.out.printf("%n- DADOS DA CONTA:%n");
		System.out.println(account2);
		
		Account account3 = new SavingsAccountPlus(1003, "José", 1000.00, 0.01);
		
		System.out.printf("%nConta do tipo: SAVINGS ACCOUNT PLUS%n");
		System.out.printf("%n- DADOS DA CONTA:%n");
		System.out.println(account3);
		
		Account account4 = new BusinessAccount(1004, "Junior", 1000.00, 500.00); 
		
		System.out.printf("%nConta do tipo: BUSINESS ACCOUNT%n"); 
		System.out.printf("%n- DADOS DA CONTA:%n");
		System.out.println(account4);
		
	}
}
/*
* CLASSE FINAL: Nesse exemplo será a classe (SavingsAccountPlus) que será definida como FINAL
	- Objetivo: Impedir a criação de subclasses de SavingsAccountPlus que já é subclasse de SavingAccount que é subclasse da classe base Account.

* Pra que?
	- SEGURANÇA: Dependendo das regras do negócio, às vezes é desejável garantir que uma classe não seja herdada, ou que um método não seja sobreposto.
		- Geralmente convém acrescentar FINAL em métodos sobrepostos, pois sobreposições múltiplas podem ser uma porta de entrada para inconsistências
	
	- PERFORMANCE: Atributos de tipo de uma classe final são analisados de forma mais rápida em tempo de execução.
		- Exemplo clássico: A classe String que é definida como FINAL 
	
*/