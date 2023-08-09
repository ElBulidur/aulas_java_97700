package br.com.juliopereira.servico;

import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.juliopereira.dao.ImovelDao;
import br.com.juliopereira.modelo.Imovel;

public class GravaImovelServico implements Servico {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		String idParametro = request.getParameter("id");
		
		Imovel imovel = new Imovel();
		
		imovel.setProprietario(request.getParameter("proprietario"));
		imovel.setEndereco(request.getParameter("endereco"));
		imovel.setTipo(request.getParameter("tipo"));
		imovel.setContato(request.getParameter("contato"));
		
		double valor = Double.parseDouble(request.getParameter("valor"));
		
		imovel.setValor(valor);
		
		imovel.setDataInclusao(Calendar.getInstance());
		

		if(idParametro != "") {
			
			Long id = Long.parseLong(idParametro);
			imovel.setId(id);
			new ImovelDao().altera(imovel);
		}else {
			new ImovelDao().adiciona(imovel);
		}
		
		
		List<Imovel> imoveis = new ImovelDao().getLista();

		request.setAttribute("imoveis", imoveis);
		
		
		return "/WEB-INF/lista-imoveis.jsp";
	}

}
