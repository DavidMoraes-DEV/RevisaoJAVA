package RevisaoProgOrientadaObjetos.Generics.Solucao01_semGenerics.application;

import java.util.Scanner;

import RevisaoProgOrientadaObjetos.Generics.Solucao01_semGenerics.services.PrintService;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PrintService ps = new PrintService();
		
		System.out.print("How many values? ");
		Integer qtdNumber = sc.nextInt();
		
		for (int i=0; i<qtdNumber; i++) {
			ps.addValue(sc.nextInt());
		}

		ps.print();
		System.out.print("First: " + ps.first());
		
		sc.close();
	}
}