package aula67ProdutoEmEstoque.model;

public class Produto {
	
	public String nome;
	public double preco;
	public int qtdEstoque;
	
	public double totalValueStock() {
		double stock = preco * qtdEstoque;
		return stock;
	}
	
	public void addProduto(int qtdEstoque) {
		this.qtdEstoque += qtdEstoque;
	}
	
	public void removeProduto(int qtdEstoque) {
		this.qtdEstoque -= qtdEstoque;
	}
	
	public String toString() {
		return nome 
				+ ", " 
				+ "$ " 
				+ String.format("%.2f", preco) 
				+ ", " 
				+ qtdEstoque +
				" units" 
				+ ", " 
				+ String.format("%.2f", totalValueStock());
	}

}
