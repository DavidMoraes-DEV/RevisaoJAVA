package RevisaoProgOrientadaObjetos.MetodosAbstratos.entities;

import RevisaoProgOrientadaObjetos.MetodosAbstratos.enums.Color;

//Ao EXTENDER(HERDAR) a classe Shape para a classe RECTANGLE (NESSE caso dara um erro no j� in�cio, pois o compilador avisar� que como essa classe RECTANGLE n�o � abstrata ela dever� SOBRESCREVER o m�todo abstrato da SUPERCLASSE SHAPE.
public class Rectangle extends Shape{

	private Double width;
	private Double height;
	
	public Rectangle(Color color, Double width, Double height) {
		super(color);
		this.width = width;
		this.height = height;
	}
	
	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	//Sobreposi��o do m�todo abstrato AREA da SUPERCLASSE SHAPE
	@Override
	public final Double area() {
		return width * height;
	}
}
