package RevisaoProgOrientadaObjetos.ProblemasExemplo.ProblemaFuncionarioComLista;

public class Funcionario {

	//Atributos
	private Integer id;
	private String nome;
	private Double salario;
	
	//Construtor
	public Funcionario(Integer id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	
	//Métodos GET e SET
	public Integer getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Double getSalario() {
		return salario;
	}
	
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public void aumentoSalario(double porcentagemAumento) {
		salario += salario * porcentagemAumento / 100;
	}
	
	@Override
	public String toString() {
		return id
				+ ", "
				+ nome
				+ ", "
				+ String.format("%.2f", salario);
	}
	
}
