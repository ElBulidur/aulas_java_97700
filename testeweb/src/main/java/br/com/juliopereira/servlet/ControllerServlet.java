package br.com.juliopereira.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.juliopereira.servico.Servico;

public class ControllerServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException{
		String parametro = request.getParameter("servico");
		String nomeDaClasse = "br.com.juliopereira.servico."+parametro;
		
		try {
			Servico servico = (Servico) Class.forName(nomeDaClasse).newInstance();
			String pagina = servico.executa(request,  response);
			
			RequestDispatcher rq = request.getRequestDispatcher(pagina);
			rq.forward(request, response);
			
		}catch(Exception ex) {
			throw new ServletException("Erro na execu��o do arquivo: ", ex);
		}
	}
}
