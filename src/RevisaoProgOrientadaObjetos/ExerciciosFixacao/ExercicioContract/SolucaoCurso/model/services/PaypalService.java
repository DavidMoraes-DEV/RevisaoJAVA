package RevisaoProgOrientadaObjetos.ExerciciosFixacao.ExercicioContract.SolucaoCurso.model.services;

public class PaypalService implements OnlinePaymentService {
	
	private static final double PAYMENT_FEE = 0.02;
	private static final double MONTHLY_INTEREST = 0.01;
	
	//Retorna apenas o valor da taxa de pagamento
	@Override
	public double paymentFee(double amount) {;
		return amount * PAYMENT_FEE;
	}
	
	//Retorna apenas o valor do juros
	@Override
	public double interest(double amount, int months) {
		return amount * months * MONTHLY_INTEREST;
	}
}