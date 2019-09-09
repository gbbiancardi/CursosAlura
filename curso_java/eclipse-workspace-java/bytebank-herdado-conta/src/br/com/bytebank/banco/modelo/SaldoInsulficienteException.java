package br.com.bytebank.banco.modelo;

public class SaldoInsulficienteException extends Exception {
	
	public SaldoInsulficienteException(String msg) {
		super(msg);
	}
}
