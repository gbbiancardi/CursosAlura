package bytebank;

public class TesteReferencia {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		System.out.println("Saldo Primeira Conta: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		System.out.println("Saldo Segunda Conta: " + segundaConta.saldo);
		
		segundaConta.saldo += 100;
		System.out.println("Saldo Segunda Conta: " + segundaConta.saldo);
		System.out.println("Saldo Primeira Conta: " + primeiraConta.saldo);

		if (primeiraConta == segundaConta) {
			System.out.println("São as mesma conta!!!");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}
