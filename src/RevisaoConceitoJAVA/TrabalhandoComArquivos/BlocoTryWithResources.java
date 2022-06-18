package RevisaoConceitoJAVA.TrabalhandoComArquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BlocoTryWithResources {

	public static void main(String[] args) {

		/*
		* BLOCO TRY-WITH-RESOURCES
			- � um bloco try que declara um ou mais recursos, e garante que esses recursos ser�o fechados ao final do bloco
			- N�o ser� preciso mais utilizar o fechamento manual com o bloco FINALLY
		*/
		
		String path = "c:\\Temp\\file.txt";
		
		/*
		* Utilizando o Bloco Try With Resource n�o � mais necess�rio instanciar FileReader e BufferedReader no in�cio do programa
			- N�O PRECISA MAIS INSTANCIAR: (Para que fique vis�vel nos diferentes escopos do c�digo)
					- FileReader fr = null;
					- BufferedReader br = null;
					
			- N�O PRECISA MAIS UTILIZAR O BLOCO FINALLY
		*/
		
		//Agora ser� instanciado diretamente no in�cio do bloco TRY passando o caminho do arquivo ficando muito mais enxuto e objetivo o c�digo do que o processo MANUAL:
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			//.readLine() -> Realiza a leitura de cada linha do arquivo. Depois da �ltima linha, retorna NULL.
			String line = br.readLine();
			
			//Se line valer ent�o diferente de NULL significa que leu com sucesso a linha do arquivo
			while (line != null) {
				System.out.println(line);
				
				//Pede para ler novamente outra linha do arquivo
				line = br.readLine();
			}
			
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} 
	}
}
