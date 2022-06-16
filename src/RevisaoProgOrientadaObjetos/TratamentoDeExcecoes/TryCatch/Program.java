package RevisaoProgOrientadaObjetos.TratamentoDeExcecoes.TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Bloco de c�digos que pode dar uma exce��o fica dentro do TRY:
		try {
			
			System.out.println("Digite 3 nomes separados por um espa�o em branco e tecle ENTER: ");
			String[] vect = sc.nextLine().split(" ");
		
			System.out.print("Deseja ver o conte�do de qual posi��o do vetor? ");
			int position = sc.nextInt();
			System.out.printf("%n" + vect[position] + "%n");
		
		//SE DIGITAR uma posi��o inexistente para o vetor mostrar o conte�do dessa posi��o gerar� uma EXCE��O: ArrayIndexOutOfBoundsException -> Exce��o quando tenta acessar uma posi��o de uma Array que n�o existe (MUITO COMUM)
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Position!!!");
			
		//SE DIGITAR uma letra(TIPO CHAR) para buscar como posi��o do vetor que espera um numero inteiro(TIPO INTEGER) gerar� a EXCE��O: InputMismatchException
		} catch (InputMismatchException e){
			System.out.println("Input Error!!!");
		}
		//Poderia adicionar mais catch para capturar outros tipos de exce��es se necess�rio
		
		System.out.printf("%nEnd of program");
		
		sc.close();
	}
}
/*
* EXCE��ES:
	- Uma exce��o � qualquer condi��o de erro ou comportamento inesperado encontrado por um programa EM EXECU��O
	- Em JAVA, uma exce��o � um OBJETO herdado da classe:
		- Java.lang.Exception - O compilador obriga a tratar ou propagar
		- Java.lang.RuntimeException - O compilador n�o obriga a tratar ou propagar
		
	- Quando lan�ada, uma exce��o � propagada na pilha de chamadas de m�todos em execu��o, at� que seja capturada (tratada) ou o programa seja encerrado
	
* HIERARQUIA DE EXCE��ES DO JAVA
 
	* Throwable (CLASSE GEN�RICA) Alguns exemplos:
		|---- Error (SUBCLASSE 1) ----------------------------> ERROS que o compilador n�o espera que o programador vai tratar
		|		|---- OutOfMemoryError -----------------------> ERRO: Estouro de Mem�ria
		|		|---- VirtualMachineError
		|
		|---- Exception (SUBCLASSE 2) ------------------------> ERROS Que se espera tratamento por parte do programadorr
				|---- IOException ----------------------------> ERROS De entrada e sa�da de DADOS
				|---- RuntimeException -----------------------> ERROS Para ser tratados por�m n�o � totalmente obrigat�rio
						|---- IndexOutOfBoundsException ------> ERROS Quando tenta acessar uma posi��o de uma Array que n�o existe (MUITO COMUM)
						|---- NullPointerException -----------> ERROS Quando se tenta acessar uma vari�vel que esta valendo NULL (nulo)

* PORQUE EXCE��ES?
	- O modelo de tratamento de exce��es permite que erros sejam tratados de forma consistente e flex�vel, usando boas pr�ticas
	
	- VANTAGENS:
		- Delega a l�gica de erro para a classe respons�vel por conhecer as regras que podem ocasionar o erro
		- Trata de forma organizada (inclusive hier�rquica) exce��es de tipos diferentes
		- A exce��o pode carregar dados quaisquer
		
* ESTRUTURA TRY-CATCH
	- BLOCO TRY
		- Cont�m o c�digo que representa a execu��o normal de trecho de c�digo que PODE acarretar em uma exce��o
	
	- BLOCO CATCH
		- Cont�m o c�digo a ser executado caso uma exce��o ocorra
		- Deve ser especificado o tipo da exce��o a ser tratada (UPCASTING � permitido)

	-	SINTAXE:
		- try {
		
			- AQUI existir� o c�digo que PODE GERAR uma exce��o
			
		} catch (ExceptionType e) { --------> FUN��O do bloco catch � CAPTURAR a exce��o e Executar alguma l�gica de programa��o
		
			- Pode existir v�rios blocos CATCH com diferentes TIPOS DE EXCE��O para tratamento
			- AQUI ter� o tratameto para a exce��o dependendo do TIPO DA EXCE��O(ExeptionType e)
			
		} catch (ExceptionType e) {
			- Mesma coisa do bloco acima para outro tipo de exce��o
		} catch (ExceptionType e) {
		
		}
*/