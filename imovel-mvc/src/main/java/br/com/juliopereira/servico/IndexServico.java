package br.com.juliopereira.servico;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IndexServico implements Servico {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		return "/WEB-INF/lista-imoveis.jsp";
	}

}
