
public class TesteConexao {

	public static void main(String[] args) {
		//M�TODO NOVO
		
		try (Conexao conexao = new Conexao()){
			conexao.leDados();
		} catch (IllegalStateException e) {
			System.out.println("Deu erro na conex�o!");
		}
		
		//------------------------------------------------------------

//		M�TODO ANTIGO
		
//		Conexao con = null;
//
//		try {
//			con = new Conexao();
//			con.leDados();
//		} catch (IllegalStateException e) {
//			System.out.println("Deu erro na conex�o!");
//		} finally {
//			if (con != null) {
//				con.close();
//			}
//
//		}

	}

}
