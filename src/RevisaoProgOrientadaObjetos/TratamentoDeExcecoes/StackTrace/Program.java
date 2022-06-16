package RevisaoProgOrientadaObjetos.TratamentoDeExcecoes.StackTrace;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	//PILHA DE CHAMADAS DE MÉTODOS(STACKTRACE):
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

			System.out.println("Digite 3 nomes separados por espaço e tecle ENTER: ");
			String[] vect = sc.nextLine().split(" ");

			System.out.println("Deseja ver o conteúdo de qual posição do vetor? ");
			int position = sc.nextInt();
			System.out.println(vect[position]);

		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Invalid Position!!!");
			
			//Essa função imprime na tela o RASTREAMENTO DO STACK (mostrando a sequência de chamadas e o valor que gerou a excessão)
			e.printStackTrace(); 
			
			/*
			 * NESSE EXEMPLO: Se digitar apenas 3 nomes e pedir a impressão da posição 5 gerará uma exceção e o método printStackTrace() imprimirá:
			 
				java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3							-> A mensagem da excessão (O que causou a exceção e a descrição)
																														-> Sequência de chamadas que gerou a exceção começando de baixo para cima:
					at RevisaoProgOrientadaObjetos.TratamentoDeExcecoes.StackTrace.Program.method2(Program.java:37)			-> Terceiro MÉTODO que por sua vez recebeu um valor inválido e gerou a excesão na linha 37.
					at RevisaoProgOrientadaObjetos.TratamentoDeExcecoes.StackTrace.Program.method1(Program.java:21)			-> Segundo MÉTODO method1 chamou o method2 na linha 21 
					at RevisaoProgOrientadaObjetos.TratamentoDeExcecoes.StackTrace.Program.main(Program.java:11)			-> Primeiro o MÉTODO principal MAIN chamou o method1 na linha 11
			 
			 * IMPORTANTE EM JAVA:
			 	- COM TRATAMENTO DE EXCEÇÃO: Quando ocorrer uma excessão que possui tratamento
			 		- Utilizando TRY-CATCH o programa tratará essa excessão de acordo com o que foi definido pelo programador e continuará executando o restante do programa normalmente.
			 		- Se for definido em CATCH para executar o método printStackTrace() será executado o método porém NÃO terminará a execução do programa
			 		
			 	- SEM TRATAMENTO DE EXCEÇÃO: Quando ocorrer uma excessão que não possui tratamento, por padrão o programa terminará(SERÁ INTERROMPIDO SEM CONCLUÍR O RESTANTE DO CÓDIGO) e será efetuado a impressão do método printStackTrace()
			*/
			
			System.out.printf("%nDigite CONTINUAR quando terminar de analizar a exceção: ");
			sc.next();
			
		} catch (InputMismatchException e) {
			
			System.out.println("Input Error!!!");
			
		}

		System.out.println("***METHOD_2 END***");
		sc.close();
	}
}