import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] matrizM = new int[4][4];
		int[][] matrizR = new int[4][4];
		int num, numMaior = 0;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println("Digite o " + (j + 1) + "º número da " + (i + 1) + "ª coluna: ");
				num = sc.nextInt();
				matrizM[i][j] = num;

				if (num > numMaior) {
					numMaior = num;
				}
			}
		}

		System.out.println("Matriz Resultante: ");
		System.out.println();
		
		for (int g = 0; g < 4; g++) {
			for (int h = 0; h < 4; h++) {
				matrizR[g][h] = (matrizM[g][h] * numMaior);
				System.out.print("\t" + matrizR[g][h]);
			}
			System.out.println(" ");
		}

//		System.out.println("Matriz Resultante: ");
//		System.out.println();
//		for (int g = 0; g < 4; g++) {
//			for (int h = 0; h < 4; h++) {
//				System.out.print("\t" + matrizR[g][h]);
//			}
//			System.out.println(" ");
//		}
		
		System.out.println();
		System.out.println("Maior número digitado: " + numMaior);

		sc.close();
	}

}
