package RevisaoProgOrientadaObjetos.ExerciciosFixacao.ExercicioContract.application;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import RevisaoProgOrientadaObjetos.ExerciciosFixacao.ExercicioContract.model.entities.Contract;
import RevisaoProgOrientadaObjetos.ExerciciosFixacao.ExercicioContract.model.services.PaypalPaymentService;
import RevisaoProgOrientadaObjetos.ExerciciosFixacao.ExercicioContract.model.services.ProcessingService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
			System.out.println("Enter contract data:");
			System.out.print("Number: ");
			int contractNumber = sc.nextInt();

			System.out.print("Date (dd/mm/yyyy): ");
			Date contractStart = sdf.parse(sc.next());
			
			System.out.print("Contract value: ");
			Double contractValue = sc.nextDouble();
			
			Contract contract = new Contract(contractNumber, contractStart, contractValue);
			
			System.out.printf("%nEnter number of installments: ");
			Integer numberInstallments = sc.nextInt();
			
			ProcessingService processingService = new ProcessingService(numberInstallments, new PaypalPaymentService());
			processingService.processInstallments(contract);
			
			System.out.printf("%nInstallments:%n");
			System.out.println(contract);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.getStackTrace();
		} finally {
			sc.close();
		}
	}

}
