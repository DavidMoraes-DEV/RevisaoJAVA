package RevisaoProgOrientadaObjetos.MetodosAbstratos.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import RevisaoProgOrientadaObjetos.MetodosAbstratos.entities.Circle;
import RevisaoProgOrientadaObjetos.MetodosAbstratos.entities.Rectangle;
import RevisaoProgOrientadaObjetos.MetodosAbstratos.entities.Shape;
import RevisaoProgOrientadaObjetos.MetodosAbstratos.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Shape> shapes = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		Integer qtd = sc.nextInt();
		
		for(int i=0; i<qtd; i++) {
			
			System.out.printf("%nShape #%d data:%n", i+1);
			System.out.printf("Rectangle or Circle (r/c)? ");
			char posicao = sc.next().charAt(0);
			
			System.out.printf("Color (BLACK/BLUE/RED): ");
			Color shapeColor = Color.valueOf(sc.next());
			
			if(posicao == 'r') {
				
				System.out.printf("Widht: ");
				Double rectangleWidht = sc.nextDouble();
				
				System.out.printf("Height: ");
				Double rectangleHeight = sc.nextDouble();
				
				shapes.add(new Rectangle(shapeColor, rectangleWidht, rectangleHeight));
				
			} else if (posicao == 'c') {
				
				System.out.printf("Radius: ");
				Double circleRadius = sc.nextDouble();
				
				shapes.add(new Circle(shapeColor, circleRadius));
				
			}
		}
		
		System.out.printf("%nSHAPES AREAS:%n");
		for(Shape obj : shapes) {
			System.out.println(String.format("%.2f", obj.area()));
		}
		
		sc.close();
	}
}
/*
* MÉTODOS ABSTRATOS:
	- São métodos que não possuem implementação
 	- Métodos precisam ser abstratos quando a classe é genérica demais para conter sua implementação
 		- Nesse exemplo da FIGURA a classe SHAPE é muito genérica pois mesmo sendo possível calcular a área de uma figura o calculo para essa área é muito genérica pois depende do tipo específico da figura
 	- Se uma classe possuir pelo menos um método abstrato, então esta classe também é abstrata.
 
* NOTAÇÃO UML: ITÁLICO
 
* PROBLEMA EXEMPLO:
 
Enter the number of shapes: 2

Shape #1 data:
Rectangle or Circle (r/c)? r
Color (BLACK/BLUE/RED): BLACK
Width: 4.0
Height: 5.0

Shape #2 data:
Rectangle or Circle (r/c)? c
Color (BLACK/BLUE/RED): BLACK
Radius: 3.0

SHAPE AREAS:
20.00
29.61
*/ 