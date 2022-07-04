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
		
		//Código Expressivo -> Programação Imperativa
		Integer sum1 = 0;
		
		for (Integer x : list) {
		sum1 += x;
		}
		
		System.out.println(sum1);
		
		//Código Conciso -> Programação Funcional É frequente alcançar códigos concisos.
		Integer sum2 = list.stream().reduce(0, Integer::sum);
		
		System.out.println(sum2);
	}
}