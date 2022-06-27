package RevisaoProgOrientadaObjetos.Interfaces.DefaultMethods.model.entities;

import RevisaoProgOrientadaObjetos.Interfaces.DefaultMethods.model.services.InterestService;

public class Loan implements InterestService{

	private Integer deadline;
	private Double amount;
	private InterestService interestService;
	
	public Loan(Integer deadline, Double amount, InterestService interestService) {
		super();
		this.deadline = deadline;
		this.amount = amount;
		this.interestService = interestService;
	}

	public Integer getDeadline() {
		return deadline;
	}

	public void setDeadline(Integer deadline) {
		this.deadline = deadline;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public InterestService getInterestService() {
		return interestService;
	}

	public void setInterestService(InterestService interestService) {
		this.interestService = interestService;
	}

	@Override
	public Double getInterestRate() {
		// TODO Auto-generated method stub
		return null;
	}
}