package br.com.estrutura.dados.aula02;

public class VetorTeste {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("Joao");
		Aluno a2 = new Aluno("Jose");
		
		Vetor lista = new Vetor();
		
		lista.adiciona(a1);
		lista.adiciona(a2);
		
		System.out.println(lista);
		
		Aluno a3 = new Aluno("Fabio");
		lista.adiciona(1, a3);
		
		System.out.println(lista);

		lista.remove(1);
		
		System.out.println(lista);
		
		for(int i = 0; i < 300; i++) {
			Aluno y = new Aluno("Joao" + i);
			lista.adiciona(y);
		}
		
		System.out.println(lista);


	}

}
