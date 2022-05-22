package RevisaoConceitoJAVA.EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaIfElse {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a hora atual separando a hora e minutos por ponto (Ex.: 10.30): ");
		double hr = sc.nextDouble();
		
		if(hr<=12) {
			System.out.println("Bom Dia!!!");
		}else if(hr>=12 && hr<=18) {
			System.out.println("Boa Tarde!!!");
		}else {
			System.out.println("Boa Noite!!!");
		}
		
		sc.close();
	}
}
