package RevisaoProgOrientadaObjetos.Interfaces.ProblemaExLocation.MinhaTentativaSemInterface;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class testes {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date inicio = sdf.parse("18/06/2022 12:00:00");
		Date fim = sdf.parse("20/06/2022 08:00:00");
		//Duração de 20horas
		
		System.out.println(sdf.format(inicio));
		System.out.println(sdf.format(fim));
		
		Date duration = new Date(fim.getTime() - inicio.getTime());
		
		System.out.println(duration);
		System.out.println(sdf.format(duration));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(duration);
		cal.add(Calendar.HOUR_OF_DAY, 3);
		
		System.out.println();
		System.out.println(cal.getTime());
		System.out.println(sdf.format(cal.getTime()));
		
		System.out.printf("Quantidade de dias: %d", cal.get(Calendar.DAY_OF_MONTH)-1);
		System.out.printf("%nQuantidade de horas: " + cal.get(Calendar.HOUR_OF_DAY));
		
		if(cal.get(Calendar.DAY_OF_MONTH-1) >= 1) {
			Integer qtdHours =  cal.get(Calendar.HOUR_OF_DAY) + (cal.get(Calendar.DAY_OF_MONTH-1)*24);
			System.out.println();
			System.out.printf("Quantidade de horas no total entre as duas datas: %d", qtdHours);
		}
		
		//RECOMENDADO UTILIZAR A DATA EM FORMATO LONG E UTILIZAR O TIMEUNIT PARA CONVERTER PARA DIA, HORA E ETC...
		//Utilizando o TIMEUNIT fica muito mais simples o procedimento acima^
		long diferenca = fim.getTime() - inicio.getTime();
		System.out.println();
		System.out.printf("%nQuantidade de horas no total entre as duas datas: %d", TimeUnit.HOURS.convert(diferenca, TimeUnit.MILLISECONDS));
	
	}
}
