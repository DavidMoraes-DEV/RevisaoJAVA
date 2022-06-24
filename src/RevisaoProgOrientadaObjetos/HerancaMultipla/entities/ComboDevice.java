package RevisaoProgOrientadaObjetos.HerancaMultipla.entities;

//Nesse exemplo ComboDevice vai HERDAR de Device pois ele também é um dispositivo e vai IMPLEMENTAR AS INTERFACES: Printer e Scanner sobrescrevendo todos os métodos deles
public class ComboDevice extends Device implements Printer, Scanner{

	public ComboDevice(String serialNumber) {
		super(serialNumber);
		// TODO Auto-generated constructor stub
	}

	//Cumpre o contrato da INTERFACE Scanner, pois é obrigatório implementar operações contidas na interface
	@Override
	public String scan() {
		return "Combo scan result";
	}
	
	//Cumpre o contrato da INTERFACE Printer, pois é obrigatório implementar operações contidas na interface
	@Override
	public void print(String doc) {
		System.out.println("Combo printing: " + doc);
	}

	//Implementa também o método da classe DEVICE pois ela EXTENDE\HERDA dessa classe
	@Override
	public void processDoc(String doc) {
		System.out.println("Combo processing: " + doc);
	}
	
	
}
/*
 * Na linguagem JAVA como na maioria das linguagens não é permitido herdar mais de uma Super Classe
 	- Nem utilizando vírgula nem acrescentando mais de um extends (Por exemplo: public class ComboDevice extends Scanner extends Printer {})
  	- Então ocorre AQUI O PROBLEMA DO DIAMANTE, pois o ComboDevice poderia hendar tanto de Scanner quando Printer
  		- mas como visto não é possível herdar de duas classes diferentes: HERANÇA MÚLTIPLA

 * SOLUÇÃO:
 	- Uma classe porém pode IMPLEMENTAR MAIS de uma INTERFACE
 		- Ficando então ComboDevice HENDANDO da classe DEVICE
 		- E implementando uma INTERFACE de Scanner e de Printer
*/