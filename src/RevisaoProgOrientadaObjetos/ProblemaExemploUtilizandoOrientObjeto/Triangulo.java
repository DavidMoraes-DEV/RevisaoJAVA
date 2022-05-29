package RevisaoProgOrientadaObjetos.ProblemaExemploUtilizandoOrientObjeto;

public class Triangulo {

	public double a;
	public double b;
	public double c;
		
	
	//FÓRMULA DE HERON: Area = RaizQ(p.(p-a).(p-b).(p-c) onde p = a+b+c/2
	public double areaT() {
		
		double p = (a+b+c)/2;
		return Math.sqrt(p * (p-a) * (p-b) * (p-c));
	}
	
	
}
/*
* Benefícios de se calcular a área de um triângulo por meio de um MÉTODO dentro da CLASSE Triangulo?
1- REAPROVEITAMENTO DE CÓDIGO: Nós eliminamos o código repetido (cálculo das áreas dos triângulos x e y) no programa principal (No meu caso o programa principal seria a classe ProblemaExUtilizandoOrientObjeto.
2- DELEGAÇÃO DE RESPONSABILIDADES: Quem deve ser responsável por saber como calcular a área de um triângulo é o próprio triângulo. A lógica do cálculo da área não deve estar em outro lugar.
*/