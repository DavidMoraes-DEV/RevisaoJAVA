package RevisaoProgOrientadaObjetos.InterfaceComparable.model.entities;

//Para que seja possível que a lista do tipo Employee seja ordenada pelo método .sort é necessário implementar a INTERFACE Comparable<Employee> e cumprir o contrato da interface adicionando sua operação
public class Employee implements Comparable<Employee>{

	private String name;
	private Double salary;

	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return name + ", Salary: $ " + salary;
	}

	/*
	* compareTo:
		- serve para COMPARAR um objeto com outro objeto
		- Nesse caso irá comparar um objeto Employee com outro objeto Employee informado entre ()
		- Esse método retorna um numero inteiro pois:
			- Compara o tamanho dos dois objetos e retorna
				- Um Número negativo -> Se o primeiro objeto for menor que o objeto especificado na função .compareTo()
				- Um Número positivo -> Se o primeiro objeto for maior que o objeto especificado na função .compareTo()
				- Ou retorna zero 	 -> Se o tamanho dos dois objetos comparados forem iguais
	*/
	@Override
	public int compareTo(Employee other) {
		/*
		- Por padrão irá ordenar em ordem crescente(do menor para o maior)
			- Exemplo:
				- return name.compareTo(other.getName())
		- Para ordenar por ordem descrente adicionar um "-" na frente do primeiro objeto que chamará a função .compareTo()
			- Exemplo:
				- return -name.compareTo(other.getName())
		*/
		return name.compareTo(other.getName()); //* Aqui definimos apenas que a comparação entre funcionários é apenas comparando seus nomes para ordenar em ordem alfabética
	}
}