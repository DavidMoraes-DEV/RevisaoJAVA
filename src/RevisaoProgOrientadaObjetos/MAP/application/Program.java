package RevisaoProgOrientadaObjetos.MAP.application;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import RevisaoProgOrientadaObjetos.MAP.model.entities.Product;

public class Program {

	public static void main(String[] args) {

		// Como é TreeMap irá ordenar com ordem alfabética por ser do tipo String a
		// coleção
		Map<String, String> cookies1 = new TreeMap<>();

		// Insere um elemento no na coleção MAP
		cookies1.put("userName", "Maria");
		cookies1.put("email", "maria@gail.com");
		cookies1.put("phone", "998877665");

		// Remove um elemento da coleção MAP
		cookies1.remove("email");

		System.out.println("ALL COOKIES 01:");
		for (String key : cookies1.keySet()) {
			System.out.println(key + ": " + cookies1.get(key));
		}

		Map<String, String> cookies2 = new TreeMap<>();

		// Insere um elemento no na coleção MAP
		cookies2.put("userName", "Pedro");
		cookies2.put("phone", "998877665");

		// MAP também não admite repetições então se adicionar outro elemento com a mesma chave irá sobreescrever o conteúdo da chave existente com o conteúdo da nova chave
		cookies2.put("phone", "998877554");

		System.out.printf("%nALL COOKIES 02:%n");
		for (String key : cookies2.keySet()) {
			System.out.println(key + ": " + cookies2.get(key));
		}
		
		//Verifica se a chave existe com .containsKey()
		System.out.printf("%nExiste a chave (phone): " + cookies2.containsKey("phone"));
		
		//Puxa o valor da chave definida .get()
		System.out.printf("%nPhone Number: " + cookies2.get("phone"));
		System.out.printf("%nEmail: " + cookies2.get("email"));
		
		//Puxa o tamanho atual da coleção MAP
		System.out.printf("%nSize: " + cookies2.size());
		
		
		Map<Product, Double> stock = new HashMap<>();
		
		Product p1 = new Product("Tv", 900.0);
		Product p2 = new Product("Notebook", 1200.0);
		Product p3 = new Product("Tablet", 400.0);
		
		//Informando a quantidade de cada produto
		stock.put(p1, 10000.0);
		stock.put(p2, 20000.0);
		stock.put(p3, 15000.0);
		
		Product ps = new Product("Tv", 900.0);
		System.out.printf("%nContains 'ps' key: " + stock.containsKey(ps));
		
		System.out.println();
		for (Product key : stock.keySet()) {
			System.out.println(key + ": " + stock.get(key));
		}
	}
}
