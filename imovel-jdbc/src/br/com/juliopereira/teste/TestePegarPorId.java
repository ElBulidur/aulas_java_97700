package br.com.juliopereira.teste;

import java.util.List;

import br.com.juliopereira.dao.ImovelDao;
import br.com.juliopereira.modelo.Imovel;

public class TestePegarPorId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Long id =  (long) 1;
		Imovel imovel = new ImovelDao().busca(id);
		
		System.out.println("Imovel encontrado: "+ imovel.getProprietario());
	}

}
