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
	
		//Brasil tem juros compostos de 2.0%
		Loan loan = new Loan(qtdMonths, amount, new BrazilInterestService(2.0));
		String finishValue = String.format("%.2f", loan.getInterestService().payment(loan));
		
		
		System.out.printf("Amount for Payment Brazil: " + finishValue);

		//USA tem juros compostos de 1.0%
		loan = new Loan(qtdMonths, amount, new UsaInterestService(1.0));
		finishValue = String.format("%.2f", loan.getInterestService().payment(loan));
		
		System.out.printf("%nAmount for Payment USA: " + finishValue);
		
		sc.close();
	}
}