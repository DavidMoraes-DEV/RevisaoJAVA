package RevisaoConceitoJAVA.TrabalhandoComArquivos;

import java.io.File;
import java.util.Scanner;

public class ManipulandoPastasComFile {

	public static void main(String[] args) {

		//MANIPULANDO PASTAS COM A CLASSE FILE:

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String srtPath = sc.next();
		
		//PATH pode indicar tanto o caminho de um arquivo ou um caminho de uma pasta
		File path = new File(srtPath);
		
		/*
		* .listFiles() -> Pega todas as pastas a partir do caminho especificado
		* File::isDirection -> Fun��o que espec�fica o tipo de coisa que se quer filtrar, ou seja ser� filtrado e pego apenas o que for DIRET�RIO/PASTA
		* File::isFile -> Fun��o que espec�fica o tipo de coisa que se quer filtrar nesse caso � ARQUIVOS
		*/
		File[] folders = path.listFiles(File::isDirectory); 
		
		//Ir� imprimir cada diret�rio ou pasta filtrado e armazenado no vetor
		System.out.println("FOLDERS: ");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		//Filtra e pega apenas os ARQUIVOS
		folders = path.listFiles(File::isFile); 
		
		//Ir� imprimir cada diret�rio ou pasta filtrado e armazenado no vetor
		System.out.printf("%nFILES:%n");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		//Cria uma SubPasta apartir da pasta TEMP
		srtPath = "c:\\Temp";
		
		//.mkdir() ir� criar a subpasta definida em new File() -> Obs.: Se a pasta for criada ao tentar rodar novamente ser� retornado o valor FALSE pois a pasta j� existe
		boolean success = new File(srtPath + "\\subPasta").mkdir();
		System.out.printf("%nDirectory created successfully: " + success);
		
		sc.close();
	}
}
