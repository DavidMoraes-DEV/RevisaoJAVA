package RevisaoProgOrientadaObjetos.TratamentoDeExcecoes.Finally;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BlocoFinally {

	public static void main(String[] args) {

		//Se o arquivo não existir, quando for chamado o Scanner para abrir o arquivo gerará uma exceção FileNotFoundException
		File file = new File("C:\\temp\\file.txt");
		Scanner sc = null;
		
		try {
			
			sc = new Scanner(file);
			
			//Se tiver linhas digitadas no arquivo será impresso na tela as linhas
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			
		} catch (FileNotFoundException e) {
			
			//Se o arquivo não existe imprimirá na tela a mensagem gerada que no caso será: O SISTEMA NÃO PODE ENCONTRAR O ARQUIVO ESPECIFICADO.
			System.out.println("Error opening file: " + e.getMessage());
			
		} finally {
			if (sc != null) {
				sc.close(); //No final mesmo se houver a exceção de o arquivo não existir será necessário fechar o Scanner e o arquivo caso ele tenha sido aberto.
				System.out.printf("%nFinally block executed!!!");
			}
		}
	}
}
/*
* BLOCO FINALLY
	- É um bloco que contém código a ser executado independentemente de ter ocorrido ou não uma exceção.
	- EXEMPLO CLÁSSICO: Fechar um arquivo, conexõ de banco de dados, ou outro recurso específico ao final do processamento.
	
	- SINTAXE:
		- try {
		
		} catch (ExceptionType e) {
		
		} finally {
			-> ESSE BLOCO SERÁ EXECUTADO INDEPENDENTIMENTE SE HOUVER EXCEÇÃO OU NÃO
			-> Recomendado utilizar conforme EXEMPLOS CLÁSSICOS digitados acima.
		}
		
* CRIAÇÃO DO ARQUIVO:
	- Testar o código sem criar o arquivo na pasta TEMP para gerar o erro
	- Depois criar o arquivo .txt em (C:\\temp\\file.txt) com as seguintes frases:
		- Good morning!!!
		- Good evening!!!
		
	- Salvar o arquivo .txt na pasta TEMP e executar o código novamente
*/