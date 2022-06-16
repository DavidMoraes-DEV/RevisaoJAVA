package RevisaoProgOrientadaObjetos.ExerciciosFixacao.ExercicioContribuinte.entities;

public class PhysicalPerson extends TaxPayer {

	private Double healthSpending;

	public PhysicalPerson(String name, Double annualIncome, Double healthSpending) {
		super(name, annualIncome);
		this.healthSpending = healthSpending;
	}

	public Double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	}

	@Override
	public Double tax() {
		
		double tax;
		if(this.getAnnualIncome() < 20000.00) {
			tax = this.getAnnualIncome() * 0.15;
			 
		}else {
			tax = this.getAnnualIncome() * 0.25;
		}
		
		if(this.healthSpending != 0.0) {
			tax -= healthSpending*0.5;
		}
		
		return tax;
	}
}
