package RevisaoProgOrientadaObjetos.Heranca_VS_Interface;

public class Semelhan�as_e_Diferen�a {
}
/*
* ASPECTOS EM COMUM entre HERAN�A e INTERFACES
 
	- Rela��o �-UM
		- HERAN�A:
			- EXEMPLO:
				- Uma classe gen�rica SHAPES(Figuras) possui 2 subclasses:
					- Rectangle(retangulo) -> Herda/Extende a classe Shape
					- Circle(c�rculo)	   -> Herda/Extende a classe Shape
					- Essas duas subclasses:
						- � UMA figura(SHAPE)
				
		- INTERFACE: 
			- EXEMPLO:
				- Uma classe gen�rica TaxService(Servi�o de Imposto) = INTERFACE possui duas subclasses:
					- BrazilTax(Imposto do Brazil)
					- UsaTax (Imposto dos USA)
					- Da mesma forma de heran�a as duas subclasses
						- � UM servi�o de imposto(TaxService)
						
	- Generaliza��o/especializa��o
		- HERAN�A e INTERFACE tamb�m utiliza tipo GEN�RICO e os tipos ESPEC�FICOS
			- HERAN�A:
				- Classe gen�rica: Super classe que ser� herdada pelas subclasses
				- No exemplo acima das figuras(SHAPES):
					- A classe do tipo gen�rica �:
						- SHAPE
					- As classes do tipo espec�fico �:
						- Ractangle
						- Circle
						
			- INTERFACE:
				- No caso das INTERFACE a pr�pria INTERFACE � do tipo gen�rico
				- No exemplo cima dos servi�os de imposto(TAX SERVICES):
					- A interface do tipo gen�rico �:
						- TaxService
					- As classes do tipo espec�fico �:
						- BrazilTax
						- UsaTax
	
	- Polimorfismo
 		- HERAN�A e INTERFACE tamb�m aplica os conceitos de polimorfismo
 			- HERAN�A:
 				- No exemplo das figuras(SHAPES)
 					- A classe gen�rica SHAPES em "tempo de execu��o":
 						- Pode ser associada a um objeto concreto Rectangle ou Circle conseguindo assim comportamentos diferentes isso � o POLIMORFISMO:
 						- Um mesmo tipo de objeto(SHAPES) com diferentes comportamentos.
 							- Exemplo: o c�lculo da �REA de um ret�ngulo � diferente do c�lculo da �REA de um c�rculo.
 			
			- INTERFACE:
				- No exemplo dos Servi�os de imposto(TAX SERVICES):
					- A interface gen�rica TaxService em "Tempo de Execu��o":
						- Pode ser associada a um objeto concreto BrazilTax ou UsaTax conseguindo tamb�m comportamentos diferentes POLIMORFISMO:
						- Um mesmo tipo de INTERFACE com diferentes comportamentos:
						 Exemplo: O imposto do Brazil ser� diferente do Imposto do USA.
						 
* DIFEREN�A FUNDAMENTAL entre HERAN�A e INTERFACE
	
	- Heran�a: Reuso de c�digos e m�todos
	- Interface: Contrato a ser cumprido
	
	- EXEMPLOS:
		- Heran�a:
			- A classe gen�rica SHAPES possui:
				- Um Atributos: COLOR.
				- Um M�todo: Area().
				
				- Atributo ser� herdado pelas subclasses RECTANGLE e CIRCLE, assim como os m�todos GET e SET do atributo sem ter que redigita-los nas subclasses
				- M�todo pode ser sobrescrito conforme regras das subclasses
				
		- Interface:
			- A interface TAXSERVICE possui:
				- Uma Opera��o/M�todo: TAX()
				- Contrato definido significa:
					- Define que para uma classe concreta implementar a INTERFACE TaxService ser� OBRIGAT�RIO possuir o m�todo TAX definido na interface
			
			- Ent�o na interface n�o se aproveita c�digo pois as opera��es definidas nas INTERFACEs n�o possui corpo{} apenas possui a declara��o das opera��es
			- APARTIR do JAVA 8 � poss�vel ter implementa��es nas INTERFACES (Chamado de Default Methods)
			
* MAS ENT�O e se precisar implementar SHAPE como INTERFACE, por�m tamb�m quiser definir uma estrutura comum reutiliz�vel para todas as figuras?
	- Nesse caso ser� precisa criar:
		- Criar uma INTERFACE chamada SHAPE contendo a opera��o/m�todos que deveram ser cumpridos (por exemplo: AREA())
		- Criar uma CLASSE ABSTRATA(AbstractShape) definindo os atributos que ser�o HERDADOS pelas subclasses espec�ficas e como ela � abstrata n�o ser� obrigat�rio cumprir o contrato de possui o m�todo AREA()
		- ESSE EXEMPLO CONSTA NOS ARQUIVOS DESSA PASTA
*/
