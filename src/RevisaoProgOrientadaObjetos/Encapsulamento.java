package RevisaoProgOrientadaObjetos;

public class Encapsulamento {
//Padrão para implementação de getters e setters:
	private String name; //Atributo privado não poderá ser acessado diretamente por outras classes. Apenas pelos métodos GET e SET definidos na classe
	
	//Método para conseguir acessar o atributo name agora será getName
	public String getName() {
		return name;
	}
	
	//Método para alterar o valor do atributo
	public void setName(String name) {
		this.name = name;
	}
	
}
/*
ENCAPSULAMENTO: É um princípio que consiste em esconder detalhes de implementação de uma classe,
expodo apenas operações seguras e que mantenham os objetos em estado consistente.

REGRA: O objeto deve sempre estar em um estado consistente, e a própria classe deve garantir isso.
Um objeto não deve expor nenhum atributo (modificador de acesso PRIVATE)
Os atributos devem ser acessados por meio de métodos GET e SET
Métodos GET retorna o valor do atributo
Métodos SET altera o valor do atributo
*/