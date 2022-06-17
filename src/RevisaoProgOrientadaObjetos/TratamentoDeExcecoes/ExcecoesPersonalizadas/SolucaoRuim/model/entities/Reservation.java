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
		
		//Lógica que eu consegui desenvolver para encontrar a qtd de dias entre as datas de entrada e saída (SEM UTILIZAR o TimeUnit, Utilizei o Calendar).
		/*
		Calendar cal = Calendar.getInstance();
		
		//Duração da hospedagem em milisegundos com getTime() do checkIn e checkOut
		Long hospedagem = checkout.getTime() - checkin.getTime();
		
		//Converte do tipo LONG para String
		String aux = sdf.format(hospedagem);
		
		//Converte do tipo String para Date
		Date dataHospedagem;
		try {
			
			dataHospedagem = sdf.parse(aux);
			cal.setTime(dataHospedagem);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		//Retorna apenas a quantidade de dias da data resultante
		return cal.get(Calendar.DAY_OF_MONTH);
		*/
	}
	
	public void updateDates(Date checkin, Date checkout) {
		this.checkIn = checkin;
		this.checkOut = checkout;
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
