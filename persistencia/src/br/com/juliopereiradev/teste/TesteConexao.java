package br.com.juliopereiradev.teste;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.juliopereiradev.dao.ConnectionFactory;

public class TesteConexao {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection connection = new ConnectionFactory().getConnection();
		
		System.out.println("Conectado ao banco de dados!");
		
		connection.close();

	}

}
