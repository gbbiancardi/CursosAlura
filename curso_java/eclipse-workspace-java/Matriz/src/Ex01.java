
public class Ex01 {

	public static void main(String[] args) {
		int[][] matriz = new int[5][6];

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 6; j++) {
				if (j % 2 == 0) {
					matriz[i][j] = 0;
				} else {
					matriz[i][j] = 1;
				}
			}
		}

		System.out.println("Matriz Resultante:");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print("\t" + matriz[i][j]);
			}
			System.out.println(" ");
		}

	}

}
