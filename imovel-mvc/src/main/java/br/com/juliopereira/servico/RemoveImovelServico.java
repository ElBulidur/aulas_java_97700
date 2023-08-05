package br.com.juliopereira.servico;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.juliopereira.dao.ImovelDao;
import br.com.juliopereira.modelo.Imovel;

public class RemoveImovelServico implements Servico {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		Long id = Long.parseLong(request.getParameter("id"));
		
		Imovel imovel = new Imovel();
		imovel.setId(id);
		
		System.out.println("Excluindo o im�vel...!!");
		new ImovelDao().remove(imovel);
		
		return "/WEB-INF/lista-imoveis.jsp";
	}

}
