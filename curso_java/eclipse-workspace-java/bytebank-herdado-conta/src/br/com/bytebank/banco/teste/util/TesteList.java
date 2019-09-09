package br.com.bytebank.banco.teste.util;

import java.util.LinkedList;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteList {

	public static void main(String[] args) {

		// Generics
		List<Conta> lista = new LinkedList<Conta>();

		Conta cc = new ContaCorrente(123, 1234);
		lista.add(cc);

		Conta cc2 = new ContaCorrente(134, 7634);
		lista.add(cc2);

		System.out.println("Tamanho: " + lista.size());

		Conta ref = lista.get(0);
		System.out.println(ref.getConta());

		lista.remove(0);

		System.out.println("Tamanho: " + lista.size());

		Conta cc3 = new ContaCorrente(678, 5270);
		lista.add(cc3);
		Conta cc4 = new ContaCorrente(965, 4180);
		lista.add(cc4);

		for (int i = 0; i < lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}

		System.out.println("==============================================");

		for (Conta oRef : lista) {
			System.out.println(oRef);
		}
	}

}
