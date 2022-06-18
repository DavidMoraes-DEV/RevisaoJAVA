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
		cal.setTime(date1); //Após instanciar o Calender e atribuir a data a ele temos agora então um calendário com a data definida dentre dele e apartir desse calendário podemos adicionar, subtrair e etc essa data.
		cal.add(Calendar.HOUR_OF_DAY, 4); //Adiciona 4 horas a data armazenada no Calendar.
		date1 = cal.getTime(); //Atualiza a variável date1 com as horas a mais definidas acima.
		
		System.out.println("Data atualizada com 4 hrs a mais: " + sdf.format(date1));
		
		//Obtendo uma unidade de tempo da data armazenada no Calendar:
		
		//Retorna a quantidade de Minutos definida na data armazena no Calendar.
		int minutos = cal.get(Calendar.MINUTE); 
		System.out.println("Minutos: " + minutos);
		
		//Retorna a Horas
		int hora = cal.get(Calendar.HOUR_OF_DAY); 
		System.out.println("Hora: " + hora);
		
		//Retorna o Dia referente ao mês
		int dia = cal.get(Calendar.DAY_OF_MONTH); 
		System.out.println("Dia: " + dia);
		
		//Retorna o Mês, porém como o mês no CALENDAR começa com JANEIRO = 0 tem que adicionar +1 para alinhar o mês correto no retorno
		int mes = 1+cal.get(Calendar.MONTH); 
		System.out.println("Mês: " + mes);
		
		//Retorna o Ano
		int ano = cal.get(Calendar.YEAR); 
		System.out.println("Ano: " + ano);
		
	}
}