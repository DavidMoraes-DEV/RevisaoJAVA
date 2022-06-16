package RevisaoProgOrientadaObjetos.ExerciciosFixacao.ExercicioContribuinte.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import RevisaoProgOrientadaObjetos.ExerciciosFixacao.ExercicioContribuinte.entities.LegalPerson;
import RevisaoProgOrientadaObjetos.ExerciciosFixacao.ExercicioContribuinte.entities.PhysicalPerson;
import RevisaoProgOrientadaObjetos.ExerciciosFixacao.ExercicioContribuinte.entities.TaxPayer;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> taxPayers = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int qtd = sc.nextInt();
		
		for(int i=0; i<qtd; i++) {
			
			System.out.printf("%nTax payer #%d data: ", i+1);
			
			System.out.printf("Individual or Company (i/c)? ");
			char posicao = sc.next().charAt(0);
			
			System.out.print("Name: ");
			String taxPayerName = sc.next();
			
			System.out.printf("Annual income: ");
			Double taxPayerAnnualIncome = sc.nextDouble();
			
			if (posicao == 'i') {
				System.out.printf("Health expenditures: ");
				Double spending	= sc.nextDouble();
				
				taxPayers.add(new PhysicalPerson(taxPayerName, taxPayerAnnualIncome, spending));
			} else if (posicao == 'c') {
				System.out.printf("Number of employees: ");
				Integer taxPayerNumberEmployees = sc.nextInt();
				
				taxPayers.add(new LegalPerson(taxPayerName, taxPayerAnnualIncome, taxPayerNumberEmployees));
			}
			
		}
	
		Double totalTaxes = 0.0;
		
		System.out.printf("%nTAXES PAID: %n");
		for(TaxPayer obj : taxPayers) {
			System.out.println(obj.getName() + ": $ " + String.format("%.2f", obj.tax()));
			totalTaxes += obj.tax();
		}
		
		System.out.printf("%nTOTAL TAXES: $ " + String.format("%.2f", totalTaxes));
		sc.close();
	}
}
/*
* EXERCICIO:
	- Fazer um programa para ler os dados de N contribuintes (N fornecido pelo usu�rio), os quais podem ser pessoa f�sica ou pessoa jur�dica
	- Mostrar o valor do imposto pago por cada um, bem como o total de imposto arrecadado.
	- Os dados de pessoa f�sica s�o: Nome, Renda anual e gastos com sa�de.
	- Os dados de pessoa jur�dica s�o: Nome, Renda anual e quantidade de funcion�rios
	
	* REGRAS PARA C�LCULO DE IMPOSTO:
		- PESSOA F�SICA:
			- Pessoas cuja renda foi abaixo de 20000.00 pagam 15% de imposto.
			- Pessoas com renda de 20000.00 em diante pagam 25� de imposto.
			- SE a pessoas teve gastos com sa�de, 50% destes gastos s�o abatidos no imposto.
				- EXEMPLO: RENDA de 50000.00 teve 2000.00 em gastos com sa�de, o imposto fica: (50000 * 25%) - (2000 * 50%) = 11500.00 
		
		- PESSOA JUR�DICA:
			- Pessoas jur�dicas pagam 16% de imposto. Por�m, se a empresa possuir mais de 10 funcion�rios, ela paga 14% de imposto.
				- EXEMPLO: RENDA de 400000.00 e 25 funcion�rios, o imposto fica: 400000.00 & 14% = 56000.00
*/