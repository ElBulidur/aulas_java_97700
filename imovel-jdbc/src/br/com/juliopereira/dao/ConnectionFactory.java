package br.com.juliopereira.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection getConnection() {
		String url = "jdbc:mysql://localhost/imovel";
		String usuario = "root";
		String senha = "root";
		
		try {
			return DriverManager.getConnection(url, usuario, senha);
		}catch (SQLException ex) {
			throw new RuntimeException(ex);
		}
	}
	
}
