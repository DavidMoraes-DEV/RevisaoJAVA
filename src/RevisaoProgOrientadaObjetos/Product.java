package RevisaoProgOrientadaObjetos;

public class Product {

	//Atributos
	public String name;
	public double price;
	public int quantity;
	
	//Construtor
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	//M�todos
	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
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
