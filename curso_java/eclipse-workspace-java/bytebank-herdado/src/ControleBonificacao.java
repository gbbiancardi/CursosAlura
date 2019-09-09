
public class ControleBonificacao {
	private double somaBonificacao;
	
	public void registra(Funcionario f) {
		double boni = f.getBonificacao();
		this.somaBonificacao = this.somaBonificacao + boni;
	}

	public double getSomaBonificacao() {
		return somaBonificacao;
	}

}
