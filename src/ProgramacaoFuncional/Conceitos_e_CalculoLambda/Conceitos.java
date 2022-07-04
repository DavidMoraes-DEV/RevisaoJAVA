package ProgramacaoFuncional.Conceitos_e_CalculoLambda;

public class Conceitos {

}
/*
* CÁLCULO LAMBDA é diferente de EXPRESSÃO LAMBDA:
 - Cálculo Lambda: É um formalismo matemático base da programação funcional
 - Expressão Lambda: Função anônima de primeira classe
 
* IMPORTANTE LEMBRAR: (Os paradgmas da programação)
	
	- Imperativo (C, Pascal, Fortran, Cobol)
	
	- Orientado a objetos (C++, Object Pascal, Java (< 8), C# (< 3)

	- Funcional (Haskell, Closure, Clean, Erlang)
	
	- Lógico (Prolog)
	
	- Multiparadgima (JavaScript, Java (8+), C# (3+), Ruby, Python, Go)

* Paradigma funcional de programação:

	- Baseado no formalismo matemático Cálculo Lambda (Church 1930)
	
+---------------------------------------------------------------------------------------+	
* Como se descreve algo a ser computado (*): 
	- Programação Imperativa
		- COMANDOS -> ("como" - imperativa) -> É descrito com COMANDOS, sendo descrito como fazer alguma coisa (SÃO OS ALGORÍTMOS)
		
	- Programação Funcional
		- EXPRESSÕES -> ("o quê" - declarativa) -> É descritos com EXPRESSÕES, sendo linguagem declarativas, dizendo o que deve ser feito
		
* Funções possuem transparência referencial (ausência de efeitos colaterais)
	- Uma função que possui transparência referencial é aquele que seu resultado será sempre o mesmo para os mesmos dados de entrada. Benefícios: Simplicidade e Previsibilidade.
	
		- Programação Imperativa
			- FRACO
	
		- Programação Funcional
			- FORTE
					
		
* Objetos imutáveis (*)
	- Programação Imperativa
		- RARO = Imutável -> O valor das variáveis não muda
		- COMUM = Mutável -> Pode se alterar o valor de um vetor ou variáveis e etc...
		
	- Programação Funcional
		- COMUM = Imutável -> O valor das variáveis não muda
		- VANTAGEM: Programa mais simples de entender e dar manutenção no programa
			- Porque sabemos que aquela variável vale um valor e isso não irá mudar.
			- E esses objetos são mais fáceis de trabalhar com concorrência.

* Funções são objetos de primeira ordem
	- Programação Imperativa
		- NÃO existe isso

	- Programação Funcional
		- SIM possui objetos de primeira ordem ou classe

* Expressividade / código conciso
	- Programação Imperativa
		- BAIXA -> Código muito verboso, ocupando muito espeço

	- Programação Funcional
		- ALTA -> Códigos mais consciso

* Tipagem dinâmica / inferência de tipos
	- Programação Imperativa
		- RARO

	- Programaçaõ Funcional
		- COMUM
*/