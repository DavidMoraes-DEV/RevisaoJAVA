package RevisaoProgOrientadaObjetos.ExerciciosFixacao.ExercicioProduto.entities;

public final class ImportedProduct extends Product {
	
	private Double customsFee;

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	@Override
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n|---------------------------------------------------------------------------|");
		sb.append("\n|-----------------------------PRODUTO IMPORTADO-----------------------------|");
		sb.append("\n|---------------------------------------------------------------------------|\n");
		sb.append("|- PRODUTO: " + name + "\n");
		sb.append("|- PREÇO: " + String.format("%.2f", totalPrice()) + "\n");
		sb.append("|- TAXA DE ALFÂNDEGA: " + String.format("%.2f", customsFee));
		sb.append("\n|---------------------------------------------------------------------------|");
		sb.append("\n|---------------------------------------------------------------------------|\n");
		
		return sb.toString();
	}
	
	public Double totalPrice() {
		return price + customsFee;
	}

}
