package br.senai.sp.informatica.empresadoschupinga.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.senai.sp.informatica.empresadoschupinga.model.Funcionario;

public class FuncionarioDao {

	// Atributo
	private Connection connection;

	// Construtor
	public FuncionarioDao() {
		// Estabelece uma conexao com o banco de dados
		connection = new ConnectionFactory().getConnection();
	}

	// Salva
	public void salva(br.senai.sp.informatica.empresadoschupinga.model.Funcionario funcionario) {
		// Cria um comando sql
		String sql = "INSERT INTO funcionario (nome, email, cpf, senha) " + "VALUES (?, ?, ?, ?)";
		try {

			// Cria um PreparedStatement
			PreparedStatement stmt = connection.prepareStatement(sql);

			// Cria os par�metros do PreparedStatement
			stmt.setString(1, funcionario.getNome());
			stmt.setString(2, funcionario.getEmail());
			stmt.setString(3, funcionario.getCpf());
			stmt.setString(4, funcionario.getSenha());

			// Executa o insert
			stmt.execute();
			// Libera o recurso statement
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	// getLista
	public List<Funcionario> getLista() {

		try {
			// Cria um arrayList
			List<Funcionario> funcionarios = new ArrayList<>();

			// Cria um PreparedStatement
			PreparedStatement stmt = connection.prepareStatement("SELECT * FROM funcionario");

			// Executa o statement e guarda o resultado em um ResultSet
			ResultSet rs = stmt.executeQuery();

			// Enquanto houver dados no resultSet
			while (rs.next()) {
				// Cria um contato com os dados do resultSet
				Funcionario contato = new Funcionario();
				contato.setId(rs.getLong("id"));
				contato.setNome(rs.getString("nome"));
				contato.setEmail(rs.getString("email"));
				contato.setCpf(rs.getString("cpf"));
				contato.setSenha(rs.getString("senha"));

				// Adiciona o contato � lista de contatos
				funcionarios.add(contato);
			} // Fim do while

			// Fecha o ResultSet
			rs.close();

			// Fecha o statement
			stmt.close();

			// retorna a lista de contato
			return funcionarios;
		} catch (SQLException e) {
			throw new RuntimeException();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
	}

}
