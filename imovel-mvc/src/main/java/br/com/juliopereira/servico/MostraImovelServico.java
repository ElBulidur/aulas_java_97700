package br.com.juliopereira.servico;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.juliopereira.dao.ImovelDao;
import br.com.juliopereira.modelo.Imovel;

public class MostraImovelServico implements Servico {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		String parametro = request.getParameter("id");
		
		if(parametro != null) {
			Long id = Long.parseLong(parametro);
			Imovel imovel = new ImovelDao().busca(id);
			
			request.setAttribute("imovel", imovel);
		}
		
		return "/WEB-INF/adiciona-imovel.jsp";
	}

}
