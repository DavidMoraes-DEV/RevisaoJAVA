package RevisaoProgOrientadaObjetos.TratamentoDeExcecoes.ExcecoesPersonalizadas.SolucaoBoa.model.exceptions;

/*EXCE��O PERSONALIZADA
* DomainException -> CONVEN��O: Utiliza-se a palavra: DOMAIN -> Porque vai ser uma exce��o lan�ada por algum erro na entidade de dom�nio (Nesse caso Reservation).
	- Mas poderia ser outro nome.
	- Quando a classe � de exce��o coloca-se o nome Exception no final do nome

* DomainExeption -> Basicamento pode ser extendida das classes: Exception ou RumtimeException
	- DIFEREN�A entre elas:
		- Exception: 
			- � um tipo de exce��o que o compilador OBRIGA ser tratada. Dever� contem a estrutura TRY-CATCH para tratamento dessa exce��o
		
		- RumtimeException: 
			- � um tipo de exce��o que o compilador N�O OBRIGA ser tratada. Se n�o colocar a estrutura TRY-CATCH o compilador n�o vai falar nada
		
		- IMPORTANTE: Se mudar para EXTENDS RUMTIMEEXCEPTION dever� remover:
			- As propaga��es de exce��es no come�o dos m�todos
			- No programa principal(Program) adicionar um CATCH do tipo RUMTIME EXECEPTION para imprimir na tela a mensagem: Unexpected error(Erro inexperado) para ser lan�ado esse erro caso ocorra qualquer outro tipo de erro como digitar texto no n�mero dos quartos.
*/
public class DomainException extends Exception{

	/**
	 * Por padr�o da linguagem JAVA o compilador vai dar uma aviso no nome da classe dizendo:
	 	- THE SERIALIZABLE CLASS:
	 		- Diz que a classe � SERIALIZABLE e precisa ter um numero de vers�o.
	 		- Os objetos desse tipo de classe podem sem convertidos para BYTES e assim trafegar em redes, grava-los em arquivos e etc...
	 */
	
	//Declara a vers�o de uma classe serializable
	private static final long serialVersionUID = 1L;

	//Construtor que recebe um String como argumento
	//Para permitir que seja poss�vel instanciar a exce��o personalizada passando uma msg para ela, para que a mensagem fique armazenada dentro da exce��o
	public DomainException (String msg) {
		//Repassa a mensagem para o construtor da super classe
		super(msg);
	}
	
}

/*

 */
