package RevisaoProgOrientadaObjetos.ExerciciosFixacao.ExercicioAccount.application;

import java.util.Locale;
import java.util.Scanner;

import RevisaoProgOrientadaObjetos.ExerciciosFixacao.ExercicioAccount.model.entities.Account;
import RevisaoProgOrientadaObjetos.ExerciciosFixacao.ExercicioAccount.model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("Enter account data:");
			
			System.out.printf("Number: ");
			Integer accountNumber = sc.nextInt();
			
			System.out.printf("Holder: ");
			sc.nextLine();
			String accountHolder = sc.nextLine();
			
			System.out.printf("Initial Balance: ");
			Double initialBalance = sc.nextDouble();
			
			System.out.printf("Withdraw Limit: ");
			Double withdrawLimit = sc.nextDouble();
			
			Account account = new Account(accountNumber, accountHolder, initialBalance, withdrawLimit);
			
			System.out.printf("%nEnter amount for withdraw: ");
			account.withdraw(sc.nextDouble());
			
			System.out.printf("%nNew balance: %.2f", account.getBalance());
			
		} catch (DomainException e) {
			
			System.out.println("Withdraw error: " + e.getMessage());
			
		} catch (RuntimeException e) {
			
			System.out.println("Unexpected Error!!!");
			
		} finally {
			
			sc.close();
			
		}
	}
}
