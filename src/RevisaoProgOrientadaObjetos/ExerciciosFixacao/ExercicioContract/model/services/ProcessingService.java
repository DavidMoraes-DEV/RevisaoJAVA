package RevisaoProgOrientadaObjetos.ExerciciosFixacao.ExercicioContract.model.services;

import java.util.Calendar;
import java.util.Date;

import RevisaoProgOrientadaObjetos.ExerciciosFixacao.ExercicioContract.model.entities.Contract;
import RevisaoProgOrientadaObjetos.ExerciciosFixacao.ExercicioContract.model.entities.Installments;

public class ProcessingService {

	private Integer numberInstallments;
	private PaymentService paymentService;
	
	public ProcessingService(Integer numberInstallments, PaymentService paymentService) {
		this.numberInstallments = numberInstallments;
		this.paymentService = paymentService;
	}

	public void processInstallments(Contract contract) {
		
		//Valor inicial da parcela baseada na quantidade de parcelas
		Double initialInstallmentAmount = contract.getTotalValue() / numberInstallments;
		
		Calendar cal = Calendar.getInstance();
		
		for (int i=1; i <= numberInstallments; i++) {
			
			int days = i * 30; //Multiplica o numero da parcela por 30 dias para encontrar a quantidade de dias para vencer a parcela.
			cal.setTime(contract.getStart()); //Adiciona a data do contrato na variável CAL que é do tipo CALENDAR.
			cal.add(Calendar.DAY_OF_MONTH, days); //Adicionar a quantidade de dias APARTIR da data do contrato para se obter a data de vencimento da parcela.
			
			Date dateInstallment = cal.getTime(); //Atribui a data da parcela atual na variável dateInstallment.

			//Valor final da parcela aplicando os juros e taxas cobradas por um serviço de pagamento online.
			Double finalInstallmentAmount = paymentService.payment(initialInstallmentAmount, i);

			contract.addInstallment(new Installments(dateInstallment, finalInstallmentAmount));
		}
	}
}
