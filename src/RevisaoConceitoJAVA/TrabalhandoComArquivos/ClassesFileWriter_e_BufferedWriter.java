package RevisaoConceitoJAVA.TrabalhandoComArquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ClassesFileWriter_e_BufferedWriter {

	/*
	* CLASSES: 
		- FileWriter:
			- Stream de escrita de caracteres em arquivos.
			- Possui v�rias formas de instanciar o FileWriter
				- Cria/recria o arquivo: new FileWriter(path)
					- Se o arquivo N�O existir ele vai ser criado
					- Se o arquivo J� exisitir ele vai ser zerado e recriado
					
				- Acrescenta ao arquivo existente: new FileWriter(path, true)
					- Vai abrir o arquivo e acrescentar o que foi definido no final do arquivo
			
		- BufferedWriter:
			- Escrita de forma mais r�pida pois possui otimiza��es de buffer
	 */
	public static void main(String[] args) {

		String[] lines = new String[] {"Good morning", "Goog afternoon", "Good night"};
		String path = "c:\\Temp\\CriandoArquivo.txt";
		
		/*
		* Se rodar o try com o new FileWriter(path) SEM o valor true:
			- Toda vez que rodar a estrutura try o arquivo ser� recriado e sobrescrito
				- Perdendo o conte�do que j� tinha anteriormente
				
		* Se rodar o try com o new FileWriter(path, true) COM o valor true:
			- Toda vez que rodar a estrutura try o arquivo ser� aberto e o conte�do ser� acrescentado no final do arquivo
				- N�o perde o conte�do que j� tinha anteriormente.
		*/
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			
			for (String line : lines) {
				
				//Vai escrever cada posi��o do vetor lines em uma linha no arquivo CriandoArquivo
				bw.write(line);
				
				//Vai quebrar a linha
				bw.newLine();
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}