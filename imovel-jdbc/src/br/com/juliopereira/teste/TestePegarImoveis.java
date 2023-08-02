package br.com.juliopereira.teste;

import java.util.List;

import br.com.juliopereira.dao.ImovelDao;
import br.com.juliopereira.modelo.Imovel;

public class TestePegarImoveis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Imovel> imoveis = new ImovelDao().getLista();
		
		System.out.println("======= Lista de imoveis ======= ");
		
		imoveis.forEach(ele ->
		System.out.println(ele.getId() + " - " + ele.getProprietario()));

	}

}
