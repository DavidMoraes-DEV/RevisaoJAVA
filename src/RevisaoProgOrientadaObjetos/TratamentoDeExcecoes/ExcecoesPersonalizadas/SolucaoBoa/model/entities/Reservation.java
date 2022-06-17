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
	
	//Propagar a exce��o com o throws
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException {
		
		/*
		 * PROGRAMA��O DEFENSIVA:
		 	- Colocar o tratamento de exce��es no come�o dos m�todos (BOA PR�TICA)
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
	
	//Agora caso ocorra um erro no m�todo, ser� PROPAGADO a exce��o do tipo DomainException para ser TRATADA no CATCH que fica na classe Program.
	public void updateDates(Date checkIn, Date checkOut) throws DomainException {
		
		Date now = new Date();
		if(checkIn.before(now) || checkOut.before(now)) { 
			
			/*
			 * Na frente da palavra THROW ser� instanciado uma exce��o.
			 	- Nesse caso foi instanciado uma exce��o PERSONALIZADA: DomainException 
			 	
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