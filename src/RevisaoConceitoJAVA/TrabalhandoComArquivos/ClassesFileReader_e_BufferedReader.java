package RevisaoConceitoJAVA.TrabalhandoComArquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//CÓDIGO VERBOSO APENAS PARA DIDÁTICA DE ENTENDIMENTO DE COMO FUNCIONA OS PROCESSOS DE ABRIR E FECHAR ARQUIVO UTILIZANDO AS CLASSES
public class ClassesFileReader_e_BufferedReader {

	/*
	* FileReader
		- Stream de leitura de caracteres a partir de arquivos
		- STREAM em programação SIGNIFICA: Uma sequência
		- Então quando se instancia um FileReader
			- Estabelecemos uma sequência de leitura apartir de um arquivo
			- Conforme for precisando do arquivo iremos navegando com o stream pelo arquivo
	
	* BufferedReader
		- É instanciado aparitr do FileReader
		- E implementa algumas otimizações utilizando o BUFFER de memória
	 
	*/
	public static void main(String[] args) {

		String path = "c:\\Temp\\file.txt";
		
		/*
		* IMPLEMENTAÇÃO BÁSICA (PADRÃO): 
			- Processo MANUAL.
			- Leitura Básica com BufferedReader
		*/
		
		//Recebendo NULL apenas para ter um valor inicial atribuído
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			
			//Estabelece uma Stream (Uma sequencia de leitura) apartir do arquivo contido em PATH
			fr = new FileReader(path);
	
			/*
			* BufferedReader é instanciado apartir do FileReader.
				- Ela é uma instanciação maior, pegando a Stream básica(fr) e apartir dela instanciamos a STREAM que possui a otimização e buffer
					- Deixa mais rápido a leitura
					- Deixa mais flexível a leitura de arquivos
			*/
			br = new BufferedReader(fr);
			
			//.readLine() -> Realiza a leitura do arquivo. Depois da última linha, retorna NULL.
			String line = br.readLine();
			
			//Se line valer então diferente de NULL significa que leu com sucesso a linha do arquivo
			while (line != null) {
				System.out.println(line);
				
				//Pede para ler novamente outra linha do arquivo
				line = br.readLine();
			}
			
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			
			//Pode ocorrer uma exceção ao tentar fechar o arquivo então é necessário utilizar outro bloco TRY-CATCH:
			try {
				if (br != null) {
					br.close();
				}
				
				if (fr != null) {
					fr.close();
				}
				
			} catch (IOException e) {
				
				//Se der exceção ao tentar fechar um arquivo significa que deu erro mesmo então chamamos o printStackTrace para analizar o erro.
				e.printStackTrace();
			}
		}
	}
}
