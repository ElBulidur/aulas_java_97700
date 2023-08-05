package br.com.juliopereira.servico;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PrimeiroServico implements Servico {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub

		System.out.println("Iniciando a execução do serviço!!");
		System.out.println("Fazendo o retorno no JSP");
		return "primeiro-servico.jsp";
	}

}
