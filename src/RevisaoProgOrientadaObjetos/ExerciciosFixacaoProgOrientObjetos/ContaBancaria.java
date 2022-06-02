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
		this.deposito(depositoInicial); //ENCAPSULANDO A REGRA DE NEGÓCIO: Previne manutenção em mais de um lugar no futuro pois se as regras de depósito inicial mudar haverá a necessidade de alteração apenas no método de depósito protegendo então o deposito inicial que será feito pelo método de depósito
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
