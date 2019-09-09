
public class TestaCondicional2 {

	public static void main(String[] args) {
		int idade = 20;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2;

		System.out.println("Valor acompanhado: " + acompanhado);
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo!");
		} else {
			System.out.println("Infelizmente você não pode entrar!");
		}

	}

}
