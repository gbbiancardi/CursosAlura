package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoGabriel = new Conta();
		contaDoGabriel.saldo = 100;
		contaDoGabriel.deposita(50);
		System.out.println("Saldo após depósito: " + contaDoGabriel.saldo);

		boolean conseguiuRetirar = contaDoGabriel.saca(50);
		System.out.println("Saldo após saque: " + contaDoGabriel.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta outraConta = new Conta();
		outraConta.saldo = 400;
		boolean sucessoTransferencia = outraConta.transfere(50, contaDoGabriel);
		if (sucessoTransferencia) {
			System.out.println("Transferência realizada com sucesso!");
		} else {
			System.out.println("Transferência falhou!");
		}
		System.out.println("Saldo conta Destino: " + contaDoGabriel.saldo);
		System.out.println("Saldo conta Origem: "+ outraConta.saldo);
	
	}

}
