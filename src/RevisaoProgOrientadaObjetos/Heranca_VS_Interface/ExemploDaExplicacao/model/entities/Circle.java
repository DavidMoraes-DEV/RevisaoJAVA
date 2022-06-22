package RevisaoProgOrientadaObjetos.Heranca_VS_Interface.ExemploDaExplicacao.model.entities;

import RevisaoProgOrientadaObjetos.Heranca_VS_Interface.ExemploDaExplicacao.model.enums.Color;

/*
* Como a classe Circle NÃO É abstrata:
	- Ela é OBRIGADA a cumprir o contrato da INTERFACE Implementada na super classe AbstractShape porque a classe Circle esta extendendo a classe AbstractShape herdando todas suas funcionalidades
		- Para cumprir o contrato da super classe então deverá:
			- Implementar a operação definida na INTERFACE implementada na superclasse AbstractShape: Area()
*/
public class Circle extends AbstractShape {
	
	private Double radius;
	
	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}
	
	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	//Cumprindo o contrato da interface SHAPE
	@Override
	public double area() {
		return Math.PI * (Math.pow(radius, 2));
	}
}
