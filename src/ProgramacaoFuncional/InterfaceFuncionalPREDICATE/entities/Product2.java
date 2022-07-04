package ProgramacaoFuncional.InterfaceFuncionalPREDICATE.entities;

public class Product2 {

	private String name;
	private Double price;
	
	public Product2(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	//Método Estático trabalha com o valor passado como parâmetro (Product2 p)
	public static boolean staticProductPredicate(Product2 p) {
		return p.getPrice() >= 100.0;
	}
	
	//Método que NÃO É Estático é um objeto da INSTÂNCIA trabalhado com os valores instânciados ao criar o objeto
	public boolean nonStaticProductPredicate() {
		return price >= 100.0;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
}
