
public class TestaGetSet {

	public static void main(String[] args) {
		Conta conta = new Conta(123, 3456);
		conta.setConta(1337);
		System.out.println(conta.getConta());
		
		Cliente paulo = new Cliente();
		paulo.setNome("Paulo Figueiredo");
		conta.setTitular(paulo);
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Cambista");
		// agora em duas linhas
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("Cambista");
		
	}

}
