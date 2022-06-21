package RevisaoProgOrientadaObjetos.ExerciciosFixacao.ExercicioContract.model.services;

public class PaypalPaymentService implements PaymentService {
	
	public double payment(double valueInstallment, double installment) {;
	
	double simpleInterest = 0.01;
	double paymentFee = 0.02;
	
	Double initialValue = (valueInstallment + (valueInstallment * simpleInterest) * installment);
	Double finishValue = initialValue + initialValue * paymentFee;
	
	return finishValue;
	}
}
