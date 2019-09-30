package br.com.alura.gerenciador.acao;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

public class AlteraEmpresa {

	public void altera(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		String nomeEmpresa = request.getParameter("nome");

		String paramDataAberturaEmpresa = request.getParameter("data");
		Date dataAberturaEmpresa = null;

		String paramIdEmpresa = request.getParameter("id");
		Integer idEmpresa = Integer.valueOf(paramIdEmpresa);

		System.out.println("alterando empresa " + idEmpresa);

		try { // Parse para transformar a data de String para Date
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dataAberturaEmpresa = sdf.parse(paramDataAberturaEmpresa);
		} catch (ParseException e) {
			throw new ServletException(e); // Captura e joga a exceção
		}

		Banco banco = new Banco();
		Empresa empresa = banco.buscaEmpresaPeloId(idEmpresa);
		empresa.setNome(nomeEmpresa);
		empresa.setDataAbertura(dataAberturaEmpresa);

		response.sendRedirect("entrada?acao=ListaEmpresas");
	}

}
