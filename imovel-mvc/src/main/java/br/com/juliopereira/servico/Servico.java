package br.com.juliopereira.servico;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Servico {
	String executa(HttpServletRequest request, HttpServletResponse response)
		throws Exception;
}
