package RevisaoProgOrientadaObjetos.Generics.GenericsDelimitados.model.entities;

//Para funcionar o m�todo . compareTo no Servico ter� que implementar Comparable<Products> para a declara��o funcionar
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
	
	@Override
	public String toString() {
		return name + ", " + String.format("%.2", price);
	}

	@Override
	public int compareTo(Product other) {
		return price.compareTo(other.getPrice());
	}
}
