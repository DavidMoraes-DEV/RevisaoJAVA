package RevisaoProgOrientadaObjetos.ExerciciosFixacaoProgOrientObjetos;

public class Retangulo {

	public double largura;
	public double altura;
	
	public double Area() {

		return largura*altura;
	}
	
	public double Perimetro() {
		
		return (largura+altura)*2;
	}
	
	public double Diagonal() {
		
		return Math.sqrt((Math.pow(largura, 2) + (Math.pow(altura, 2))));
	}
}
