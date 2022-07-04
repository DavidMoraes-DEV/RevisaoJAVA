package ProgramacaoFuncional.InterfaceFuncionalFUNCTION.entities;

import java.util.function.Function;

/*
* Nos parâmetros da interface funcional Function<T, R> possui dois tipos: T e R.
	- T = É o tipo de entrada "T"(Nesse caso tipo Product)
	- R = É o tipo de saída "R"(Nesse caso é String)
		- Porque queremos apenas converter os nomes dos produtos em letras maíusculas
*/
public class UpperCaseName implements Function<Product, String> {

	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
	}
}