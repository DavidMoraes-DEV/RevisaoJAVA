package RevisaoProgOrientadaObjetos.ExerciciosFixacao.ExercicioQtdDeVotos.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import RevisaoProgOrientadaObjetos.ExerciciosFixacao.ExercicioQtdDeVotos.model.entities.Urn;

public class Program {

	public static void main(String[] args) {

		List<Urn> originalData = new ArrayList<>();
		Map<String, Integer> mapCandidates = new HashMap<String, Integer>();
		
		String path = "C:\\Temp\\Records\\Votes.csv";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			while(line != null) {
				
				String[] fields = line.split(",");
				String nameCandidate = fields[0];
				Integer numberVotes = Integer.parseInt(fields[1]);
				
				originalData.add(new Urn(nameCandidate, numberVotes));
				
				if(mapCandidates.containsKey(fields[0])) {
					
					Integer votes = mapCandidates.get(nameCandidate) + numberVotes;
					
					mapCandidates.put(nameCandidate, votes);
					
				} else {
					mapCandidates.put(nameCandidate, numberVotes);
				}
				
				line = br.readLine();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("DADOS ORIGINAIS DO ARQUIVO:");
		for(Urn urn : originalData) {
			System.out.println(urn);
		}
		
		System.out.printf("%n%nTOTAL DE VOTOS POR CANDIDATO:%n");
		
		for(String cand : mapCandidates.keySet()) {
			System.out.printf(cand + ": " + mapCandidates.get(cand) + "%n");
		}
	}
}
/*
DADOS DO ARQUIVO:
Alex Blue,15
Maria Green,22
Bob Brown,21
Alex Blue,30
Bob Brown,15
Maria Green,27
Maria Green,22
Bob Brown,25
Alex Blue,31

ENTRADAS E SAÍDAS:
Enter file full path: c:\temp\in.txt
Alex Blue: 76
Maria Green: 71
Bob Brown: 61
*/