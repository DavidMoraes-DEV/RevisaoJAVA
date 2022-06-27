package RevisaoProgOrientadaObjetos.Interfaces.DefaultMethods;

public class Problematica {
}
/*
* DEFAULT METHODS (DEFENDER METHODS)
 	- A partir do JAVA 8, Interfaces podem conter métodos concretos. (Dependendo do caso expecífico podem ter métodos estaticos e métodos privados)
 	- A intenção básica é prover implementação padrão para métodos, de modo a evitar:
 		- Repetiçao de implementação em toda classe que implemente a interface
 		- A necessidade de se criar classes abstratas para prover reuso da implementação
 	
 	- Outras Vantagens:
 		- Manter a retrocompatibilidade com sistemas existentes
 			- Quando o JAVA 8 introduziu os métodos padrões em algumas interfaces da biblioteca do JAVA elas continuaram compatíveis com sistemas anteriores.
 		- Permitir que "interfaces funcionais" (que devem conter apenas um método) possam prover outras operações padrão reutilizáveis

* PROBLEMA EXEMPLO:
	- Fazer um programa para ler uma quantia e a duração em meses de um empréstimo. Informar o valor a ser pago depois de decorrido o prazo do empréstimo, conforme
	regras de juros do Brasil. A regra de cálculo de juros do Brasil é juro composto padrão de 2% ao mês.

EXEMPLO DE ENTRADA E SAÍDA:
Amount: 200.00
Months: 2
Payment after 3 months:
212.24

* QUESTIONAMENTO: E se existisse outro serviço de juros de outro pais?
	- Aqui entra a questão de se utilizar os Default Methods para não precisar declarar duas vezes a função Payment()

* CONSIDERAÇÕES IMPORTANTES:
	- SIM: Agora as interfaces podem prover REUSO
	- SIM: Agora temos uma forma de HERANÇA MÚLTIPLA
		- MAS o compilador reclama se houver mais de um método com a mesma assinatura, obrigando a sobrescreve-lo
	
	- Interfaces ainda são bem diferentes de classes abstratas.
	- Interfaces não possuem recursos tais como construtores e atributos.

*/