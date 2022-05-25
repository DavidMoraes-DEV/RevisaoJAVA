package RevisaoConceitoJAVA;

import java.util.Scanner;

public class operadorBitwise {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro para saber se o 6 bit do n�mero � igual a 1: ");
		int n = sc.nextInt();
		//Nesse caso apenas o n�mero 32(formato bin�rio = 00100000) possui o 6 bit igual a 1
		int mask = 0b00100000; //Pode ser colocado o numero 32 sem ser em formato bin�rio
		
		if ((n & mask) != 0) {
			System.out.printf("O 6 bit do n�mero %d � igual a 1", n);
		} else {
			System.out.printf("O 6 bit do n�mero %d � diferente de 1", n);
		}
		
	}
}
/*
 OPERADOR BITWISE: Semelhando aos operadores l�gicos por�m percorre bit a bit do n�mero. Sendo eles: &(E bit a bit), I(OU nit a bit), ^(OU exclusivo)
 
 PROBLEMA EXEMPLO: Criar um programa para verificar se o 6BIT do n�mero digitado corresponde a 1.
 
 EXEMPLO PARA RESULTADO VERDADEIRO: 32(00100000) ou 59(00111011)...
 EXMPLO PARA RESULTADO FALTO: 132(10000100) ou 150(10010110)
 Para mais exemplos verificar na CALCULADORA DO WINDOWS(MODO PROGRAMADOR).
*/