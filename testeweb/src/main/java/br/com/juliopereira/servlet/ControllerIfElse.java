package br.com.juliopereira.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.juliopereira.dao.ImovelDao;
import br.com.juliopereira.modelo.Imovel;
import br.com.juliopereira.servico.Servico;

@WebServlet("/sistema")
public class ControllerIfElse extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException{
		
		String servico = request.getParameter("servico");
		
		if(servico.equals("adiciona")) {
			
			//Imovel imovel = new Imovel();
			//new ImovelDao().adiciona(imovel);

			RequestDispatcher rq = request.getRequestDispatcher("/index.jsp");
			rq.forward(request, response);
			
		}else if(servico.equals("altera")){
			// index
		}else if(servico.equals("busca")){
			// index
		}else if(servico.equals("excluir")){
			// index
		}else {
			// index
		}
	}
}
