package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/alteraEmpresa")
public class AlteraEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nomeEmpresa = request.getParameter("nome");
		
		String paramDataAberturaEmpresa = request.getParameter("data");
		Date dataAberturaEmpresa = null;
		
		String paramIdEmpresa = request.getParameter("id");		
		Integer idEmpresa = Integer.valueOf(paramIdEmpresa); 		
		
		try { // Parse para transformar a data de String para Date
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dataAberturaEmpresa =sdf.parse(paramDataAberturaEmpresa);
		} catch (ParseException e) {
			throw new ServletException(e); // Captura e joga a exceção
		}
		
		Banco banco = new Banco();
		Empresa empresa = banco.buscaEmpresaPeloId(idEmpresa);
		empresa.setNome(nomeEmpresa);
		empresa.setDataAbertura(dataAberturaEmpresa);
		
		response.sendRedirect("listaEmpresas");
	}

}
