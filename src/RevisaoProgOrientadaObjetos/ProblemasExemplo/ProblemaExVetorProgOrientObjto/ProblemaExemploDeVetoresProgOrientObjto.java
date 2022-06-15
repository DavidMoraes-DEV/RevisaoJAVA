package RevisaoProgOrientadaObjetos.ProblemasExemplo.ProblemaExVetorProgOrientObjto;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaExemploDeVetoresProgOrientObjto {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("CADASTROS DE PRODUTOS:");
		System.out.printf("%nQuantos produtos será cadastrado? ");
		int qtdProdutos = sc.nextInt();
		
		Produto[] produtos = new Produto[qtdProdutos];
		for(int i=0; i<qtdProdutos; i++) {
			System.out.printf("%nCadastro do Produto %d:%n", i+1);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Preço: ");
			double preco = sc.nextDouble();

			produtos[i] = new Produto(nome, preco);
		}
		
		double soma = 0;
		
		/*for(int i=1; i<produtos.length; i++) {
			soma += produtos[i].getPreco();
		}*/
		
		//Exemplo utilizando o for-each
		for(Produto obj : produtos) {
			soma += obj.getPreco();
		}
		
		double media = soma/produtos.length;
		System.out.printf("%nMedia dos preços: %.2f", media);
		
		sc.close();
	}
}
/*
PROBLEMA EXEMPLO: Fazer um programa para ler um número inteiro N e os dados (nome e preço) de N Produtos.
Armazene os N produtos em um vetor. Em seguida, mostrar o preço médio dos produtos.

EXEMPLO:
Vai cadastrar quantos produtos? 3

TV
900.00

Fryer
400.00

Stove
800.0

Média de preço dos pordutos: 700.0

*/