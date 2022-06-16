package RevisaoProgOrientadaObjetos.TratamentoDeExcecoes.StackTrace;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	//PILHA DE CHAMADAS DE M�TODOS(STACKTRACE):
	public static void main(String[] args) {

		method1(); //Chama o method_1
		System.out.printf("%nEnd of program");
		
	}
	
	public static void method1() { 
		
		System.out.println("***METHOD_1 START***");
		
		//Method_1 chama o method_2
		method2(); 
		System.out.println("***METHOD_1 END***");
		
	}
	
	public static void method2 () {
		
		System.out.println("***METHOD_2 START***");
		Scanner sc = new Scanner(System.in);

		try {

			System.out.println("Digite 3 nomes separados por espa�o e tecle ENTER: ");
			String[] vect = sc.nextLine().split(" ");

			System.out.println("Deseja ver o conte�do de qual posi��o do vetor? ");
			int position = sc.nextInt();
			System.out.println(vect[position]);

		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Invalid Position!!!");
			
			//Essa fun��o imprime na tela o RASTREAMENTO DO STACK (mostrando a sequ�ncia de chamadas e o valor que gerou a excess�o)
			e.printStackTrace(); 
			
			/*
			 * NESSE EXEMPLO: Se digitar apenas 3 nomes e pedir a impress�o da posi��o 5 gerar� uma exce��o e o m�todo printStackTrace() imprimir�:
			 
				java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3							-> A mensagem da excess�o (O que causou a exce��o e a descri��o)
																														-> Sequ�ncia de chamadas que gerou a exce��o come�ando de baixo para cima:
					at RevisaoProgOrientadaObjetos.TratamentoDeExcecoes.StackTrace.Program.method2(Program.java:37)			-> Terceiro M�TODO que por sua vez recebeu um valor inv�lido e gerou a exces�o na linha 37.
					at RevisaoProgOrientadaObjetos.TratamentoDeExcecoes.StackTrace.Program.method1(Program.java:21)			-> Segundo M�TODO method1 chamou o method2 na linha 21 
					at RevisaoProgOrientadaObjetos.TratamentoDeExcecoes.StackTrace.Program.main(Program.java:11)			-> Primeiro o M�TODO principal MAIN chamou o method1 na linha 11
			 
			 * IMPORTANTE EM JAVA:
			 	- COM TRATAMENTO DE EXCE��O: Quando ocorrer uma excess�o que possui tratamento
			 		- Utilizando TRY-CATCH o programa tratar� essa excess�o de acordo com o que foi definido pelo programador e continuar� executando o restante do programa normalmente.
			 		- Se for definido em CATCH para executar o m�todo printStackTrace() ser� executado o m�todo por�m N�O terminar� a execu��o do programa
			 		
			 	- SEM TRATAMENTO DE EXCE��O: Quando ocorrer uma excess�o que n�o possui tratamento, por padr�o o programa terminar�(SER� INTERROMPIDO SEM CONCLU�R O RESTANTE DO C�DIGO) e ser� efetuado a impress�o do m�todo printStackTrace()
			*/
			
			System.out.printf("%nDigite CONTINUAR quando terminar de analizar a exce��o: ");
			sc.next();
			
		} catch (InputMismatchException e) {
			
			System.out.println("Input Error!!!");
			
		}

		System.out.println("***METHOD_2 END***");
		sc.close();
	}
}