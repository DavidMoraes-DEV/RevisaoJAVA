package RevisaoProgOrientadaObjetos.ExerciciosFixacao.ExercicioItensVendidos.application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import RevisaoProgOrientadaObjetos.ExerciciosFixacao.ExercicioItensVendidos.model.entities.FilePath;
import RevisaoProgOrientadaObjetos.ExerciciosFixacao.ExercicioItensVendidos.model.entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> products = new ArrayList<>();
		
		try {
			System.out.printf("Quantos produtos serão gravados nos arquivos? ");
			Integer qtdProduct = sc.nextInt();

			for (int i = 0; i < qtdProduct; i++) {

				System.out.printf("%nDigite as informações do %dº produto:%n%n", i + 1);

				System.out.print("Nome: ");
				sc.nextLine();
				String productName = sc.nextLine();

				System.out.print("Preço: ");
				Double productPrice = sc.nextDouble();

				System.out.print("Quantidade: ");
				Integer productAmount = sc.nextInt();

				products.add(new Product(productName, productPrice, productAmount));
			}

			// Nome da pasta sugerida: Arquivos CSV
			System.out.printf("%nDigite o nome da pasta: ");
			sc.nextLine();
			String folderName = sc.nextLine();

			// CRIA A PASTA
			FilePath filePath = new FilePath(folderName);
			filePath.createdFolder();

			// Nome do Arquivo sugerido: products
			System.out.printf("Digite o nome do arquivo: ");
			String fileName = sc.next();

			// CRIA O ARQUIVO EM FORMATO .CSV E ADICIONA OS PRODUTOS DENTRO DO ARQUIVO
			filePath = new FilePath(folderName, fileName);
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath.createdFileCSV()))) {
				for (Product product : products) {

					String conversorCSV = product.getName() + "," + product.getPrice() + "," + product.getAmount();
					bw.write(conversorCSV);
					bw.newLine();
				}
			}

			List<Product> archiveProducts = new ArrayList<>();

			// ABRE O ARQUIVO CRIADO ANTERIORMENTE E PASSA PARA UMA LISTA DE PRODUTOS NOVAMENTE
			try (BufferedReader br = new BufferedReader(new FileReader(filePath.fullFilePath()))) {

				String line = br.readLine();
				while (line != null) {
					String[] productLine = line.split(",");
					archiveProducts.add(new Product(productLine[0], Double.parseDouble(productLine[1]), Integer.parseInt(productLine[2])));

					line = br.readLine();
				}
			}

			// Nome da Pasta Sugerida: out
			System.out.print("Digite o nome da pasta que armazenará o valor total de cada produto cadastrado: ");
			sc.nextLine();
			folderName += "\\" + sc.nextLine();

			// CRIA A PASTA
			filePath = new FilePath(folderName);
			filePath.createdFolder();

			// Nome de Arquivo Sugerido: summary
			System.out.print("Digite o nome do arquivo que armazenará o valor total de cada produto cadastrado: ");
			fileName = sc.next();

			// CRIA O ARQUIVO EM FORMATO .CSV E ADICIONA OS PRODUTOS DENTRO DO ARQUIVO
			filePath = new FilePath(folderName, fileName);
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath.createdFileCSV()))) {
				for (Product product : archiveProducts) {

					String conversorCSV = product.getName() + "," + product.totalProduct();

					bw.write(conversorCSV);
					bw.newLine();
				}
			}

			System.out.println("Arquivos e pastas criados com sucesso!!!");

		} catch (Exception e) {

			// Quando for criar a pasta com um nome que já existe naquele diretório retornará NULL
			if (e.getMessage() == null) {
				System.out.printf("%nJá existe uma pasta ou arquivo com esse nome!!!%n");
			} else {
				System.out.println(e.getMessage());
			}
		} finally {
			sc.close();
		}
	}
}
