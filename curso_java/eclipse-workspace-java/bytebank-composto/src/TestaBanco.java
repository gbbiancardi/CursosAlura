
public class TestaBanco {

	public static void main(String[] args) {
		Cliente gabriel = new Cliente();
		gabriel.nome = "Gabriel Bertocco Biancardi";
		gabriel.cpf = "456.867.999-04";
		gabriel.profissao = "Estagi�rio";
		
		// associa o cliente gabriel � contaGabriel
		Conta contaGabriel = new Conta();
		contaGabriel.deposita(100);
		contaGabriel.setTitular(gabriel);
		System.out.println(contaGabriel.getTitular().nome);
	}

}
