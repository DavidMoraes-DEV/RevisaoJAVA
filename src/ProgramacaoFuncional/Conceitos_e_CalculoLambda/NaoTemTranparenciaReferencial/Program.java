package ProgramacaoFuncional.Conceitos_e_CalculoLambda.NaoTemTranparenciaReferencial;

import java.util.Arrays;

public class Program {

	public static int globalValue = 3;
/*
 * TRANSPAR�NCIA REFERENCIAL:
	- Uma fun��o possui transpar�ncia referencial se seu resultado for sempre o mesmo para os mesmos dados de entrada.
	- BENEF�CIOS: Simplicidade e Previsibilidade.
 */
	public static void main(String[] args) {

		int[] vect = new int[] { 3, 4, 5 }; 
		/*
		* Ir� pegar os valores impares desse vetor e ir� substitu�-los acrescentando:
		 	- O valor da vari�vel globalValue que no exemplo vale 3
		 	- por�m se esse valor MUDAR o resultado tamb�m ir� mudar
		 	- Por esse motivo o resultado da pr�pria fun��o changeOddValues()
		 		- N�o depende da l�gica aplicada dentro da fun��o e sim do valor da vari�vel GLOBALVALUE
		*/
		changeOddValues(vect); 
		System.out.println(Arrays.toString(vect));
	}

	/*
	* EXEMPLO DE FUN��O QUE N�O � REFERENCIALMENTE TRANSPARENTE
		- Porque o resultado da fun��o ir� depender do valor da vari�vel GLOBAL VALUE pois,
			- Mesmo se receber os mesmos valores do vetor se o valor da variavel GLOBAL VALUE MUDAR o resultado tamb�m mudar�
	*/
	public static void changeOddValues(int[] numbers) { //Muda os valores Impares
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 != 0) {
				numbers[i] += globalValue;
			}
		}
	}
	/*
	 * Na programa��o Funcional a transparencia Referencial � super forte ao contr�rio da Programa��o Imperativa conforme exemplo acima
	 */
}