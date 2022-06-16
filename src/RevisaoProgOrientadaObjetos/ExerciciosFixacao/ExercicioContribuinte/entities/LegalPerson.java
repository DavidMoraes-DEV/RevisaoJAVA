package RevisaoProgOrientadaObjetos.ExerciciosFixacao.ExercicioContribuinte.entities;

public class LegalPerson extends TaxPayer{

	private Integer numberEmployees;

	public LegalPerson(String name, Double annualIncome, Integer numberEmployees) {
		super(name, annualIncome);
		this.numberEmployees = numberEmployees;
	}

	public Integer getNumberEmployees() {
		return numberEmployees;
	}

	public void setNumberEmployees(Integer numberEmployees) {
		this.numberEmployees = numberEmployees;
	}

	@Override
	public Double tax() {
			
			double tax;
			if(numberEmployees < 10) {
				tax = this.getAnnualIncome() * 0.16;
				 
			}else {
				tax = this.getAnnualIncome() * 0.14;
			}
			
			return tax;
	}
}
