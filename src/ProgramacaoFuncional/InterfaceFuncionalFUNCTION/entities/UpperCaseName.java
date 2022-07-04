package ProgramacaoFuncional.InterfaceFuncionalFUNCTION.entities;

import java.util.function.Function;

/*
* Nos par�metros da interface funcional Function<T, R> possui dois tipos: T e R.
	- T = � o tipo de entrada "T"(Nesse caso tipo Product)
	- R = � o tipo de sa�da "R"(Nesse caso � String)
		- Porque queremos apenas converter os nomes dos produtos em letras ma�usculas
*/
public class UpperCaseName implements Function<Product, String> {

	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
	}
}