package bytebank;

public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		System.out.println(primeiraConta.saldo);

		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);

		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;

		System.out.println("Saldo Primeira Conta: " + primeiraConta.saldo);
		System.out.println("Saldo Segunda Conta: " + segundaConta.saldo);
		
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.conta);
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.titular);
	}

}
