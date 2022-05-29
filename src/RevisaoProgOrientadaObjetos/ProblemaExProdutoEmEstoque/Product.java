package RevisaoProgOrientadaObjetos.ProblemaExProdutoEmEstoque;

public class Product {

	public String name;
	public double price;
	public int quantity;

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
