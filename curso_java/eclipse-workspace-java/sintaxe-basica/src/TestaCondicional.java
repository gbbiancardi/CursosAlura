
public class TestaCondicional {

	public static void main(String[] args) {
		int idade = 20;
		int quantidadePessoas = 3;
		
		if (idade>=18) {
			System.out.println("Você tem mais que 18 anos");
			System.out.println("Seja bem vindo!");
		} else if (quantidadePessoas >=2){
			System.out.println("Infelizmente você não pode entrar");
			System.out.println("Mas pode entrar por estar acompanhado!");
		} else {
			System.out.println("Infelizmente você não pode entrar!");
		}

	}

}
