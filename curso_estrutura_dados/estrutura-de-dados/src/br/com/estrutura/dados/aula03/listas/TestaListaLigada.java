package br.com.estrutura.dados.aula03.listas;

public class TestaListaLigada {

	public static void main(String[] args) {

		// A vantagem da lista ligada é que como a relação entre duas células é feita
		// por referências, é fácil inserir um elemento no meio da lista (afinal, basta
		// acertar das células a esquerda e a direita).

		// Na lista ligada simples a célula só aponta para a próxima célula da lista. Já
		// na lista duplamente ligada, a célula tem referências para a anterior e para a
		// próxima. A grande vantagem é que muitas operações necessitam também da célula
		// anterior, e tudo fica mais fácil com a referência armazenada em cada célula.

		ListaLigada lista = new ListaLigada();

		System.out.println(lista);
		lista.adicionaNoComeco("Gabriel");
		System.out.println(lista);
		lista.adicionaNoComeco("Fabio");
		System.out.println(lista);
		lista.adicionaNoComeco("Andre");
		System.out.println(lista);

		lista.adiciona("Luiz");
		System.out.println(lista);

		lista.adiciona(2, "Mauricio");
		System.out.println(lista);

		Object x = lista.pega(2);
		System.out.println(x);

		lista.removeDoComeco();
		System.out.println(lista);

		lista.removeDoFim();
		System.out.println(lista);

		lista.remove(0);
		System.out.println(lista);

		System.out.println(lista.contem("Mauricio"));
		System.out.println(lista.contem("Luiz"));

	}

}
