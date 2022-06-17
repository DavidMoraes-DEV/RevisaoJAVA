package RevisaoProgOrientadaObjetos.TratamentoDeExcecoes.ExcecoesPersonalizadas.SolucaoBoa.application;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import RevisaoProgOrientadaObjetos.TratamentoDeExcecoes.ExcecoesPersonalizadas.SolucaoBoa.model.entities.Reservation;
import RevisaoProgOrientadaObjetos.TratamentoDeExcecoes.ExcecoesPersonalizadas.SolucaoBoa.model.exceptions.DomainException;

public class Program {

	/*
	 * SOLUÇÃO BOA:
	 	- 
	 	- Não definir (Throws ParseException) no método MAIN para a exceção ser PROPAGADA.
	 	- AGORA essa exceção será TRATADA se ocorrer.
	 	- Utilizando agora TRY-CATCH para capturar a exceção e trata-la
	 	- O código fica muito mais organizado e linear utilizando o tratamento de exceção sem utilizar IF-ELSE no programa principal e se houver uma exceção será tratada
	 	- Se houver qualquer exceção em qualquer lugar do código
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
			System.out.print("Room number: ");
			Integer ReservationRoomNumber = sc.nextInt();
	
			System.out.print("Check-in date (dd/MM/yyyy): ");
			Date ReservationCheckIn = sdf.parse(sc.next());
	
			System.out.print("Check-out date (dd/MM/yyyy): ");
			Date ReservationCheckOut = sdf.parse(sc.next());
	
			Reservation reservation = new Reservation(ReservationRoomNumber, ReservationCheckIn, ReservationCheckOut);
			System.out.println(reservation);
	
			System.out.printf("%nEnter data to update the reservation:%n");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			ReservationCheckIn = sdf.parse(sc.next());
	
			System.out.print("Check-out date (dd/MM/yyyy): ");
			ReservationCheckOut = sdf.parse(sc.next());
	
			//Vai LANÇAR uma exceção caso ocorra
			reservation.updateDates(ReservationCheckIn, ReservationCheckOut);
			System.out.println("Reservation: " + reservation);
			
		} catch (ParseException e){
			
			System.out.println("Invalid date format!!!");
			
		} catch (DomainException e){
			
			System.out.println("Error in Reservation: " + e.getMessage());
			
		}
		
		sc.close();
	}
}