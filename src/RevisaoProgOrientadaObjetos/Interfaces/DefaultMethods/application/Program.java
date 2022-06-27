package RevisaoProgOrientadaObjetos.Interfaces.DefaultMethods.application;

import java.util.Locale;
import java.util.Scanner;

import RevisaoProgOrientadaObjetos.Interfaces.DefaultMethods.model.entities.Loan;
import RevisaoProgOrientadaObjetos.Interfaces.DefaultMethods.model.services.BrazilInterestService;
import RevisaoProgOrientadaObjetos.Interfaces.DefaultMethods.model.services.UsaInterestService;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Amount: ");
		Double amount = sc.nextDouble();
		
		System.out.print("Months: ");
		Integer qtdMonths = sc.nextInt();
	
		Loan loan = new Loan(qtdMonths, amount, new BrazilInterestService());
		String finishValue = String.format("%.2f", loan.getInterestService().payment(amount, qtdMonths));
		
		
		System.out.printf("Amount for Payment Brazil: " + finishValue);
		
		loan = new Loan(qtdMonths, amount, new UsaInterestService());
		finishValue = String.format("%.2f", loan.getInterestService().payment(amount, qtdMonths));
		
		System.out.printf("%nAmount for Payment USA: " + finishValue);
		
		sc.close();
	}
}