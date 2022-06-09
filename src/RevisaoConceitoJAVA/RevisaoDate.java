package RevisaoConceitoJAVA;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class RevisaoDate {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy"); //Define o formato da data que queremos no JAVA
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		
		Date date1 = sdf1.parse("25/06/2022"); //Define apenas a data
		System.out.println("Formato padrão JAVA: " + date1); //Imprime as datas definidas acima em um formato padrão do JAVA
		
		Date date2 = sdf2.parse("25/06/2022 15:42:07"); //Define a data e hora
		System.out.println("Formatado com SimpleDateFormat: " + sdf2.format(date2)); //Utilizando o sdf2.formato() é feita a formatação da data conforme definido no sdf2 acima
		
		Date date3 = new Date(); //Puxa a data e hora atual
		System.out.println("Data Atual com new Date():" + sdf2.format(date3));
		
		Date date4 = new Date(System.currentTimeMillis()); //Puxa o instante do sistema atual, converte em milisegundos e cria a data com esse valor.
		System.out.println("Data Atual com new Date(System.currentTimeMillis()):" + sdf2.format(date4));
		
		System.out.printf("%nFormatado pré-definido: " + sdf2.format(date2)); //Formato Original sem Utilizar O formato UTC na entrada
		Date date5 = Date.from(Instant.parse("2022-06-25T15:42:07Z")); //Quando a data esta definida no padrão UTC, ao ser chamada pelo programa ela será convertida altomaticamente no padrão local no caso do brasil 3 horas atrazada do horário UTC
		System.out.printf("%nData no formato ISO8601 sem a formatação com TimeZone = GMT:" + sdf2.format(date5)); //Chamada do horário no formato UTC que será convertido automaticamente para o horário local
		//Para imprimir no formato local UTC deverá instanciar um novo SimpleDateFormat DEFININDO o TIMEZONE = GMT
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); //Declaração igual as anteriores acima.
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		System.out.printf("%nData no formato ISO8601 formatado com TimeZone = GMT: " + sdf3.format(date5));
		
	
	}
}
/*
DATE: Representa um INSTANTE

Pacote JAVA.UTIL

* Um objeto Date internamente armazena:
	- O número de milissegundos desde a meia noite do dia 1 de janeiro de 1970 GMT (UTC)
		- GMT: Greenwich Mean Time (time zone)
		- UTC: Coordinated Universal Time (time standard)

* SimpleDateFormat: Define formatos para conversão de Date para String e vice e versa.

	dd/MM/yyyy -> 23/07/2022
	dd/MM/yyyy HH:mm:ss -> 23/07/2022 15:42:07
	
**IMPORTANTE: Padrão ISO 8601 e classe Instant
	
	Formato: yyyy-MM-ddTHH:mm:ssZ
		Exemplo: "2022-06-09T15:42:07Z"

CLASSE INSTANT:		
Ex: Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

BOA PRÁTICA: Quando for armazenar data e hora armazenar no formato UTC e quando for recuperar aí sim podemos formata-la de acordo com a necessidade.
*/