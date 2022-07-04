package ProgramacaoFuncional.Conceitos_e_CalculoLambda.Expressividade_e_CodigoConciso;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(5);
		list.add(10);
		list.add(4);
		
		//C�digo Expressivo -> Programa��o Imperativa
		Integer sum1 = 0;
		
		for (Integer x : list) {
		sum1 += x;
		}
		
		System.out.println(sum1);
		
		//C�digo Conciso -> Programa��o Funcional � frequente alcan�ar c�digos concisos.
		Integer sum2 = list.stream().reduce(0, Integer::sum);
		
		System.out.println(sum2);
	}
}