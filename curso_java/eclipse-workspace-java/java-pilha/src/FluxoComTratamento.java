
public class FluxoComTratamento {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
			metodo1();
		} catch (ArithmeticException | NullPointerException | MinhaExcecao ex) {
			String msg = ex.getMessage();
			System.out.println("Exception " + msg);
			ex.printStackTrace();
		} 
//			catch (NullPointerException ex) {
//			String msg = ex.getMessage();
//			System.out.println("NullPointerException " + msg);
//			ex.printStackTrace();
//		}
		System.out.println("Fim do main");
	}

	private static void metodo1() throws MinhaExcecao {
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() throws MinhaExcecao { 
		System.out.println("Ini do metodo2");
		throw new MinhaExcecao("Deu errado!");
				
//		System.out.println("Fim do metodo2");
	}
}
