package br.com.juliopereira.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="/hello2", urlPatterns= {"/hello3", "/hi"})
public class HelloServlet2 extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) 
		throws ServletException, IOException{
			PrintWriter out = res.getWriter();

			out.println("<html>");
			out.println("<body>");
			out.println("<h1 style='color:green;'>Página feita em Servlet COM DECORADOR!!!</h1>");
			out.println("</body>");
			out.println("</html>");
		}

}