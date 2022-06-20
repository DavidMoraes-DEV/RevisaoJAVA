package RevisaoProgOrientadaObjetos.Interfaces.ProblemaExLocation.SolucaoSemInteface.application;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import RevisaoProgOrientadaObjetos.Interfaces.ProblemaExLocation.SolucaoSemInteface.model.entities.CarRental;
import RevisaoProgOrientadaObjetos.Interfaces.ProblemaExLocation.SolucaoSemInteface.model.entities.Vehicle;
import RevisaoProgOrientadaObjetos.Interfaces.ProblemaExLocation.SolucaoSemInteface.model.services.BrazilTaxService;
import RevisaoProgOrientadaObjetos.Interfaces.ProblemaExLocation.SolucaoSemInteface.model.services.RentalService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");
		
		try {
			System.out.println("Enter rental data: ");
			System.out.print("Car model: ");
			String carModel = sc.next();

			System.out.print("Pickup (dd/MM/yyyy HH:ss): ");
			sc.nextLine();
			Date start = sdf.parse(sc.nextLine());
			
			System.out.print("Return (dd/MM/yyyy HH:ss): ");
			Date end = sdf.parse(sc.nextLine());
			
			CarRental cr = new CarRental(start, end, new Vehicle(carModel));
			
			System.out.printf("Enter price per hour: ");
			Double valuePerHour = sc.nextDouble();
			
			System.out.print("Enter price per day: ");
			Double valuePerDay = sc.nextDouble();
			
			RentalService rentalService = new RentalService(valuePerHour, valuePerDay, new BrazilTaxService());
			
			rentalService.processInvoice(cr);
			
			System.out.println("INVOICE: ");
			System.out.println("Basic payment: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
			System.out.println("Tax: " + String.format("%.2f", cr.getInvoice().getTax()));
			System.out.println("Total payment: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.getStackTrace();
		} finally {
			sc.close();
		}
	}
}
