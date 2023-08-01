package br.com.juliopereiradev.teste;

import java.util.List;

import br.com.juliopereiradev.dao.ImovelDao;
import br.com.juliopereiradev.modelo.Imovel;

public class TesteLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Imovel> imoveis = new ImovelDao().getLista();
		System.out.println("Lista de im�veis:\n"); 
		imoveis.forEach(
				i -> System.out.println(i.getId() + " - " + i.getProprietario())
			);

	}// fim main

}// fim class
