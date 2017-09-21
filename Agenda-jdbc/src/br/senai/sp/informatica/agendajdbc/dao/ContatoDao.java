package br.senai.sp.informatica.agendajdbc.dao;

import java.sql.Connection;

public class ContatoDao {

	// Atributo
	private Connection connection;
	
	public ContatoDao() {
		// Estabelece uma conexao com o banco de dados
		connection = new ConnectionFactory().getConnection();
	}
	
	
	
	
}
