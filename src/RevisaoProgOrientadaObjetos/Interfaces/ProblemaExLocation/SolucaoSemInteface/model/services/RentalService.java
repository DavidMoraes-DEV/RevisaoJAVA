package RevisaoProgOrientadaObjetos.Interfaces.ProblemaExLocation.SolucaoSemInteface.model.services;

import RevisaoProgOrientadaObjetos.Interfaces.ProblemaExLocation.SolucaoSemInteface.model.entities.CarRental;
import RevisaoProgOrientadaObjetos.Interfaces.ProblemaExLocation.SolucaoSemInteface.model.entities.Invoice;

public class RentalService {

	private Double pricePerHour;
	private Double pricePerDay;
	
	private BrazilTaxService taxService;

	public RentalService(Double pricePerHour, Double pricePerDay, BrazilTaxService taxService) {
		super();
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}

	public void processInvoice(CarRental carRental) {
		
		long t1 = carRental.getStart().getTime();
		long t2 = carRental.getFinish().getTime();
		
		double hours = (double)			/*Garante que o resultado seja em formato double COM PONTO FLUTUANTE*/
				(t2-t1)					/*Obtem o valor das horas em millisegundos*/
				/ 1000 					/*Converte de milisegundos para segundos*/
				/ 60					/*Converte de segundos para minutos*/
				/ 60;					/*Converte de minutos para horas*/
		
		double basicPayment;
		if (hours <= 12) {
			basicPayment = Math.ceil(hours) //Math.ceil -> converte\arredonda o valor para cima
					* pricePerHour; // Multiplica o valor arredondado das horas pelo valor definido pra cobrar em horas
		} else {
			basicPayment = Math.ceil(hours / 24) //Math.ceil -> converte\arredonda o valor para cima em formato de dia
					* pricePerDay; // Multiplica o valor arredondado em dias pelo valor definido pra cobrar em dias
		}
		
		//Calcula o valor do imposto apartir do valor em BASIC PAYMENT
		double tax = taxService.tax(basicPayment);
		
		//Cria um novo objeto de nota de pagamento associado ao objeto de aluguel
		carRental.setInvoice(new Invoice(basicPayment, tax));
	}
}
