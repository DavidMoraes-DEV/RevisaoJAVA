package RevisaoConceitoJAVA.EstruturaSequencial;

public class ProcDeDadosCasting {

	public static void main(String[] args) {

		int a = 5, b = 2;
		double result1, result2;
		
		result1 = a / b;
		System.out.printf("Sem a aplica��o de Casting: %.1f%n", result1);

		result2 = (double) a / b;
		System.out.printf("Com a aplica��o de Casting: %.1f%n", result2);
	}
}
 /*
 Obs.: No processamento de dados em JAVA ao colocar duas vari�veis do
 	tipo inteiro, o retorno tamb�m ser� do tipo inteiro mesmo se a vari�vel
 	que receber� o resultado for do tipo double. Para que n�o seja perdido
 	nenhum dado, nesse caso, h� a necessidade de aplicar um CASTING (RESULT2).
 */
