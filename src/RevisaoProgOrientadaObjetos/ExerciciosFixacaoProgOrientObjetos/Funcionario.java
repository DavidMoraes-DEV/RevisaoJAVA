package RevisaoProgOrientadaObjetos.ExerciciosFixacaoProgOrientObjetos;

public class Funcionario {

	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	
	public void aumentoSalario(double porc) {
		double aux = porc/100;
		salarioBruto += (salarioBruto*aux);
	}
	
	@Override
	public String toString() {
		
		return "Nome: "
				+ nome
				+ ", Salario: R$ "
				+ String.format("%.2f", salarioLiquido());
	}
}
