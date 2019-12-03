package br.com.estrutura.dados.aula03;

public class TestaListaLigada {
	
	public static void main(String[] args) {
		
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

	}

}
