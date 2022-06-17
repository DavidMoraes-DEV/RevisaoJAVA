package RevisaoProgOrientadaObjetos.TratamentoDeExcecoes.ExcecoesPersonalizadas.SolucaoBoa.model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import RevisaoProgOrientadaObjetos.TratamentoDeExcecoes.ExcecoesPersonalizadas.SolucaoBoa.model.exceptions.DomainException;

public class Reservation {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	//Propagar a exceção com o throws
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException {
		
		/*
		 * PROGRAMAÇÃO DEFENSIVA:
		 	- Colocar o tratamento de exceções no começo dos métodos (BOA PRÁTICA)
		 */
		if(!checkOut.after(checkIn)) {

			throw new DomainException("Check-out date must be after check-in date");
			
		}
		
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}
	
	public Integer duration() {
		
		long diferenca = checkOut.getTime() - checkIn.getTime();
		return (int) TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS);
		
		
	}
	
	//Agora caso ocorra um erro no método, será PROPAGADO a exceção do tipo DomainException para ser TRATADA no CATCH que fica na classe Program.
	public void updateDates(Date checkIn, Date checkOut) throws DomainException {
		
		Date now = new Date();
		if(checkIn.before(now) || checkOut.before(now)) { 
			
			/*
			 * Na frente da palavra THROW será instanciado uma exceção.
			 	- Nesse caso foi instanciado uma exceção PERSONALIZADA: DomainException 
			 	
			*/
			throw new DomainException("Reservation dates for update must be future dates");
		
		}
		
		if(!checkOut.after(checkIn)) {

			throw new DomainException("Check-out date must be after check-in date");
			
		}
		
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	@Override
	public String toString() {
		return "Reservation: Room "
				+ roomNumber
				+ ", check-in: "
				+ sdf.format(checkIn)
				+ ", checkout: "
				+ sdf.format(checkOut)
				+ ", "
				+ duration()
				+ " nights";
	}
}