package RevisaoProgOrientadaObjetos.Interfaces.DefaultMethods.model.services;

import java.security.InvalidParameterException;

public class BrazilInterestService implements InterestService {

	private static Double InterestRate = 0.02;
	
	public Double payment(Double amount, int months) {
		
		if(months < 1) {
			throw new InvalidParameterException("Months must be greater than zero");
		}
		
		return amount * Math.pow(1+InterestRate, months);
	}
}