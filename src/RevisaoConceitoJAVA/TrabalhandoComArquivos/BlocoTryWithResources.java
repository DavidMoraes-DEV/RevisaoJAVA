package RevisaoConceitoJAVA.TrabalhandoComArquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BlocoTryWithResources {

	public static void main(String[] args) {

		/*
		* BLOCO TRY-WITH-RESOURCES
			- É um bloco try que declara um ou mais recursos, e garante que esses recursos serão fechados ao final do bloco
			- Não será preciso mais utilizar o fechamento manual com o bloco FINALLY
		*/
		
		String path = "c:\\Temp\\file.txt";
		
		/*
		* Utilizando o Bloco Try With Resource não é mais necessário instanciar FileReader e BufferedReader no início do programa
			- NÃO PRECISA MAIS INSTANCIAR: (Para que fique visível nos diferentes escopos do código)
					- FileReader fr = null;
					- BufferedReader br = null;
					
			- NÃO PRECISA MAIS UTILIZAR O BLOCO FINALLY
		*/
		
		//Agora será instanciado diretamente no início do bloco TRY passando o caminho do arquivo ficando muito mais enxuto e objetivo o código do que o processo MANUAL:
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			//.readLine() -> Realiza a leitura de cada linha do arquivo. Depois da última linha, retorna NULL.
			String line = br.readLine();
			
			//Se line valer então diferente de NULL significa que leu com sucesso a linha do arquivo
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
