package RevisaoProgOrientadaObjetos.TratamentoDeExcecoes.TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Bloco de códigos que pode dar uma exceção fica dentro do TRY:
		try {
			
			System.out.println("Digite 3 nomes separados por um espaço em branco e tecle ENTER: ");
			String[] vect = sc.nextLine().split(" ");
		
			System.out.print("Deseja ver o conteúdo de qual posição do vetor? ");
			int position = sc.nextInt();
			System.out.printf("%n" + vect[position] + "%n");
		
		//SE DIGITAR uma posição inexistente para o vetor mostrar o conteúdo dessa posição gerará uma EXCEÇÃO: ArrayIndexOutOfBoundsException -> Exceção quando tenta acessar uma posição de uma Array que não existe (MUITO COMUM)
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Position!!!");
			
		//SE DIGITAR uma letra(TIPO CHAR) para buscar como posição do vetor que espera um numero inteiro(TIPO INTEGER) gerará a EXCEÇÃO: InputMismatchException
		} catch (InputMismatchException e){
			System.out.println("Input Error!!!");
		}
		//Poderia adicionar mais catch para capturar outros tipos de exceções se necessário
		
		System.out.printf("%nEnd of program");
		
		sc.close();
	}
}
/*
* EXCEÇÕES:
	- Uma exceção é qualquer condição de erro ou comportamento inesperado encontrado por um programa EM EXECUÇÃO
	- Em JAVA, uma exceção é um OBJETO herdado da classe:
		- Java.lang.Exception - O compilador obriga a tratar ou propagar
		- Java.lang.RuntimeException - O compilador não obriga a tratar ou propagar
		
	- Quando lançada, uma exceção é propagada na pilha de chamadas de métodos em execução, até que seja capturada (tratada) ou o programa seja encerrado
	
* HIERARQUIA DE EXCEÇÕES DO JAVA
 
	* Throwable (CLASSE GENÉRICA) Alguns exemplos:
		|---- Error (SUBCLASSE 1) ----------------------------> ERROS que o compilador não espera que o programador vai tratar
		|		|---- OutOfMemoryError -----------------------> ERRO: Estouro de Memória
		|		|---- VirtualMachineError
		|
		|---- Exception (SUBCLASSE 2) ------------------------> ERROS Que se espera tratamento por parte do programadorr
				|---- IOException ----------------------------> ERROS De entrada e saída de DADOS
				|---- RuntimeException -----------------------> ERROS Para ser tratados porém não é totalmente obrigatório
						|---- IndexOutOfBoundsException ------> ERROS Quando tenta acessar uma posição de uma Array que não existe (MUITO COMUM)
						|---- NullPointerException -----------> ERROS Quando se tenta acessar uma variável que esta valendo NULL (nulo)

* PORQUE EXCEÇÕES?
	- O modelo de tratamento de exceções permite que erros sejam tratados de forma consistente e flexível, usando boas práticas
	
	- VANTAGENS:
		- Delega a lógica de erro para a classe responsável por conhecer as regras que podem ocasionar o erro
		- Trata de forma organizada (inclusive hierárquica) exceções de tipos diferentes
		- A exceção pode carregar dados quaisquer
		
* ESTRUTURA TRY-CATCH
	- BLOCO TRY
		- Contém o código que representa a execução normal de trecho de código que PODE acarretar em uma exceção
	
	- BLOCO CATCH
		- Contém o código a ser executado caso uma exceção ocorra
		- Deve ser especificado o tipo da exceção a ser tratada (UPCASTING é permitido)

	-	SINTAXE:
		- try {
		
			- AQUI existirá o código que PODE GERAR uma exceção
			
		} catch (ExceptionType e) { --------> FUNÇÃO do bloco catch é CAPTURAR a exceção e Executar alguma lógica de programação
		
			- Pode existir vários blocos CATCH com diferentes TIPOS DE EXCEÇÃO para tratamento
			- AQUI terá o tratameto para a exceção dependendo do TIPO DA EXCEÇÃO(ExeptionType e)
			
		} catch (ExceptionType e) {
			- Mesma coisa do bloco acima para outro tipo de exceção
		} catch (ExceptionType e) {
		
		}
*/