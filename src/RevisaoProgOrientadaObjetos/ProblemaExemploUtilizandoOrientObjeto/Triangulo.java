package RevisaoProgOrientadaObjetos.ProblemaExemploUtilizandoOrientObjeto;

public class Triangulo {

	public double a;
	public double b;
	public double c;
		
	
	//F�RMULA DE HERON: Area = RaizQ(p.(p-a).(p-b).(p-c) onde p = a+b+c/2
	public double areaT() {
		
		double p = (a+b+c)/2;
		return Math.sqrt(p * (p-a) * (p-b) * (p-c));
	}
	
	
}
/*
* Benef�cios de se calcular a �rea de um tri�ngulo por meio de um M�TODO dentro da CLASSE Triangulo?
1- REAPROVEITAMENTO DE C�DIGO: N�s eliminamos o c�digo repetido (c�lculo das �reas dos tri�ngulos x e y) no programa principal (No meu caso o programa principal seria a classe ProblemaExUtilizandoOrientObjeto.
2- DELEGA��O DE RESPONSABILIDADES: Quem deve ser respons�vel por saber como calcular a �rea de um tri�ngulo � o pr�prio tri�ngulo. A l�gica do c�lculo da �rea n�o deve estar em outro lugar.
*/