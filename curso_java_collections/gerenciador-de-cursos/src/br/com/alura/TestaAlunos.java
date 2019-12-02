package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {
		// O Set, ao inv�s de ser uma lista, � um conjunto, onde os elementos n�o s�o
		// ordenados conforme a ordem de inser��o. Eles s�o ordenados aleatoriamente.
		// O HashSet garante que s� haja um elemento na lista.
		Set<String> alunos = new HashSet<>();
		alunos.add("Rodrigo Turini");
		alunos.add("Alberto Souza");
		alunos.add("Nico Steppat");
		alunos.add("Nico Steppat"); // outro Nico Steppat, exatamente igual ao anterior
		alunos.add("Sergio Lopes");
		alunos.add("Renan Saggio");
		alunos.add("Mauricio Aniche");

		for (String aluno : alunos) {
			System.out.println(aluno);
		}

//	    Outro m�todo de chamar o forEach
//	    alunos.forEach(aluno -> {
//	    	System.out.println(aluno);
//	    });

		System.out.println(alunos);
	}

}
