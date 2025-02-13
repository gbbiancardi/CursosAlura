package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsulficienteException;

public class TestaConta {
	public static void main(String[] args) throws SaldoInsulficienteException {
		
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);

		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.0);

		cc.transfere(10.0, cp);

		System.out.println("Saldo CC: " + cc.getSaldo());
		System.out.println("Saldo CP: " + cp.getSaldo());

	}
}
