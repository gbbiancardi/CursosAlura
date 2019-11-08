package br.com.alura.algoritmos.funcionarios;

public class TestaMaiorMenorSalario {

	public static void main(String[] args) {

		Funcionario funcionarios[] = {
			new Funcionario("Fernando", 3200),
			new Funcionario("Alfredo", 6000),
			new Funcionario("Flávio", 5000),
			new Funcionario("Marcela", 2200)
		};
		
		int menorSalario = buscaMenorSalario(funcionarios, 0, 3);
		int maiorSalario = buscaMaiorSalario(funcionarios, 0, 3);
		
		System.out.println("O maior salário é o do funcionário " + funcionarios[maiorSalario].getNome() 
				+ " que é R$" + funcionarios[maiorSalario].getSalario());
		
		System.out.println("O menor salário é o do funcionário " + funcionarios[menorSalario].getNome() 
				+ " que é R$" + funcionarios[menorSalario].getSalario());
	}

	private static int buscaMenorSalario(Funcionario[] funcionarios, int inicio, int termino) {
		int menorSalario = 0;
		for (int atual = inicio; atual <= termino; atual++) {
			if (funcionarios[atual].getSalario() < funcionarios[menorSalario].getSalario()) {
				menorSalario = atual;
			} 
		}
		return menorSalario;
	}
	
	private static int buscaMaiorSalario(Funcionario[] funcionarios, int inicio, int termino) {
		int maiorSalario = 0;
		for (int atual = inicio; atual <= termino; atual++) {
			if (funcionarios[atual].getSalario() > funcionarios[maiorSalario].getSalario()) {
				maiorSalario = atual;
			}
		}
		
		return maiorSalario;
	}

}
