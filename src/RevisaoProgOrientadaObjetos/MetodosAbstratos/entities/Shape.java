package RevisaoProgOrientadaObjetos.MetodosAbstratos.entities;

import RevisaoProgOrientadaObjetos.MetodosAbstratos.enums.Color;

//Para ter M�TODO ABSTRATO a classe PRECISA ser ABSTRATA
public abstract class Shape {
	
	private Color color;

	public Shape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	//M�todo ABSTRATO, N�o possui implementa��o(CORPO).
	public abstract Double area();
}

