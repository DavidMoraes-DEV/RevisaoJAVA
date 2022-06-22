package RevisaoProgOrientadaObjetos.ExerciciosFixacao.ExercicioContract.SolucaoCurso.model.services;

import java.util.Calendar;
import java.util.Date;

import RevisaoProgOrientadaObjetos.ExerciciosFixacao.ExercicioContract.SolucaoCurso.model.entities.Contract;
import RevisaoProgOrientadaObjetos.ExerciciosFixacao.ExercicioContract.SolucaoCurso.model.entities.Installment;

public class ContractService {

	/*
	* PRINCIPIO SOLID:
		- A classe deve ser
			- ABERTA para exten��o
			- FECHADA para altera��o.
			
	 	- Por esse motivo utilizamos a interface OnlinePaymentService
		- Para que se o m�todo de pagamento mudar ou ter outro m�todo de pagamento
			- N�o ser� necess�rio alterar a classe ContractService por conta da interface que � um tipo gen�rico
	
	* PRINCIPIO DA INVER��O DE CONTROLE:
		- N�o pode deixar a pr�pria classe respons�vel pelo controle de QUAL INSTANCIA ela vai precisar para executar
		- Quem tem que controlar qual inst�ncia do objeto dependente que ser� instanciada ser� um agente externo que entregar� a instancia
			- Nesse exemplo � a classe Program que DECLARA e enviar a instancia NEW PAYPALSERVICE
				- Fazendo isso esta fazendo a INJE��O DE DEPENDENCIA
	
	* EXISTE V�RIAS FORMA DE REALIZAR A INVER��O DE CONTROLE E A INJE��O DE DEPENDENCIA
		- Alguns exemplos que pode realizar isso:
			- CONSTRUTOR
			- M�todo SET
			- Forma manual
			- Algum conteiner ou framework de forma automatizada
	*/
	private OnlinePaymentService onlinePaymentService;
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	//O papel desse m�todo � gerar as parcelas
	public void processInstallments(Contract contract, Integer months) {
		
		Double basicQuota = contract.getTotalValue() / months;

		for (int i=1; i <= months; i++) {
			double updateQuota = basicQuota + onlinePaymentService.interest(basicQuota, i);
			
			double fullQuota = updateQuota + onlinePaymentService.paymentFee(updateQuota);
			
			Date dueDate = addMonths(contract.getDate(), i);
			contract.getInstallments().add(new Installment(dueDate, fullQuota));
		}
	}
	
	private Date addMonths(Date date, int N) {
		Calendar calendar = Calendar.getInstance();
		
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, N);
		
		return calendar.getTime();
	}
}
