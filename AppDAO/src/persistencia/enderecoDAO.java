package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import negocio.Endereco;

public class enderecoDAO {
	public ArrayList<Endereco> listar() throws SQLException, ClassNotFoundException{
	    ArrayList<Endereco> endereco = new ArrayList<Endereco>();
		String sql = "SELECT * FROM endereco";
		Connection connection = new ConexaoPostgreSQL().getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		ResultSet rs = preparedStatement.executeQuery();
		Endereco e = null;
		while(rs.next()) {
			e = new Endereco();
			e.setId(rs.getInt("id"));
			e.setNumero(rs.getInt("numero"));
			e.setBairro(rs.getString("bairro"));
			e.setLogradouro(rs.getString("logradouro"));
			e.setComplemento(rs.getString("complemento"));
			endereco.add(e);
		}
		preparedStatement.close();
		connection.close();
		return endereco;
	}
	
	public void inserir(Endereco e) throws SQLException, ClassNotFoundException{
		String sql = "INSERT INTO endereco(id, id_contato, numero, bairro, logradouro, complemento)VALUES(?,?,?,?,?,?);";
		Connection connection = new ConexaoPostgreSQL().getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, e.getId());
		preparedStatement.setInt(2, e.getId_contato());
		preparedStatement.setInt(3, e.getNumero());
		preparedStatement.setString(4, e.getBairro());
		preparedStatement.setString(5, e.getLogradouro());
		preparedStatement.setString(6, e.getComplemento());
		preparedStatement.execute();
		preparedStatement.close();
		connection.close();
	
	}
	
	public void excluir(int id) throws SQLException, ClassNotFoundException{
		String sql = "DELETE FROM  endereco WHERE id = ?;";
		Connection connection = new ConexaoPostgreSQL().getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, id);
		preparedStatement.executeUpdate();
		preparedStatement.close();
		connection.close();
	
	}


	public void atualizar(Endereco e) throws ClassNotFoundException, SQLException {
		String sql = "UPDATE endereco SET numero = ?  WHERE id = ?;";
		Connection connection = new ConexaoPostgreSQL().getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		
		preparedStatement.setInt(1, e.getNumero());
		preparedStatement.setInt(2, e.getId());
		//preparedStatement.setString(3, e.getBairro());
		//preparedStatement.setString(4, e.getLogradouro());
		//preparedStatement.setString(5, e.getComplemento());
		preparedStatement.execute();
		preparedStatement.close();
		connection.close();
	}

}
