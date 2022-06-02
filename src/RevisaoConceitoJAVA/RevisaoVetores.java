package RevisaoConceitoJAVA;

import java.util.Locale;
import java.util.Scanner;

public class RevisaoVetores {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantos registros de altura de pessoas? ");
		int qtdRegistro = sc.nextInt();
		double[] alturaPessoas = new double[qtdRegistro];
		
		System.out.println("Informe as alturas:");
		for(int i=0; i<qtdRegistro; i++) {
			alturaPessoas[i] = sc.nextDouble();
		}
		
		double mediaAltura, somaAltura = alturaPessoas[0];
		for(int i=1; i<qtdRegistro; i++) {
			somaAltura += alturaPessoas[i];
		}
		
		mediaAltura = somaAltura / qtdRegistro;
		System.out.printf("%nM�dia das alturas: %.2f", mediaAltura);
		
		sc.close();
	}
}
/*
VETORES:

Em programa��o, "vetor" � o nome dado a arranjos unidimendionais

- Arranjo (array) � uma estrutura de dados:
Homog�nea (dados do mesmo tipo)
Ordenada (elementos acessados por meio de posi��es)
Alocada de uma vez s�, em um bloco cont�guo de mem�ria

- VANTAGENS:
Acesso imediato aos elementos pela sua posi��o

- DESVANTAGENS:
Tamanho fixo
Dificuldade para se realizar inser��es e dele��es
*/