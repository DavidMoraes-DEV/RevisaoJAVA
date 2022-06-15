package RevisaoProgOrientadaObjetos.ExercicioFixacaoEmployee;

public class Employee {
	
	private String name;
	private Integer hours;
	private Double valuePerHours;
	
	public Employee(String name, Integer hours, Double valuePerHours) {
		this.name = name;
		this.hours = hours;
		this.valuePerHours = valuePerHours;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getHours() {
		return hours;
	}
	
	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	public Double getValuePerHours() {
		return valuePerHours;
	}

	public void setValuePerHours(Double valuePerHours) {
		this.valuePerHours = valuePerHours;
	}
	
	public Double payment() {
		return valuePerHours * hours;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("Name: " + name);
		sb.append("\nPayment: $ " + String.format("%.2f", this.payment()) + "\n");
		
		return sb.toString();
	}
}