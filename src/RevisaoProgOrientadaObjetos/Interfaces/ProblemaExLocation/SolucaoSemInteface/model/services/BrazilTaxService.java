package RevisaoProgOrientadaObjetos.Interfaces.ProblemaExLocation.SolucaoSemInteface.model.services;

public class BrazilTaxService {
	
	//double com d min�sculo porque estamos assumindo que sempre ter� um valor amount v�lido
	public double tax (Double amount) {
		if(amount <= 100.00) {
			return amount * 0.2;
		}
		return amount * 0.15;
	}

}
