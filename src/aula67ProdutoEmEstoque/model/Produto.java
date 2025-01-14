package aula67ProdutoEmEstoque.model;

public class Produto {
	
	public String nome;
	public double preco;
	public int qtdEstoque;

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}

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
				" unidades" 
				+ ", " 
				+ String.format("%.2f", totalValueStock());
	}

}
