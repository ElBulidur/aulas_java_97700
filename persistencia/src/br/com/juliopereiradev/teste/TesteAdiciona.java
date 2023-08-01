package br.com.juliopereiradev.teste;

import java.util.Calendar;

import br.com.juliopereiradev.dao.ImovelDao;
import br.com.juliopereiradev.modelo.Imovel;

public class TesteAdiciona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Imovel imovel = new Imovel(); 
		imovel.setProprietario("Julio Pereira"); 
		imovel.setEndereco("Conjunto SIR"); 
		imovel.setTipo("aluguel"); 
		imovel.setContato("juliopereira.dev@gmail.com"); 
		imovel.setValor(3000.00); 
		imovel.setDataInclusao(Calendar.getInstance()); 
		new ImovelDao().adiciona(imovel); 
		
		System.out.println("Salvo no BD.");

	}

}
