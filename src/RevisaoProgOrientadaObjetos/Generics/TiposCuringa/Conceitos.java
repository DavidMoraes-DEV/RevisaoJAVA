package RevisaoProgOrientadaObjetos.Generics.TiposCuringa;

public class Conceitos {
}
/*
* GENERICS SÃO INVARIANTES

	- List<Object> myObjs = new ArrayList<Object>();			-> Embora Object receba todos os outros tipos primitivos, esse tipo de Lista não é um Super tipo para qualquer tipo de lista
	- List<Integer> myNumbers = new ArrayList<Integer>();		-> Integer é um subtipo de Object, porém não é possível atribuir a lista do tipo Inteiro para a lista do tipo Object, porque LIST<OBJECT> não é um super tipo de LIST<INTEGER>
	myObjs = myNumbers; 										-> Dará Erro de compilação dizendo que não é possível converter para list<Object>
	
* O supertipo de qualquer tipo de lista é:
	- List<?>													-> Este é um tipo CURINGA. É o SuperTipo de List<>, aceitando qualquer tipo de lista.
	- List<?> myObjs = new ArrayList<Objetc>();
	- List<Integer> myNumbers = new ArrayList<Integer>();
	myObjs = myNumbers;
	
* Com tipos curinga podemos fazer métodos que recebem um genérico de "qualquer tipo"
	- Porém para métodos que recebem "qualquer tipo" não é possível adicionar algum tipo específico como list.add(3) (Erro de compilação)
	- O compilador não sabe qual é o tipo específico do qual a lista foi instanciada.
	
*/