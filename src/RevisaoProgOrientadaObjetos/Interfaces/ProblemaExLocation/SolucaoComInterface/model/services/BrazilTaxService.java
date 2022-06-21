package RevisaoProgOrientadaObjetos.Interfaces.ProblemaExLocation.SolucaoComInterface.model.services;

//Para utilizar uma INTERFACE em uma classe espec�fica � feita a implementa��o dessa INTERFACE, sendo a interface uma classe gen�rica
public class BrazilTaxService implements TaxService {
	
	//double com d min�sculo porque estamos assumindo que sempre ter� um valor amount v�lido
	public double tax (double amount) {
		if(amount <= 100.00) {
			return amount * 0.2;
		}
		return amount * 0.15;
	}
}