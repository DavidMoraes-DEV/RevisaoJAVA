package RevisaoProgOrientadaObjetos.Interfaces.ProblemaExLocation.SolucaoComInterface.model.services;

//Para utilizar uma INTERFACE em uma classe específica é feita a implementação dessa INTERFACE, sendo a interface uma classe genérica
public class BrazilTaxService implements TaxService {
	
	//double com d minúsculo porque estamos assumindo que sempre terá um valor amount válido
	public double tax (double amount) {
		if(amount <= 100.00) {
			return amount * 0.2;
		}
		return amount * 0.15;
	}
}