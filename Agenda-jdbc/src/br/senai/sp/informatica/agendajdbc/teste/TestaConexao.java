package br.senai.sp.informatica.agendajdbc.teste;

import java.sql.Connection;
import java.sql.SQLException;

import br.senai.sp.informatica.agendajdbc.dao.ConnectionFactory;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {

		// Abre uma conexão com o banco de dados 
		Connection conexao = new ConnectionFactory().getConnection();
		
		System.out.println("Conectado !");
		
		conexao.close();
	}

}
