import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double matriz[][] = new double[5][6];
//		int codigo[] = { 1, 2, 3, 4, 5 };
		double menor = 0;
		String nome[] = { "Celular", "Tv", "Computador", "Laptop", "Video-game" };
		String loja[] = { "Guarulhos", "Penha", "Tatuapé", "Mooca", "Belém", "Carrão" };

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.println("Digite o valor do produto " + nome[i] + " para a loja " + loja[j] + ":");
				matriz[i][j] = sc.nextInt();

				if (matriz[i][j] < menor) {
					menor = matriz[i][j];
				}
			}
			menor = 0;
		}
		
		for (int j = 0; j < 6; j++) {
			for (int i = 0; i < 5; i++) {
				System.out.println("O produto " + nome[i] + " foi encontrado na loja " + loja[j] + " por: R$" + menor);
			}
		}

		sc.close();
	}

}
