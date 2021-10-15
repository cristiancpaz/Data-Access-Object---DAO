package persistencia;

import java.sql.*;
import java.util.ArrayList;
import negocio.Contato;




public class contatoDAO {

	public ArrayList<Contato> listar() throws SQLException, ClassNotFoundException{
	    ArrayList<Contato> contato = new ArrayList<Contato>();
		String sql = "SELECT * FROM contato";
		Connection connection = new ConexaoPostgreSQL().getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		ResultSet rs = preparedStatement.executeQuery();
		Contato c = null;
		while(rs.next()) {
			c = new Contato();
			c.setId(rs.getInt("id"));
			c.setNome(rs.getString("nome"));
			contato.add(c);
		}
		preparedStatement.close();
		connection.close();
		return contato;
	}
	
	
	public void inserir(Contato c) throws SQLException, ClassNotFoundException{
		String sql = "INSERT INTO contato(id, nome)VALUES(?,?);";
		Connection connection = new ConexaoPostgreSQL().getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, c.getId());
		preparedStatement.setString(2, c.getNome());
		preparedStatement.execute();
		preparedStatement.close();
		connection.close();
	
	}
	
	public void excluir(int id) throws SQLException, ClassNotFoundException{
		String sql = "DELETE FROM  contato WHERE id = ?;";
		Connection connection = new ConexaoPostgreSQL().getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, id);
		preparedStatement.executeUpdate();
		preparedStatement.close();
		connection.close();
	
	}


	public void atualizar(Contato c) throws ClassNotFoundException, SQLException {
		String sql = "UPDATE contato SET nome = ? WHERE id = ?;";
		Connection connection = new ConexaoPostgreSQL().getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, c.getNome());
		preparedStatement.setInt(2, c.getId());
		preparedStatement.execute();
		preparedStatement.close();
		connection.close();
	}
	
}
