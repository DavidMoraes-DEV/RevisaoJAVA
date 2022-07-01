package RevisaoProgOrientadaObjetos.ExerciciosFixacao.ExercicioQtdDeVotos.model.entities;

import java.util.Objects;

public class Urn {

	private String candidateName;
	private Integer votes;
	
	public Urn(String candidateName, Integer votes) {
		this.candidateName = candidateName;
		this.votes = votes;
	}

	public String getCandidateName() {
		return candidateName;
	}

	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}

	public Integer getVotes() {
		return votes;
	}

	public void setVotes(Integer votes) {
		this.votes = votes;
	}
	
	public Integer totalVotes(String name) {
		
		Integer votes=0;
		
		if(name == candidateName) {
			return votes;
		}
		
		return votes;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(candidateName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Urn other = (Urn) obj;
		return Objects.equals(candidateName, other.candidateName);
	}

	@Override
	public String toString() {
		return candidateName + ", " + votes;
	}
}
