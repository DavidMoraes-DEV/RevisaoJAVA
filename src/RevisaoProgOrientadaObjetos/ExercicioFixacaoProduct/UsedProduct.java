package RevisaoProgOrientadaObjetos.ExercicioFixacaoProduct;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class UsedProduct extends Product {
	
	private Date manufactureDate;

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sb.append("\n|---------------------------------------------------------------------------|");
		sb.append("\n|-------------------------------PRODUTO USADO-------------------------------|");
		sb.append("\n|---------------------------------------------------------------------------|\n");
		sb.append("|- PRODUTO: " + name + "\n");
		sb.append("|- PREÇO: " + String.format("%.2f", price) + "\n");
		sb.append("|- DATA DE FABRICAÇÃO: " + sdf.format(manufactureDate));
		sb.append("\n|---------------------------------------------------------------------------|");
		sb.append("\n|---------------------------------------------------------------------------|\n");
		
		return sb.toString();
	}
}
