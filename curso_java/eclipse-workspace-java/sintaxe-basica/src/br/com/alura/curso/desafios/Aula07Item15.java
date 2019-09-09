package br.com.alura.curso.desafios;

public class Aula07Item15 {

	public static void main(String[] args) {
		int n, fatorial = 1;

		for (n = 1; n <= 10; n++) {
			fatorial *= n;
			System.out.println("Fatorial de " + n + " é: " + fatorial);
		}

	}

}
