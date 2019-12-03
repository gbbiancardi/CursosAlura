package br.com.estrutura.dados.aula03;

public class TestaListaLigada {

	public static void main(String[] args) {

		// A vantagem da lista ligada � que como a rela��o entre duas c�lulas � feita
		// por refer�ncias, � f�cil inserir um elemento no meio da lista (afinal, basta
		// acertar das c�lulas a esquerda e a direita).

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
