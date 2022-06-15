package RevisaoProgOrientadaObjetos.ProblemasExemplo.ProblemaExProdutoEmEstoque;

public class Product {

	//Atributos
	public String name;
	public double price;
	public int quantity;

	//M�todos:
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
				+ ", Pre�o R$: "
				+ String.format("%.2f", price)
				+ ", Quantidade: "
				+ quantity
				+ " Total: R$: "
				+ String.format("%.2f", this.TotalValueInStock());
	}
}
/*
 * CONSTRUTOR: - � uma opera��o especial da classe, que executa no momenta da
 * instancia��o do objeto
 * 
 * USOS COMUNS: - Iniciar valores dos atributos - Permitir ou obrigar que o
 * objeto receba dados / depend�ncias no momento de sua instancia��o (inje��o de
 * depend�ncia)
 * 
 * Se um construtuor customizado n�o for especificado, a classe disponibiliza o
 * construtor padr�o: Ex.: Product p = new Product();
 * 
 * � poss�vel especificar mais de um construtuor na mesma classe (sobrecarga)
 */