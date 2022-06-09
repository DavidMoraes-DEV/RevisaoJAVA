package RevisaoConceitoJAVA.Composicao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalhador {

	private String nome;
	private NivelTrabalhador nivel;
	private Double salarioBase;
	
	//ASSOCIAÇÕES
	private Departamento departamento; //1 trabalhador trabalha em 1 departamento
	private List<ContratoPorHoras> contratos = new ArrayList<>(); //1 Trabalhador pode ter vários contratos, por isso utiliza a lista para associar.
	
	//No caso de construtores NÃO incluir composições TEM MUITOS do tipo LIST
	public Trabalhador(String nome, NivelTrabalhador nivel, Double salarioBase, Departamento departamento) {
		this.nome = nome;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelTrabalhador getNivel() {
		return nivel;
	}

	public void setNivel(NivelTrabalhador nivel) {
		this.nivel = nivel;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	//Faz a associação de um contrato com o trabalhador(adiciona um contrato)
	public void addContrato(ContratoPorHoras contract) {
		contratos.add(contract);
	}
	
	//Desfaz a associação de um contrato com o trabalhador(remove um contrato)
	public void removeContrato(ContratoPorHoras contract) {
		contratos.remove(contract);
	}
	
	public Double rendaMes(int mes, int ano) {
		
		double soma = salarioBase;
		Calendar cal = Calendar.getInstance();
		
		for (ContratoPorHoras c : contratos) {
			
			cal.setTime(c.getDate());
			int contratoAno = cal.get(Calendar.YEAR);
			int contratoMes = 1 + cal.get(Calendar.MONTH);	
			
			if(ano == contratoAno && mes == contratoMes) {
				soma += c.totalValue();
			}
		}
		
		return soma;
	}
}
