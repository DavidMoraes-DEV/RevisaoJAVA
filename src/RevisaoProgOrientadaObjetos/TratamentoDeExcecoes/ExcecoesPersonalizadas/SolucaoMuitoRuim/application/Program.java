package RevisaoProgOrientadaObjetos.TratamentoDeExcecoes.ExcecoesPersonalizadas.SolucaoMuitoRuim.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import RevisaoProgOrientadaObjetos.TratamentoDeExcecoes.ExcecoesPersonalizadas.SolucaoRuim.model.entities.Reservation;

public class Program {

	/*
	 * throws ParseException -> Significa que o m�todo MAIN dessa classe PROGRAM pode lan�ar uma exce��o do tipo PARSE EXCEPTION
		- Ou seja o m�todo pode lan�ar a exce��o sem precisar trata-la
		- Porque foi incluido no corpo do metodo um c�digo que pode acontecer uma excess�o desse tipo quando defini: sdf.parse(sc.next())
		- Se outro m�todo chamar o m�todo MAIN dever� tratar esse exce��o tamb�m ou propaga-la(THROWS) da mesma forma. (Relacionado a PILHA DE CHAMADAS DE M�TODOS)
	*/
	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Room number: ");
		Integer ReservationRoomNumber = sc.nextInt();
		
		System.out.print("Check-in date (dd/MM/yyyy): ");
		Date ReservationCheckIn = sdf.parse(sc.next());
		
		System.out.print("Check-out date (dd/MM/yyyy): ");
		Date ReservationCheckOut = sdf.parse(sc.next());
		
		/*
		* SOLU��O MUITO RUIM: Aplicar toda l�gica de programa��o no programa principal
			- Problema GRAVE de DELEGA��O: Quem tem que ser respons�vel por saber sobre a reserva � a classe RESERVATION e n�o outra classe 
		*/
		if(!ReservationCheckOut.after(ReservationCheckIn)) {
			
			System.out.println("Error in reservation: Check-out date must be after check-in date");
			
		} else {
		
			Reservation reservation = new Reservation(ReservationRoomNumber, ReservationCheckIn, ReservationCheckOut);
			System.out.println(reservation);
		
			System.out.printf("%nEnter data to update the reservation:%n");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			ReservationCheckIn = sdf.parse(sc.next());
			
			System.out.print("Check-out date (dd/MM/yyyy): ");
			ReservationCheckOut = sdf.parse(sc.next());
			
			if(ReservationCheckIn.before(new Date()) || ReservationCheckOut.before(new Date()) ) { 
				
				System.out.println("Error in reservation: Reservation dates for update must be future dates");
			
			} else if(!ReservationCheckOut.after(ReservationCheckIn)) {
				
				System.out.println("Error in reservation: Check-out date must be after check-in date");
				
			} else {
				
				reservation.updateDates(ReservationCheckIn, ReservationCheckOut);
				System.out.println(reservation);
				
			}
		}
					
		sc.close();
	}
}
