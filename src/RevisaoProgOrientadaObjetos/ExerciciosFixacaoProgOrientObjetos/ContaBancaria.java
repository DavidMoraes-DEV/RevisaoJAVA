package RevisaoProgOrientadaObjetos.ExerciciosFixacaoProgOrientObjetos;

public class ContaBancaria {
	
	//ATRIBUTOS
	private int numeroConta;
	private String nomeTitular;
	private double saldo;
	
	//CONSTRUTOR
	public ContaBancaria (int numeroConta, String nomeTitular) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
	}
	
	//CONSTRUTOR SOBRECARGA
	public ContaBancaria (int numeroConta, String nomeTitular, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.deposito(depositoInicial); //ENCAPSULANDO A REGRA DE NEG�CIO: Previne manuten��o em mais de um lugar no futuro pois se as regras de dep�sito inicial mudar haver� a necessidade de altera��o apenas no m�todo de dep�sito protegendo ent�o o deposito inicial que ser� feito pelo m�todo de dep�sito
	}
	
	//ACESSA O ATRIBUTO NUMERO DA CONTA
	public int getContaBancaria () {
		return numeroConta;
	}
	
	//ACESSA O ATRIBUTO NOME DO TITULAR DA CONTA
	public String getNomeTitular () {
		return nomeTitular;
	}
	
	//ALTERA O ATRIBUTO NOME DO TITULAR DA CONTA
	public void setNomeTitular (String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	
	public void deposito (double valor) {
		this.saldo += valor;
	}
	
	public void saque (double valor) {
		this.saldo -= valor+5.00;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "N�mero da conta: "
				+ this.numeroConta
				+ ", Titular: "
				+ this.nomeTitular
				+ ", Saldo Atual: R$ "
				+ String.format("%.2f", this.saldo);
	}
}
