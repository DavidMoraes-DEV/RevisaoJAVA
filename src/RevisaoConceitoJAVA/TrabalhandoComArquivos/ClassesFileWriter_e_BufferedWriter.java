package RevisaoConceitoJAVA.TrabalhandoComArquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ClassesFileWriter_e_BufferedWriter {

	/*
	* CLASSES: 
		- FileWriter:
			- Stream de escrita de caracteres em arquivos.
			- Possui várias formas de instanciar o FileWriter
				- Cria/recria o arquivo: new FileWriter(path)
					- Se o arquivo NÃO existir ele vai ser criado
					- Se o arquivo JÁ exisitir ele vai ser zerado e recriado
					
				- Acrescenta ao arquivo existente: new FileWriter(path, true)
					- Vai abrir o arquivo e acrescentar o que foi definido no final do arquivo
			
		- BufferedWriter:
			- Escrita de forma mais rápida pois possui otimizações de buffer
	 */
	public static void main(String[] args) {

		String[] lines = new String[] {"Good morning", "Goog afternoon", "Good night"};
		String path = "c:\\Temp\\CriandoArquivo.txt";
		
		/*
		* Se rodar o try com o new FileWriter(path) SEM o valor true:
			- Toda vez que rodar a estrutura try o arquivo será recriado e sobrescrito
				- Perdendo o conteúdo que já tinha anteriormente
				
		* Se rodar o try com o new FileWriter(path, true) COM o valor true:
			- Toda vez que rodar a estrutura try o arquivo será aberto e o conteúdo será acrescentado no final do arquivo
				- Não perde o conteúdo que já tinha anteriormente.
		*/
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			
			for (String line : lines) {
				
				//Vai escrever cada posição do vetor lines em uma linha no arquivo CriandoArquivo
				bw.write(line);
				
				//Vai quebrar a linha
				bw.newLine();
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}