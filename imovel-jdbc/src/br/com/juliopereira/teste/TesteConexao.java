package br.com.juliopereira.teste;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.juliopereira.dao.ConnectionFactory;

public class TesteConexao {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection connection = new ConnectionFactory().getConnection();
		System.out.println("Banco conectado com sucesso!!");
		connection.close();

	}

}
