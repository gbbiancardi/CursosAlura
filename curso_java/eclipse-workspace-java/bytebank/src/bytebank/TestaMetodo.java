package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoGabriel = new Conta();
		contaDoGabriel.saldo = 100;
		contaDoGabriel.deposita(50);
		System.out.println("Saldo ap�s dep�sito: " + contaDoGabriel.saldo);

		boolean conseguiuRetirar = contaDoGabriel.saca(50);
		System.out.println("Saldo ap�s saque: " + contaDoGabriel.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta outraConta = new Conta();
		outraConta.saldo = 400;
		boolean sucessoTransferencia = outraConta.transfere(50, contaDoGabriel);
		if (sucessoTransferencia) {
			System.out.println("Transfer�ncia realizada com sucesso!");
		} else {
			System.out.println("Transfer�ncia falhou!");
		}
		System.out.println("Saldo conta Destino: " + contaDoGabriel.saldo);
		System.out.println("Saldo conta Origem: "+ outraConta.saldo);
	
	}

}
