package br.com.estrutura.dados.aula05.pilhas;

public class TesteDaPilha {

	public static void main(String[] args) {

		// Pilha � uma estrutura de dados na qual o �ltimo elemento a entrar � o
		// primeiro a sair, tamb�m conhecida como LIFO(Last-In First-Out), por exemplo,
		// uma pilha de pratos.

		Pilha pilha = new Pilha();

		pilha.insere("Gabriel");
		System.out.println(pilha);

		pilha.insere("Andre");
		System.out.println(pilha);

		String r1 = pilha.remove();
		System.out.println(r1);

		String r2 = pilha.remove();
		System.out.println(r2);

		System.out.println(pilha);

		System.out.println(pilha.vazia());

		pilha.insere("Luiz");
		System.out.println(pilha);

		System.out.println(pilha.vazia());
	}

}
