package RevisaoProgOrientadaObjetos.Generics.TiposCuringaDelimitados.Exemplo01.application;

import java.util.ArrayList;
import java.util.List;

import RevisaoProgOrientadaObjetos.Generics.TiposCuringaDelimitados.Exemplo01.entities.Circle;
import RevisaoProgOrientadaObjetos.Generics.TiposCuringaDelimitados.Exemplo01.entities.Rectangle;
import RevisaoProgOrientadaObjetos.Generics.TiposCuringaDelimitados.Exemplo01.entities.Shape;

public class Program {

	public static void main(String[] args) {

		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));
		
		System.out.println("Total area: " + totalArea(myShapes));
		
		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(2.0));
		myCircles.add(new Circle(3.0));
		
		System.out.println("Total area: " + totalArea(myCircles));
		
	}
	
	/*
	* Esse método quando declaramos <? extends Shape> definimos que:
		- Essa lista como parâmetro do método pode receber tipos SHAPE
		- E qualquer outro tipo que SEJA SUBTIPO de Shape. Nesse exemplo é Circle e Rectangle
	*/public static double totalArea(List<? extends Shape> list) {
		double sum = 0.0;
		for(Shape s : list) {
			sum += s.area();
		}
		return sum;
	}
}
