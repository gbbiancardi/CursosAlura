package br.com.estrutura.dados.aula07.conjuntos;

import java.util.HashSet;
import java.util.Set;

public class TesteConjunto {

	public static void main(String[] args) {

		// Conjuntos são estruturas de dados que não permitem dados repetidos.
		// Para garantir que os dados não fiquem repetidos, conjuntos fazem uso de
		// funções de hash para espalhar bem os dados, e em seguida, varrer o conteúdo
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
