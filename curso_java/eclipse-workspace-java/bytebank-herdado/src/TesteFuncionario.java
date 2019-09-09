
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		gerente.setNome("Gabriel");
		gerente.setCpf("654.765.987-04");
		gerente.setSalario(6000.0);
		
		System.out.println(gerente.getNome());
		System.out.println(gerente.getBonificacao());

	}

}
