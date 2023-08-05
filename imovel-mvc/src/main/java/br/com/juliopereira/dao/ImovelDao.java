package br.com.juliopereira.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.juliopereira.modelo.Imovel;

public class ImovelDao {
	private Connection connection;

	public ImovelDao() {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	// Adicionar informações
	public void adiciona(Imovel imovel) {
		String sql = "insert into imovel (proprietario, endereco, tipo,"
				+ "contato, valor, dataInclusao) values (?,?,?,?,?,?)";
		
		try(PreparedStatement stmt = connection.prepareStatement(sql)){
			stmt.setString(1, imovel.getProprietario());
			stmt.setString(2, imovel.getEndereco());
			stmt.setString(3, imovel.getTipo());
			stmt.setString(4, imovel.getContato());
			stmt.setDouble(5, imovel.getValor());
			stmt.setDate(6, new Date(imovel.getDataInclusao().getTimeInMillis()));
			
			stmt.executeUpdate();
			
		}catch(SQLException ex){
			throw new RuntimeException(ex);
		}
		
	}
	
	// Pegar os dados...
	public List<Imovel> getLista(){
		String sql = "select * from imovel";
		
		List<Imovel> imoveis = new ArrayList();
		
		try(PreparedStatement stmt = connection.prepareStatement(sql)){
			ResultSet rs = stmt.executeQuery();
			
			
			while(rs.next()) {
				Imovel imovel = new Imovel();
				
				imovel.setId(rs.getLong("id"));
				imovel.setProprietario(rs.getString("proprietario"));
				imovel.setEndereco(rs.getString("endereco"));
				imovel.setTipo(rs.getString("tipo"));
				imovel.setContato(rs.getString("contato"));
				imovel.setValor(rs.getDouble("valor"));
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("dataInclusao"));
				imovel.setDataInclusao(data);
				imoveis.add(imovel);
			}
			
			
			
		}catch(SQLException ex) {
			throw new RuntimeException(ex);
		}
		

		return imoveis;
		
		
	}
	
	// Pegar por id
	public Imovel busca(Long id) {
		String sql = "select * from imovel where id = ?";
		
		Imovel imovel = null;
		
		try(PreparedStatement stmt = connection.prepareStatement(sql)){

			stmt.setLong(1, id);
			
			ResultSet rs = stmt.executeQuery();
			
			if (rs.next()) {
				
				imovel = new Imovel();
				
				imovel.setId(rs.getLong("id"));
				imovel.setProprietario(rs.getString("proprietario"));
				imovel.setEndereco(rs.getString("endereco"));
				imovel.setTipo(rs.getString("tipo"));
				imovel.setContato(rs.getString("contato"));
				imovel.setValor(rs.getDouble("valor"));
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("dataInclusao"));
				imovel.setDataInclusao(data);
			}
			
			
		}catch(SQLException ex) {
			throw new RuntimeException(ex);
		}
		
		return imovel;
	}
	
	// Atualizar pelo ID
	public void altera(Imovel imovel) {
		String sql = "update imovel set proprietario=?, endereco=?,"
				+"tipo=?, contato=?, valor=?, dataInclusao=?"
				+"where id = ?";
		
		try(PreparedStatement stmt = connection.prepareStatement(sql)){
			stmt.setString(1, imovel.getProprietario());
			stmt.setString(2, imovel.getEndereco());
			stmt.setString(3, imovel.getTipo());
			stmt.setString(4, imovel.getContato());
			stmt.setDouble(5, imovel.getValor());
			stmt.setDate(6, new Date(imovel.getDataInclusao().getTimeInMillis()));
			stmt.setLong(7, imovel.getId());
			
			stmt.executeUpdate();
			
		}catch (SQLException ex) {
			throw new RuntimeException(ex);
		}
	}
	
	// Deletar
	public void remove(Imovel imovel) {
		String sql = "delete from imovel where id= ?";
		
		try(PreparedStatement stmt = connection.prepareStatement(sql)){
			stmt.setLong(1, imovel.getId());
			stmt.executeUpdate();
			
		}catch (SQLException ex) {
			throw new RuntimeException(ex);
		}
		
	}
}
