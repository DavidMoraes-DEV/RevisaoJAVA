package RevisaoProgOrientadaObjetos.Heranca_VS_Interface.ExemploDaExplicacao.model.entities;

import RevisaoProgOrientadaObjetos.Heranca_VS_Interface.ExemploDaExplicacao.model.enums.Color;

public class Rectangle extends AbstractShape {
	/*
	* Como a classe Rectangle NÃO É abstrata:
		- Ela é OBRIGADA a cumprir o contrato da INTERFACE Implementada na super classe AbstractShape porque a classe Rectangle esta extendendo a classe AbstractShape herdando todas suas funcionalidades
			- Para cumprir o contrato da super classe então deverá:
				- Implementar a operação definida na INTERFACE implementada na superclasse AbstractShape: Area()
	*/
	
	private Double width;
	private Double heigth;
	
	public Rectangle(Color color, Double width, Double heigth) {
		super(color);
		this.width = width;
		this.heigth = heigth;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeigth() {
		return heigth;
	}

	public void setHeigth(Double heigth) {
		this.heigth = heigth;
	}

	//Cumprindo o contrato da INTERFACE
	@Override
	public double area() {
		return width * heigth;
	}
}
