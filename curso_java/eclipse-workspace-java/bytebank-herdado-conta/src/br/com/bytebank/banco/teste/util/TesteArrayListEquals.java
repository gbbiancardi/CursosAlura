package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
//		Conta cc1 = new ContaCorrente(123, 1234);
//		Conta cc2 = new ContaCorrente(123, 1234);
//		
//		boolean igual = cc1.ehIgual(cc2);
//		System.out.println(igual);
		
		// Generics
		ArrayList<Conta> lista = new ArrayList<Conta>();

		Conta cc = new ContaCorrente(123, 1234);
		lista.add(cc);
		Conta cc2 = new ContaCorrente(134, 7634);
		lista.add(cc2);

		Conta cc3 = new ContaCorrente(134, 7634);
		boolean existe = lista.contains(cc3);

		System.out.println("Já existe? " + existe);

		for (Conta oRef : lista) {
			System.out.println(oRef);
		}
	}

}
