package RevisaoProgOrientadaObjetos.ProblemasExemplo.ProblemaExProdutoEmEstoque;

public class Product {

	//Atributos
	public String name;
	public double price;
	public int quantity;

	//Métodos:
	public double TotalValueInStock() {
		
		return price * quantity;			
	}
	
	public void AddProducts(int qtd) {
		
		this.quantity += qtd;
	}
	
	public void RemoveProducts(int qtd) {
		
		this.quantity -= qtd;
	}
	
	@Override
	public String toString() {
		return "Nome: "
				+ name
				+ ", Preço R$: "
				+ String.format("%.2f", price)
				+ ", Quantidade: "
				+ quantity
				+ " Total: R$: "
				+ String.format("%.2f", this.TotalValueInStock());
	}
}
/*
 * CONSTRUTOR: - É uma operação especial da classe, que executa no momenta da
 * instanciação do objeto
 * 
 * USOS COMUNS: - Iniciar valores dos atributos - Permitir ou obrigar que o
 * objeto receba dados / dependências no momento de sua instanciação (injeção de
 * dependência)
 * 
 * Se um construtuor customizado não for especificado, a classe disponibiliza o
 * construtor padrão: Ex.: Product p = new Product();
 * 
 * É possível especificar mais de um construtuor na mesma classe (sobrecarga)
 */