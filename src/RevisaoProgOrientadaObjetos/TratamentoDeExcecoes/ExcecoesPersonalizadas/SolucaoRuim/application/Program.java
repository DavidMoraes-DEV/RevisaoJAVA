package RevisaoProgOrientadaObjetos.TratamentoDeExcecoes.ExcecoesPersonalizadas.SolucaoRuim.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import RevisaoProgOrientadaObjetos.TratamentoDeExcecoes.ExcecoesPersonalizadas.SolucaoRuim.model.entities.Reservation;

public class Program {

	/*
	 * throws ParseException -> Significa que o método MAIN dessa classe PROGRAM pode lançar uma exceção do tipo PARSE EXCEPTION
		- Ou seja o método pode lançar a exceção sem precisar trata-la
		- Porque foi incluido no corpo do metodo um código que pode acontecer uma excessão desse tipo quando defini: sdf.parse(sc.next())
		- Se outro método chamar o método MAIN deverá tratar esse exceção também ou propaga-la(THROWS) da mesma forma. (Relacionado a PILHA DE CHAMADAS DE MÉTODOS)
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
		 * SOLUÇÃO RUIM: Passar um pouco da lógica para a classe RESERVATION retornando uma String quando ocorrer um erro
			- Essa solução ainda é ruim pois retorna uma string contendo o erro ou o valor NULL para indicar que não houve erro.
			- Porém ainda contém uma lógica de validação que é a lógica abaixo que deveria estar no construtor.
			- Não é possível colocar a Lógica abaixo no construtor pois o construtor NÃO PODE retornar uma STRING
			- Então é necessário ter essa lógica ainda no programa principal
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
				
			//Nessa solução ainda ruim o método UPDATEDATES retornará uma String dizendo se houve algum erro ou não
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
