
public class Ex05 {

	public static void main(String[] args) {
		int matriz[][] = new int[5][5];

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if ((i + j) == (matriz.length - 1)) {
					matriz[i][j] = 1;
				} else {
					matriz[i][j] = 0;
				}
			}
		}
		
		System.out.println("Matriz Resultante:");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("\t" + matriz[i][j]);
			}
			System.out.println(" ");
		}

	}

}
