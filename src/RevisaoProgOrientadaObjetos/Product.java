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

	//Métodos
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
