package RevisaoProgOrientadaObjetos.TratamentoDeExcecoes.ExcecoesPersonalizadas.SolucaoRuim.application;

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
		 * SOLU��O RUIM: Passar um pouco da l�gica para a classe RESERVATION retornando uma String quando ocorrer um erro
			- Essa solu��o ainda � ruim pois retorna uma string contendo o erro ou o valor NULL para indicar que n�o houve erro.
			- Por�m ainda cont�m uma l�gica de valida��o que � a l�gica abaixo que deveria estar no construtor.
			- N�o � poss�vel colocar a L�gica abaixo no construtor pois o construtor N�O PODE retornar uma STRING
			- Ent�o � necess�rio ter essa l�gica ainda no programa principal
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
				
			//Nessa solu��o ainda ruim o m�todo UPDATEDATES retornar� uma String dizendo se houve algum erro ou n�o
			String error = reservation.updateDates(ReservationCheckIn, ReservationCheckOut);
			if (error != null) {
				
				System.out.println("Error in Reservation: " + error);
				
			} else {
				System.out.println("Reservation: " + reservation);
			}
		}
					
		sc.close();
	}
}
