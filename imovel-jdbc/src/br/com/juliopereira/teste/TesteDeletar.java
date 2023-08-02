package br.com.juliopereira.teste;

import br.com.juliopereira.dao.ImovelDao;
import br.com.juliopereira.modelo.Imovel;

public class TesteDeletar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ImovelDao acao = new ImovelDao();
		
		Imovel imovel = acao.busca((long) 3);
		
		acao.remove(imovel);
		
		System.out.print("Removido com sucesso!");
		
		
	}

}
