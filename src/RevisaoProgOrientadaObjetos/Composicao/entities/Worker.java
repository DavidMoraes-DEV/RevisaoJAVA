package RevisaoProgOrientadaObjetos.Composicao.entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {

	private String nome;
	private WorkerLevel nivel;
	private Double salarioBase;
	
	//ASSOCIAÇÕES
	private Department department; //1 trabalhador trabalha em 1 departamento
	private List<ContractPerHour> contratos = new ArrayList<>(); //1 Trabalhador pode ter vários contratos, por isso utiliza a lista para associar.
	
	//No caso de construtores NÃO incluir composições TEM MUITOS do tipo LIST
	public Worker(String nome, WorkerLevel nivel, Double salarioBase, Department department) {
		this.nome = nome;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.department = department;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public WorkerLevel getNivel() {
		return nivel;
	}

	public void setNivel(WorkerLevel nivel) {
		this.nivel = nivel;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Department getDepartamento() {
		return department;
	}

	public void setDepartamento(Department department) {
		this.department = department;
	}

	//Faz a associação de um contrato com o trabalhador(adiciona um contrato)
	public void addContrato(ContractPerHour contract) {
		contratos.add(contract);
	}
	
	//Desfaz a associação de um contrato com o trabalhador(remove um contrato)
	public void removeContrato(ContractPerHour contract) {
		contratos.remove(contract);
	}
	
	public Double rendaMes(int mes, int ano) {
		
		double soma = salarioBase;
		Calendar cal = Calendar.getInstance();
		
		for (ContractPerHour c : contratos) {
			
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
