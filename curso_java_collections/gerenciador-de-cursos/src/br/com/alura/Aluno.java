package br.com.alura;

public class Aluno implements Comparable<Aluno>{

	private String nome;
	private int numeroMatricula;

	public Aluno(String nome, int numeroMatricula) {
		if (nome == null) {
			throw new NullPointerException("Nome n�o pode ser null.");
		}
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	@Override
	public String toString() {
		return "[Aluno: " + this.nome + ", Matricula: " + this.numeroMatricula + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		Aluno outro = (Aluno) obj;
		return this.nome.equals(outro.nome);
	}
	
	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}

	@Override
	public int compareTo(Aluno outroAluno) {
		return this.nome.compareTo(outroAluno.nome);
	}
}
