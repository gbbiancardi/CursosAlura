package br.com.estrutura.dados.aula06.filas;

public class TesteFila {

	public static void main(String[] args) {

		// Fila � uma estrutura de dados onde o primeiro a entrar � o primeiro a sair. �
		// como uma fila de banco: o primeiro que chega na fila � o primeiro a ser
		// atendido.

		Fila fila = new Fila();

		fila.adiciona("Gabriel");
		fila.adiciona("Andre");

		System.out.println(fila);

		fila.remove();

		System.out.println(fila);

		System.out.println(fila.vazia());
		fila.remove();
		System.out.println(fila.vazia());
		System.out.println(fila);
	}

}
