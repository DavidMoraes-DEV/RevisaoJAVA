package RevisaoProgOrientadaObjetos.ExercicioFixacaoProduct;

public class Product {

	protected String name;
	protected Double price;
	
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
	
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n|---------------------------------------------------------------------------|");
		sb.append("\n|-------------------------------PRODUTO COMUM-------------------------------|");
		sb.append("\n|---------------------------------------------------------------------------|\n");
		sb.append("|- PRODUTO: " + name + "\n");
		sb.append("|- PREÇO: " + String.format("%.2f", price));
		sb.append("\n|---------------------------------------------------------------------------|");
		sb.append("\n|---------------------------------------------------------------------------|\n");
		
		return sb.toString();
	}
	
	
}
