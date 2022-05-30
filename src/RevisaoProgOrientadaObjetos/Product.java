package RevisaoProgOrientadaObjetos;

public class Product {

	//Atributos
	public String name;
	public double price;
	public int quantity;
	
	//Construtor Padr�o: Permite instanciar um objeto sem a obriga��o de colocar par�metros de entrada. No JAVA o construtor padr�o n�o precisa ser declarado manualmente dessa forma se n�o definir outro construtor que receba par�metros na classe.
	public Product() {
	}
	
	//Construtor com par�metros de entrada
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//SOBRECARGA de um construtor sem o par�metro quantidade. Para que seja poss�vel cadastrar um produto sem a quantidade inicial se o usu�rio precisar.
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
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
