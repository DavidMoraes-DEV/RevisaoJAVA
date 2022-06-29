package RevisaoProgOrientadaObjetos.Generics.TiposCuringaDelimitados.Exemplo01.entities;

public class Circle implements Shape{

	private Double radius;
	
	public Circle(Double radius) {
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}

	
}
