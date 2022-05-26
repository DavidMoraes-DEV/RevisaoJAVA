package RevisaoConceitoJAVA;

public class FuncoesInteressantesParaStrings {

	public static void main(String[] args) {

		String original = "abcde FGHIJ ABC abc DEFG    ";
		
		System.out.printf("Frase Original: %s%n", original);
		
		String string1 = original.toLowerCase();
		System.out.printf("Convertendo frase para MINÚSCULO: %s%n%n", string1 + "-");
		
		String string2 = original.toUpperCase();
		System.out.printf("Convertendo frase para MAIÚSCULO: %s%n%n", string2 + "-");
		
		String string3 = original.trim();
		System.out.printf("Removendo os espaços dos cantos da string: %s%n%n", string3 + "-");
		
		String string4 = original.substring(2);
		System.out.printf("Recortando uma parte da string apartir do 2 caracter da string: %s%n%n", string4 + "-");
		
		String string5 = original.substring(2, 9);
		System.out.printf("Recortando uma parte da string do 2 caracter até o 8 caracter: %s%n%n", string5);

		String string6 = original.replace('a', 'x');
		System.out.printf("Substituindo um caracter pelo outro: %s%n%n", string6 + "-");
		
		String string7 = original.replace("abc", "xy");
		System.out.printf("Substituindo uma parte da string correspondente por outra definida: %s%n%n", string7 + "-");
		
		int posicao1 = original.indexOf("bc");
		System.out.printf("Primeira ocorrencia do (bc): %d%n%n", posicao1);
		
		int posicao2 = original.lastIndexOf("bc");
		System.out.printf("Última ocorrência do (bc): %d%n%n", posicao2);
		
		String stringSplit = "potato apple lemon";
		
		String[] vect = stringSplit.split(" ");
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];		
		
		System.out.printf("FRASE PARA CORTAR COM O SPLI: %s", stringSplit);
		
		System.out.printf("PALAVRAS DA STRING CORTADAS COM O SPLIT:%n %s %n %s %n %s", word1, word2, word3);
	}

}
/*
---FUNÇÕES MAIS UTILIZADAS:

--FORMATAR STRING:
toLowerCase() -> Converte para minúsculo
toUpperCase() -> Converte para maiúsculo
trim() -> Remove os espaços em branco

--RECORTAR:
substring(inicio) -> recorta string apartir do início informado até o final da string existente
substring(inicio, fim) -> recorta string apartir do início e do fim informado descartando o restante se houver

--SUBSTITUIR:
Replace(char, char) -> Substitui um caracter pelo outro na string
Replace(string, string) -> Substitui uma string pela outra string ou por uma substring

--BUSCAR:
IndexOf -> Busca a posição de alguma parte da string
LastIndexOf -> Busca a posição de alguma parte da string
str.Split("") -> Recorta um pedaço da string de acordo com o caracter especificado entre ()
*/