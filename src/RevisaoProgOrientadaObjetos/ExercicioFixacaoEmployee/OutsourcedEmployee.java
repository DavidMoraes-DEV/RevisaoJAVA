package RevisaoProgOrientadaObjetos.ExercicioFixacaoEmployee;

public final class OutsourcedEmployee extends Employee{

	private Double additionalCharge;
	
	public OutsourcedEmployee(String name, Integer hours, Double valuePerHours, Double additionalCharge) {
		super(name, hours, valuePerHours);
		this.additionalCharge = additionalCharge;
	}
	
	public Double getAdditionalCharge() {
		return additionalCharge;
	}
	
	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public Double payment() {
		Double payment = super.payment();
		
		return payment += additionalCharge + additionalCharge * 0.1;
	}
}
