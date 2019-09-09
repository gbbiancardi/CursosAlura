
public class TesteValores {

	public static void main(String[] args) {
		Conta conta = new Conta(123, 4567);
		
		System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta(321, 5436);
		Conta conta3 = new Conta(432, 9854);
		
		System.out.println(Conta.getTotal());
	}

}
