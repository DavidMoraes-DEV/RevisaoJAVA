package RevisaoProgOrientadaObjetos.ProblemasExemplo.ProblemaExVetorProgOrientObjto;

public class Produto {

	//ATRIBUTOS
	private String nome;
	private double preco;

	//CONSTRUTOR
	public Produto(String nome) {
		this.nome = nome;
	}
	
	//SOBRECARGA CONSTRUTOR
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	//MÉTODOS
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		return "Produto: "
				+ this.nome
				+ "Preço: R$ "
				+ String.format("%.2f", getPreco());
	}
}
