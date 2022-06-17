package RevisaoProgOrientadaObjetos.TratamentoDeExcecoes.ExcecoesPersonalizadas.SolucaoBoa.model.exceptions;

/*EXCEÇÃO PERSONALIZADA
* DomainException -> CONVENÇÃO: Utiliza-se a palavra: DOMAIN -> Porque vai ser uma exceção lançada por algum erro na entidade de domínio (Nesse caso Reservation).
	- Mas poderia ser outro nome.
	- Quando a classe é de exceção coloca-se o nome Exception no final do nome

* DomainExeption -> Basicamento pode ser extendida das classes: Exception ou RumtimeException
	- DIFERENÇA entre elas:
		- Exception: 
			- É um tipo de exceção que o compilador OBRIGA ser tratada. Deverá contem a estrutura TRY-CATCH para tratamento dessa exceção
		
		- RumtimeException: 
			- É um tipo de exceção que o compilador NÃO OBRIGA ser tratada. Se não colocar a estrutura TRY-CATCH o compilador não vai falar nada
		
		- IMPORTANTE: Se mudar para EXTENDS RUMTIMEEXCEPTION deverá remover:
			- As propagações de exceções no começo dos métodos
			- No programa principal(Program) adicionar um CATCH do tipo RUMTIME EXECEPTION para imprimir na tela a mensagem: Unexpected error(Erro inexperado) para ser lançado esse erro caso ocorra qualquer outro tipo de erro como digitar texto no número dos quartos.
*/
public class DomainException extends Exception{

	/**
	 * Por padrão da linguagem JAVA o compilador vai dar uma aviso no nome da classe dizendo:
	 	- THE SERIALIZABLE CLASS:
	 		- Diz que a classe é SERIALIZABLE e precisa ter um numero de versão.
	 		- Os objetos desse tipo de classe podem sem convertidos para BYTES e assim trafegar em redes, grava-los em arquivos e etc...
	 */
	
	//Declara a versão de uma classe serializable
	private static final long serialVersionUID = 1L;

	//Construtor que recebe um String como argumento
	//Para permitir que seja possível instanciar a exceção personalizada passando uma msg para ela, para que a mensagem fique armazenada dentro da exceção
	public DomainException (String msg) {
		//Repassa a mensagem para o construtor da super classe
		super(msg);
	}
	
}

/*

 */
