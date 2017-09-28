package br.senai.sp.informatica.empresadoschupinga.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection getConnection() {
		try {
			// Registra o driver jdbc
			Class.forName("com.mysql.jdbc.Driver");
			
			// Retorna uma conexão com o banco de dados
			// gerada pelo DriveManager
			return DriverManager.getConnection("jdbc:mysql://172.16.7.23/empresat", "tarde", "tarde");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
	
}
