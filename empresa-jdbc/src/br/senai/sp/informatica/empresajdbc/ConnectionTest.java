package br.senai.sp.informatica.empresajdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionTest {

	public static void main(String[] args) throws SQLException {

		// Abre uma conexão com o banco de dados
		Connection conexao = new ConnectionFactory().getConnection();
		
		System.out.println();
		
		conexao.close();
	}

}
