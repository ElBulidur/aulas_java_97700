package br.com.juliopereira.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sistema")
public class ControllerServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException{
		
		String servico = req.getParameter("servico");
		
		if (servico.equals("adiciona")) {
			
			RequestDispatcher rq = req.getRequestDispatcher("/WEB-INF/adiciona-imovel.jsp");
			rq.forward(req, res);
			
		}else if(servico.equals("imoveis")) {
			RequestDispatcher rq = req.getRequestDispatcher("/WEB-INF/lista-imoveis.jsp");
			rq.forward(req, res);
		}
	}
}
