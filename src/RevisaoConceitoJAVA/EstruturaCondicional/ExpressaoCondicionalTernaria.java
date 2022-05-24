package RevisaoConceitoJAVA.EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class ExpressaoCondicionalTernaria {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Pre�o do Produto 01: ");
		double precoProd1 = sc.nextDouble();
		
		double desconto;
		
		//******Exemplo de condi��o utilizando IF-ELSE******
		if(precoProd1 < 20.0) {
			desconto = precoProd1 * 0.1;
		}else {
			desconto = precoProd1 * 0.05;
		}
		
		System.out.printf("%nDesconto para o Produto 01: %.3f%n", desconto);
		
		System.out.printf("Pre�o do Produto 02: ");
		double precoProd2 = sc.nextDouble();
		
		//******Exemplo de condi��o utilizando a express�o condicional tern�ria******
		desconto = (precoProd2 < 20.0) ? precoProd2 * 0.1 : precoProd2 * 0.05;			
		
		System.out.printf("%nDesconto para o Produto 02: %.3f%n", desconto);
		
		sc.close();
	}
}

/*
 	Estrutura opcional ao if-else quando se deseja decidir um VALOR com base em uma condi��o.
 	
 	SINTAXE: (***igual a fun��o "SE" do Excel***)
 	( condi��o ) ? valor_se_verdadeiro : valor_se_falso
 	
 	Exemplos:
 	
 	(2>4) ? 50:80   ->   resultado: 80
 	(10!=3) ? "Maria":"Alex"   ->   resultado: "Maria"
*/