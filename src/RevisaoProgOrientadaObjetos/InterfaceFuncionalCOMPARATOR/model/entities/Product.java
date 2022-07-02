package RevisaoProgOrientadaObjetos.InterfaceFuncionalCOMPARATOR.model.entities;

public class Product implements Comparable<Product>{

	private String name;
	private Double price;
	
	public Product(String name, Double price) {
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
	
	//Dessa forma se os critérios de comparação de produtos mudar terá que alterar manualmente a classe Product, Método CompareTo()
	@Override
	public int compareTo(Product other) {
		return name.toUpperCase().compareTo(other.getName().toUpperCase());
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	
}
