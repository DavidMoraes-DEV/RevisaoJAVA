package RevisaoProgOrientadaObjetos.Construtor.application;

import java.util.Locale;
import java.util.Scanner;

import RevisaoProgOrientadaObjetos.Construtor.entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("TELA DE CADASTRO DE PRODUTO:%n");
		
		System.out.printf("Nome: ");
		String name = sc.next();
		
		System.out.printf("Preço: ");
		double price = sc.nextDouble();
		
		System.out.printf("Quantidade em estoque: ");
		int quantity = sc.nextInt();
		
		Product prod = new Product(name, price, quantity);
		

		System.out.printf("%nPRODUTO CADASTRADO: ");
		System.out.println(prod); //com ou sem .toString funciona mesmo assim.		
		
		System.out.printf("%nQuantidade a ser adicionada ao estoque: ");
		prod.addProducts(sc.nextInt());
		System.out.println(prod);
		
		System.out.printf("%nQuantidade a ser removida do estoque: ");
		prod.removeProducts(sc.nextInt());
		System.out.println(prod);
		
		sc.close();
	}
}