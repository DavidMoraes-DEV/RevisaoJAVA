package RevisaoConceitoJAVA;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*Ler Dados do tipo string (Uma palavra)*/
		String x1;
		System.out.printf("Qual o seu nome: ");
		x1 = sc.next();
		System.out.printf("Seu nome eh: %s%n%n", x1);
		
		/*Ler Dados do tipo string (Uma frase)*/
		String x5;
		System.out.printf("Qual o seu Sobrenome: ");
		sc.nextLine(); /*Limpeza de buffer de leitura, necessário devido a quebra de linha anterior*/
		x5 = sc.nextLine();
		System.out.printf("Seu nome completo eh: %s %s%n%n", x1, x5);
		
		/*Ler Dados do tipo inteiro*/
		int x2;
		System.out.printf("Qual sua idade: ");
		x2 = sc.nextInt();
		System.out.printf("Sua idade eh: %d%n%n", x2);
		
		/*Ler Dados do tipo double(ponto flutuante)*/
		double x3;
		System.out.printf("Qual sua Altura: ");
		x3 = sc.nextDouble();
		System.out.printf("Sua Altura eh: %.2f%n%n", x3);
		
		/*Ler Dados do tipo char(Um Caracter)*/
		char x4;
		System.out.printf("Gênero (F/M): ");
		x4 = sc.next().charAt(0);
		System.out.printf("Seu gênero eh: %s%n%n", x4);
		
		sc.close();
	}

}
/*
PARTICULARIDADE DO JAVA:
Entrada de Dados:
- Para fazer entrada de dados, nós precisamos criar um
objeto do tipo "Scanner": Tipo "Especial" do JAVA para
fazer entrada de dados.

NECESSÁRIO:
Importar: "import java.util.Scanner;"

Quando não precisar mais da Entrada de dados
Realizar o comando: VARIÁVEL.close()
para desalocar o recurso Scanner

.charAt(0) = Pega o 1º caracter da String
*/