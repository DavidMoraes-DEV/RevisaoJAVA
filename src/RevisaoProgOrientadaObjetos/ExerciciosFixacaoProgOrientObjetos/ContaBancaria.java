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
	
	//CONSTRUTOR
	public ContaBancaria (int numeroConta, String nomeTitular, double saldo) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.saldo = saldo;
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
		return "Número da conta: "
				+ this.numeroConta
				+ ", Titular: "
				+ this.nomeTitular
				+ ", Saldo Atual: R$ "
				+ String.format("%.2f", this.saldo);
	}
}
