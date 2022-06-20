package RevisaoProgOrientadaObjetos.Interfaces.ProblemaExLocation.SolucaoSemInteface.model.services;

public class BrazilTaxService {
	
	//double com d minúsculo porque estamos assumindo que sempre terá um valor amount válido
	public double tax (Double amount) {
		if(amount <= 100.00) {
			return amount * 0.2;
		}
		return amount * 0.15;
	}

}
