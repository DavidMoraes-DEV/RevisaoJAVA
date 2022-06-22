package RevisaoProgOrientadaObjetos.ExerciciosFixacao.ExercicioContract.SolucaoCurso.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import RevisaoProgOrientadaObjetos.ExerciciosFixacao.ExercicioContract.SolucaoCurso.model.entities.Contract;
import RevisaoProgOrientadaObjetos.ExerciciosFixacao.ExercicioContract.SolucaoCurso.model.entities.Installment;
import RevisaoProgOrientadaObjetos.ExerciciosFixacao.ExercicioContract.SolucaoCurso.model.services.ContractService;
import RevisaoProgOrientadaObjetos.ExerciciosFixacao.ExercicioContract.SolucaoCurso.model.services.PaypalService;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

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

		ContractService processingService = new ContractService(new PaypalService());
		processingService.processInstallments(contract, numberInstallments);

		System.out.printf("%nInstallments:%n");
		for (Installment it : contract.getInstallments()) {
			System.out.println(it);
		}

		sc.close();
	}
}
