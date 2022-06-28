package RevisaoProgOrientadaObjetos.Generics.GenericsDelimitados.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import RevisaoProgOrientadaObjetos.Generics.GenericsDelimitados.model.entities.Product;
import RevisaoProgOrientadaObjetos.Generics.GenericsDelimitados.model.services.CalculationService;

public class Program {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		String path = "C:\\Temp\\Products\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			
			while(line != null) {
				
				String[] vect = new String[1];
				vect = line.split(",");
				
				list.add(new Product(vect[0], Double.parseDouble(vect[1])));
				line = br.readLine();
			}
			
			Product x = CalculationService.max(list);
			System.out.print("Most expensive: ");
			System.out.println(x);
			
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}
