package persistencia;

//import java.sql.*; 
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class ConexaoPostgreSQL {
	static final String JDBC_DRIVER = "org.postgresql.Driver";
	private String host;
	private String port;
	private String username;
	private String password;
	private String database;
	
	
	public ConexaoPostgreSQL() {
		this.host = "localhost";
		this.port = "5432";
		this.username = "postgres";
		this.password = "1234";
		this.database = "dao";
	}


	
	public Connection getConnection() throws ClassNotFoundException {
		
		Connection conn = null;
		
		try {
			
			System.out.println("Conectado");
			Class.forName ("org.postgresql.Driver");
			conn = DriverManager.getConnection("jdbc:postgresql://" + this.host + ":" + this.port 
					+ "/" + this.database, username, password);
			
		}catch(SQLException e) {
			System.out.println("Deu erro - Nao Conectou");
			
			Logger.getLogger(ConexaoPostgreSQL.class.getName()).log(Level.SEVERE,null,e);
		//	throw new RuntimeException(e);
		}
		
		return conn;
		
	}

}
