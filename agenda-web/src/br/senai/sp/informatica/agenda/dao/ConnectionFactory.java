package br.senai.sp.informatica.agenda.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection getConnection() {
		try {
			// Registra o driver jdbc
			Class.forName("com.mysql.jdbc.Driver");
			
			// Retorna uma conex�o com o banco de dados
			// gerada pelo DriveManager
			return DriverManager.getConnection("jdbc:mysql://localhost/agendat", "root", "root132");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
	
}
