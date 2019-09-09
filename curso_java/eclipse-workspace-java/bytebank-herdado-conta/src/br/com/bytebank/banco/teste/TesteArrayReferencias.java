package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		Object[] referencias = new Object[5];
		
		ContaCorrente cc1 = new ContaCorrente(234, 9856);
		referencias[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(345, 7590);
		referencias[1] = cc2;
		
		Cliente cliente = new Cliente();
		referencias[2] = cliente;
		
		
		
//		System.out.println(cc2.getConta());
//		System.out.println(contas[1].getNumero());
		
		Conta  ref = (ContaPoupanca) referencias[1]; //type cast
		System.out.println(cc2.getConta());
		System.out.println(ref.getConta());
	}

}
