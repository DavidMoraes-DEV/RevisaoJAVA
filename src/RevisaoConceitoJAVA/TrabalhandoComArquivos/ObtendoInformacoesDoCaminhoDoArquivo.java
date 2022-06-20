package RevisaoConceitoJAVA.TrabalhandoComArquivos;

import java.io.File;
import java.util.Scanner;

public class ObtendoInformacoesDoCaminhoDoArquivo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a file path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		//Retorna apenas o nome do arquivo e não o caminho completo: .getName()
		System.out.println("getName: " + path.getName());
		
		//Retorna apenas o caminho e não mostra o nome do arquivo: .getParent()
		System.out.println("getParent: " + path.getParent());
		
		//Retorna o caminho completo: .getPath()
		System.out.println("getPath: " + path.getPath());
		
		sc.close();
	}
}
