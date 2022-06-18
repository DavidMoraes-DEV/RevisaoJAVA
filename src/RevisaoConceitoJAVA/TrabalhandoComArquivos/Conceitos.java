package RevisaoConceitoJAVA.TrabalhandoComArquivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Conceitos {

	/*
	* TRABALHANDO COM ARQUIVOS
		- File = Representa��o abstrata de um arquivo e seu caminho
		- Scanner = Leitor de texto (Pode ser utilizado para ler dados digitados pelo usu�rio ou ler dados dos arquivos(polimorfismo da classe Scanner))
		- IOException = Classe de exce��es padr�o de entrada e sa�da de dados quando mexemos com arquivos(IOException herda de Exception -> Ent�o o compulador obriga tratamento desse tipo de exce��o)
	*/
	
	// - LEITURA B�SICA DE UM ARQUIVO:
	public static void main(String[] args) {
		
		Scanner sc = null;
		
		/* 
		* CLASSE File:
			- Por conta do caracter \ j� ser utilizado pelo padr�o do JAVA como por exemplo \n precisa ser colocado duas barras para identificar que deseja imprimir uma barra
			- Instancia um objeto do tipo FILE. Esse objeto vai encapsular todo o processo de acessar o arquivo e tamb�m o caminho desse arquivo.
			
			- A partir da instancia��o ser� poss�vel utilizar v�rias opera��o apartir de um arquivo. alguns exemplos comuns:
				- file.canExecute();	-> Testa se pode executar o arquivo
				- file.canRead();		-> Verifica se tem permiss�o de leitura
				- file.canWrite();		-> Verifica se tem permiss�o de escrita
				- file.exists();		-> Verifica se o arquivo existe
		*/
		File file = new File("C:\\Temp\\file.txt"); 
		
		/*
		* Ao instanciar o Scanner apartir do arquivo:
			- O sistema tentar� abrir o arquivo
			- Ao tentar abrir o arquivo pode gerar uma exce��o:
				- Do tipo IOException
					- J� que a classe IOException herda de Exception devemos tratar a exce��o
					- Para isso devemos colocar a abertura de um arquivo dentro de um bloco TRY
		 */
		try {
			
			sc = new Scanner(file);
			
			while (sc.hasNextLine()) {
				
				//Ir� ler as linhas do arquivo e imprimir na tela
				System.out.println(sc.nextLine());
				
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			//N�o podemos fechar o Scanner dessa forma, pois se der um erro antes de instanciar o Scanner gerar� uma exce��o do tipo: NullPointerException -> Pois o Scanner n�o foi aberto ent�o n�o pode ser fechado
			if (sc != null) {
				sc.close();
				System.out.printf("%n%nScanner close!!!");
			}
		}
	}
}