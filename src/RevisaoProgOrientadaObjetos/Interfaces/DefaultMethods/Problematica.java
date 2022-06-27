package RevisaoProgOrientadaObjetos.Interfaces.DefaultMethods;

public class Problematica {
}
/*
* DEFAULT METHODS (DEFENDER METHODS)
 	- A partir do JAVA 8, Interfaces podem conter m�todos concretos. (Dependendo do caso expec�fico podem ter m�todos estaticos e m�todos privados)
 	- A inten��o b�sica � prover implementa��o padr�o para m�todos, de modo a evitar:
 		- Repeti�ao de implementa��o em toda classe que implemente a interface
 		- A necessidade de se criar classes abstratas para prover reuso da implementa��o
 	
 	- Outras Vantagens:
 		- Manter a retrocompatibilidade com sistemas existentes
 			- Quando o JAVA 8 introduziu os m�todos padr�es em algumas interfaces da biblioteca do JAVA elas continuaram compat�veis com sistemas anteriores.
 		- Permitir que "interfaces funcionais" (que devem conter apenas um m�todo) possam prover outras opera��es padr�o reutiliz�veis

* PROBLEMA EXEMPLO:
	- Fazer um programa para ler uma quantia e a dura��o em meses de um empr�stimo. Informar o valor a ser pago depois de decorrido o prazo do empr�stimo, conforme
	regras de juros do Brasil. A regra de c�lculo de juros do Brasil � juro composto padr�o de 2% ao m�s.

EXEMPLO DE ENTRADA E SA�DA:
Amount: 200.00
Months: 2
Payment after 3 months:
212.24

* QUESTIONAMENTO: E se existisse outro servi�o de juros de outro pais?
	- Aqui entra a quest�o de se utilizar os Default Methods para n�o precisar declarar duas vezes a fun��o Payment()

* CONSIDERA��ES IMPORTANTES:
	- SIM: Agora as interfaces podem prover REUSO
	- SIM: Agora temos uma forma de HERAN�A M�LTIPLA
		- MAS o compilador reclama se houver mais de um m�todo com a mesma assinatura, obrigando a sobrescreve-lo
	
	- Interfaces ainda s�o bem diferentes de classes abstratas.
	- Interfaces n�o possuem recursos tais como construtores e atributos.

*/