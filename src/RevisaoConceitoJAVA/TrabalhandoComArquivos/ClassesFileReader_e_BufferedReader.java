package RevisaoConceitoJAVA.TrabalhandoComArquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//C�DIGO VERBOSO APENAS PARA DID�TICA DE ENTENDIMENTO DE COMO FUNCIONA OS PROCESSOS DE ABRIR E FECHAR ARQUIVO UTILIZANDO AS CLASSES
public class ClassesFileReader_e_BufferedReader {

	/*
	* FileReader
		- Stream de leitura de caracteres a partir de arquivos
		- STREAM em programa��o SIGNIFICA: Uma sequ�ncia
		- Ent�o quando se instancia um FileReader
			- Estabelecemos uma sequ�ncia de leitura apartir de um arquivo
			- Conforme for precisando do arquivo iremos navegando com o stream pelo arquivo
	
	* BufferedReader
		- � instanciado aparitr do FileReader
		- E implementa algumas otimiza��es utilizando o BUFFER de mem�ria
	 
	*/
	public static void main(String[] args) {

		String path = "c:\\Temp\\file.txt";
		
		/*
		* IMPLEMENTA��O B�SICA (PADR�O): 
			- Processo MANUAL.
			- Leitura B�sica com BufferedReader
		*/
		
		//Recebendo NULL apenas para ter um valor inicial atribu�do
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			
			//Estabelece uma Stream (Uma sequencia de leitura) apartir do arquivo contido em PATH
			fr = new FileReader(path);
	
			/*
			* BufferedReader � instanciado apartir do FileReader.
				- Ela � uma instancia��o maior, pegando a Stream b�sica(fr) e apartir dela instanciamos a STREAM que possui a otimiza��o e buffer
					- Deixa mais r�pido a leitura
					- Deixa mais flex�vel a leitura de arquivos
			*/
			br = new BufferedReader(fr);
			
			//.readLine() -> Realiza a leitura do arquivo. Depois da �ltima linha, retorna NULL.
			String line = br.readLine();
			
			//Se line valer ent�o diferente de NULL significa que leu com sucesso a linha do arquivo
			while (line != null) {
				System.out.println(line);
				
				//Pede para ler novamente outra linha do arquivo
				line = br.readLine();
			}
			
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			
			//Pode ocorrer uma exce��o ao tentar fechar o arquivo ent�o � necess�rio utilizar outro bloco TRY-CATCH:
			try {
				if (br != null) {
					br.close();
				}
				
				if (fr != null) {
					fr.close();
				}
				
			} catch (IOException e) {
				
				//Se der exce��o ao tentar fechar um arquivo significa que deu erro mesmo ent�o chamamos o printStackTrace para analizar o erro.
				e.printStackTrace();
			}
		}
	}
}
