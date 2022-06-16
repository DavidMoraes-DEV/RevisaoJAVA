package RevisaoProgOrientadaObjetos.ExerciciosFixacao.ExercicioContribuinte.entities;

public abstract class TaxPayer {

	//Atributos
	private String name;
	private Double AnnualIncome;
	
	//Construtor
	public TaxPayer(String name, Double annualIncome) {
		this.name = name;
		this.AnnualIncome = annualIncome;
	}

	//M�todos getters e setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnnualIncome() {
		return AnnualIncome;
	}

	public void setAnnualIncome(Double annualIncome) {
		AnnualIncome = annualIncome;
	}
	
	//M�todo abstrato
	public abstract Double tax();
}
