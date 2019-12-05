public class TestaPagamentos {

	public static void main(String[] args) {

		Pagamentos pagamentos = new Pagamentos();
		Pagamento pagamento1 = new Pagamento();
		Pagamento pagamento2 = new Pagamento();
		pagamento1.setValor(105);
		pagamento2.setValor(25);
		
		pagamentos.registra(pagamento1);
		pagamentos.registra(pagamento2);
		
		System.out.println("Valor total pago: " + pagamentos.getValorPago());
		System.out.println("O pagamento 01 já foi realizado? " + pagamentos.foiRealizado(pagamento1));
		
		Iterable<Pagamento> lista = new Pagamentos();
		for (Pagamento pagamento : pagamentos) {
			System.out.println(pagamento.getValor());
		}
		
	}

}
