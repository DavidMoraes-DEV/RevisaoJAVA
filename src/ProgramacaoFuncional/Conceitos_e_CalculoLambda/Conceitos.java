package ProgramacaoFuncional.Conceitos_e_CalculoLambda;

public class Conceitos {

}
/*
* C�LCULO LAMBDA � diferente de EXPRESS�O LAMBDA:
 - C�lculo Lambda: � um formalismo matem�tico base da programa��o funcional
 - Express�o Lambda: Fun��o an�nima de primeira classe
 
* IMPORTANTE LEMBRAR: (Os paradgmas da programa��o)
	
	- Imperativo (C, Pascal, Fortran, Cobol)
	
	- Orientado a objetos (C++, Object Pascal, Java (< 8), C# (< 3)

	- Funcional (Haskell, Closure, Clean, Erlang)
	
	- L�gico (Prolog)
	
	- Multiparadgima (JavaScript, Java (8+), C# (3+), Ruby, Python, Go)

* Paradigma funcional de programa��o:

	- Baseado no formalismo matem�tico C�lculo Lambda (Church 1930)
	
+---------------------------------------------------------------------------------------+	
* Como se descreve algo a ser computado (*): 
	- Programa��o Imperativa
		- COMANDOS -> ("como" - imperativa) -> � descrito com COMANDOS, sendo descrito como fazer alguma coisa (S�O OS ALGOR�TMOS)
		
	- Programa��o Funcional
		- EXPRESS�ES -> ("o qu�" - declarativa) -> � descritos com EXPRESS�ES, sendo linguagem declarativas, dizendo o que deve ser feito
		
* Fun��es possuem transpar�ncia referencial (aus�ncia de efeitos colaterais)
	- Uma fun��o que possui transpar�ncia referencial � aquele que seu resultado ser� sempre o mesmo para os mesmos dados de entrada. Benef�cios: Simplicidade e Previsibilidade.
	
		- Programa��o Imperativa
			- FRACO
	
		- Programa��o Funcional
			- FORTE
					
		
* Objetos imut�veis (*)
	- Programa��o Imperativa
		- RARO = Imut�vel -> O valor das vari�veis n�o muda
		- COMUM = Mut�vel -> Pode se alterar o valor de um vetor ou vari�veis e etc...
		
	- Programa��o Funcional
		- COMUM = Imut�vel -> O valor das vari�veis n�o muda
		- VANTAGEM: Programa mais simples de entender e dar manuten��o no programa
			- Porque sabemos que aquela vari�vel vale um valor e isso n�o ir� mudar.
			- E esses objetos s�o mais f�ceis de trabalhar com concorr�ncia.

* Fun��es s�o objetos de primeira ordem
	- Programa��o Imperativa
		- N�O existe isso

	- Programa��o Funcional
		- SIM possui objetos de primeira ordem ou classe

* Expressividade / c�digo conciso
	- Programa��o Imperativa
		- BAIXA -> C�digo muito verboso, ocupando muito espe�o

	- Programa��o Funcional
		- ALTA -> C�digos mais consciso

* Tipagem din�mica / infer�ncia de tipos
	- Programa��o Imperativa
		- RARO

	- Programa�a� Funcional
		- COMUM
*/