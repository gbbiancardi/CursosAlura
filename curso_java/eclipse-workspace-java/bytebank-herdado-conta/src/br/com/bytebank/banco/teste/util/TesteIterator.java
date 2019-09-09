package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TesteIterator {

	public static void main(String[] args) {
		
		Set<String> nomes = new HashSet<>(); // IMPLEMENTADO ATRAVÉS DE UM CONJUNTO
		nomes.add("Super Mario");
		nomes.add("Yoshi"); 
		nomes.add("Donkey Kong"); 

		Iterator<String> it = nomes.iterator();

		while(it.hasNext()) {
		  System.out.println(it.next());
		}
		
//		List<String> nomes = new ArrayList<>(); // IMPLEMENTADO ATRAVÉS DE UM ARRAYLIST
//		nomes.add("Super Mario");
//		nomes.add("Yoshi");
//		nomes.add("Donkey Kong");
//
//		Iterator<String> it = nomes.iterator();
//
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
		
	}
}
