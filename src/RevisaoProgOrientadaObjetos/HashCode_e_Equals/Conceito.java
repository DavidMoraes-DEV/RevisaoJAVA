package RevisaoProgOrientadaObjetos.HashCode_e_Equals;

public class Conceito {

}
/*
* HASHCODE E EQUALS
	- S�o opera��es da classe Object utilizadas para comparar se um objeto � igual a outro
	
	- EQUALS:
		- Lento, por�m resultado � 100%
		- M�todo que compara se o objeto � igual a outro, retornando TRUE ou FALSE
		- EXEMPLO:
			- String a = "Maria";
			- String b = "Alex";
			- System.out.println(a.equals(b));
			- RESULTADO SER�: FALSE
	
	- HASHCODE:
		- R�pido, por�m resultado n�o � 100%
		- M�todo que retorna um n�mero inteiro representando um c�digo gerado a partir das informa��es do objeto
		- REGRA DE OURO:
			- Se o hashCode de dois objetos for diferente, ent�o os dois objetos s�o diferentes
				- Pois NUNCA ir� acontecer de dois objetos IGUAIS gerar hashCodes DIFERENTES.
				
			- Se o c�digo de dois objetos for igual, MUITO PROVAVELMENTE os objetos s�o iguais (pode haver colis�o).
				- Pode haver colis�o porque h� a remota possibilidade de 2 objetos diferente gerar o MESMO hashCode (Pode acontecer por�m � muito raro).
	
	- ENT�O SE DOIS OBJETOS DIFERENTES PODEM GERAR O MESMO HASHCODE PORQUE EXISTE O HASHCODE?
		- Porque a compara��o por hashCode � muito r�pido de ser calculado.
		- Geralmente � utilizado o HASHCODE para encontrar objetos em uma cole��o muito grande e os resultados VERDADEIRO(hashCode Iguais)
			- Depois os resultados positivos s�o validados com o EQUALS.
	
	- TIPOS COMUNS(String, Date, Integerm Double, etc.):
		- J� possuem implementa��o para essas opera��es.
		- Classes personalizadas precisam sobrep�-las


* COMO AS COLE��ES HASH TESTAM IGUALDADE?
	- Se hashCode e equals estiverem implementados:
		- Primeiro hashCode. Se der igual, usa equals para confirmar.
		- Lembre-se: String, Integer, Double, etc. J� possuem equals e hashCode.
	
	- Se hashCode e equals N�O estiverem implementados:
		- Compara as refer�ncias (ponteiros) dos objetos.

*/