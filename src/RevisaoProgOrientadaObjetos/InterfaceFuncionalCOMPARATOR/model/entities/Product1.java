package RevisaoProgOrientadaObjetos.InterfaceFuncionalCOMPARATOR.model.entities;

public class Product1 implements Comparable<Product1>{

	private String name;
	private Double price;
	
	public Product1(String name, Double price) {
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
	
	// PARTE I: Dessa forma se os crit�rios de compara��o de produtos mudar ter� que alterar manualmente a classe Product, M�todo CompareTo()
	@Override
	public int compareTo(Product1 other) {
		return name.toUpperCase().compareTo(other.getName().toUpperCase());
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	
}
