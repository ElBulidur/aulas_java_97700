package br.com.juliopereira.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.juliopereira.dao.ImovelDao;
import br.com.juliopereira.modelo.Imovel;

@WebServlet("/cadastraimovel")
public class CadastraImoveisServlet extends HttpServlet {
	@SuppressWarnings("deprecation")
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException{
		
		PrintWriter out = res.getWriter();

		String proprietario = req.getParameter("proprietario");
		String endereco = req.getParameter("endereco");
		String tipo = req.getParameter("tipo");
		String contato = req.getParameter("contato");
		
		
		Calendar datainclusao = null;
		Double valor = null;
		
		try {
			valor = Double.parseDouble(req.getParameter("valor"));
			Date date = (Date) new SimpleDateFormat("dd/MM/yyyy").parse(req.getParameter("datainclusao"));
			
			datainclusao = Calendar.getInstance();
			
			datainclusao.setTime(date);
			
		}catch(RuntimeException ex) {
			
			out.println("Erro de conversão de valor! Não numérico!");
			return;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Imovel imovel = new Imovel();

		imovel.setProprietario(proprietario);
		imovel.setEndereco(endereco);
		imovel.setTipo(tipo);
		imovel.setContato(contato);
		imovel.setValor(valor);
 		imovel.setDataInclusao(datainclusao);
		
		new ImovelDao().adiciona(imovel);
		
		out.println("<html><body><h3>");
		out.println("Proprietario "+ proprietario + " adicionado com sucesso!!");
		out.println("</h3></body>");
		out.println("</html>");
		
		System.out.println("Imovel atualizado com sucesso!!!");
	}
}
