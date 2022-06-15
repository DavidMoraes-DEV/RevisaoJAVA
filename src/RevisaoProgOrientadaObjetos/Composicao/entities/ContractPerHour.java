package RevisaoProgOrientadaObjetos.Composicao.entities;

import java.util.Date;

public class ContractPerHour {

	private Date data;
	private Double valorPorHora;
	private Integer horas;
	
	public ContractPerHour(Date data, Double valorPorHora) {
		this.data = data;
		this.valorPorHora = valorPorHora;
	}
	
	public ContractPerHour(Date data, Double valorPorHora, Integer houras) {
		this.data = data;
		this.valorPorHora = valorPorHora;
		this.horas = houras;
	}

	public Date getDate() {
		return data;
	}

	public void setDate(Date date) {
		this.data = date;
	}

	public Double getValuePerHour() {
		return valorPorHora;
	}

	public void setValuePerHour(Double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}

	public Integer getHours() {
		return horas;
	}

	public void setHours(Integer houras) {
		this.horas = houras;
	}
	
	public Double totalValue() {
		return valorPorHora*horas;
	}
}
