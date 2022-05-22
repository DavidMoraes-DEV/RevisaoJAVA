package RevisaoConceitoJAVA.EstruturaSequencial;

public class ProcDeDadosCasting {

	public static void main(String[] args) {

		int a = 5, b = 2;
		double result1, result2;
		
		result1 = a / b;
		System.out.printf("Sem a aplicação de Casting: %.1f%n", result1);

		result2 = (double) a / b;
		System.out.printf("Com a aplicação de Casting: %.1f%n", result2);
	}
}
 /*
 Obs.: No processamento de dados em JAVA ao colocar duas variáveis do
 	tipo inteiro, o retorno também será do tipo inteiro mesmo se a variável
 	que receberá o resultado for do tipo double. Para que não seja perdido
 	nenhum dado, nesse caso, há a necessidade de aplicar um CASTING (RESULT2).
 */
