package RevisaoConceitoJAVA.TrabalhandoComArquivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Conceitos {

	/*
	* TRABALHANDO COM ARQUIVOS
		- File = Representação abstrata de um arquivo e seu caminho
		- Scanner = Leitor de texto (Pode ser utilizado para ler dados digitados pelo usuário ou ler dados dos arquivos(polimorfismo da classe Scanner))
		- IOException = Classe de exceções padrão de entrada e saída de dados quando mexemos com arquivos(IOException herda de Exception -> Então o compulador obriga tratamento desse tipo de exceção)
	*/
	
	// - LEITURA BÁSICA DE UM ARQUIVO:
	public static void main(String[] args) {
		
		Scanner sc = null;
		
		/* 
		* CLASSE File:
			- Por conta do caracter \ já ser utilizado pelo padrão do JAVA como por exemplo \n precisa ser colocado duas barras para identificar que deseja imprimir uma barra
			- Instancia um objeto do tipo FILE. Esse objeto vai encapsular todo o processo de acessar o arquivo e também o caminho desse arquivo.
			
			- A partir da instanciação será possível utilizar várias operação apartir de um arquivo. alguns exemplos comuns:
				- file.canExecute();	-> Testa se pode executar o arquivo
				- file.canRead();		-> Verifica se tem permissão de leitura
				- file.canWrite();		-> Verifica se tem permissão de escrita
				- file.exists();		-> Verifica se o arquivo existe
		*/
		File file = new File("C:\\Temp\\file.txt"); 
		
		/*
		* Ao instanciar o Scanner apartir do arquivo:
			- O sistema tentará abrir o arquivo
			- Ao tentar abrir o arquivo pode gerar uma exceção:
				- Do tipo IOException
					- Já que a classe IOException herda de Exception devemos tratar a exceção
					- Para isso devemos colocar a abertura de um arquivo dentro de um bloco TRY
		 */
		try {
			
			sc = new Scanner(file);
			
			while (sc.hasNextLine()) {
				
				//Irá ler as linhas do arquivo e imprimir na tela
				System.out.println(sc.nextLine());
				
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			//Não podemos fechar o Scanner dessa forma, pois se der um erro antes de instanciar o Scanner gerará uma exceção do tipo: NullPointerException -> Pois o Scanner não foi aberto então não pode ser fechado
			if (sc != null) {
				sc.close();
				System.out.printf("%n%nScanner close!!!");
			}
		}
	}
}