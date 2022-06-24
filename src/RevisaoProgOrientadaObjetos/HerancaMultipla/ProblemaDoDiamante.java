package RevisaoProgOrientadaObjetos.HerancaMultipla;

public class ProblemaDoDiamante {
}
/*
* PROBLEMA DO DIAMANTE:
	- Pode ser gerada pela HERAN�A M�LTIPLA:
		- Uma ambiguidade causada pela exist�ncia do mesmo m�todo em mais de uma superclasse.
		- Heran�a m�ltipla n�o � permitida na maioria das linguagens!

 	* Na linguagem JAVA como na maioria das linguagens n�o � permitido herdar mais de uma Super Classe
		- Nem utilizando v�rgula nem acrescentando mais de um extends (Por exemplo: public class ComboDevice extends Scanner extends Printer {})
  		- Ent�o ocorre AQUI O PROBLEMA DO DIAMANTE, pois o ComboDevice poderia hendar tanto de Scanner quando Printer
  			- mas como visto n�o � poss�vel herdar de duas classes diferentes: HERAN�A M�LTIPLA

 	* SOLU��O:
 		- Uma classe por�m pode IMPLEMENTAR MAIS de uma INTERFACE
 			- Ficando ent�o ComboDevice HENDANDO da classe Device
 			- E implementando duas INTERFACE:
 				- Scanner
 				- Printer

 	* ATEN��O:
 		- A solu��o N�O � mais heran�a m�ltipla, pois N�O H� REUSO na rela��o entre ComboDevice e as interfaces Scanner e Printer.
 		- ComboDevice N�O HERDA, mas SIM implementa as INTERFACES (Cumpre o contrato)
 	
 		- POL�MICA:
 			- Alguns autores defende que isso � heran�a m�ltipla
 			- Alguns autores defende que N�O � heran�a m�ltipla porque:
 				- Se ver a concep��o do conceito de REUSO para heran�a:
 					- Veremos que n�o � considerado Heran�a m�ltipla
 					- Porque n�o reutiliza nenhum c�digo apenas cumpre o contrato com a interface implementando as opera��es dela.
 		
 			- No JAVA apartir da vers�o 8, possui os M�todos concretos para interface:
 				- A� possui um caso ESPECIAL RESTRITO de heran�a m�ltipla
 				- Por�m dentro da concep��o CL�SSICA n�o existe REUSO para ser considereda HERAN�A M�LTIPLA
*/