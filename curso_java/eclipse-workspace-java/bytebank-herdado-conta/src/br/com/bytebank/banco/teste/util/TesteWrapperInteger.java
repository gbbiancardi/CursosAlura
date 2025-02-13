package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {

		int idade = 29;
		
		Integer idadeRef = Integer.valueOf(29);// Autoboxing
		int valor = idadeRef.intValue();// Unboxing
		
		System.out.println(idadeRef.doubleValue());
		
		System.out.println("Maior valor que Integer pode guardar: " + Integer.MAX_VALUE);
		System.out.println("Menor valor que Integer pode guardar: " + Integer.MIN_VALUE);
		System.out.println("Quanto bits tem o Integer: " + Integer.SIZE);
		System.out.println("Quantos bytes tem o Integer: " + Integer.BYTES);
		
		String s = "12";
		
		//Integer numero = Integer.valueOf(s);
		int numero = Integer.parseInt(s);
		System.out.println(numero);
		
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(Integer.valueOf(29));// Autoboxing

	}

}
