public class Divida {
	private double total;
	private String credor;
	private Cnpj cnpjCredor = new Cnpj();
	private Pagamentos pagamentos = new Pagamentos();

	public Pagamentos getPagamentos() {
		return pagamentos;
	}

	public Cnpj getCnpjCredor() {
		return cnpjCredor;
	}

	public String getCredor() {
		return this.credor;
	}

	public void setCredor(String credor) {
		this.credor = credor;
	}

	public double getTotal() {
		return this.total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double valorAPagar(Pagamentos pagamento) {
		return this.total - pagamentos.getValorPago();
	}
}
