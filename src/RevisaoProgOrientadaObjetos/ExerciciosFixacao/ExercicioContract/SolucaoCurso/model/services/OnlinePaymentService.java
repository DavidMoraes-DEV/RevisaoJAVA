package RevisaoProgOrientadaObjetos.ExerciciosFixacao.ExercicioContract.SolucaoCurso.model.services;

public interface OnlinePaymentService {

	double paymentFee(double amount);	
	double interest(double amount, int months);
}
