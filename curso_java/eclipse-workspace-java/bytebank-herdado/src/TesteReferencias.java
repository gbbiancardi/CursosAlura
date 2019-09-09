
public class TesteReferencias {

	public static void main(String[] args) {

		Gerente g1 = new Gerente();
		g1.setNome("Marcos");
		g1.setSalario(5000.0);
		
		EditorVideo ev1 = new EditorVideo();
		ev1.setNome("Laurindo");
		ev1.setSalario(2500.0);
		
		Designer dg = new Designer();
		dg.setNome("Conrado");
		dg.setSalario(1500.0);

		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(ev1);
		controle.registra(dg);

		System.out.println(controle.getSomaBonificacao());
	}

}
