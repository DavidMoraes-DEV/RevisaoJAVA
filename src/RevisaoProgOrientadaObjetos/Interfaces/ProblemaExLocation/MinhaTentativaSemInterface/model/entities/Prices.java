package RevisaoProgOrientadaObjetos.Interfaces.ProblemaExLocation.MinhaTentativaSemInterface.model.entities;

public class Prices {

	private Double valuePerHour;
	private Double valuePerDay;
	
	public Prices(Double valuePerHour, Double valuePerDay) {
		this.valuePerHour = valuePerHour;
		this.valuePerDay = valuePerDay;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public Double getValuePerDay() {
		return valuePerDay;
	}

	public void setValuePerDay(Double valuePerDay) {
		this.valuePerDay = valuePerDay;
	}
}
