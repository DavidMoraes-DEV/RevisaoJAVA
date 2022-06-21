package RevisaoProgOrientadaObjetos.ExerciciosFixacao.ExercicioContract.model.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {

	private Integer number;
	private Date start;
	private Double totalValue;
	
	private List<Installments> installments = new ArrayList<>();
	
	public Contract(Integer number, Date start, Double totalValue) {
		this.number = number;
		this.start = start;
		this.totalValue = totalValue;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	public List<Installments> getInstallments() {
		return installments;
	}

	public void addInstallment(Installments installment) {
		installments.add(installment);
	}
	
	public void removeInstallment(Installments installment) {
		installments.remove(installment);
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		for(Installments installment : installments) {
			sb.append(sdf.format(installment.getDueDate()) + " - $ " + String.format("%.2f", installment.getValue())  + "\n");
		}
		
		return sb.toString();
	}
}
