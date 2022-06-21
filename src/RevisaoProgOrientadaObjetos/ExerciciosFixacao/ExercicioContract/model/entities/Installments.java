package RevisaoProgOrientadaObjetos.ExerciciosFixacao.ExercicioContract.model.entities;

import java.util.Date;

public class Installments {
	
	private Double value;
	private Date dueDate;
	
	public Installments(Date dueDate, Double value) {
		this.dueDate = dueDate;
		this.value = value;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
}
