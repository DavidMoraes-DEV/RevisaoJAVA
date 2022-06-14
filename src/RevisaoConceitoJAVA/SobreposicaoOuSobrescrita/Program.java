package RevisaoConceitoJAVA.SobreposicaoOuSobrescrita;

public class Program {

	public static void main(String[] args) {
		
		Account account1 = new Account(1001, "Alex", 1000.0);
		
		account1.withdraw(200.0); //Método original COM TAXA de saque de 5.00 reais
		System.out.println(account1.getBalance());
		
		Account account2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		
		account2.withdraw(200.0); //Método com a sobreposição para contas do tipo poupança RETIRANDO a taxa de saque de 5,00 reais
		System.out.println(account2.getBalance());
		
		
	}
}
/*
* SOBREPOSIÇÃO OU SOBRESCRITA
	- É a implementação de um método de uma superclasse na subclasse
	- É fortemente recomendável usar a anotação @Override em um método sobescrito pois ele fará a identificação para que esse método seja procurado na classe base evitando erros de dignitação na chamada do método sobrescrito, pois
		- Facilita a leitura e compreensão do código.
		- Avisamos ao compilador que aquele método é uma sobreposição(boa prática)

 */