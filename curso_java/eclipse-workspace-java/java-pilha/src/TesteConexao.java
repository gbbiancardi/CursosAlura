
public class TesteConexao {

	public static void main(String[] args) {
		//MÉTODO NOVO
		
		try (Conexao conexao = new Conexao()){
			conexao.leDados();
		} catch (IllegalStateException e) {
			System.out.println("Deu erro na conexão!");
		}
		
		//------------------------------------------------------------

//		MÉTODO ANTIGO
		
//		Conexao con = null;
//
//		try {
//			con = new Conexao();
//			con.leDados();
//		} catch (IllegalStateException e) {
//			System.out.println("Deu erro na conexão!");
//		} finally {
//			if (con != null) {
//				con.close();
//			}
//
//		}

	}

}
