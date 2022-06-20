package RevisaoProgOrientadaObjetos.Interfaces.MinhaTentativaSemInterface.model.entities;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Location {
	
	private Prices prices;
	private String modelCar;
	private Date start;
	private Date end;
	
	public Location(Prices prices, String modelCar, Date start, Date end) {
		super();
		this.prices = prices;
		this.modelCar = modelCar;
		this.start = start;
		this.end = end;
	}

	public Prices getPrices() {
		return prices;
	}
	
	public void setPrices(Prices prices) {
		this.prices = prices;
	}

	public String getModelCar() {
		return modelCar;
	}

	public void setModelCar(String modelCar) {
		this.modelCar = modelCar;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	public Integer duration() {
		long duration = end.getTime() - start.getTime();
		return (int) TimeUnit.HOURS.convert(duration, TimeUnit.MILLISECONDS);
	}
	
	public Double basicPayment() {
		if(duration() < 12) {
			return (duration() * prices.getValuePerHour());
		}
		return (duration() * prices.getValuePerDay());
	}
	
	public Double tax() {
		if(basicPayment() <= 100.0) {
			return basicPayment() + basicPayment()*0.20;
		}
		return basicPayment() + basicPayment()*0.15;
	}
	
	public Double totalPayment() {
		return basicPayment()+tax();
	}
	
	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append("Basic payment: " + String.format("%.2f", basicPayment()));
		sb.append("\nTax: " + String.format("%.2f", tax()));
		sb.append("\nTotal payment: " + String.format("%.2f", totalPayment()));

		return sb.toString();
	}
}
