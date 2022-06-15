package RevisaoProgOrientadaObjetos.ProblemasExemplo.ProblemaExemploUtilizandoOrientObjeto;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaExUtilizandoOrientObjeto {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangulo x, y;
		
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Digite as medidas do triangulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.printf("%nDigite as medidas do triangulo Y: %n");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.areaT();
		double areaY = y.areaT();
		
		System.out.printf("%nÁrea do triangulo X: %.4f%n", areaX);
		System.out.printf("Área do triangulo Y: %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.printf("Maior Área: X");
		}else {
			System.out.printf("Maior Área: Y");
		}
		
		sc.close();
	}

}
/*
PROBLEMA EXEMPLO:
Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas válidas).
mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos possui a maior área.

A fórmula para calcular a área de um triângulo a partir das medidas de seus lados a, b e c é a seguinte:
FÓRMULA DE HERON: Area = RaizQ(p.(p-a).(p-b).(p-c) onde p = a+b+c/2

EXEMPLO PRÁTICO:

ENTRADAS:
Digite as medidas do triagulo X:
3.00
4.00
5.00

Digite as medidas do triangulo Y:
7.50
4.50
4.02

Triangulo X area: 6.0000
Triangulo Y area: 7.5638
Maior area: Y
*/