package RevisaoConceitoJAVA.SobreposicaoOuSobrescrita;

public class Program {

	public static void main(String[] args) {
		
		Account account1 = new Account(1001, "Alex", 1000.0);
		
		account1.withdraw(200.0); //M�todo original COM TAXA de saque de 5.00 reais
		System.out.println(account1.getBalance());
		
		Account account2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		
		account2.withdraw(200.0); //M�todo com a sobreposi��o para contas do tipo poupan�a RETIRANDO a taxa de saque de 5,00 reais
		System.out.println(account2.getBalance());
		
		
	}
}
/*
* SOBREPOSI��O OU SOBRESCRITA
	- � a implementa��o de um m�todo de uma superclasse na subclasse
	- � fortemente recomend�vel usar a anota��o @Override em um m�todo sobescrito pois ele far� a identifica��o para que esse m�todo seja procurado na classe base evitando erros de dignita��o na chamada do m�todo sobrescrito, pois
		- Facilita a leitura e compreens�o do c�digo.
		- Avisamos ao compilador que aquele m�todo � uma sobreposi��o(boa pr�tica)

 */