public class ArquivoDeDividas implements ArmazenadorDeDividas {
	
//	private File arquivo;
//
//	public ArquivoDeDividas(String nomeDoArquivo) {
//		this.arquivo = new File(nomeDoArquivo);
//	}

	@Override
	public Divida carrega(Documento documentoCredor) {
		// procura a divida no arquivo e a devolve
		return null;
	}

	@Override
	public void salva(Divida divida) {
		// grava no arquivo
	}
}