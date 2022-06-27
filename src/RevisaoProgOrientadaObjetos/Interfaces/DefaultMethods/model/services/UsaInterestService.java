package RevisaoProgOrientadaObjetos.Interfaces.DefaultMethods.model.services;

public class UsaInterestService implements InterestService{

	private double interestRate;
	
	public UsaInterestService(double interestRate) {
		this.interestRate = interestRate;
	}
	
	@Override
	public Double getInterestRate() {
		return interestRate;
	}
}