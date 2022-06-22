package RevisaoProgOrientadaObjetos.ExerciciosFixacao.ExercicioContract.SolucaoCurso.model.services;

import java.util.Calendar;
import java.util.Date;

import RevisaoProgOrientadaObjetos.ExerciciosFixacao.ExercicioContract.SolucaoCurso.model.entities.Contract;
import RevisaoProgOrientadaObjetos.ExerciciosFixacao.ExercicioContract.SolucaoCurso.model.entities.Installment;

public class ContractService {

	/*
	* PRINCIPIO SOLID:
		- A classe deve ser
			- ABERTA para extenção
			- FECHADA para alteração.
			
	 	- Por esse motivo utilizamos a interface OnlinePaymentService
		- Para que se o método de pagamento mudar ou ter outro método de pagamento
			- Não será necessário alterar a classe ContractService por conta da interface que é um tipo genérico
	
	* PRINCIPIO DA INVERÇÃO DE CONTROLE:
		- Não pode deixar a própria classe responsável pelo controle de QUAL INSTANCIA ela vai precisar para executar
		- Quem tem que controlar qual instância do objeto dependente que será instanciada será um agente externo que entregará a instancia
			- Nesse exemplo é a classe Program que DECLARA e enviar a instancia NEW PAYPALSERVICE
				- Fazendo isso esta fazendo a INJEÇÃO DE DEPENDENCIA
	
	* EXISTE VÁRIAS FORMA DE REALIZAR A INVERÇÃO DE CONTROLE E A INJEÇÃO DE DEPENDENCIA
		- Alguns exemplos que pode realizar isso:
			- CONSTRUTOR
			- Método SET
			- Forma manual
			- Algum conteiner ou framework de forma automatizada
	*/
	private OnlinePaymentService onlinePaymentService;
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	//O papel desse método é gerar as parcelas
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
