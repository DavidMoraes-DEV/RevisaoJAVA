package RevisaoProgOrientadaObjetos.ExerciciosFixacaoProgOrientObjetos;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioRetangulo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo ret = new Retangulo();
		
		System.out.printf("Digite as medidas de um retagulo: %nDigite a Largura: ");
		ret.largura = sc.nextDouble();
		
		System.out.printf("Digite a altura: ");
		ret.altura = sc.nextDouble();
		
		System.out.printf("%nAREA = %.2f%nPERÍMETRO = %.2f%nDIAGONAL = %.2f", ret.Area(), ret.Perimetro(), ret.Diagonal());		
		
		sc.close();
	}

}
/*
EXERCÍCIO: Fazer um programa para ler os valores da largura e altura de um retângulo. Em seguida, mostrar na tela
o valor de sua área, perímetro e diagonal. Usar uma classe como mostrado no projeto UML abaixo:

-----------------------
      RETANGULO
-----------------------
- Largura : double
- Altura : double
-----------------------
+ Area() : double
+ Perimeter() : double
+ Diagonal() : double
-----------------------

EXEMPLO ENTRADA E SAÍDA:
Digite a altura e a largura do retangulo:
3.00
4.00
AREA = 12.00
PERIMETRO = 14.00
DIAGONAL = 5.00
*/