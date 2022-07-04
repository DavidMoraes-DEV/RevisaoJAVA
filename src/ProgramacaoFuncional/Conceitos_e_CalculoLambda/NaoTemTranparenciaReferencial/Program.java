package ProgramacaoFuncional.Conceitos_e_CalculoLambda.NaoTemTranparenciaReferencial;

import java.util.Arrays;

public class Program {

	public static int globalValue = 3;
/*
 * TRANSPARÊNCIA REFERENCIAL:
	- Uma função possui transparência referencial se seu resultado for sempre o mesmo para os mesmos dados de entrada.
	- BENEFÍCIOS: Simplicidade e Previsibilidade.
 */
	public static void main(String[] args) {

		int[] vect = new int[] { 3, 4, 5 }; 
		/*
		* Irá pegar os valores impares desse vetor e irá substituí-los acrescentando:
		 	- O valor da variável globalValue que no exemplo vale 3
		 	- porém se esse valor MUDAR o resultado também irá mudar
		 	- Por esse motivo o resultado da própria função changeOddValues()
		 		- Não depende da lógica aplicada dentro da função e sim do valor da variável GLOBALVALUE
		*/
		changeOddValues(vect); 
		System.out.println(Arrays.toString(vect));
	}

	/*
	* EXEMPLO DE FUNÇÃO QUE NÃO É REFERENCIALMENTE TRANSPARENTE
		- Porque o resultado da função irá depender do valor da variável GLOBAL VALUE pois,
			- Mesmo se receber os mesmos valores do vetor se o valor da variavel GLOBAL VALUE MUDAR o resultado também mudará
	*/
	public static void changeOddValues(int[] numbers) { //Muda os valores Impares
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 != 0) {
				numbers[i] += globalValue;
			}
		}
	}
	/*
	 * Na programação Funcional a transparencia Referencial é super forte ao contrário da Programação Imperativa conforme exemplo acima
	 */
}