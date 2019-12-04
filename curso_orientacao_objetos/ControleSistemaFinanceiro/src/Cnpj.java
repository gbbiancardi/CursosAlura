
public class Cnpj {
	
	private String valor;
	
	public boolean ehValido() {
		return primeiroDigitoVerificador() == primeiroDigitoCorreto()
				&& segundoDigitoVerificador() == segundoDigitoCorreto();
	}
	
	private int primeiroDigitoCorreto() {
		// Extrai o primeiro d�gito verificador do CNPJ armazenado
		// no atributo cnpj
		return 1;
	}

	private int primeiroDigitoVerificador() {
		// Extrai o segundo d�gito verificador do CNPJ armazenado
		// no atributo cnpj
		return 1;
	}

	private int segundoDigitoCorreto() {
		// Calcula o primeiro d�gito verificador correto para
		// o CNPJ armazenado no atributo cnpj
		return 2;
	}

	private int segundoDigitoVerificador() {
		// Calcula o primeiro d�gito verificador correto para
		// o CNPJ armazenado no atributo cnpj
		return 2;
	}

	public String getValor() {
		return this.valor;
	}
	
	public void setValor(String novoValor) {
		this.valor = novoValor;
	}
	
	@Override
	public String toString() {
		return this.valor;
	}
}
