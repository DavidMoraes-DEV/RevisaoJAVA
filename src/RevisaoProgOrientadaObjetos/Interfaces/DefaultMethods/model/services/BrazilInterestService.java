package RevisaoProgOrientadaObjetos.Interfaces.DefaultMethods.model.services;

public class BrazilInterestService implements InterestService {

	private double interestRate;
	
	public BrazilInterestService(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public Double getInterestRate() {
		return interestRate;
	}
}