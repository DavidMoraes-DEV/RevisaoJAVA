package RevisaoProgOrientadaObjetos.TratamentoDeExcecoes.ExcecoesPersonalizadas.SolucaoRuim.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import RevisaoProgOrientadaObjetos.TratamentoDeExcecoes.ExcecoesPersonalizadas.SolucaoRuim.model.entities.Reservation;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Room number: ");
		Integer ReservationRoomNumber = sc.nextInt();
		
		System.out.print("Check-in date (dd/MM/yyyy): ");
		Date ReservationCheckIn = sdf.parse(sc.next());
		
		System.out.print("Check-out date (dd/MM/yyyy): ");
		Date ReservationCheckOut = sdf.parse(sc.next());
		
		if(ReservationCheckIn.getTime() > ReservationCheckOut.getTime()) {
			
			System.out.println("Error in reservation: Check-out date must be after check-in date");
			
		} else {
		
			Reservation reservation = new Reservation(ReservationRoomNumber, ReservationCheckIn, ReservationCheckOut);
			System.out.println(reservation);
		
			System.out.printf("%nEnter data to update the reservation:%n");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			ReservationCheckIn = sdf.parse(sc.next());
			
			System.out.print("Check-out date (dd/MM/yyyy): ");
			ReservationCheckOut = sdf.parse(sc.next());
			
			if(reservation.getCheckIn().getTime() > ReservationCheckIn.getTime() || reservation.getCheckOut().getTime() > ReservationCheckOut.getTime()) { 
				
				System.out.println("Error in reservation: Reservation dates for update must be future dates");
			
			} else if( ReservationCheckIn.getTime() > ReservationCheckOut.getTime() ) {
				
				System.out.println("Error in reservation: Check-out date must be after check-in date");
				
			} else {
				
				reservation.updateDates(ReservationCheckIn, ReservationCheckOut);
				System.out.println(reservation);
				
			}
		}
					
		sc.close();
	}
}
