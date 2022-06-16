package RevisaoProgOrientadaObjetos.TratamentoDeExcecoes.Finally;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BlocoFinally {

	public static void main(String[] args) {

		//Se o arquivo n�o existir, quando for chamado o Scanner para abrir o arquivo gerar� uma exce��o FileNotFoundException
		File file = new File("C:\\temp\\file.txt");
		Scanner sc = null;
		
		try {
			
			sc = new Scanner(file);
			
			//Se tiver linhas digitadas no arquivo ser� impresso na tela as linhas
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			
		} catch (FileNotFoundException e) {
			
			//Se o arquivo n�o existe imprimir� na tela a mensagem gerada que no caso ser�: O SISTEMA N�O PODE ENCONTRAR O ARQUIVO ESPECIFICADO.
			System.out.println("Error opening file: " + e.getMessage());
			
		} finally {
			if (sc != null) {
				sc.close(); //No final mesmo se houver a exce��o de o arquivo n�o existir ser� necess�rio fechar o Scanner e o arquivo caso ele tenha sido aberto.
				System.out.printf("%nFinally block executed!!!");
			}
		}
	}
}
/*
* BLOCO FINALLY
	- � um bloco que cont�m c�digo a ser executado independentemente de ter ocorrido ou n�o uma exce��o.
	- EXEMPLO CL�SSICO: Fechar um arquivo, conex� de banco de dados, ou outro recurso espec�fico ao final do processamento.
	
	- SINTAXE:
		- try {
		
		} catch (ExceptionType e) {
		
		} finally {
			-> ESSE BLOCO SER� EXECUTADO INDEPENDENTIMENTE SE HOUVER EXCE��O OU N�O
			-> Recomendado utilizar conforme EXEMPLOS CL�SSICOS digitados acima.
		}
		
* CRIA��O DO ARQUIVO:
	- Testar o c�digo sem criar o arquivo na pasta TEMP para gerar o erro
	- Depois criar o arquivo .txt em (C:\\temp\\file.txt) com as seguintes frases:
		- Good morning!!!
		- Good evening!!!
		
	- Salvar o arquivo .txt na pasta TEMP e executar o c�digo novamente
*/