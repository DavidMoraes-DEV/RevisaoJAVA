package RevisaoProgOrientadaObjetos.Interfaces.DefaultMethods.model.services;

import java.security.InvalidParameterException;

import RevisaoProgOrientadaObjetos.Interfaces.DefaultMethods.model.entities.Loan;

public interface InterestService {

	Double getInterestRate();
	
	//Método padrão ou método defensivo para a interface. Evita ter que implementar o mesmo método PAYMENT nas duas classes específicas de juros do Brazil e USA.
	default double payment(Loan loan) {
		
		if(loan.getDeadline() < 1) {
			throw new InvalidParameterException("Months must be greater than zero");
		}
		
		double value = loan.getAmount() * Math.pow(1+getInterestRate()/100, loan.getDeadline());
		
		return value;
	}
}
