package ProgramacaoFuncional.ExerciciosDeFixacao.ExercicioFixacaoProduct.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import ProgramacaoFuncional.ExerciciosDeFixacao.ExercicioFixacaoProduct.model.entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> products = new ArrayList<>();
		
		//Caminho do arquivo: C:\\Temp\\Stock\\Products.csv
		System.out.print("Enter full file path: ");
		String path = sc.next();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			while(line != null) {
				
				String[] fields = new String[2];
				fields = line.split(",");
				
				String productName = fields[0];
				Double productPrice = Double.parseDouble(fields[1]);
				
				products.add(new Product(productName, productPrice));
				
				line = br.readLine();
			}
			
			Double avg = products.stream()
					.map(p -> p.getPrice())
					.reduce(0.0, (x, y) -> x + y) / products.size();
			

			System.out.printf("%nAverage price: %.2f%n%n", avg);
			
			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			
			List<String> names = products.stream()
					.filter(p -> p.getPrice() < avg) //Filtra apenas os preços dos produtos que é menor que a média AVG obtida acima
					.map(p -> p.getName()) //Pega apenas os nomes desses produtos
					.sorted(comp.reversed()) //Ordena com o Comparator por ordem alfabetica e reverte a ordem com o .reversed
					.collect(Collectors.toList()); //Converte para o tipo LISTA novamente
			
			names.forEach(System.out::println);
					
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
				
		sc.close();
	}
}
