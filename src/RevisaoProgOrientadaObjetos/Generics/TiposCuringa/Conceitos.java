package RevisaoProgOrientadaObjetos.Generics.TiposCuringa;

public class Conceitos {
}
/*
* GENERICS S�O INVARIANTES

	- List<Object> myObjs = new ArrayList<Object>();			-> Embora Object receba todos os outros tipos primitivos, esse tipo de Lista n�o � um Super tipo para qualquer tipo de lista
	- List<Integer> myNumbers = new ArrayList<Integer>();		-> Integer � um subtipo de Object, por�m n�o � poss�vel atribuir a lista do tipo Inteiro para a lista do tipo Object, porque LIST<OBJECT> n�o � um super tipo de LIST<INTEGER>
	myObjs = myNumbers; 										-> Dar� Erro de compila��o dizendo que n�o � poss�vel converter para list<Object>
	
* O supertipo de qualquer tipo de lista �:
	- List<?>													-> Este � um tipo CURINGA. � o SuperTipo de List<>, aceitando qualquer tipo de lista.
	- List<?> myObjs = new ArrayList<Objetc>();
	- List<Integer> myNumbers = new ArrayList<Integer>();
	myObjs = myNumbers;
	
* Com tipos curinga podemos fazer m�todos que recebem um gen�rico de "qualquer tipo"
	- Por�m para m�todos que recebem "qualquer tipo" n�o � poss�vel adicionar algum tipo espec�fico como list.add(3) (Erro de compila��o)
	- O compilador n�o sabe qual � o tipo espec�fico do qual a lista foi instanciada.
	
*/