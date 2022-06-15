package RevisaoProgOrientadaObjetos.ProblemasExemplo.ProblemaExemploSemUtilizarOrientObjeto;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaExSemUtilizarOrientObjetos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite as medidas do triangulo X: ");
		double x1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double x3 = sc.nextDouble();
		
		System.out.printf("%nDigite as medidas do triangulo Y: %n");
		double y1 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double y3 = sc.nextDouble();
		
		double areaX = Math.sqrt(((x1+x2+x3)/2) * (((x1+x2+x3)/2)-x1) * (((x1+x2+x3)/2)-x2) * (((x1+x2+x3)/2)-x3));
		double areaY = Math.sqrt(((y1+y2+y3)/2) * (((y1+y2+y3)/2)-y1) * (((y1+y2+y3)/2)-y2) * (((y1+y2+y3)/2)-y3));
		
		System.out.printf("%n�rea do triangulo X: %.4f%n", areaX);
		System.out.printf("�rea do triangulo Y: %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.printf("Maior �rea: X");
		}else {
			System.out.printf("Maior �rea: Y");
		}
		
		sc.close();
	}

}
/*
PROBLEMA EXEMPLO:
Fazer um programa para ler as medidas dos lados de dois tri�ngulos X e Y (suponha medidas v�lidas).
mostrar o valor das �reas dos dois tri�ngulos e dizer qual dos dois tri�ngulos possui a maior �rea.

A f�rmula para calcular a �rea de um tri�ngulo a partir das medidas de seus lados a, b e c � a seguinte:
F�RMULA DE HERON: Area = RaizQ(p.(p-a).(p-b).(p-c) onde p = a+b+c/2

EXEMPLO PR�TICO:

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