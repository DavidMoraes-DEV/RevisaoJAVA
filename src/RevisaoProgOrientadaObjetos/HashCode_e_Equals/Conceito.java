package RevisaoProgOrientadaObjetos.HashCode_e_Equals;

public class Conceito {

}
/*
* HASHCODE E EQUALS
	- São operações da classe Object utilizadas para comparar se um objeto é igual a outro
	
	- EQUALS:
		- Lento, porém resultado é 100%
		- Método que compara se o objeto é igual a outro, retornando TRUE ou FALSE
		- EXEMPLO:
			- String a = "Maria";
			- String b = "Alex";
			- System.out.println(a.equals(b));
			- RESULTADO SERÁ: FALSE
	
	- HASHCODE:
		- Rápido, porém resultado não é 100%
		- Método que retorna um número inteiro representando um código gerado a partir das informações do objeto
		- REGRA DE OURO:
			- Se o hashCode de dois objetos for diferente, então os dois objetos são diferentes
				- Pois NUNCA irá acontecer de dois objetos IGUAIS gerar hashCodes DIFERENTES.
				
			- Se o código de dois objetos for igual, MUITO PROVAVELMENTE os objetos são iguais (pode haver colisão).
				- Pode haver colisão porque há a remota possibilidade de 2 objetos diferente gerar o MESMO hashCode (Pode acontecer porém é muito raro).
	
	- ENTÃO SE DOIS OBJETOS DIFERENTES PODEM GERAR O MESMO HASHCODE PORQUE EXISTE O HASHCODE?
		- Porque a comparação por hashCode é muito rápido de ser calculado.
		- Geralmente é utilizado o HASHCODE para encontrar objetos em uma coleção muito grande e os resultados VERDADEIRO(hashCode Iguais)
			- Depois os resultados positivos são validados com o EQUALS.
	
	- TIPOS COMUNS(String, Date, Integerm Double, etc.):
		- Já possuem implementação para essas operações.
		- Classes personalizadas precisam sobrepô-las


* COMO AS COLEÇÕES HASH TESTAM IGUALDADE?
	- Se hashCode e equals estiverem implementados:
		- Primeiro hashCode. Se der igual, usa equals para confirmar.
		- Lembre-se: String, Integer, Double, etc. Já possuem equals e hashCode.
	
	- Se hashCode e equals NÃO estiverem implementados:
		- Compara as referências (ponteiros) dos objetos.

*/