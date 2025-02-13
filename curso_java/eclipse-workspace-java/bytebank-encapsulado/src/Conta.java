public class Conta {
	private double saldo;
	private int agencia;
	private int conta;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia, int conta) {
		Conta.total++;
		System.out.println("O total de contas � " + Conta.total);
		this.agencia = agencia;
		this.conta = conta;
		System.out.println("Conta: "+conta);
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Conta contaDestino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			contaDestino.deposita(valor);
			// OU => contaDestino.saldo += valor;
			return true;
		}

		return false;
	}

	public double getSaldo() {
		return saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia >= 0) {
			this.agencia = agencia;
		} else {
			System.out.println("N�o pode valor negativo!");
			return;
		}

	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		if (conta >= 0) {
			this.conta = conta;
		} else {
			System.out.println("N�o pode valor negativo!");
			return;
		}
		
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return total;
	}
	public static void setTotal(int total) {
		Conta.total = total;
	}

}
