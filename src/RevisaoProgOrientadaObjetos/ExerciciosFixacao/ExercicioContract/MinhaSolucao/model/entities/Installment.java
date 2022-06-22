package RevisaoProgOrientadaObjetos.ExerciciosFixacao.ExercicioContract.MinhaSolucao.model.entities;

import java.util.Date;

public class Installment {
	
	private Double value;
	private Date dueDate;
	
	public Installment(Date dueDate, Double value) {
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
