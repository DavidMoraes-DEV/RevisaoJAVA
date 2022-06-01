package RevisaoProgOrientadaObjetos;

public class Encapsulamento {
//Padr�o para implementa��o de getters e setters:
	private String name; //Atributo privado n�o poder� ser acessado diretamente por outras classes. Apenas pelos m�todos GET e SET definidos na classe
	
	//M�todo para conseguir acessar o atributo name agora ser� getName
	public String getName() {
		return name;
	}
	
	//M�todo para alterar o valor do atributo
	public void setName(String name) {
		this.name = name;
	}
	
}
/*
ENCAPSULAMENTO: � um princ�pio que consiste em esconder detalhes de implementa��o de uma classe,
expodo apenas opera��es seguras e que mantenham os objetos em estado consistente.

REGRA: O objeto deve sempre estar em um estado consistente, e a pr�pria classe deve garantir isso.
Um objeto n�o deve expor nenhum atributo (modificador de acesso PRIVATE)
Os atributos devem ser acessados por meio de m�todos GET e SET
M�todos GET retorna o valor do atributo
M�todos SET altera o valor do atributo
*/