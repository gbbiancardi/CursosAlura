package br.com.bytebank.banco.teste;

public class TesteArrayPrimitivos {

	public static void main(String[] args) {
		
		int[] idades = new int[5]; //inicializa o array com os valores padrões
		
		for (int i = 0; i < idades.length; i++) {
			idades[i] = i * i;
		}
		
		for (int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
		
//		int[] numeros = new int[6];
//		numeros[0] = 1;
//		numeros[1] = 2;
//		numeros[2] = 3;
//		numeros[3] = 4;
//		numeros[4] = 5;
//		
//		OU 
//		
//		int[] refs = {1,2,3,4,5};
		
//		idades[0] = 29;
//		idades[1] = 39;
//		idades[2] = 49;
//		idades[3] = 59;
//		idades[4] = 69;
//		
//		int idade1 = idades[0];
//		
//		System.out.println(idade1);
//		System.out.println(idades.length);
	}

}
