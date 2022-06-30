package RevisaoProgOrientadaObjetos.ExerciciosFixacao.ExercicioRegistrosdeLog.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import RevisaoProgOrientadaObjetos.ExerciciosFixacao.ExercicioRegistrosdeLog.model.entities.LogUser;

public class Program {

	public static void main(String[] args) {

		List<LogUser> list = new ArrayList<LogUser>();
		Set<LogUser> set = new HashSet<LogUser>();
		
		try(BufferedReader br = new BufferedReader(new FileReader("C:\\Temp\\LogRecords\\records.txt"))) {
			
			String line = br.readLine();
			while (line != null) {
				
				String[] fields = new String[2];
				fields = line.split(" ");
				
				//Lista por padr�o aceita repeti��es normalmente ent�o pegar� todos os dados
				list.add(new LogUser(fields[0], Date.from(Instant.parse(fields[1]))));
				
				/*
				* Como as cole��es Set N�O ACEITAM repeti��es os usu�rios que tiverem o mesmo nome seram barrados e n�o ser�o adicionados na cole��o
				* 	- POIS na classe LogUser definimos HashCode e Equal apenas para os NOMES.
				
				*/
				set.add(new LogUser(fields[0], Date.from(Instant.parse(fields[1]))));
				
				line = br.readLine();
			}
		
			System.out.println("|--------------------------------------------------------------------|");
			System.out.println("|--------------------- DADOS COMPLETO DO ARQUIVO --------------------|");
			System.out.println("|--------------------------------------------------------------------|");
			
			System.out.printf("%nTODOS OS DADOS DO ARQUIVO:%n%n");
			for(LogUser u : list) {
				System.out.println(u);	
			}
			
			System.out.printf("%nQuantidade total de Registros de Usu�rios: %d%n%n", list.size());
			
			System.out.println("|--------------------------------------------------------------------|");
			System.out.println("|----------- ESTRUTURA SET N�O ACEITA REPETI��ES POR ISSO -----------|");
			System.out.println("|--------------------------------------------------------------------|");
			
			System.out.printf("%nDADOS DO ARQUIVO QUE POSSUI NOME DE USU�RIO DIFERENTE:%n%n");
			for(LogUser u : set) {
				System.out.println(u);	
			}
			
			System.out.printf("%nQuantidade de Usu�rios diferentes: %d", set.size());
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
