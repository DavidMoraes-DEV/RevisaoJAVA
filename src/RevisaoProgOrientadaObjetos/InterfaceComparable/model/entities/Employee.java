package RevisaoProgOrientadaObjetos.InterfaceComparable.model.entities;

//Para que seja poss�vel que a lista do tipo Employee seja ordenada pelo m�todo .sort � necess�rio implementar a INTERFACE Comparable<Employee> e cumprir o contrato da interface adicionando sua opera��o
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
		- Nesse caso ir� comparar um objeto Employee com outro objeto Employee informado entre ()
		- Esse m�todo retorna um numero inteiro pois:
			- Compara o tamanho dos dois objetos e retorna
				- Um N�mero negativo -> Se o primeiro objeto for menor que o objeto especificado na fun��o .compareTo()
				- Um N�mero positivo -> Se o primeiro objeto for maior que o objeto especificado na fun��o .compareTo()
				- Ou retorna zero 	 -> Se o tamanho dos dois objetos comparados forem iguais
	*/
	@Override
	public int compareTo(Employee other) {
		/*
		- Por padr�o ir� ordenar em ordem crescente(do menor para o maior)
			- Exemplo:
				- return name.compareTo(other.getName())
		- Para ordenar por ordem descrente adicionar um "-" na frente do primeiro objeto que chamar� a fun��o .compareTo()
			- Exemplo:
				- return -name.compareTo(other.getName())
		*/
		return name.compareTo(other.getName()); //* Aqui definimos apenas que a compara��o entre funcion�rios � apenas comparando seus nomes para ordenar em ordem alfab�tica
	}
}