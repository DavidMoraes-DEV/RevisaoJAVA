package RevisaoProgOrientadaObjetos.HerancaMultipla;

public class ProblemaDoDiamante {
}
/*
* PROBLEMA DO DIAMANTE:
	- Pode ser gerada pela HERANÇA MÚLTIPLA:
		- Uma ambiguidade causada pela existência do mesmo método em mais de uma superclasse.
		- Herança múltipla não é permitida na maioria das linguagens!

 	* Na linguagem JAVA como na maioria das linguagens não é permitido herdar mais de uma Super Classe
		- Nem utilizando vírgula nem acrescentando mais de um extends (Por exemplo: public class ComboDevice extends Scanner extends Printer {})
  		- Então ocorre AQUI O PROBLEMA DO DIAMANTE, pois o ComboDevice poderia hendar tanto de Scanner quando Printer
  			- mas como visto não é possível herdar de duas classes diferentes: HERANÇA MÚLTIPLA

 	* SOLUÇÃO:
 		- Uma classe porém pode IMPLEMENTAR MAIS de uma INTERFACE
 			- Ficando então ComboDevice HENDANDO da classe Device
 			- E implementando duas INTERFACE:
 				- Scanner
 				- Printer

 	* ATENÇÃO:
 		- A solução NÃO é mais herança múltipla, pois NÃO HÁ REUSO na relação entre ComboDevice e as interfaces Scanner e Printer.
 		- ComboDevice NÃO HERDA, mas SIM implementa as INTERFACES (Cumpre o contrato)
 	
 		- POLÊMICA:
 			- Alguns autores defende que isso É herança múltipla
 			- Alguns autores defende que NÃO É herança múltipla porque:
 				- Se ver a concepção do conceito de REUSO para herança:
 					- Veremos que não é considerado Herança múltipla
 					- Porque não reutiliza nenhum código apenas cumpre o contrato com a interface implementando as operações dela.
 		
 			- No JAVA apartir da versão 8, possui os Métodos concretos para interface:
 				- Aí possui um caso ESPECIAL RESTRITO de herança múltipla
 				- Porém dentro da concepção CLÁSSICA não existe REUSO para ser considereda HERANÇA MÚLTIPLA
*/