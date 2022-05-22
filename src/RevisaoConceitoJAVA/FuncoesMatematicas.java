package RevisaoConceitoJAVA;

import java.util.Scanner;

public class FuncoesMatematicas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Calcular raiz quadrada de: ");
		int x1 = sc.nextInt();
		
		//Fun��o matem�tica para calcular a Raiz quadrada: Math.sqrt();
		double raizQuadrada = Math.sqrt(x1);
		System.out.printf("%nA raiz quadrada de %d eh: %.1f%n%n", x1, raizQuadrada);

		//Fun��o matem�tica para calcular a potencia de X por Y: Math.pow(x, y);
		System.out.printf("Calcular pot�ncia de X: ");
		int x2 = sc.nextInt();
		System.out.printf("Elevado a Y: ");
		int x3 = sc.nextInt();
		double potencia = Math.pow(x2, x3);
		System.out.printf("A pot�ncia de X elevado a Y eh: %.2f", potencia);
		
		//Fun��o matem�tica para VALOR ABSOLUTO: Math.obs();
		double x4 = -20;
		System.out.println("Calcula o valor absoluto da vari�vel(Ex: x4 = -20");
		double absoluto = Math.abs(x4);
		System.out.printf("Ap�s calcular o valor absoluto ficou: %.2f", absoluto);
		
		/*EXEMPLO: Fun��es matem�ticas utilizadas em calculos mais complexos como a FORMULA DE BhASKARA:
		-F�RMULA de BhASKARA eh: X = -b +/- RaizQuadrada(de DELTA(onde DELTA eh: A� - 4.B.C)) dividido por 2.a
		
		-DELTA eh: A� - 4.B.C
		double delta = Math.pow(b, 2) - 4*a*c;
		
		-BhASKARA eh: X = -b +/- RaizQuadrada(DELTA) dividido por 2.a
		double BhASKARA1 = (-b + Math.sqrt(delta) / (2*a));
		double BhASKARA2 = (-b - Math.sqrt(delta) / (2*a));*/	
	}
}