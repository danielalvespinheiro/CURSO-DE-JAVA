package aula67ProdutoEmEstoque.main;

import java.util.Locale;
import java.util.Scanner;

import aula67ProdutoEmEstoque.model.Produto;

public class EstoqueDeProdutos {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Produto pd = new Produto();
		
		System.out.println("Coloque os dados dos produtos! ");
		System.out.println("Produto: ");
		pd.nome = sc.nextLine();
		System.out.println("Preço: ");
		pd.preco = sc.nextDouble();
		System.out.println("Quantidade em estoque: ");
		pd.qtdEstoque = sc.nextInt();
		pd.totalValueStock();
		
		System.out.println();
		System.out.println("Dados do produto: " + pd.toString());
		
		System.out.println();
		System.out.print("Adicionar mais ao estoque(números inteiros): ");
		int quantidade = sc.nextInt();
		pd.addProduto(quantidade);

		System.out.println();
		System.out.println("Dados do atualizados: " + pd.toString());
		
		System.out.println();
		System.out.print("Remover alguns produtos do estoque(números inteiros): ");
		int removerQtd = sc.nextInt();
		pd.removeProduto(removerQtd);
		
		System.out.println();
		System.out.println("Dados do atualizados: " + pd.toString());
		
		sc.close();
	}

}
