package RevisaoProgOrientadaObjetos.Heranca_VS_Interface;

public class Semelhanças_e_Diferença {
}
/*
* ASPECTOS EM COMUM entre HERANÇA e INTERFACES
 
	- Relação É-UM
		- HERANÇA:
			- EXEMPLO:
				- Uma classe genérica SHAPES(Figuras) possui 2 subclasses:
					- Rectangle(retangulo) -> Herda/Extende a classe Shape
					- Circle(círculo)	   -> Herda/Extende a classe Shape
					- Essas duas subclasses:
						- É UMA figura(SHAPE)
				
		- INTERFACE: 
			- EXEMPLO:
				- Uma classe genérica TaxService(Serviço de Imposto) = INTERFACE possui duas subclasses:
					- BrazilTax(Imposto do Brazil)
					- UsaTax (Imposto dos USA)
					- Da mesma forma de herança as duas subclasses
						- É UM serviço de imposto(TaxService)
						
	- Generalização/especialização
		- HERANÇA e INTERFACE também utiliza tipo GENÉRICO e os tipos ESPECÍFICOS
			- HERANÇA:
				- Classe genérica: Super classe que será herdada pelas subclasses
				- No exemplo acima das figuras(SHAPES):
					- A classe do tipo genérica é:
						- SHAPE
					- As classes do tipo específico é:
						- Ractangle
						- Circle
						
			- INTERFACE:
				- No caso das INTERFACE a própria INTERFACE é do tipo genérico
				- No exemplo cima dos serviços de imposto(TAX SERVICES):
					- A interface do tipo genérico é:
						- TaxService
					- As classes do tipo específico é:
						- BrazilTax
						- UsaTax
	
	- Polimorfismo
 		- HERANÇA e INTERFACE também aplica os conceitos de polimorfismo
 			- HERANÇA:
 				- No exemplo das figuras(SHAPES)
 					- A classe genérica SHAPES em "tempo de execução":
 						- Pode ser associada a um objeto concreto Rectangle ou Circle conseguindo assim comportamentos diferentes isso é o POLIMORFISMO:
 						- Um mesmo tipo de objeto(SHAPES) com diferentes comportamentos.
 							- Exemplo: o cálculo da ÁREA de um retângulo é diferente do cálculo da ÁREA de um círculo.
 			
			- INTERFACE:
				- No exemplo dos Serviços de imposto(TAX SERVICES):
					- A interface genérica TaxService em "Tempo de Execução":
						- Pode ser associada a um objeto concreto BrazilTax ou UsaTax conseguindo também comportamentos diferentes POLIMORFISMO:
						- Um mesmo tipo de INTERFACE com diferentes comportamentos:
						 Exemplo: O imposto do Brazil será diferente do Imposto do USA.
						 
* DIFERENÇA FUNDAMENTAL entre HERANÇA e INTERFACE
	
	- Herança: Reuso de códigos e métodos
	- Interface: Contrato a ser cumprido
	
	- EXEMPLOS:
		- Herança:
			- A classe genérica SHAPES possui:
				- Um Atributos: COLOR.
				- Um Método: Area().
				
				- Atributo será herdado pelas subclasses RECTANGLE e CIRCLE, assim como os métodos GET e SET do atributo sem ter que redigita-los nas subclasses
				- Método pode ser sobrescrito conforme regras das subclasses
				
		- Interface:
			- A interface TAXSERVICE possui:
				- Uma Operação/Método: TAX()
				- Contrato definido significa:
					- Define que para uma classe concreta implementar a INTERFACE TaxService será OBRIGATÓRIO possuir o método TAX definido na interface
			
			- Então na interface não se aproveita código pois as operações definidas nas INTERFACEs não possui corpo{} apenas possui a declaração das operações
			- APARTIR do JAVA 8 é possível ter implementações nas INTERFACES (Chamado de Default Methods)
			
* MAS ENTÃO e se precisar implementar SHAPE como INTERFACE, porém também quiser definir uma estrutura comum reutilizável para todas as figuras?
	- Nesse caso será precisa criar:
		- Criar uma INTERFACE chamada SHAPE contendo a operação/métodos que deveram ser cumpridos (por exemplo: AREA())
		- Criar uma CLASSE ABSTRATA(AbstractShape) definindo os atributos que serão HERDADOS pelas subclasses específicas e como ela é abstrata não será obrigatório cumprir o contrato de possui o método AREA()
		- ESSE EXEMPLO CONSTA NOS ARQUIVOS DESSA PASTA
*/
