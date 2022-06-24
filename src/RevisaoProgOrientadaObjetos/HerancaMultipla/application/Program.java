package RevisaoProgOrientadaObjetos.HerancaMultipla.application;

import RevisaoProgOrientadaObjetos.HerancaMultipla.entities.ComboDevice;
import RevisaoProgOrientadaObjetos.HerancaMultipla.entities.ConcretePrinter;
import RevisaoProgOrientadaObjetos.HerancaMultipla.entities.ConcreteScanner;

public class Program {

	public static void main(String[] args) {
		
		ConcretePrinter concretePrinter = new ConcretePrinter("1000");

		System.out.println("COMPORTAMENTO DA IMPRESSORA(PRINTER):");
		concretePrinter.processDoc("My Letter");
		concretePrinter.print("My Letter");
	
		ConcreteScanner concreteScanner = new ConcreteScanner("2001");

		System.out.printf("%nCOMPORTAMENTO DO SCANNER:%n");
		concreteScanner.processDoc("My Email");
		
		System.out.println("Scan result: " + concreteScanner.scan());
		
		ComboDevice comboDevice = new ComboDevice("1002");

		System.out.printf("%nCOMPORTAMENTO DO COMBO-DEVICE:%n");
		comboDevice.processDoc("My dissertation");
		comboDevice.print("My dissertation");
		
		System.out.println("Scan result: " + comboDevice.scan());
	
	}
}
/*
 * Nesse exemplo temos duas classes sebrescrevendo o método processDoc com funções específicas dentro de cada classe

*/