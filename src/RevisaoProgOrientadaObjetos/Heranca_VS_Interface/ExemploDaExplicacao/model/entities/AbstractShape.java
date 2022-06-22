package RevisaoProgOrientadaObjetos.Heranca_VS_Interface.ExemploDaExplicacao.model.entities;

import RevisaoProgOrientadaObjetos.Heranca_VS_Interface.ExemploDaExplicacao.model.enums.Color;
import RevisaoProgOrientadaObjetos.Heranca_VS_Interface.ExemploDaExplicacao.model.services.Shape;

//Como é uma classe ABSTRATA NÃO precisa cumprir o contrato implementando a operação AREA()
public abstract class AbstractShape implements Shape {

	private Color color;

	public AbstractShape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
}
