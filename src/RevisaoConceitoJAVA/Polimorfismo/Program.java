package RevisaoConceitoJAVA.Polimorfismo;

import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Account account1 = new Account(1001, "Alex", 1000.00);
		account1.withdraw(200.0); //Realiza o saque de R$ 200.00 + a taxa padrão  de R$ 5.00, para contas do tipo (Account)=CONTA COMUM.
		
		System.out.printf("Conta do tipo: ACCOUNT(Saque -> TAXA PADRÃO = R$ 5.00):%nSALDO INICIAL: 1000.00%nSaque de R$ 200.00%n");
		System.out.printf("%n- DADOS ATUALIZADOS DA CONTA:%n");
		System.out.println(account1);
		
		Account account2 = new SavingsAccount(1002, "Maria", 1000.00, 0.01);
		account2.withdraw(200.0); //Conta do tipo Poupança(SavingsAccount), não utiliza a taxa padrão de R$ 5.00 para realizar saques, utilizando a sobreposição do método WITHDRAW da classe base ACCOUNT.
		
		System.out.printf("%nConta do tipo: SAVINGS ACCOUNT(Saque -> Sem TAXAS):%nSALDO INICIAL: 1000.00%nSaque de R$ 200.00%n");
		System.out.printf("%n- DADOS ATUALIZADOS DA CONTA:%n");
		System.out.println(account2);
		
		Account account3 = new BusinessAccount(1003, "Junior", 1000.00, 500.00); 
		account3.withdraw(200.0); //Método com a sobreposição utilizando a palavra SUPER para aplicar um sobreposição ao método saque(withdrow) para contas do tipo empresarial(Business) ADICIONANDO uma taxa extra específica para conta empresarial de R$ 2.00, além das taxas da conta normal(Account).
		
		System.out.printf("%nConta do tipo: BUSINESS ACCOUNT%nSALDO INICIAL: 1000.00%nSaque de R$ 200.00 (Saque -> TAXA PADRÃO + R$ 2.00):%n"); 
		System.out.printf("%n- DADOS ATUALIZADOS DA CONTA:%n");
		System.out.println(account3);
		
	}
}
/*
* PALAVRA SUPER
	- É possível chamar a implementação da super classe usando a palara super.
	
* EXEMPLO: Suponha que na classe BusinessAccount, a regra para saque seja realizar o saque normalmente da superclasse(VALOR DO SAQUE = TAXA DE 5.00), e descontar mais 2.0 
 */