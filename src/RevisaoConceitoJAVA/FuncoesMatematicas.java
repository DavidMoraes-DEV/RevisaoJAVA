package RevisaoConceitoJAVA;

import java.util.Scanner;

public class FuncoesMatematicas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Calcular raiz quadrada de: ");
		int x1 = sc.nextInt();
		
		//Função matemática para calcular a Raiz quadrada: Math.sqrt();
		double raizQuadrada = Math.sqrt(x1);
		System.out.printf("%nA raiz quadrada de %d eh: %.1f%n%n", x1, raizQuadrada);

		//Função matemática para calcular a potencia de X por Y: Math.pow(x, y);
		System.out.printf("Calcular potência de X: ");
		int x2 = sc.nextInt();
		System.out.printf("Elevado a Y: ");
		int x3 = sc.nextInt();
		double potencia = Math.pow(x2, x3);
		System.out.printf("A potência de X elevado a Y eh: %.2f", potencia);
		
		//Função matemática para VALOR ABSOLUTO: Math.obs();
		double x4 = -20;
		System.out.println("Calcula o valor absoluto da variável(Ex: x4 = -20");
		double absoluto = Math.abs(x4);
		System.out.printf("Após calcular o valor absoluto ficou: %.2f", absoluto);
		
		/*EXEMPLO: Funções matemáticas utilizadas em calculos mais complexos como a FORMULA DE BhASKARA:
		-FÓRMULA de BhASKARA eh: X = -b +/- RaizQuadrada(de DELTA(onde DELTA eh: A² - 4.B.C)) dividido por 2.a
		
		-DELTA eh: A² - 4.B.C
		double delta = Math.pow(b, 2) - 4*a*c;
		
		-BhASKARA eh: X = -b +/- RaizQuadrada(DELTA) dividido por 2.a
		double BhASKARA1 = (-b + Math.sqrt(delta) / (2*a));
		double BhASKARA2 = (-b - Math.sqrt(delta) / (2*a));*/	
	}
}