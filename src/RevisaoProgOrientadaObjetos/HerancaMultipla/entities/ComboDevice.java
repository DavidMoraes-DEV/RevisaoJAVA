package RevisaoProgOrientadaObjetos.HerancaMultipla.entities;

//Nesse exemplo ComboDevice vai HERDAR de Device pois ele tamb�m � um dispositivo e vai IMPLEMENTAR AS INTERFACES: Printer e Scanner sobrescrevendo todos os m�todos deles
public class ComboDevice extends Device implements Printer, Scanner{

	public ComboDevice(String serialNumber) {
		super(serialNumber);
		// TODO Auto-generated constructor stub
	}

	//Cumpre o contrato da INTERFACE Scanner, pois � obrigat�rio implementar opera��es contidas na interface
	@Override
	public String scan() {
		return "Combo scan result";
	}
	
	//Cumpre o contrato da INTERFACE Printer, pois � obrigat�rio implementar opera��es contidas na interface
	@Override
	public void print(String doc) {
		System.out.println("Combo printing: " + doc);
	}

	//Implementa tamb�m o m�todo da classe DEVICE pois ela EXTENDE\HERDA dessa classe
	@Override
	public void processDoc(String doc) {
		System.out.println("Combo processing: " + doc);
	}
	
	
}
/*
 * Na linguagem JAVA como na maioria das linguagens n�o � permitido herdar mais de uma Super Classe
 	- Nem utilizando v�rgula nem acrescentando mais de um extends (Por exemplo: public class ComboDevice extends Scanner extends Printer {})
  	- Ent�o ocorre AQUI O PROBLEMA DO DIAMANTE, pois o ComboDevice poderia hendar tanto de Scanner quando Printer
  		- mas como visto n�o � poss�vel herdar de duas classes diferentes: HERAN�A M�LTIPLA

 * SOLU��O:
 	- Uma classe por�m pode IMPLEMENTAR MAIS de uma INTERFACE
 		- Ficando ent�o ComboDevice HENDANDO da classe DEVICE
 		- E implementando uma INTERFACE de Scanner e de Printer
*/