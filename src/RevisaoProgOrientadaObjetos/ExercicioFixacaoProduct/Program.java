package RevisaoProgOrientadaObjetos.ExercicioFixacaoProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> products = new ArrayList<>();
		
		System.out.printf("Enter the number of product: ");
		Integer qtd = sc.nextInt();
		
		for (int i=0; i<qtd; i++) {
			System.out.printf("%nProduct #%d data:%n", i+1);
			
			System.out.print("Common, used or imported (c/u/i)? ");
			char posicao = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String productName = sc.nextLine();

			System.out.printf("Price: ");
			Double productPrice = sc.nextDouble();
			
			if(posicao == 'c') {
				
				products.add(new Product(productName, productPrice));
				
			} else if(posicao == 'u') {
				
				System.out.print("Manufacture date(DD/MM/YYYY): ");
				
				Date productManufacture = sdf.parse(sc.next());
				
				products.add(new UsedProduct(productName, productPrice, productManufacture));
				
			} else if(posicao == 'i') {
				
				System.out.printf("Customs fee: ");
				Double productCustomsFee = sc.nextDouble();
				
				products.add(new ImportedProduct(productName, productPrice, productCustomsFee));
				
			} else {
				System.out.println("Sorry: Non-existent product category");
			}	
		}
		
		System.out.println("PRICE TAGS:");
		for(Product prod : products) {
			System.out.println(prod.priceTag());
		}	
		
		sc.close();
	}
}
/*
* EXERC�CIOS:
	- Fazer um programa para ler os dados de N produtos (N fornecido pelo usu�rio). Ao final, mostrar a etiqueta de pre�o de cada produto na mesma ordem em que foram digitados.
	- Todo produto possui nome e pre�o. Produtos importados possuem uma taxa de alf�ndega, e produtos usados possuem data de fabrica��o.
	- Estes dados espec�ficos devem ser acrescentados na etiqueta de pre�o conforme exemplos abaixo.
	- Para produtos importados, a taxa e alf�ndega deve ser acrescentada ao pre�o final do produto.
*/