package RevisaoProgOrientadaObjetos.ExerciciosFixacao.ExercicioRegistrosdeLog.model.entities;

import java.util.Date;
import java.util.Objects;

public class LogUser{
	
	private String name;
	private Date moment;
	
	public LogUser(String name, Date moment) {
		this.name = name;
		this.moment = moment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	@Override
	public String toString() {
		return name + " " + moment;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LogUser other = (LogUser) obj;
		return Objects.equals(name, other.name);
	}
}
