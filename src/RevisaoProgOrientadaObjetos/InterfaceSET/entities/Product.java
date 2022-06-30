package RevisaoProgOrientadaObjetos.InterfaceSET.entities;

import java.util.Objects;

public class Product implements Comparable<Product> {

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
		return name + ", $ " + price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(name, other.name) && Objects.equals(price, other.price);
	}

	@Override
	public int compareTo(Product other) {
		//Converte os dois objetos em letras maiúsculas para garantir que seja os mesmo nome sem diferença e compara uma objeto com outro objeto da mesma classe
		return name.toUpperCase().compareTo(other.getName().toUpperCase());
	}
	
}
