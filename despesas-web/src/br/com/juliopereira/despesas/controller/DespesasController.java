package br.com.juliopereira.despesas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.juliopereira.despesas.dao.JdbcDespesaDao;
import br.com.juliopereira.despesas.modelo.Despesa;

@Controller
public class DespesasController {

	@RequestMapping("/novaDespesa")
	public String form() {
		return "despesa/formulario";
	}
	
	
	@RequestMapping("/adicionaDespesa")
	public String adiciona(Despesa despesa) {
		
		JdbcDespesaDao dao = new JdbcDespesaDao();
		
		dao.adiciona(despesa); //POJO
		
		return "despesa/adicionada";
	}
}
