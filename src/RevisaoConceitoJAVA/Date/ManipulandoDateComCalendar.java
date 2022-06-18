package RevisaoConceitoJAVA.Date;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class ManipulandoDateComCalendar {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date date1 = Date.from(Instant.parse("2022-06-09T15:42:07Z"));
		System.out.println("Data Original: " + sdf.format(date1));
		
		//Somando uma unidade de tempo a data armazenada no calendario:
		Calendar cal = Calendar.getInstance();
		cal.setTime(date1); //Ap�s instanciar o Calender e atribuir a data a ele temos agora ent�o um calend�rio com a data definida dentre dele e apartir desse calend�rio podemos adicionar, subtrair e etc essa data.
		cal.add(Calendar.HOUR_OF_DAY, 4); //Adiciona 4 horas a data armazenada no Calendar.
		date1 = cal.getTime(); //Atualiza a vari�vel date1 com as horas a mais definidas acima.
		
		System.out.println("Data atualizada com 4 hrs a mais: " + sdf.format(date1));
		
		//Obtendo uma unidade de tempo da data armazenada no Calendar:
		
		//Retorna a quantidade de Minutos definida na data armazena no Calendar.
		int minutos = cal.get(Calendar.MINUTE); 
		System.out.println("Minutos: " + minutos);
		
		//Retorna a Horas
		int hora = cal.get(Calendar.HOUR_OF_DAY); 
		System.out.println("Hora: " + hora);
		
		//Retorna o Dia referente ao m�s
		int dia = cal.get(Calendar.DAY_OF_MONTH); 
		System.out.println("Dia: " + dia);
		
		//Retorna o M�s, por�m como o m�s no CALENDAR come�a com JANEIRO = 0 tem que adicionar +1 para alinhar o m�s correto no retorno
		int mes = 1+cal.get(Calendar.MONTH); 
		System.out.println("M�s: " + mes);
		
		//Retorna o Ano
		int ano = cal.get(Calendar.YEAR); 
		System.out.println("Ano: " + ano);
		
	}
}