package RevisaoProgOrientadaObjetos.Generics.ConceitoBasico.Solucao02_comGenerics.applicationn;

import java.util.Scanner;

import RevisaoProgOrientadaObjetos.Generics.ConceitoBasico.Solucao02_comGenerics.servicess.PrintService;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Obtemos o benefício do REUSO utilizando o mesmo serviço para instanciar tipos de dados diferentes
		PrintService<Integer> psInteger = new PrintService<>();
		PrintService<String> psString = new PrintService<>();
		
		System.out.print("How many integer values? ");
		Integer qtdNumber = sc.nextInt();
		
		for (int i=0; i<qtdNumber; i++) {
			psInteger.addValue(sc.nextInt());
		}

		psInteger.print();
		System.out.print("First: " + psInteger.first());
		
		System.out.printf("%n%nHow many string values? ");
		qtdNumber = sc.nextInt();
		
		for (int i=0; i<qtdNumber; i++) {
			psString.addValue(sc.next());
		}

		psString.print();
		System.out.print("First: " + psString.first());
		
		sc.close();
	}
}