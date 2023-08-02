package br.com.juliopereira.teste;

import java.util.Calendar;

import br.com.juliopereira.dao.ImovelDao;
import br.com.juliopereira.modelo.Imovel;

public class TesteAdiciona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Imovel imovel = new Imovel();
		
		imovel.setProprietario("Outra dono");
		imovel.setEndereco("Rua das couves");
		imovel.setTipo("Aluguel");
		imovel.setContato("juv@gmail.com");
		imovel.setValor(1890.00);
		imovel.setDataInclusao(Calendar.getInstance());
		
		new ImovelDao().adiciona(imovel);
		System.out.println("Imovel adicionado com sucesso!!!");
	}

}
