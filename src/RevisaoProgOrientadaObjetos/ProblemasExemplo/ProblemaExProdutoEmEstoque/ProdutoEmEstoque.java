package RevisaoProgOrientadaObjetos.ProblemasExemplo.ProblemaExProdutoEmEstoque;

import java.util.Locale;
import java.util.Scanner;

public class ProdutoEmEstoque {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product prod = new Product();
		
		System.out.printf("TELA DE CADASTRO DE PRODUTO:%n");
		
		System.out.printf("Nome: ");
		prod.name = sc.next();
		
		System.out.printf("Preço: ");
		prod.price = sc.nextDouble();
		
		System.out.printf("Quantidade em estoque: ");
		prod.quantity = sc.nextInt();

		System.out.printf("%nPRODUTO CADASTRADO: ");
		System.out.println(prod); //com ou sem .toString funciona mesmo assim.		
		
		System.out.printf("%nQuantidade a ser adicionada ao estoque: ");
		prod.AddProducts(sc.nextInt());
		System.out.println(prod);
		
		System.out.printf("%nQuantidade a ser removida do estoque: ");
		prod.RemoveProducts(sc.nextInt());
		System.out.println(prod);
		
		sc.close();
	}

}
/*
PROBLEMA EXEMPLO: Fazer um programa para ler os dados de um produtos em estoque (nome, preço e quantidade no estoque).
Em seguida:
- Mostrar os dados do produto (nome, preço, quantidade no estoque, valor total no esotque)
- Realizar uma entrada no estoque e mostrar novamnete os dados do produto
- Realizar uma saída no estoque e mostrar novamente os dados do produto

Para resolver este problema, você deve criar um CLASSE conforme projeto UML:

UML:
--------------------------------------
				Product
---------------------------------------
- Name: string
- Price: double
- Quantity: int
---------------------------------------
+ TotalValueInStock(): double
+ AddProducts(quantity : int : void
+ RemoveProducts(quantity : int) : void
---------------------------------------
*/