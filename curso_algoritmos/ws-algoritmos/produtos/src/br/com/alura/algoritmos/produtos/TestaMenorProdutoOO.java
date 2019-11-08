package br.com.alura.algoritmos.produtos;

public class TestaMenorProdutoOO {

	public static void main(String[] args) {

		Produto produtos[] = { 
				new Produto("Lamborghini", 1000000), 
				new Produto("Jipe", 46000),
				new Produto("Bras�lia", 16000), 
				new Produto("Smart", 46000), 
				new Produto("Fusca", 17000) 
		};

		int maisBarato = buscaMenor(produtos, 0, 4);
		System.out.println(maisBarato);
		System.out.println("O carro " + produtos[maisBarato].getNome() + " � o mais barato, e custa "
				+ produtos[maisBarato].getPreco());

	}

	private static int buscaMenor(Produto[] produtos, int inicio, int termino) {
		int maisBarato = inicio;
		for (int atual = inicio; atual <= termino; atual++) {
			if (produtos[atual].getPreco() < produtos[maisBarato].getPreco()) {
				maisBarato = atual;
			}
		}
		return maisBarato;
	}

}
