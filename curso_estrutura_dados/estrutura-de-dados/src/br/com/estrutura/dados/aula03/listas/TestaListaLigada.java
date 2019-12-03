package br.com.estrutura.dados.aula03.listas;

public class TestaListaLigada {

	public static void main(String[] args) {

		// A vantagem da lista ligada � que como a rela��o entre duas c�lulas � feita
		// por refer�ncias, � f�cil inserir um elemento no meio da lista (afinal, basta
		// acertar das c�lulas a esquerda e a direita).

		// Na lista ligada simples a c�lula s� aponta para a pr�xima c�lula da lista. J�
		// na lista duplamente ligada, a c�lula tem refer�ncias para a anterior e para a
		// pr�xima. A grande vantagem � que muitas opera��es necessitam tamb�m da c�lula
		// anterior, e tudo fica mais f�cil com a refer�ncia armazenada em cada c�lula.

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
