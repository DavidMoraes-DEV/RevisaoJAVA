package RevisaoProgOrientadaObjetos.TratamentoDeExcecoes.ExcecoesPersonalizadas.SolucaoRuim.model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
		super();
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
	
	//Retorna uma string dependendo do erro se ocorrer
	public String updateDates(Date checkIn, Date checkOut) {
		
		Date now = new Date();
		if(checkIn.before(now) || checkOut.before(now) ) { 
			
			return "Reservation dates for update must be future dates";
		
		}
		
		if(!checkOut.after(checkIn)) {

			return "Check-out date must be after check-in date";
			
		}
		
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		
		//Esse ser� o crit�rio para mostrar que a opera��o UpdateDate n�o teve nenhuma erro
		//Se retornar algo diferente de NULL significa que houve algum dos erros definidos acima nas estruturas IF
		return null;
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
