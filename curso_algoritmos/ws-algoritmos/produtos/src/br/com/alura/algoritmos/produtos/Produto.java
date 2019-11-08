package br.com.alura.algoritmos.produtos;

public class Produto {

	private String nome;
	private double preco;
	
	public Produto(String nome, int preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}
	
	
}
