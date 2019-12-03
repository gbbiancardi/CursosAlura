package br.com.estrutura.dados.aula07.conjuntos;

import java.util.HashSet;
import java.util.Set;

public class TesteConjunto {

	public static void main(String[] args) {

		// Conjuntos s�o estruturas de dados que n�o permitem dados repetidos.
		// Para garantir que os dados n�o fiquem repetidos, conjuntos fazem uso de
		// fun��es de hash para espalhar bem os dados, e em seguida, varrer o conte�do
		// de maneira eficiente.

		Conjunto conjunto = new Conjunto();

		conjunto.adiciona("Gabriel");
		System.out.println(conjunto);

		conjunto.adiciona("Guilherme");
		System.out.println(conjunto);

		conjunto.adiciona("Andre");
		System.out.println(conjunto);

		conjunto.remove("Guilherme");
		System.out.println(conjunto);

		Set<String> conjuntoDoJava = new HashSet<String>();

		conjuntoDoJava.add("Gabriel");
		conjuntoDoJava.add("Andre");

		System.out.println(conjuntoDoJava);

		String x = "Guilherme";
		x.hashCode();

	}

}
