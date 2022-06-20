package RevisaoProgOrientadaObjetos.Interfaces.MinhaTentativaSemInterface.application;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import RevisaoProgOrientadaObjetos.Interfaces.MinhaTentativaSemInterface.model.entities.Location;
import RevisaoProgOrientadaObjetos.Interfaces.MinhaTentativaSemInterface.model.entities.Prices;

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
			
			System.out.printf("Enter price per hour: ");
			Double valuePerHour = sc.nextDouble();
			
			System.out.print("Enter price per day: ");
			Double valuePerDay = sc.nextDouble();
			
			Prices prices = new Prices(valuePerHour, valuePerDay);
			Location location = new Location(prices, carModel, start, end);
			
			System.out.println("INVOICE: ");
			System.out.println(location);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.getStackTrace();
		} finally {
			sc.close();
		}
	}

}
